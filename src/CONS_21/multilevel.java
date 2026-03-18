package CONS_21;

public class multilevel {
    public static void main(String[] args) {

        fishh garhiya = new fishh();
        //in fish clas only fish have type function- which type pf fish is something...
        //but we will see all property pof animals dog tht used..cos we use extends

        garhiya.enjoy();

    }
}
class animals {
    String color;

    void eats(){
        System.out.println("EATING");
    }
    void dance(){
        System.out.println("animals dancing");
    }
    void enjoy(){
        System.out.println("amimals are doing partyyyy");
    }
}

class dog extends animals{
    String breed;

    void food(){
        System.out.println("which food animal eating");
    }

    void owner (){
        System.out.println("whts th name of the dog owner");
    }
}

class fishh extends dog{
    String type;

}