


public class MyLinkedList {

    int size;
    Node head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int count = 0;
        Node tempNode = head;
        while(tempNode.next!= null && index > count ){
            tempNode = tempNode.next;
            count++;
        }
        get();
        return tempNode.val;
    }
    public void get() {
        Node tempNode = head;
        while (tempNode.next != null) {
            System.out.println("None " + " = " + tempNode.val);
            tempNode = tempNode.next;
        }
        System.out.println("None " + " = " + tempNode.val);
    }


    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        Node tempNode = head.next;
        newNode.next = tempNode;
        head = newNode;

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node tempNode = head.next;
        while(tempNode.next!= null){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        int count = 0;
        Node newNode = new Node(val);
        Node tempNode = head.next;
        while(tempNode.next!= null && index > count + 1 ){
            tempNode = tempNode.next;
            count++;
        }
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int count = 0;

        Node tempNode = head;
        while(tempNode.next!= null && index > count + 1 ){
            tempNode = tempNode.next;
            count++;
        }
        //tempNode.next = tempNode.next.next;
//        if(tempNode.next != null && tempNode.next.next != null)
//        tempNode.next = tempNode.next.next;
//        else if( tempNode.next == null) {
//
//        }
    }


    public static void main(String[] args) {

//        ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
//          [[],[1],[3],[1,2],[1],[1],[1]]
        MyLinkedList myLinkedList = new MyLinkedList();
        // 0
        myLinkedList.addAtHead(1);
        // 1 0
        myLinkedList.addAtTail(3);
        // 1 0 3
        myLinkedList.addAtIndex(1,2);
        // 1 2 0 3
        myLinkedList.get(1);
//        myLinkedList.addAtTail(4);
//        myLinkedList.addAtTail(5);

        myLinkedList.deleteAtIndex(1);
        myLinkedList.get(1);

    }
}


