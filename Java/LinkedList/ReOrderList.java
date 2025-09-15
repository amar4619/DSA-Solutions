package Java.LinkedList;

//Leetcode problem : https://leetcode.com/problems/reorder-list/description/
/*===============NOTES======================================

    The code works fine but I have used extra space to reverse 
    which can be ignored

*/
public class ReOrderList {

    public static void reorderList(Node head) {

        // find the middle
        Node slow = head;
        Node fast = head;
        Node prevNode = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prevNode = slow;
            slow = slow.next;
        }
        prevNode = slow;
        System.out.println(slow.data);
        Node checker = slow;

        // get the half list and reverse it
        Node secList = new Node(slow.data);
        Node newHead = secList;
        Node bSlow = null;
        slow = slow.next;
        while (slow != null) {
            secList.next = new Node(slow.data);
            secList = secList.next;
            bSlow = slow;
            slow = slow.next;

        }
        // System.err.println(newHead.data);
        // reverse the half of the list
        Node prev = null;
        Node cur = newHead;
        Node nextVal = newHead;

        while (cur != null) {
            nextVal = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextVal;
        }

        // System.err.println(cur.data);
        // make new list
        Node current = head;
        boolean check = true;
        Node temp = null;
        Node temp1 = null;
        while (current != checker) {
            if (check) {
                temp = current.next;
                temp1 = prev.next;
                current.next = prev;
                prev.next = temp;
                prev = temp1;

                check = false;
            } else {
                current = current.next.next;
                check = true;
            }
        }
        prevNode.next = null;
        System.out.println(head);

    }

    public static void main(String[] args) {
        // create the dataset

        int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
        // setting up linkedlist
        Node head = null;
        for (int val : ar) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                Node looper = head;
                while (looper != null) {
                    if (looper.next == null) {
                        looper.next = temp;
                        break;
                    }
                    looper = looper.next;
                }
            }

        }
        reorderList(head);
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
