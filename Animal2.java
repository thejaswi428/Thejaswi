class Animal2{
Animal2(){System.out.println("Animal is created");}
}
class Dog extends Animal2{
Dog(){
System.out.println("dog is created");
}
}
class TestSuper4{
public static void main(String args[]){
Dog d=new Dog();
}
}

