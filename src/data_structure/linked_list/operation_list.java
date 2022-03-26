package data_structure.linked_list;

public class operation_list {
    public static void main(String[] args) throws Exception {
        myLinkedList myLinkedList = new myLinkedList();
        myLinkedList.insert(3,0);
        myLinkedList.insert(7,1);
        myLinkedList.insert(2,2);
        myLinkedList.insert(5,3);
        myLinkedList.remove(0);
        myLinkedList.output();
    }
}

class myLinkedList {
    private static class Node {
        int data; // 数据
        Node next; // 链表指向的下一个
        Node(int data) {
            this.data = data;
        }
    }

    private Node head; // 头指针节点
    private Node last; // 尾指针节点
    private int size; // 链表长度

    /**
     * 链表插入
     * @param data 插入元素
     * @param index 插入位置
     * @throws Exception 抛出异常
     */
    public void insert(int data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node insertedNode = new Node(data);
        if (size == 0) {
            // 空链表
            head = insertedNode;
            last = insertedNode;
        } else if (index == 0) {
            // 插入头部
            insertedNode.next = head;
            head = insertedNode;
        } else if (index == size) {
            // 插入尾部
            last.next = insertedNode;
            last = insertedNode;
        } else {
            // 插入中间元素
            Node prevNode = get(index - 1);
            insertedNode.next = prevNode.next;
            prevNode.next = insertedNode;
        }
        size++;
    }

    /**
     * 删除节点
     * @param index 删除节点的位置
     * @return 返回被删除的节点
     */
    public Node remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node removeNode = null;
        if (index == 0) {
            // 删除头节点
            removeNode = head;
            head = head.next;
        } else if (index == size) {
            // 删除尾节点
            Node prevNode = get(index - 1);
            removeNode = prevNode.next;
            prevNode.next = null;
            last = prevNode;
        } else {
            // 删除中间元素
            Node prevNode = get(index - 1);
            Node nextNode = prevNode.next.next;
            removeNode = prevNode.next;
            prevNode.next = nextNode;
        }
        size--;
        return removeNode;
    }

    /**
     * 查找节点
     * @param index 要查找节点的位置
     * @return 返回查找到的节点
     */
    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? "->":""));
            temp = temp.next;
        }
    }
}