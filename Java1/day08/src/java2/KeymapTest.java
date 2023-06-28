package java2;

/*
第1组：通用型
说明             快捷键
--------------------------------
复制代码-copy     ctrl + c
粘贴-paste       ctrl + v
剪切-cut         ctrl + x
撤销-undo        ctrl + z
反撤销-redo      ctrl + shift + z
保存-save all    ctrl + s
全选-select all  ctrl + a
第2组：提高编写速度（上）
说明                                                快捷键
-------------------------------------------------------------------
智能提示-edit                                       alt + enter
提示代码模板-insert live template                    ctrl+j
使用xx块环绕-surround with ...                      ctrl+alt+t
调出生成getter/setter/构造器等结构-generate ...       alt+insert
自动生成返回值变量-introduce variable ...             ctrl+alt+v
复制指定行的代码-duplicate line or selection          ctrl+d
删除指定行的代码-delete line                          ctrl+y
切换到下一行代码空位-start new line                   shift + enter
切换到上一行代码空位-start new line before current    ctrl +alt+ enter
向上移动代码-move statement up                       ctrl+shift+↑
向下移动代码-move statement down                     ctrl+shift+↓
向上移动一行-move line up                            alt+shift+↑
向下移动一行-move line down                          alt+shift+↓
方法的形参列表提醒-parameter info                     ctrl+p
第3组：提高编写速度（下）
说明                                         快捷键
---------------------------------------------------------
批量修改指定的变量名、方法名、类名等-rename        shift+f6
抽取代码重构方法-extract method ...            ctrl+alt+m
重写父类的方法-override methods ...            ctrl+o
实现接口的方法-implements methods ...          ctrl+i
选中的结构的大小写的切换-toggle case             ctrl+shift+u
批量导包-optimize imports                     ctrl+alt+o
第4组：类结构、查找和查看源码
说明                                                      快捷键
-----------------------------------------------------------------------------------------
如何查看源码-go to class...                             ctrl + 选中指定的结构 或 ctrl+n
显示当前类结构，支持搜索指定的方法、属性等-file structure     ctrl+f12
退回到前一个编辑的页面-back                               ctrl+alt+←
进入到下一个编辑的页面-forward                            ctrl+alt+→
打开的类文件之间切换-select previous/next tab             alt+←/→
光标选中指定的类，查看继承树结构-Type Hierarchy             ctrl+h
查看方法文档-quick documentation                        ctrl+q
类的UML关系图-show uml popup                            ctrl+alt+u
定位某行-go to line/column                              ctrl+g
回溯变量或方法的来源-go to implementation(s)              ctrl+alt+b
折叠方法实现-collapse all                                ctrl+shift+ -
展开方法实现-expand all                                  ctrl+shift+ +
第5组：查找、替换与关闭
说明                                               快捷键
--------------------------------------------------------------
查找指定的结构                                        ctrl+f
查找与替换-replace                                   ctrl+r
直接定位到当前行的首位-move caret to line start        home
直接定位到当前行的末位 -move caret to line end         end
全项目搜索文本-find in path ...                      ctrl+shift+f
第6组：调整格式
说明                                          快捷键
--------------------------------------------------------------
格式化代码-reformat code                        ctrl+alt+l
使用单行注释-comment with line comment          ctrl + /
使用/取消多行注释-comment with block comment     ctrl + shift + /
选中数行，整体往后移动-tab                        tab
选中数行，整体往前移动-prev tab                   shift + tab
 */
public class KeymapTest {
  int aaa = 10;

  public static void main(String[] args) {
    fn();

    Integer i = 10;

    Number n2 = new Number() {
      @Override
      public int intValue() {
        return 0;
      }

      @Override
      public long longValue() {
        return 0;
      }

      @Override
      public float floatValue() {
        return 0;
      }

      @Override
      public double doubleValue() {
        return 0;
      }
    };
    System.out.println(n2.intValue());

  }

  private static void fn() {
    String str = "sdfsfd";
    System.out.println(str);
    System.out.println(str);
    System.out.println(str);
    System.out.println(str);
    System.out.println(str);
  }


}

class Person1 {
  public void eat() {
  }
}

interface fly {
  void flyable();
}

class Student1 extends Person1 implements fly {
  @Override
  public void eat() {
    super.eat();
  }

  @Override
  public void flyable() {

  }
}






































