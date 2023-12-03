import java.util.Scanner;

class Account
{
    double account_no;
    double balance;
    void deposit(double depo)
    {
        balance = balance + depo;
    }

    void withdraw(double with)
    {
        if (balance >= with)
        balance = balance - with;
        else 
        System.out.println("Insufficient Balance");
    }

    void display()
    {
        System.out.println("The account balance is "+balance);
    }
}

class Saving extends Account
{
    double interest;
    
    void add_cal_inter(int year, double rate)
    {
        interest=(balance*year*rate)/100;
        double initial = balance;
        balance+=interest;
        System.out.println("The interest value for "+initial+" is "+interest);
    }
}

class Current extends Account
{
    double overdraft = 10000;
    
    
    void withdraw(double with)
    {
        if (balance >= with)
        {
        balance = balance - with;
        System.out.println("1st if else");
        }
        else if(with <= (overdraft+balance))
        {
        with = with-balance;
        balance = -with;
        overdraft=overdraft-with;
        }
        else 
        System.out.println("Insufficient Balance");
    }
    @Override
    void display()
    {
        System.out.println("The remaining Overdraft limit is "+overdraft);
        System.out.println("The account balance is "+balance);
    }
}

class Account_Demo
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Account account = new Account();
        System.out.println("Enter Account number: ");
        double temp = scanner.nextDouble();
        account.account_no = temp;
        System.out.println("Enter Amount to deposit: ");
        temp = scanner.nextDouble();
        account.deposit(temp);
        System.out.println("Enter Amount to withdraw: ");
        temp = scanner.nextDouble();
        account.withdraw(temp);
        account.display();

        Saving sav = new Saving();
        sav.balance=1000;
        System.out.println("\nEnter Amount to deposit in saving account (balane 1000): ");
        temp = scanner.nextDouble();
        sav.deposit(temp);
        sav.add_cal_inter(2,5);

        Current cur = new Current();
        System.out.println("\nEnter Amount to deposit in current account: ");
        temp = scanner.nextDouble();
        cur.deposit(temp);
        System.out.println("\nOverdraft limit for current account is 10000");
        System.out.println("Enter Amount to withdraw: ");
       temp = scanner.nextDouble();
        cur.withdraw(temp);
        cur.display();
    }
}