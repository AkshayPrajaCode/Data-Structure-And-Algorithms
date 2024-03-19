public class Interfaces implements Car {
    public static void main(String[] args) {
      Interfaces interfaces = new Interfaces();
    }
    
   
    @Override
    public void start() {
        System.out.println("Car is startiing...........\n");   
    }
    
}
 interface Car{
    public abstract  void start();
}
