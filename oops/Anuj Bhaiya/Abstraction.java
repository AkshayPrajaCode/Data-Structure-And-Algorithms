public class Abstraction {
    public static void main(String[] args) {
       Audi audi= new Audi();
       audi.start();
       BMW bmw = new BMW();
       bmw.start();
    }
}

abstract class Car{
    String Brand;
    int Price;

   abstract void start();
}

class Audi extends Car {
    @Override
    void start(){
        System.out.println(" Audi is Starting ........................\n");
    }
}
 /**
  * InnerAbstraction
  */
 class BMW extends Car{
    @Override
    void start(){
        System.out.println("BMW is starting right now .............\n");
    } 
 }
