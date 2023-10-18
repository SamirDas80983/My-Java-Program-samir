import java.util.*;
public class sumandaverage
{
public static void main(String args[])
{
int sum,average;
Scanner Sc=new Scanner(System.in);
System.out.println("Enter first number");
int number1=Sc.nextInt();
System.out.println("Enter second number");
int number2=Sc.nextInt();
System.out.println("Enter third number");
int number3=Sc.nextInt();
System.out.println("Enter fourth number");
int number4=Sc.nextInt();
System.out.println("Enter fifth number");
int number5=Sc.nextInt();
sum=number1+number2+number3+number4+number5;
average=sum/5;
System.out.println("sum:"+sum);
System.out.println("average:"+average);
}
}