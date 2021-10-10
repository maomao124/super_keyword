/**
 * Project name(项目名称)：super关键字
 * Package(包名): PACKAGE_NAME
 * Class(类名): People
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/10
 * Time(创建时间)： 15:25
 * Version(版本): 1.0
 * Description(描述)： 由于子类不能继承父类的构造方法，因此，如果要调用父类的构造方法，可以使用 super 关键字。
 * super 可以用来访问父类的构造方法、普通方法和属性。
 * super 关键字的功能：
 * 在子类的构造方法中显式的调用父类构造方法
 * 访问父类的成员方法和变量。
 * super调用父类构造方法
 * super 关键字可以在子类的构造方法中显式地调用父类的构造方法，基本格式如下：
 * super(parameter-list);
 * 其中，parameter-list 指定了父类构造方法中的所有参数。super( ) 必须是在子类构造方法的方法体的第一行。
 * super调用成员方法
 * 当父类和子类都具有相同的方法名时，可以使用 super 关键字访问父类的方法
 * super 关键字的用法：
 * super.父类属性名：调用父类中的属性
 * super.父类方法名：调用父类中的方法
 * super()：调用父类的无参构造方法
 * super(参数)：调用父类的有参构造方法
 * 如果构造方法的第一行代码不是 this() 和 super()，则系统会默认添加 super()。
 * this 关键字的用法：
 * this.属性名：表示当前对象的属性
 * this.方法名(参数)：表示调用当前对象的方法
 * <p>
 * 关于 Java super 和 this 关键字的异同，可简单总结为以下几条。
 * 子类和父类中变量或方法名称相同时，用 super 关键字来访问。可以理解为 super 是指向自己父类对象的一个指针。在子类中调用父类的构造方法。
 * this 是自身的一个对象，代表对象本身，可以理解为 this 是指向对象本身的一个指针。在同一个类中调用其它方法。
 * this 和 super 不能同时出现在一个构造方法里面，因为 this 必然会调用其它的构造方法，其它的构造方法中肯定会有 super 语句的存在，
 * 所以在同一个构造方法里面有相同的语句，就失去了语句的意义，编译器也不会通过。
 * this( ) 和 super( ) 都指的是对象，所以，均不可以在 static 环境中使用，包括 static 变量、static 方法和 static 语句块。
 * 从本质上讲，this 是一个指向对象本身的指针, 然而 super 是一个 Java 关键字。
 */

public class People
{
    protected String name;
    protected int age;
    protected String sex;
    protected int id = 12345;

    public People(String name, int age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public People(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void message()
    {
        System.out.println("This is person class");
    }
}
