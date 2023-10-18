class counter4
{
static int count=0;
counter4()
{
count++;
System.out.println(count);
}
public static void main(String args[])
{
counter4 c1=new counter4();
counter4 c2=new counter4();
counter4 c3=new counter4();
}
}
