class A
{
void m()
{
System.out.println("Hello m");
}
void n()
{
System.out.println("Hello n");
this.m();
}
}
class test11
{
public static void main(String args[])
{
A ob=new A();
ob.n();
}
}