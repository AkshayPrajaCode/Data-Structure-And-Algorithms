
/*
 * Compile time polymorphism
 */

public class OOPS {

    public static void main(String[] args) {
        Stundent s1= new Stundent();
        s1.name = "Akshay";
        s1.age=12;
        s1.printInfo("Akshay" ,12);
    }
}
/**
 * InnerOOPS
 */
 class Stundent{

    String name ;
    int age ;

    public void printInfo(String name ){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }
    public void printInfo(String name, int age){
        System.out.println(this.name +" "+this.age );
    }
}
