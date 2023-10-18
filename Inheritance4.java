class Animal
{
void eat()
{
System.out.println("eating");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("barking");
}
}
class Inheritance4
{
public static void main(String args[])
{
Dog ob=new Dog();
ob.eat();
ob.bark();
}
} 
