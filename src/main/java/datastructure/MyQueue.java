package datastructure;

/**
 * @Author twb0223
 * @Date Create in 13:45 2018/3/30
 * @Descripton 队列（queue）是一种特殊的线性表，特殊之处在于它只允许在表的前端（front）进行删除操作，而在表的后端（rear）进行插入操作，和栈一样，队列是一种操作受限制的线性表。进行插入操作的端称为队尾，进行删除操作的端称为队头。队列中没有元素时，称为空队列。

　　队列的数据元素又称为队列元素。在队列中插入一个队列元素称为入队，从队列中删除一个队列元素称为出队。因为队列只允许在一端插入，在另一端删除，所以只有最早进入队列的元素才能最先从队列中删除，故队列又称为先进先出（FIFO—first in first out）线性表。

　　比如我们去电影院排队买票，第一个进入排队序列的都是第一个买到票离开队列的人，而最后进入排队序列排队的都是最后买到票的。

　　在比如在计算机操作系统中，有各种队列在安静的工作着，比如打印机在打印列队中等待打印。

　　队列分为：

　　①、单向队列（Queue）：只能在一端插入数据，另一端删除数据。

　　②、双向队列（Deque）：每一端都可以进行插入数据和删除数据操作。
 */
public class MyQueue {
    private Object[] queArray;
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;

    //查看对头数据
    public Object peekFront() {
        return queArray[front];
    }


    //判断队列是否满了
    public boolean isFull() {
        return (nItems == maxSize);
    }


    /*
     * @Author twb0223
     * @Description 判断队列是否为空
     * @Date 13:48 2018/3/30
     * @Params
     */
    public boolean isEmpty() {
        return (nItems == 0);
    }

    public MyQueue(int s) {
        maxSize = s;
        queArray = new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /*
     * @Author twb0223
     * @Description 添加
     * @Date 13:50 2018/3/30
     */
    public void insert(int value) {
        if (isFull()) {
            System.out.println("队列已满！！！");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queArray[++rear] = value;
            nItems++;
        }
    }

    /*
     * @Author twb0223
     * @Description
     * @Date 13:51 2018/3/30
     */
    public Object remove() {
        Object removeValue = null;
        if (!isEmpty()) {
            removeValue = queArray[front];
            queArray[front] = null;
            front++;
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return removeValue;
        }
        return removeValue;
    }
}
