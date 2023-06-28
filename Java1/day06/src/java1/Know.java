package java1;
/*
1、在类的属性中，可以有哪些位置给属性赋值？
① 默认初始化
② 显式初始化
③ 构造器中初始化
④ 通过"对象.属性"或"对象.方法"的方式，给属性赋值
2、这些位置执行的先后顺序是怎样？
顺序：① - ② - ③ - ④
3. 什么是JavaBean?
  JavaBean是一种 Java 语言写成的可重用组件。
  – 好比你做了一个扳手，这个扳手会在很多地方被拿去用。这个扳手也提供
  多种功能 (你可以拿这个扳手扳、锤、撬等等 )，而这个扳手就是一个组件。
  所谓
  JavaBean ，是指符合如下标准的 Java 类：
    – 类是公共的,public
    – 有一个无参的公共的构造器
    – 有属性，且有对应的 get 、 set 方法
  • 用户可以使用 JavaBean 将功能、处理、值、数据库访问和其他任何可以用 Java 代码
  创造的对象进行打包，并且其他的开发者可以通过内部的 JSP 页面、 Servlet 、其他
  JavaBean 、 applet 程序或者应用来使用这些对象。用户可以认为 JavaBe an 提供了一
  种随时随地的复制和粘贴的功能，而不用关心任何改变。
  • 《 Think in Java 》中提到， JavaBean 最初是为 Java GUI 的可视化编程实现的。你拖动
  IDE 构建工具创建一个 GUI 组件（如多选框），其实是工具给你创建 Java 类，并提供
  将类的属性暴露出来给你修改调整，将事件监听器暴露出来。
4.什么是UML 类图
  UML(Unified Modeling Language ，统一建模语言），用来描述 软件模型和 架构的图形化
  语言。
  • 常用的 UML 工具软件有 PowerDesinger、 Rose和 Enterprise Architect。
  • UML 工具软件不仅可以绘制软件开发中所需的各种图表，还可以生成对应的源代码。
  • 在软件开发中，使用 UML类图可以更加直观地描述类内部结构（类的属性和操作）
  以及类之间的关系（如关联、依赖、聚合等）。
  – +表示 public 类型， -表示 private 类型， #表示 protected 类型
  – 方法的写法 : 方法的类型 (+-) 方法名 (参数名： 参数类型 )：返回值类型
  – 斜体表示抽象方法或类。
  - 下划线方法是构造器
 */
public class Know {
  private String name;
  private int age;
  public Know(){

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
