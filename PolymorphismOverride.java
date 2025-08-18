class Animal{
    void sound(){
        System.out.println("This animal makes sound");
    }
}

class Dog5 extends Animal{
    @Override
    void sound(){
        System.out.println("The dog makes sound as Bow Bow");
    }
}

class Cat5 extends Animal{
    @Override
    void sound(){
        System.out.println("The cat makes sound as mewo mweo");
    }
}

public class PolymorphismOverride {
    public static void main(String[] args) {
        //obj for parent class
        Animal myAnimal = new Animal();
        //obj for child class
        Animal myDog = new Dog5();
        Animal myCat = new Cat5();

        // When we call the method, Java determines at RUNTIME
        // which version of the method to execute based on the actual object.

        myAnimal.sound();
        myDog.sound();
        myCat.sound();

    }
}
    

