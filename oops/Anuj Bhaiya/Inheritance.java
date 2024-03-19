public class Inheritance {
    public static void main(String[] args) {
        developer developer=new developer(0, "null");
        developer.doWork();
        developer.eat();
        developer.walk();
    }
}
class person{
    String age ;
    String name;


   

    public void walk(){
        System.out.println(name+" is walking ");
    }

    public void eat(){
        System.out.println(name+ "is eating .");
    }

    public void doWork(){
        System.out.println(name +"is doing his work.");
    }
}

class developer extends person{
    public developer (int age, String name){
       super();
    }
    public void doWork(){
        System.out.println(name +"is doing his work\n."+"\n it is a software Engineering \n");
    }
}