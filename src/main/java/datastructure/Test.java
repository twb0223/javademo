package datastructure;

public class Test {
    public static void main(String[] args) {
//        BinaryTree tree=new BinaryTree(10);
//
//        // 第一层子节点
//        tree.add(4);
//        tree.add(33);
//
//        // 第二层子节点
//        tree.add(25);
//        tree.add(46);
//        tree.add(8);
//        tree.add(1);


        SingleLinkedList singleList = new SingleLinkedList();
        singleList.addHead("A");
        singleList.addHead("B");
        singleList.addHead("C");
        singleList.addHead("D");
        //打印当前链表信息
        singleList.display();
        //删除C
        singleList.delete("C");
        singleList.display();
        //查找B
        System.out.println(singleList.find("B"));
    }
}
