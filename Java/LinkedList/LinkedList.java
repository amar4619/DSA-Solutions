package Java.LinkedList;

public class LinkedList {
    ListNode head;
    LinkedList(){
          // create the dataset

        int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
        // setting up the linkedlist
        head = null;
        for (int val : ar) {
            ListNode temp = new ListNode(val);
            if (head == null) {
                head = temp;
            } else {
                ListNode looper = head;
                while (looper != null) {
                    if (looper.next == null) {
                        looper.next = temp;
                        break;
                    }
                    looper = looper.next;
                }
            }

        }
    }

}


class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

}