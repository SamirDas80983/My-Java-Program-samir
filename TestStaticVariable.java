class student
{
int rollno;
String name;
static String college="Nalanda";
student(int r,String n) 
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
class TestStaticVariable
{
public static void main(String args[])
{
student s1=new student(121,"Samir");
student s2=new student(222,"Amit");
s1.display();
s2.display();
}
}
}
