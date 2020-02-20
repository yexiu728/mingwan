package study.day2;

public class Test0 {
    public static void main(String[] args) {

        /*
Test1：

8 种数据类型
    byte            short                   int                                     long        float       double      char    boolean
    1                   2                       4                                       8               4           8               2       1           字节
    -128~127    -32768~32767    -2147483648~2147483647

取模%
    System.out.println(7 % 3); // 1
    System.out.println(7 % -3); // 1
    System.out.println(-7 % 3); // -1
    System.out.println(-7 % -3); // -1
    取余结果符号与左边符号相同

标识符：是指在程序中，我们自己定义的名字。比如类的名字、方法的名字和变量的 名字等等，都是标识 符。
    命名规则：硬性要求
        标识符可以包含 英文字母26个(区分大小写) 、 0-9数字 、 $（美元符号） 和 _（下划线） 。
        标识符不能以数字开头。
        标识符不能是关键字。
        区分大小写。

命名规范： 软性建议
    类名规范：每个单词首字母大写（大驼峰式）。
    方法名和变量名规范：第一个单词全小写，后面每个单词首字母大写（小驼峰 式）。
    包名规范：全部小写。

自动类型转换
    范围小的类型向范围大的类型提升， byte 、 short 、 char 运算时直接提升为 int 。

强制类型转换
    将 取值范围大的类型 强制转换成 取值范围小的类型
    float f = 10.1F; // 小数不加F 会报错
        浮点型默认为double 类型，转成float 类型需要强制转换，加上F 则意味着这个数是float 类型
    long l = 2147483648L; // 不加L 会报错
        因为数值大于int 类型的最大值，如果不加L 则意味着这个数为int 类型，超出范围会报错

方法
    修饰符 返回值类型 方法名 （参数列表）｛
        代码...
    }

    定义格式解释：
        修饰符： 目前固定写法 public static 。
        返回值类型： 目前固定写法 void ，其他返回值类型在后面的课程讲解。
        方法名：为我们定义的方法起名，满足标识符的规范，用来调用方法。
        参数列表： 目前无参数， 带有参数的方法在后面的课程讲解。

获取位数
    int num = 1234;
    g = num % 10;
    s = num / 10 % 10;
    b = num / 100 % 10;
    q = num / 1000 % 10;

switch 语句注意
    switch语句中，表达式的数据类型，可以是byte，short，int，char，enum（枚举），JDK7后可以接收字符串。

case的穿透性
    在switch语句中，如果case的后面不写break，将出现穿透现象，
    也就是不会在判断下一个case的值，直接向后运行，直到遇到break，或者整体switch结束。

char 类型（ASCII 编码表）
    0：48
    A：65
    a：97



        * */
    }
}