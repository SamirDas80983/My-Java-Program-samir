class Student4
{
int id;
String name;
Student4(int id,String name)
{
this.id=id;
this.name=name;
}
public static void main(String[]args)
{
Student4 s1=new Student4(111,"Samir");
Student4 s2=new Student4(121,"Amit");
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+" "+s2.name);
}
}