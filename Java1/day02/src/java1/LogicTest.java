package java1;
/*
运算符4:逻辑运算符
逻辑运算符，操作的都是boolean 类型的变量或常量，而且运算得结果也是 boolean 类型的值。
运算符说明：
  – & 和 &&&&：表示 且 关系，当符号左右两边布尔值都是 true 时，结果才能
  为 true 。否则，为 false 。
  – | 和 || ：表示 或 关系，当符号两边布尔值有一边为 true 时，结果为
  true 。当两边都为 false 时，结果为 false
  – ! ：表示 非 关系，当变量布尔值为 true 时，结果 为 false 。当变量布尔值
  为 false 时，结果为 true 。
  – ^ ：当符号左右两边布尔值不同时，结果为 true 。当两边布尔值相同时，
  结果为 false 。
  • 理解： 异或，追求的是“异”！

区分 & vs &&
  – 相同点：如果符号左边是 true ，则二者都执行符号右边的操作
  – 不同点： ：& 如果符号左边是 false, 则继续执行符号右边的操作
  && ：如果符号左边是 false, 则不再继续执行符号右边的操作
  – 建议：开发中，推荐使用 &&
区分 | vs ||
  —相同点：如果符号左边是 false ，则二者都执行符号右边的操作
  —不同点： ：| 如果符号左边是 true ，则继续执行符号右边的操作
  || ：如果符号左边是 true ，则不再继续执行符号右边的操作
  建议：开发中，推荐使用
 */
public class LogicTest {
  public static void main(String[] args) {

  }
}
