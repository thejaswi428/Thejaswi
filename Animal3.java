class Animal3{
public void move(){System.out.println("Animals can move");}
}
class Dog extends Animal3{
public void move(){System.out.println("Dogs can walk and run");}
}
class TestDog{
public static void main(String args[]){
Animal3 a=new Animal3();//Animal reference and object
Animal3 b=new Dog();//animal reference but Dog object
a.move();//runs the method in Animal class
b.move();//runs the method in Dog class
}
}