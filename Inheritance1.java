class Dog1{
    String breed;
    int age;

    // constructor
    public Dog1(String breed, int age){
        this.breed = breed;
        this.age = age;
        System.out.println("Dog has been created.");
    }

    //methods fo super class
    void barks(){
        System.out.println("Dog is barking");
    }

    void eat(){
        System.out.println("Dog is eating");
    }
}
//child class
class GuideDog extends Dog1{
    String handlerName;

    //constroctor for child class
    public GuideDog(String breed,int age,String handlerName){
        super(breed, age);
        this.handlerName = handlerName;
        System.out.println("This is guide dog");
    }

    void guide(){
       System.out.println("Guide's name is "+ handlerName);
    }
}

//main class
class Inheritance1{
    public static void main(String[] args){
        GuideDog buddy = new GuideDog("Lab",4,"Alex");
        System.out.println("BUddy is a "+buddy.breed+" breed");
        buddy.barks();
        buddy.eat();
        buddy.guide();

    }
}