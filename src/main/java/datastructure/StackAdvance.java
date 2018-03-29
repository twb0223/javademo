package datastructure;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackAdvance {
    private Object[] elementData;

    private int top;
    private int size;

    public StackAdvance() {
        this.elementData = new Object[10];
        this.top = -1;
        this.size = 10;
    }

    public StackAdvance(int initCapacity) {
        this.elementData = new Object[initCapacity];
        if (initCapacity < 0) {
            throw new IllegalArgumentException("栈初始容量不能小于0: " + initCapacity);
        }
        this.top = -1;
        this.size = initCapacity;
    }

    public Object push(Object item) {
        isGrow(top + 1);
        elementData[++top] = item;
        return item;
    }

    //弹出栈顶元素
    public Object pop() {
        Object obj = peek();
        remove(top);
        return obj;
    }

    public Object peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return elementData[top];
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return (top == -1);
    }

    //删除栈顶元素
    public void remove(int top) {
        //栈顶元素置为null
        elementData[top] = null;
        this.top--;
    }

    private boolean  isGrow(int minCapacity) {
        int oldCapacity = size;
        //如果当前元素压入栈之后总容量大于前面定义的容量，则需要扩容
        if (minCapacity >= oldCapacity) {
            //定义扩大之后栈的总容量
            int newCapacity = 0;
            //栈容量扩大两倍(左移一位)看是否超过int类型所表示的最大范围
            if ((oldCapacity << 1) - Integer.MAX_VALUE > 0) {
                newCapacity = Integer.MAX_VALUE;
            } else {
                newCapacity = (oldCapacity << 1);//左移一位，相当于*2
            }
            this.size = newCapacity;
            //int[] newArray = new int[size];
            elementData = Arrays.copyOf(elementData, size);
            return true;
        } else {
            return false;
        }
    }

}
