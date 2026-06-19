class bankaccount {
   private int id;
   private String name;
   private double balance;
public void getdetails(){
    System.out.println(id+" "+name+" "+balance);
}
 public void setdeatils(int id,String name,double balance){
    this.id=id;
    this.name=name;
    this.balance=balance;
}
public int getid(){
    return id;
}
public double getbalance(){
    return balance;
}
public void deposit(double amount){
    this.balance+=amount;
}
public void withdraw(double amount){
    this.balance-=amount;
}
}
public class main{
    public static void main(String[] args) {
        bankaccount hariniBankaccount=new bankaccount();
        hariniBankaccount.setdeatils(113,"Harini", 100000);
        hariniBankaccount.deposit(4000);
        hariniBankaccount.withdraw(2000);
        hariniBankaccount.getdetails();
    }

    
}
