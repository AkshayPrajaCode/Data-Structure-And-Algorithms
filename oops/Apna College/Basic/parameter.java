public class parameter{
    public static void main(String[] args) {
      Studeent st= new Studeent("Akshay", 21);
      st.printAll();  
    }
}

class Studeent {

    String name ;
    int age;
    Studeent(String name , int age){
        this.name = name ;
        this.age = age;
    }


    public void printAll(){
        System.out.println(name);
        System.out.println(age);
    }
}