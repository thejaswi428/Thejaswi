class Animal4{
public void move(){System.out.println("Call from Animal class");}
}
class Wild extends Animal4{
public void move(){System.out.println("Call from Wild class");}
}
class Pet extends Animal4{
public void move(){System.out.println("Call from Pet class");}
}
class TestAnimal{
public static void main(String args[]){
Animal4 a=new Animal4();//Animal reference and object
Animal4 w=new Wild();//animal reference but wild object
Animal4 p=new Pet();//Animal reference pet object
a.move();//runs the method in Animal class
w.move();//runs the method in wild class
p.move();//runs the method in pet class
}
}	