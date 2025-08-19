/*
 * The Abstract Class
 * You cannot create an object of this class.
 * It acts as a blueprint for other classes.
 */
abstract class Animals1{
    // An abstract method. It has no body.
    // This forces subclasses to provide an implementation.
    public abstract void Animalsound();

    //regular method
    public void sleep(){
        System.out.println("zzz");
    }

}
//child class
/*
 * The Subclass
 * It MUST implement all abstract methods from the parent.
 */
class Dog9 extends Animals1{
    public void Animalsound(){
         // Here, we provide the body for the abstract animalSound() method.
        System.out.println("Bow Bow");
    }
}

//Main  class
public class AbstractionClass{
    public static void main(String[] args) {
        Dog9 myDog2 = new Dog9();
        myDog2.Animalsound();
        myDog2.sleep();
    }
}