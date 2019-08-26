package alrigothms;

/**你和你的朋友，两个人一起玩 Nim 游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。

 你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。

 示例:

 输入: 4
 输出: false
 解释: 如果堆中有 4 块石头，那么你永远不会赢得比赛；
      因为无论你拿走 1 块、2 块 还是 3 块石头，最后一块石头总是会被你的朋友拿走

 * @Author: WY
 * @Date: 2019/8/24 11:35
 */
public class NimGame {
    public boolean canWinNim(int n) {
        if (n < 4) { return true; }
//        长度为n + 1的目的是将index 0让出来，从1开始计数
        boolean[] array = new boolean[n + 1];
//        array[n] 时一定能赢
        array[n] = true;
//      从第i位往回看，如果有一个为false，则该位为己方获胜。为了防止array出界，用check保证
        for (int i = n - 1; i > 0; i--){
            if(!check(array, i + 1) || !check(array, i + 2) || !check(array, i + 3)){
                array[i] = true;
            }
        }
        return array[1];
    }
    public boolean check(boolean[] array, int i){
        if (i >= array.length){
            return false;
        }
        return array[i];
    }
}
