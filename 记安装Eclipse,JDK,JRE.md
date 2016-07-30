# 记安装Eclipse,JDK,JRE

 - 问题和解决 
 
  - 环境变量
  
  一开始按网上教程上弄不行，出来`java was started but returned exit code=13` 而且后面带了很多的文件路径，其中有一个`C:\ProgramData\Oracle\Java\javapath\...`我忘了具体是什么了。由于之前安装过Java环境，我怀疑是不是残留导致的。因为我把东西都装在D盘了。
  
  然后我看到环境变量那边，我不确定在环境变量那边多出来的`C:\ProgramData\Oracle\Java\javapath`是不是系统自己生成的。所以我把他删掉了。
  所有有关java的我都删掉了，然后我把新安的jdk的地址添了上去，分别是
  ```
  ‪D:\Program Files\Java\jdk1.8.0_91\jre\bin;
  ‪D:\Program Files\Java\jdk1.8.0_91\bin;
  ```
  然后Eclipse出现了新的错误，原来的错误可能解决了吧。
  
  - 位数匹配
  后来出现的错误提示是`Failed to load the JNI shared library jvm.dll`，百度后知道是位数不匹配。找了个64bit的Eclipse来下。就可以了


> 现在写完了Hello World运行完也没什么问题，就后怕那个在环境变量那边删掉的`C:\ProgramData\Oracle\Java\javapath`会不会有影响。
 
 
> 另外这个链接是另外一个学弟在安装的时候遇到的新问题，在按照以上方法操作之后仍然没得到解决。在输入javac后，出现了   找不到或无法加载主类 com.sun.tools.javac.Main  的问题，原因是JDK和JRE安装在了同一个文件夹下导致的问题。对应以下有链接：     
http://blog.csdn.net/sun1956/article/details/8760239
