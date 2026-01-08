package Java.LinkedList;

public class RemoveNthNode {

public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head,temp1 = head,old=head;
        //temp is the last pointer with the hope that will be nth element from last
        //temp1 is moving pointer
        //old is 
        while(temp != null && temp.next != null){
            temp1= temp;
            count=0;
            for(int i=0;i<n && temp1 != null && temp1.next != null;++i){
                temp1 = temp1.next;
                count++;
            }
            //Here I the idea is that if temp1 is at last node of the list then 
            //temp.next is the nth element from last
            if(temp1.next == null){
                temp.next = temp.next.next;
                break;
            }
            //If successfully moved n elements then store the old pointer
            if(count == n){
                old = temp;
                temp = temp1;
            }else{
                for(int i=0;i<count;++i){
                    old = old.next;
                }
                old.next = old.next.next;
                break;
            }


        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ListNode head = removeNthFromEnd(ls.head,3);
        System.out.println("Hi");
    }



}
