class A
{
A()
{
System.out.println("I am default argument constructor");
}
A(int x)
{
this();
System.out.println("I am parameterized constructor");
System.out.println(x);
}
}
class cse5
{
public static void main(String args[])
{
A ob=new A(10);
}
}