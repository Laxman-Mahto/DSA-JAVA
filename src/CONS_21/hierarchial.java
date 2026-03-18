package CONS_21;

public class hierarchial {
    public static void main(String[] args) {

        jharkhand namee= new jharkhand();
        namee.name();
    }
}
class india{
    String people;
    void name(){
        System.out.println("rahul");
    }
     void caste(){
         System.out.println("hindu");
     }
     void religion(){
         System.out.println("indian");
     }
     void eat(){
         System.out.println("veg");
     }
}
class jharkhand extends india{
    void food(){
        System.out.println("wht the best food");
    }
}
class rajasthan extends india{
    void food(){
        System.out.println("wht the best food");
    }
}

class haryana extends india{
    void food(){
        System.out.println("wht the best food");
    }
}

class jaipur extends india{
    void food(){
        System.out.println("wht the best food");
    }
}

class punjab extends india{
    void food(){
        System.out.println("wht the best food");
    }
}
class assam extends india{
    void food(){
        System.out.println("wht the best food");
    }
}

class delhi extends india{
    void food(){
        System.out.println("wht the best food");
    }
}

class bihar extends india{
    void food(){
        System.out.println("wht the best food");
    }
}
class mumbai extends india {
    void food() {
        System.out.println("wht the best food");
    }
}










