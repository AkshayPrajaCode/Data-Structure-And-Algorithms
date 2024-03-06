public class Constructor{
    public static void main(String[] args) {
       Info info = new Info(); 
       Info intent = new Info();
    }
}

class Info{
    Info(){
        System.out.println("Constructor is called");
    }

   

}