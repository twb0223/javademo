package datastructure;

/*
栈（英语：stack）又称为堆栈或堆叠，栈作为一种数据结构，是一种只能在一端进行插入和删除操作的特殊线性表。它按照先进后出的原则存储数据，
先进入的数据被压入栈底，最后的数据在栈顶，需要读数据的时候从栈顶开始弹出数据（最后一个数据被第一个读出来）。栈具有记忆作用，对栈的插入与删除操作中
不需要改变栈底指针。
栈是允许在同一端进行插入和删除操作的特殊线性表。允许进行插入和删除操作的一端称为栈顶(top)，另一端为栈底(bottom)；栈底固定，而栈顶浮动；
栈中元素个数为零时称为空栈。插入一般称为进栈（PUSH），删除则称为退栈（POP）。
由于堆叠数据结构只允许在一端进行操作，因而按照后进先出（LIFO, Last In First Out）的原理运作。栈也称为后进先出表。



* 这个栈是用数组实现的，内部定义了一个数组，一个表示最大容量的值以及一个指向栈顶元素的top变量。构造方法根据参数规定的容量创建一个新栈，
* push()方法是向栈中压入元素，指向栈顶的变量top加一，使它指向原顶端数据项上面的一个位置，并在这个位置上存储一个数据。
* pop()方法返回top变量指向的元素，然后将top变量减一，便移除了数据项。要知道 top 变量指向的始终是栈顶的元素。
产生的问题：
　　1.上面栈的实现初始化容量之后，后面是不能进行扩容的（虽然栈不是用来存储大量数据的），如果说后期数据量超过初始容量之后怎么办？（自动扩容）

　　2.我们是用数组实现栈，在定义数组类型的时候，也就规定了存储在栈中的数据类型，那么同一个栈能不能存储不同类型的数据呢？（声明为Object）

　　3.栈需要初始化容量，而且数组实现的栈元素都是连续存储的，那么能不能不初始化容量呢？（改为由链表实现）
* */
public class StackByArray {
    private int[] array;
    private int maxSize;
    private int top;

    public StackByArray(int size) {
        this.maxSize = size;
        array = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            array[++top] = value;
        }
    }

    public int pop() {
        return array[top--];
    }

    public int peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
