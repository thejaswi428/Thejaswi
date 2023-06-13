class Animal1{
Animal1(){System.out.println("Animal is created");}
}
class Dog extends Animal1{
Dog(){
super();
System.out.println("dog is created");
}
}
class TestSuper3{
public static void main(String args[]){
Dog d=new Dog();
}
}

