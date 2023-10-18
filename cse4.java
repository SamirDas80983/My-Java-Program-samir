class A
{
void m()
{
System.out.println("hello m");
}
void n()
{
System.out.println("hello n");
this.m();
}
}
class cse4
{
public static void main(String args[])
{
A ob=new A();
ob.n();
}
}