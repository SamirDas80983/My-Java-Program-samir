import java.util.*;
public class Assignment4
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter first integer");
int number1=Sc.nextInt();
System.out.println("Enter second integer");
int number2=Sc.nextInt();
int sum=number1+number2;
int diff=number1-number2;
int product=number1*number2;
float average=sum/2;
int distance=number1-number2;
System.out.println("Expected output");
System.out.println("Sum of two integer:"+sum);
System.out.println("Difference of two integer:"+diff);
System.out.println("Product of two integer:"+product);
System.out.println("Average of two number:"+average);
System.out.println("Distence of two number:"+distance);
if(number1>number2)
{
System.out.println("Max integer:"+number1);
System.out.println("Min integer:"+number2);
}
else if(number2>number1)
{
System.out.println("Max integer:"+number2);
System.out.println("Min integer:"+number1);
}
else
{
System.out.println("Enter two different element");
}
}
}
