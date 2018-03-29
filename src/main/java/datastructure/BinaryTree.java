package datastructure;


public class BinaryTree {
    public int value;            // 节点的值

    public BinaryTree left;      // 节点的左子节点

    public BinaryTree right;     // 节点的右子节点

    public BinaryTree parent;    // 节点的父节点。如果为 null 则表示该节点是根节点

    // 构造方法
    public BinaryTree(int value) {
        this.value = value;
    }

    //将一个节点添加到当前节点的左子节点
    public void setLeft(BinaryTree node) {
        if (this.left != null) {
            this.left.parent = null;
        }
        this.left = node;
        if (this.left != null) {
            this.left.parent = this;
        }
    }

    public void setRight(BinaryTree node) {
        if (this.right != null) {
            this.right.parent = null; // 解除当前的右子节点
        }
        this.right = node;
        if (this.right != null) {
            this.right.parent = this; // 设置新子节点的父节点为自身
        }
    }

    // 将一个节点加为当前节点的左或右子节点
    public void setChild(BinaryTree node) {
        if (node == null) {
            return;
        }

        if (node.value < this.value) {
            setLeft(node);
        } else if (node.value > this.value) {
            setRight(node);
        }
    }

    public void deleteChild(BinaryTree node) {
        if (node == null) {
            return;
        }
        if (node == this.left) {
            node.parent = null;
            this.left = null;
        } else if (node == right) {
            node.parent = null;
            this.right = null;
        }
    }

    public void add(int value) {
        if (value < this.value) { // 表示应该放入左子树
            if (this.left == null) { // 如果左子树为空则构建一个节点加进去
                setLeft(new BinaryTree(value));
            } else {
                this.left.add(value);// 否则对左子树同样调用 add 方法（即递归）
            }

        } else if (value > this.value) {  // 表示应该放入右子树.
            if (this.right == null) {       // 如果右子树为空则构建一个节点加进去
                setRight(new BinaryTree(value));
            } else {
                this.right.add(value);      // 否则对右子树同样调用 add 方法（即递归）
            }
        }
    }

    public BinaryTree leftMax() {
        if (this.left == null) {
            return null;
        }
        BinaryTree result = this.left;
        while (result.right != null) {
            result = result.right;
        }
        return result;
    }

    public BinaryTree rightMin() {
        if (this.right == null) {
            return null;
        }
        BinaryTree result = this.right;
        while (result.left != null) {
            result = result.left;
        }
        return result;
    }

    public BinaryTree find(int value) {
        BinaryTree result = this;     // 起始节点

        if (result.value == value) {
            return result;
        }
        while (result.left != null || result.right != null) {
            // 如果查找的值比当前节点小则顺着左子树查找；
            // 如果比当前节点大则顺着右子树查找。
            if (value < result.value && result.left != null) {
                result = result.left;
            } else if (value > result.value && result.right != null) {
                result = result.right;
            }
            if (result.value == value) {
                return result;
            }
        }
        return null;
    }

    public BinaryTree replace(BinaryTree node, BinaryTree replace) {
        // 1. replace 接管 node 的子节点
        replace.setLeft(node.left);
        replace.setRight(node.right);

        // 2. replace 从原来的 parent 脱离
        if (replace.parent != null) {
            replace.parent.deleteChild(replace);
        }

        // 3. node 原来的 parent 接管 replace
        if (node.parent != null) {
            node.parent.setChild(replace);
        }

        // 注意 2 必须在 3 之前，1 位置不论
        return replace;
    }

    // 从树的子节点中删除指定的值，并重组剩余节点
    public BinaryTree delete(int value) {
        BinaryTree node = find(value);
        if (node == null) {
            return this;
        }

        // 没有子节点，直接删除即可
        if (node.left == null && node.right == null) {
            if (node.parent != null) {
                node.parent.deleteChild(node);
                return this;
            } else {
                // 表示整棵树唯一的根节点删了，只能返回 null
                return null;
            }
        }

        // 如果有子节点，则取左子树的最大值或者右子树的最小值都可以，
        // 来取代该节点。这里优先取左子树的最大值
        BinaryTree replace;
        if (node.left != null) {
            replace = replace(node, node.leftMax());
        } else {
            replace = replace(node, node.rightMin());
        }

        // 如果被删除的是根节点，则返回用于替换的节点，否则还是返回根节点
        return node == this ? replace : this;
    }

}



