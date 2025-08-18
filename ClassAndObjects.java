class Cat{
    String breed;
    int age;
    String color;

    //method 
    void meowing(){
        System.out.println("Mewo,Mewo!");
    }

    void catInfo(){
        System.out.println("This cat is of "+breed+" type of age "+age+" and of color of "+color);
    }

}
public class ClassAndObjects{
    public static void main(String[] args ){
    //obj1
    Cat tommy = new Cat();
    tommy.breed = "Saimse ";
    tommy.age=3;
    tommy.color = "Reddish Brown";

    //obj2
    Cat kitty = new Cat();
    kitty.breed = "Main Coon";
    kitty.age = 5;
    kitty.color = "Gold";

    //Calling Methods
    tommy.meowing();
    tommy.catInfo();

    kitty.meowing();
    kitty.catInfo();

    }
    
}