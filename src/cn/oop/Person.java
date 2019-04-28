package cn.oop;
// 先有类,才有对象
public class Person {
    // 类中有属性和方法
    private String name;
    // 类的属性一般没有值
    private int age;
    // static 是类方法,不用创建对象直接可以调用
    public static void demo(String name){
        System.out.println("name:" + name);
    }

    // 属性可以生成set,get方法

    // get开头的方法，返回属性的值
    public String getName() {
        return name;
    }
    // set开头的方法，都是有参无返(给属性赋值)
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            this.age = 0;
        }else{
            this.age = age;
        }

    }

    // 编写一个方法 void 代表没有返回值
    // private 代表私有的方法,属性. 只能在当前类中使用
    // 属性一般private,而方法public(公共的,在其他类也可以使用)
    public void show(){
        // 此方法仅仅用来对属性的打印输出
        // 不同的对象都会调用此方法,this代表当前调用的那个对象
        System.out.println("姓名为:" + this.name + "年龄为:" + this.age);
    }

}
