class Father
{
void parent()
{
System.out.println("This is parent class");
}
}
class Son extends Father
{
void child()
{
System.out.println("This is child class");
}
}
class TestInheritance8
{
public static void main(String args[])
{
Father ob1=new Father();
Son ob2=new Son();
ob1.parent();
ob2.parent();
ob2.child();
}
}