/**
 * Project name(项目名称)：super关键字
 * Package(包名): PACKAGE_NAME
 * Class(类名): Cat
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/10
 * Time(创建时间)： 15:46
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Cat extends Animal
{
    private String name;

    public Cat(String name, String name2)
    {
        super.name = name;
        this.name = name2;
    }

    public void display()
    {
        System.out.println("我是:" + super.name + ",名字为：" + this.name);
    }
}
