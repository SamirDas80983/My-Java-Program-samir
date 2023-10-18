class A
{
A()
{
this(20);
System.out.println("I am default argument constructor");
}
A(int x)
{
System.out.println("I am parameterized constructor");
System.out.println(x);
}
}
class cse6
{
public static void main(String args[])
{
A ob=new A();
}
}