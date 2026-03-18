package CONS_21;

public class CONSSS {
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.rollnoo);

    }
}

class student{
    String name;
    int rollnoo;
    //making a constructor in the class student
    student(){
        this.name="laxman";
        this.rollnoo= 7;
    }


}
