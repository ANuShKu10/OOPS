class Dog1{
    String breed;
    int age;

    public Dog1(String breed, int age){
        this.breed = breed;
        this.age = age;
        System.out.println("Dog is created.");
    }

    public void bark(){
        System.out.println("Bow Bow");
    }

    public void eat(){
        System.out.println("Dog is eating");
    }
}
class GuideDog extends Dog1{
    String handlerName;

    public GuideDog(String breed, int age, String handlerName){
        super(breed,age);
        this.handlerName = handlerName;
        System.out.println("Its a guide dog");
    }

    public void guide(){
        System.out.println("Guide name is "+handlerName);
    }
}

public class Inheritance1{
    public static void main(String[] args){
        GuideDog buddy = new GuideDog("German SHeford",4,"Rajath");

        System.out.println("Buddys breed is "+buddy.breed);
        buddy.eat();
        buddy.bark();
        buddy.guide();

    }
}