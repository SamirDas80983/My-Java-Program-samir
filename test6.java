class counter
{
static int a=50;
static void show()
{
System.out.println("I am a static method");
System.out.println(a);
show1();
}
static void show1()
{
System.out.println("nalanda");
}
}
class test6
{
public static void main(String args[])
{
counter.show();
}
}
