package alrigothms;

import javax.swing.*;
import java.util.List;

/**给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 示例：

 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807

 * @Author: WY
 * @Date: 2019/8/23 13:21
 */
public class AddTwoNums {
    public ListNode addTwoNums(ListNode l1,ListNode l2){
        if (l1 == null && l2 == null){ return null; }
//        定义虚结点，作指针
        ListNode dummy = new ListNode(0);
//        定义head指向dummy，留住dummy当前位置的值
        ListNode head = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
//            将l1的值赋给val1。如果l1的值等于null，就将它变为0，反之则保持l1的值不变
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + carry;
//            head由dummy指向下一位，其值为该位数之和对十取余
            head.next = new ListNode(sum % 10);
            head = head.next;
            carry = sum / 10;
            if (l1 != null) { l1 = l1.next; }
            if (l2 != null) { l2 = l2.next; }
        }
        return dummy.next   ;
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
