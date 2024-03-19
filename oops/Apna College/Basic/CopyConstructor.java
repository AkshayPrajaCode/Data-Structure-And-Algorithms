class CopyConst{
    String name;
    String age;


    CopyConst(CopyConst s1){
        this.name = s2.name;
        this.age = s2.age;


    }
    CopyConst(){
        
    }


    public void Info(){
        System.out.println(s2.name);
        System.out.println(this.age);
    }
}



/**
 * CopyConstructor
 */




public class CopyConstructor {
    public static void main(String[] args) {
        CopyConst s1= new CopyConst();
        s1.name ="Akshay";
        s1.age="23";

        new CopyConst(s1);
        s1.Info();
        
    }
    
}