class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


public class JigarLinkedList {
    int size;
    ListNode head;  // sentinel node as pseudo-head

    public JigarLinkedList() {
        size = 1;
        head = new ListNode(0);
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
     //1 2 3
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = head.next;
        }
        return curr.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);

         {
            newNode.next = head;
            head = newNode;
        }
        size++;
        ListNode prev1 = head;
        for (int i = 0; i < size; i++) {
            System.out.println("addathead  " + prev1.val);
            prev1 = prev1.next;

        }

    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {

        ListNode tempNode = head;
        ListNode newNode = new ListNode(val);
       {
           while(tempNode.next != null ) {
               tempNode = tempNode.next;
           }
           tempNode.next = newNode;

//           for (int i = 0; i < size; i++) {
//                tempNode = tempNode.next;
//                if (tempNode.next == null) {
//                    tempNode.next = newNode;
//                }
//            }
            size++;
        }
//    1- 2- 3
//        ListNode prev1 = head;
//        for (int i = 0; i < size; i++) {
//            System.out.println("addattail  " + prev1.val);
//            prev1 = prev1.next;
//
//        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) index = 0;
        size++;
        ListNode prev = head;
        for (int i = 0; i < index - 1 ; ++i) {
            prev = prev.next;

        }
        ListNode addNode = new ListNode(val);
        addNode.next = prev.next;
        prev.next = addNode;

        ListNode prev1 = head;
        for (int i = 0; i < size; i++) {
            System.out.println("addatindex  " + prev1.val);
            prev1 = prev1.next;

        }

    }


    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode curr = head;
        for (int i = 0; i < index -1; ++i) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;


    }

    public static void main(String[] args) {

//        ["JigarLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
//          [[],[1],[3],[1,2],[1],[1],[1]]
        JigarLinkedList JigarLinkedList = new JigarLinkedList();
        // 0
        JigarLinkedList.addAtHead(1);
        // 1 0
        JigarLinkedList.addAtTail(3);
        // 1 0 3
        JigarLinkedList.addAtIndex(1, 2);
        // 1 2 0 3
        JigarLinkedList.get(1);
//        JigarLinkedList.addAtTail(4);
//        JigarLinkedList.addAtTail(5);

        JigarLinkedList.deleteAtIndex(1);
        //1 0 3
        JigarLinkedList.get(1);
 /*         None = 0
            None = 1
            None = 2
            None = 3
            None = 0
            None = 1
            None = 3  */
    }
}


/**
 * Your JigarLinkedList object will be instantiated and called as such:
 * JigarLinkedList obj = new JigarLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */