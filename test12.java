class Animal
{
String color="white";
}
class Dog extends Animal
{
String color="blue";
void printColor()
{
System.out.println("color");
System.out.println("Super.color");
}
}
class test12
{
public static void main(String args[])
{
Dog ob=new Dog();
ob.printColor();
}
}