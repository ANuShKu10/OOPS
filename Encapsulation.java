class Dog{
    //Attributes are private 
    private String breed;
    private int age;
    private String color;
    // public methods to access attributes
    //to display - Get Method
    public String getBreed(){
        return breed;
    }
    // to store data / set method
    public void setBreed(String newBreed){
        breed = newBreed;
    }
    

    // to display age
    public int getAge(){
        return age;
    }
    //to set age
    public void setAge(int newAge){
        if(newAge>0){
            age = newAge;
        }
    }

    // to display color
    public String getColor(){
        return color;
    }
    // to set color
    public void setColor(String newColor){
        color = newColor;
    }

    

}

class Encapsulation{
    public static void main(String [] args){
        Dog agastya = new Dog();
        agastya.setBreed("GermanSgeford");;
        agastya.setAge(4);
        agastya.setColor("Black");

        System.out.println("Agastya is a "+agastya.getBreed()+" dog of age "+agastya.getAge()+" having color "+agastya.getColor());

    }
}