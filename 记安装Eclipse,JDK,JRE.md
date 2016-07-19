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
