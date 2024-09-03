public class SinglyLinkedList_06{
    private ListNode head;
    private static class ListNode{
        private int data; // Generic type data
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        SinglyLinkedList_06 sll = new SinglyLinkedList_06();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        // connecting them together
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
    }
}