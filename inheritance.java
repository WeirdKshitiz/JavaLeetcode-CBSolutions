public class inheritance {
    public static void main(String[] args) {
        // fish shark=new fish();
        // shark.eat();
        Bird dobby=new Bird();
        dobby.eat();
       
       // System.out.println(dobby.legs);
    }
}

//BASE CLASS
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammals extends Animal{
    void walk(){
       System.out.println("walks"); 
    }
}

class Fish extends Mammals{
    void swim(){
        System.out.println("swims"); 
     }
}

class Bird extends Fish{
    void fly(){
        System.out.println("flies"); 
     }
}


//DERIVED CLASS or sub class
// class fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swims in water");
//     }
// }