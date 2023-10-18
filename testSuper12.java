class Animal
{
String color="white";
}
class Dog extends Animal
{
String color="blue";
void printColor()
{
System.out.println("white");
System.out.println("Super.blue");
}
}
class testSuper12
{
public static void main(String args[])
{
Dog ob=new Dog();
ob.printColor();
}
}