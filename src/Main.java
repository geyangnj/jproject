import cn.oop.Person;

// OOP
public class Main {

    // 编写一个main方法(java程序入口)
    public static void main(String[] args) {
        // 1: 通过类创建一个对象, 创建对象的语法: 类名称 对象名 = new 类名称()
        Person p1= new Person();  // 创建了一个对象
        // 2: 给对象的属性赋值，"."代表的
        p1.setName("张三");
        p1.setAge(-100);
        p1.show();

        Person p2= new Person();
        p2.setName("李四");
        p2.setAge(28);
        p2.show();
        // 类方法,直接通过类调用
        Person.demo("李四");

    }
}
