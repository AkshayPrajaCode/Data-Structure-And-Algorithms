

class Account{
    public String Name;
    protected String email;

     private String password;

     /*
      * getter and setter
      */



      /*
       * get password
       */
    public String getPassword(){
        return this.password;
    }


    /*
     * Set password
     */

   public void setpass(String pString){
    this.password=pString;
   }




}
public class Bank {
    public static void main(String[] args) {
        Account account_one= new Account();
        account_one.Name="Akshay";
        account_one.email="akshaykumarprajapati@mail.com";
       account_one.setpass("null");
       System.out.println(account_one.getPassword());
    }
    
}