package CONS_21;

public class constypess {
    public static void main(String[] args) {
        student2 s=new student2();
        student2 s2=new student2(5);
        student2 s3=new student2("laxman");
        student2 s4=new student2(3.4f); //f have to write in marks




    }
}
class student2{
    String name;
    int roll_no;
    float marks;

    student2(){
        System.out.println("this is called a cnstructor and in parameter nothing so this is non parametersed cons");
    }
    student2(String name){
        this.name=name;
    }
    student2(int roll_no){
        this.roll_no=roll_no;
    }
    student2(float marks) {
        this.marks = marks;
    }
}
