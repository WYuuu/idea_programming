package alrigothms;

/**编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。

 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。

 示例 1：

 输入：["h","e","l","l","o"]
 输出：["o","l","l","e","h"]

 * @Author: WY
 * @Date: 2019/8/24 11:05
 */
public class ReverseString {
    public char[] reverseString(char[] s) {
        if (s == null || s.length == 0) { return s;}
//        创建左右两个指针，分别指向头尾
        int left = 0;
        int right = s.length - 1;
    /**
     * 当左指针小于右指针时，交换这两个指针所指内容的位置
     * 再将左指针右移一位，右指针左移一位，直至左指针大于右指针
     */
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
}
