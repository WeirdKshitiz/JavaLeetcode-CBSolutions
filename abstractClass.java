public class abstractClass {
    public static void main(String[] args) {
    //     Horse h=new Horse();
    //     h.eat();
    //     h.walk();


    //   System.out.println(h.color);


        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();


       // Animal a=new Animal() ;
            
       

       Mustang myHorse=new Mustang();
       //animal->horse->mustang 
    }
}

abstract class Animal{
    String color;

    Animal(){
        color="brown";
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color="darkbrown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
   
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}