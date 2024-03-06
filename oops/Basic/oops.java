public class oops{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color="red";
        pen2.type="extra gel pen ";

        Student aman= new Student();
        aman.name="Akshay";
        aman.age=21;

        aman.printName();
        aman.printAge();
        aman.Info();

        pen2.printColor();
    }
}



class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor()
{
    System.out.println(this.color);
}
}



class Student{
    String name;
    int age ;
    public void printName()
    {
        System.out.println(this.name);
    }

    public void printAge (){
        System.out.println(this.age);
    }



    public void Info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
