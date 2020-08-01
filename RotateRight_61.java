
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RotateRight_61 {

    public static void append(ListNode h,int v){
        ListNode p = h;
        if(p == null){
            p = new ListNode(v);
        }
        while (p.next != null){
            p = p.next;
        }
        p.next = new ListNode(v);
    }
    public static void print(ListNode p){
        while (p != null){
            System.out.println(p.val);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        ListNode h = new ListNode(0);
        append(h,1);
        append(h,2);
//        append(h,3);
//        append(h,4);
//        append(h,5);
        print(h);
        ListNode hh = new RotateRight_61().rotateRight(h, 3);
        System.out.println("-------------");
        print(hh);

    }
    public ListNode rotateRight(ListNode head, int k) {
        int len = 0;
        ListNode p = head;
        while(p != null){
            p = p.next;
            len++;
        }
        if(len == 0){
            return head;
        }
        k = k % len;
        //1->2->3->4->5->NULL
        //当k等于0时，需要将p指针移动要1处，移动次数=0
        //当k等于1时，需要将p指针移动要5处，移动次数=4
        //当k等于2时，需要将p指针移动要4处，移动次数=3
        //当k等于3时，需要将p指针移动要3处，移动次数=2
        //当k等于4时，需要将p指针移动要2处，移动次数=1

        //当k等于5时，需要将p指针移动要1处，n=0
        int n = (len - k)%len;//n=移动次数-1

        if(n == 0){
            return head;
        }
        p = head;
        while(p.next != null  && n>1){
            p = p.next;
            n--;
        }
        ListNode h1 = head;
        ListNode h2 = p.next;
        p.next = null;
        ListNode pp = h2;
        while(pp.next != null){
            pp = pp.next;
        }
        pp.next = h1;
        return h2;
    }

}
