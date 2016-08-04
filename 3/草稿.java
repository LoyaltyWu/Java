
/*
[类修饰词列表] class 类名 [extends 父类名] [implements 接口名称列表]
{
		类体
}
// ////////////////////////////////////
// 类修饰词
// ////////////////////////////////////
//类修饰词
//public,abstract,final,strictfp
//public 可以被Java的所有软件包使用
//abstract 抽象类
//final 不能做父类
//strictfp 类:各个浮点数的表示和运算严格遵循IEEE标准

*/
/*
// ////////////////////////////////////
// 域修饰词
// ////////////////////////////////////
[域修饰词列表] 类型 变量名或带初始化的变量名列表
int m_radius = 0;






域修饰词
//public,protected,private,static,final,transient,voilatile

//public,protected,private 不能同时存在
//static                   静态
//final                    首次赋值后,不能再修改该成员域的值
//volatile 								 在多线程程序设计中采用同步机制
//transient 表明当前的成员域是一种暂时的成员域，即当进行对象保存的时候可以不必保存当前的成员域




*/

/*
//类的成员方法 简称方法 格式为:
[方法修饰词列表] 返回类型 方法名 (方法的参数列表)
//第一行叫做 定义的头部/成员方法的声明
{
	方法体
}

方法修饰词:public,protected,private,abstract,static,final,synchronized,strictfp
公有 保护 私有 抽象 静态 

final子方法一样的存在,该类的子类中不能出现同样的声明

synchronized表明当前成员方法是一种同步成员方法

strictfp 浮点数运算严格按照IEEE 754方法

//成员方法定义的头部示例:
public int mb_method()
public static void main(String args[])



*/



/*
类的构造方法
[构造方法修饰词列表] 类名 (方法的参数列表)
//第一行是构造方法的头部 构造方法的声明
{
	方法体
}


构造方法3个特点:
1.构造方法和类名相同 
2.无返回类型
(3.可以有多个构造方法)???????
3.任何一个类都有一个构造方法,如果没有显式地定义构造方法,系统会默认地定义一个构造方法
*/


/*
在类体中一般是:


1.成员域
2.构造方法
3.成员方法

 	
*/

/*
创建类的实例对象

new 构造方法名(构造方法调用参数列表)

举个例子:
类Integer的构造方法:
public Integer (int value)
new Integer (11)
Integer a = new Integer(11);

*/

/*
引用数据类型变量
4个基本属性:
变量名, 数据类型, 存储单元, 变量值
类名 变量名或带初始化的变量名列表
Integer a;
*/

Integer a = new Integer (11);
//a值是个引用值
//指向实例中生成的实例对象
//
public int intValue();
a.intValue();

/*
类的实例对象的生命周期
1. new 运算符和类的构造方法创建类的实例对象
2. 进行实例对象的初始化
2.1 若带有
*/

Integer a = new Integer (11);
a = NULL;//那么a不再指向实例对象,所占据的内存称为"垃圾",回收内存也称回收垃圾


