class counter
{
int count=0;
count()
{
count++;
System.out.println(count);
}
}
class test3
{
public static void main(String args[])
{
counter c1=new counter();
counter c2=new counter();
counter c3=new counter();
}
}