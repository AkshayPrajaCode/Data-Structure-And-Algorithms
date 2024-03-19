

import Encapsulation.EncapsulationIntro;
public class MainClass{
    public static void main(String[] args) {
        System.out.println("Hello World\n");
        EncapsulationIntro obj= new EncapsulationIntro();
        EncapsulationIntro onject = new EncapsulationIntro();
        obj.doWork();
     
        Person  p1= new Person();
        p1.age=23;
        p1.name="Akshay\n";

        System.out.println(p1.age +"\n"+p1.name);
    

        Person  p2= new Person(31,"Akshay");
       
        System.out.println(p2.age +"\n"+p2.name);
        System.out.println(Person.count);
    
    
    }
}


class Person{
    static String name;
    int age;
    static int count ;

    Person (){
        count++;
        System.out.println("Hello");
    }


    public Person(int age , String NewNamae){
        this();
        age = age;
        name=NewNamae;
    }

    public void walk(){
      System.out.println(name+ "is walking .");  
    }
    public static void eat(){
        System.out.println(name+"is eating .");
    }
    
}