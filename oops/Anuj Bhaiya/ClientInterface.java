import java.util.Scanner;

public class ClientInterface {
    public static void main(String[] args) {
        Client c= new student();
        
    }

}
/**
 * InnerClientInterface
 */
interface Client {
    void input();
    void output();

    
}
class student implements Client{
    String name;
    Double saDouble;

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter is The Name....\n");
        name = scanner.nextLine();



        System.out.println("Enter the salary..........\n");
        saDouble=scanner.nextDouble();
    }

    @Override
    public void output() {
        System.out.println(name +" " +saDouble);
    }
    
}
