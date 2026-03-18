package CONS_21;

public class methodoverriding {
    public static void main(String[] args) {

        animaal a = new animaal();
        a.eats();

    }
}
class animaal{
        void eats() {
            System.out.println("eating chicken");

        }
}

class deer extends animaal{
    void eats(){
        System.out.println("maalik not given grass hehe");
    }
}



//diff class but same funtion inside class na diff parameter/definatiom