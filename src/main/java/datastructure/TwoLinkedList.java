
/*
* 双向链表
*
* */

package datastructure;

public class TwoLinkedList {

    private Node head;
    private Node tail;
    private int size;


    private class Node {
        private Object data;
        private Node next;
        private Node prev;

        public Node(Object data) {
            this.data = data;
        }
    }


    public TwoLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    //在头添加节点
    public void addHead(Object value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    //在链表尾巴添加节点
    public void addTail(Object value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Node deleteHead() {
        Node tmp=head;
        if (size!=0){
            head=head.next;
            head.prev=null;
            size--;
        }
        return tmp;
    }


    public Node deleteTail(){
        Node temp=tail;
        if (size!=0){
            tail=tail.prev;
            tail.next=null;
            size--;
        }
        return temp;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public void display(){
        if (size>0){
            Node node=head;
            int tempSize=size;
            if (tempSize==1){
                System.out.println("["+node.data+"}");
                return;
            }
            while (tempSize>0){
                if (node.equals(head)){
                    System.out.print("["+node.data+"->");
                }else if (node.next==null){
                    System.out.println(node.data+"]");
                }else {
                    System.out.println(node.data+"->");
                }
                node=node.next;
                tempSize--;
            }
            System.out.println();
        }else {
            System.out.println("[]");
        }
    }
}





















