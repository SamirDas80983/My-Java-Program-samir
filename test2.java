class counter
{
static int a=50;
static void show();
{
System.out.println("I am a static method");
System.out.println(a);
show1();
}
static void show1();
{
System.out.println("Nalanda");
}
}
class test2
{
public static void main(String args[])
{
counter c1=new counter();
counter c2=new counter();
counter c3=new counter();
}
}