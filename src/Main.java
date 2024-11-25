import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int printMenu(Scanner sc){
        System.out.println("===========MENU==========");
        System.out.println("PLEASE SELECT YOUR OPTION");
        System.out.println("1.DEPOSIT");
        System.out.println("2.WITHDRAW");
        System.out.println("3.CHECK BALANCE");
        System.out.println("4.EXIT");

        int i = sc.nextInt(); sc.nextLine();
        while(i <= 0 && i > 4){
            System.out.println("===========MENU==========");
            System.out.println("PLEASE SELECT YOUR OPTION");
            System.out.println("1.DEPOSIT");
            System.out.println("2.WITHDRAW");
            System.out.println("3.CHECK BALANCE");
            System.out.println("4.EXIT");
            i = sc.nextInt(); sc.nextLine();
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankSimulate sim = new BankSimulate();
        int input = printMenu(sc);
        int acc_no;
        double amount;
        String password;
        if(input == 1)
        {
            System.out.println("Please input acc_no: ");
            acc_no = sc.nextInt(); sc.nextLine();
            System.out.println("Please input amount to deposit: ");
            amount = sc.nextDouble(); sc.nextLine();
            sim.deposit(acc_no,amount);
        }else if(input == 2)
        {
            System.out.println("Please input acc_no: ");
            acc_no = sc.nextInt(); sc.nextLine();
            System.out.println("Please input password: ");
            password = sc.nextLine();
            System.out.println("Please input amount: ");
            amount = sc.nextDouble(); sc.nextLine();
            sim.withdraw(acc_no,password,amount);
        }else if(input == 3)
        {
            System.out.println("Please input acc_no: ");
            acc_no = sc.nextInt(); sc.nextLine();
            System.out.println("Please input password: ");
            password = sc.nextLine();
            sim.getBalance(acc_no,password);
        }else{
            return;
        }
    }
}