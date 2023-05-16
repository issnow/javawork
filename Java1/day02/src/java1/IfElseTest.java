package java1;
/*
结构1：单分支条件判断：if
格式：
if(条件表达式)｛ 语句块; ｝
  说明：条件表达式必须是布尔表达式（关系表达式或逻辑表达式）或 布尔变量。
  执行流程：
  3. 首先判断条件表达式看其结果是 true 还是 false
  4. 如果是 true 就执行语句块
  5.如果是 false 就不执行语句块
结构2：双分支条件判断：if...else
格式：
if(条件表达式) { 语句块1; }else { 语句块2; }
  执行流程：
  6. 首先判断条件表达式看其结果是 true 还是 false
  7. 如果是 true 就执行语句块 1
  8. 如果是 false 就执行语句块 2
结构3：多分支条件判断：if...else if...else
格式：
if (条件表达式1) { 语句块1; }
else if (条件表达式2) { 语句块2; } ... }
else if (条件表达式n) { 语句块n; }
else { 语句块n+1; }
  说明：一旦条件表达式为true，则进入执行相应的语句块。执行完对应的语句块之后，就跳出当前结构。
  执行流程：
  9. 首先判断关系表达式 1 看其结果是 true 还是 false
  10. 如果是 true 就执行语句块 1 ，然后结束当前多分支
  11. 如果是 false 就继续判断关系表达式 2 看其结果是 true 还是 false
  12. 如果是 true 就执行语句块 2 ，然后结束当前多分支
  13. 如果是 false 就继续判断关系表达式 看其结果是 true 还是 false
  …
  n. 如果没有任何关系表达式为true，就执行语句块n+1，然后结束当前多分支
 */
public class IfElseTest {
  public static void main(String[] args) {
    /*
    案例1：成年人心率的正常范围是每分钟60-100次。体检时，
    如果心率不在此范围内，则提示需要做进一步的检查。
     */
    int heartBeats = 89;
    if(heartBeats >= 60 &&heartBeats <= 100){
      System.out.println("正常");
    }else {
      System.out.println("不正常");
    }
  }
}
