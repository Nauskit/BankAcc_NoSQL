import java.util.Arrays;
import java.util.Scanner;

public class BankSimulate {
    Account [] accs;
    public BankSimulate(){
            accs = new Account[10];
            accs[0] = new Account();
            accs[0].acc_no = 1;
            accs[0].acc_name = "สมชาย";
            accs[0].acc_password = "123";
            accs[0].balance = 100;

            accs[1] = new Account();
            accs[1].acc_no = 2;
            accs[1].acc_name = "สมหญิง";
            accs[1].acc_password = "123";

            accs[2] = new Account();
            accs[2].acc_no = 3;
            accs[2].acc_name = "สมหวัง";
            accs[2].acc_password = "123";
            accs[2].balance = 300;
        };
    private void printBalance(Account a)
    {
        if(a == null){return;}
        System.out.println(a.acc_name + " have " + a.balance + " BAHT");
    }

    private Account getAccountByAccNo(int acc_no)
    {
        for(int i = 0; i<accs.length; i++)
        {
            if(accs == null) continue;
            if(accs[i].acc_no == acc_no)
            {
                return accs[i];
            }
        }
        return null;
    }
    public void withdraw(int acc_no,String password,double amount)
    {
        Account a = getAccountByAccNo(acc_no);
        if(a == null){
            System.out.println("Account not found no ACC NO.");
            return;
        }
        if(a.acc_password.equals(password)){

        }else{
            System.out.println("Wrong password");
            return;
        }

        if(a.balance - amount < 0)
        {
            System.out.println("Not enough money");
            return;
        }
        a.balance -= amount;
        printBalance(a);
    }


    public void deposit(int acc_no,double amount)
    {
        Account a = getAccountByAccNo(acc_no);
        if(a == null){
            System.out.println("Account not found no ACC NO.");
            return;
        }else{
            a.balance += amount;
            printBalance(a);
        }
    }
    public void getBalance(int acc_no,String password)
    {
        Account a = getAccountByAccNo(acc_no);
        if(a == null){
            System.out.println("Account not found no ACC NO.");
            return;
        }
        if(a.acc_password.equals(password)){

        }else{
            System.out.println("Wrong password");
            return;
        }
        printBalance(a);
    }
}
