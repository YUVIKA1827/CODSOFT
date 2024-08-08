//ATM INTERFACE
import java.util.Scanner;

class UserBankAcc{
    float accountBalance;
    UserBankAcc(float acc_balance){
        accountBalance=acc_balance;

    }
}
class ATM_Machine extends UserBankAcc{
    float WithdrawAmount;
    float depositAmount;
   Scanner sc=new Scanner(System.in);
   ATM_Machine(float acc_balance){
       super(acc_balance);
   }
   void withdraw()
   {
       System.out.println("If you want to withdraw amount write write yes: ");
       String response = sc.next();
       if (response.equalsIgnoreCase("yes")) {
           System.out.println("Enter the withdraw amount:");
           WithdrawAmount=sc.nextFloat();
           if(WithdrawAmount>accountBalance){
               System.out.println("Withdraw is not possible");
           }else{
               accountBalance=accountBalance-WithdrawAmount;

           }

       }
   }
    void deposit()
    {
        System.out.println("If you want to deposit amount write write yes: ");
        String response = sc.next();
        if (response.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter the deposit amount:");
            depositAmount=sc.nextFloat();
            accountBalance=accountBalance+depositAmount;


        }
    }
    void balance(){
        System.out.println("Current  account balance is :"+accountBalance);
    }

}
public class ATM {
    public static void main(String[] args) {
        ATM_Machine user1=new ATM_Machine(20000);
        user1.withdraw();
        user1.deposit();
        user1.balance();
    }
}