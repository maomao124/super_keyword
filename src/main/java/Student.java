/**
 * Project name(项目名称)：super关键字
 * Package(包名): PACKAGE_NAME
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/10
 * Time(创建时间)： 15:25
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student extends People
{
    protected int age = 18;
    protected int id = 15;

    public Student(String name, int age, String sex)
    {
        super(name, age, sex);
    }

    public Student(String name, int age)
    {
        super(name, age); // 调用父类中含有2个参数的构造方法
    }

    public void display()
    {
        System.out.println("年龄:" + super.age);
        System.out.println(super.id);
        message();
        super.message();
    }

    void message()
    {
        System.out.println("This is student class");
    }

}
