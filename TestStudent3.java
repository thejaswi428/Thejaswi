class Student{
int id;
String name;
}
class TestStudent3{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.name="theju";
s1.id=428;
s2.name="siri";
s2.id=453;
System.out.println(s1.id+""+s1.name);
System.out.println(s2.id+""+s2.name);
}
}