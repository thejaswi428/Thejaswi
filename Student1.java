class Student1{
int rollno;
String name,course;
float fee;
Student1(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student1(int rollno,String name,String course,float fee){
this(rollno,name,course);
this.fee=fee;
}
void display(){System.out.println(rollno+""+name+""+course+""+fee);}
}
class TestThis8{
public static void main(String args[]){
Student1 s1=new Student1(428,"theju","java");
Student1 s2=new Student1(453,"siri","java",12000f);
s1.display();
s2.display();
}
}