package day2;
class SavingAccount{
    String name;
    static int Amount;
    static int time;
    SavingAccount(String name,int Amount,int time)
    {
        this.name=name;
        SavingAccount.Amount =Amount;
        SavingAccount.time =time;
    }
    public static int ROISavingAccount(){
        return (int) (Amount*time*0.25/100);
    }
}
class CurrentAccount {
    String name;
    int Amount;
    int time;
    CurrentAccount(String name,int Amount,int time){
        this.name=name;
        this.Amount=Amount;
        this.time=time;
    }
    public static int ROICurrentAccount(){
        return 0;
    }

}
public class ROI {
    public static void main(String[] args)
    {
        new SavingAccount("Amrita", 100000, 3);
        new CurrentAccount("Gopal", 60000, 3);
        System.out.println("Amrita Gets the Interest Of : "+ SavingAccount.ROISavingAccount());
        System.out.println("Gopal Gets the Interest Of : "+ CurrentAccount.ROICurrentAccount());
    }
}