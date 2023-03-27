public class getDecimalValue1 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }



    public  int getDecimalValue(ListNode head) {
        int size = -1;
        int sum = 0;

        for(ListNode temp = head; temp != null; temp= temp.next){
            size++;
        }
        ListNode node = head;
        while(node != null){
            sum += node.val * Math.pow(2,size--);
            node = node.next;
        }
        return sum;
    }
}
