package CONS_21;

public class methodoverloading {
    public static void main(String[] args) {
        btech b=new btech();
        b.setdetails("laxman",4,"a",1);
        System.out.println("name:" + b.name+  "\n" + "rollno" + b.rollno);

    }
}
class btech{
    String name;
    int rollno;
    String section;
    int year;

    //1
    void setdetails(String name,int rollno,String section,int year){
        this.name=name;
        this.rollno=rollno;
        this.section=section;
        this.year=year;
    }
//2
    void setdetails(String name,int rollno,String section){
        this.name=name;
        this.rollno=rollno;
        this.section=section;
    }
//3
    void setdetails(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
//4
    void setdetails(String name) {
        this.name = name;
    }
}
