package CONS_21;

public class inheritance {
    public static void main(String[] args) {
        fish shark=new fish();
        shark.eat();

    }
}
//PARENT CLASS - BASE CLASS
class Animal{
    String color; //function ho gyi
    void eat(){ //ye kuch properties ho gyi
        System.out.println("fish is eating  another fish");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

//CHILD CLASS-DERIVED CLASS
//FOR THT WE WILL USE EXTENDS KEYWORDS
class fish extends Animal{
    int fina;
    //uper extends se class a ki saari properties aa gyi
    //but kuch additional property bhi likh sakte hai

    void swim(){
        System.out.println("swims in the water");
    }
    void dance(){
        System.out.println("fish is dancing");
    }

}
