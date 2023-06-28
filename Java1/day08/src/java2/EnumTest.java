package java2;
/*
枚举类的使用
1. 枚举类的理解：
枚举类型本质上也是一种类，只不过是这个类的对象是有限的、固定的几个，不能让用户随意创建。
2. 举例：
- `星期`：Monday(星期一)......Sunday(星期天)
- `性别`：Man(男)、Woman(女)
- `月份`：January(1月)......December(12月)
- `季节`：Spring(春节)......Winter(冬天)
- `三原色`：red(红色)、green(绿色)、blue(蓝色)
- `支付方式`：Cash（现金）、WeChatPay（微信）、Alipay(支付宝)、BankCard(银行卡)、CreditCard(信用卡)
- `就职状态`：Busy(忙碌)、Free(空闲)、Vocation(休假)、Dimission(离职)
- `订单状态`：Nonpayment（未付款）、Paid（已付款）、Fulfilled（已配货）、Delivered（已发货）、Checked（已确认收货）、Return（退货）、Exchange（换货）、Cancel（取消）
- `线程状态`：创建、就绪、运行、阻塞、死亡
3. 开发中的建议：
> 开发中，如果针对于某个类，其实例是确定个数的。则推荐将此类声明为枚举类。
> 如果枚举类的实例只有一个，则可以看做是单例的实现方式。
4. JDK5.0 之前如何自定义枚举类 （了解）
见代码
5. JDK5.0中使用enum定义枚举类
见代码
6. Enum中的常用方法:
6.1 使用enum关键字定义的枚举类，默认其父类是java.lang.Enum类
    使用enum关键字定义的枚举类，不要再显示的定义其父类。否则报错。
6.2 熟悉Enum类中常用的方法
    String toString(): 默认返回的是常量名（对象名），可以继续手动重写该方法！
    (关注)static 枚举类型[] values():返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值，是一个静态方法
    (关注)static 枚举类型 valueOf(String name)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常：IllegalArgumentException。
    String name():得到当前枚举常量的名称。建议优先使用toString()。
    int ordinal():返回当前枚举常量的次序号，默认从0开始
7. 枚举类实现接口的操作
   情况1：枚举类实现接口，在枚举类中重写接口中的抽象方法。当通过不同的枚举类对象调用此方法时，执行的是同一个方法。
   情况2：让枚举类的每一个对象重写接口中的抽象方法。当通过不同的枚举类对象调用此方法时，执行的是不同的实现的方法。
 */
public class EnumTest {
}
