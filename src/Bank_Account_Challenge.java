
class Account
{
    public String accountNumber, name, address, phoneNumber, dateOfBirth;
    public double balance;

    public Account(String accNo, String name, String address, String phNo, String dob)
    {
        accountNumber = accNo;
        this.name = name;
        this.address = address;
        phoneNumber = phNo;
        dateOfBirth = dob;
        balance = 0;
    }

    public String getAccountNumber() {return accountNumber;}
    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getPhoneNumber() {return phoneNumber;}
    public String getDateOfBirth() {return dateOfBirth;}
    public double getBalance() {return balance;}

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setPhoneNumber(String phNo)
    {
        phoneNumber = phNo;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String toString()
    {
        return "\nBank Account Holder Info: " +
                "\n==========" + "\nAccount:\t\t" + getAccountNumber() +
                "\nName:\t\t\t" + getName() + "\nDate of Birth:\t" + getDateOfBirth()+
                "\nAddress:\t\t" + getAddress() + "\nPhone:\t\t\t" + getPhoneNumber();
    }

}

class SavingsAccount extends Account
{
    public SavingsAccount(String accNo, String name, String address, String phNo, String dob) {
        super(accNo, name, address, phNo, dob);
    }

    private double deposit_amount, withdraw_amount, fixed_amount;

    public double getDeposit_amount() {return deposit_amount;}
    public double getWithdraw_amount() {return withdraw_amount;}

    public void deposit(double amount)
    {
        if(amount >= 0)
        {
            deposit_amount = getBalance() + amount;
            setBalance(deposit_amount);
        }
        else
            deposit_amount =0;
    }

    public void withdraw(double amount)
    {
        if(amount >= 0)
        {
            withdraw_amount += amount;
            setBalance(getDeposit_amount() - getWithdraw_amount());
        }
        else
            withdraw_amount = 0;
    }

    public String toString()
    {
        return "\nBank Saving Account Info:" + "\n==========" + "\nDeposit:\t" + getDeposit_amount()+
                "\nWithdraw\t\t" + getWithdraw_amount() + "\nCurrent Balance:\t" + getBalance();
    }

}

class LoanAccount extends Account
{

    public LoanAccount(String accNo, String name, String address, String phNo, String dob) {
        super(accNo, name, address, phNo, dob);
    }

    private double emi_amount;

    public double getEmi_amount() {return emi_amount;}

    public void payEMI(double amount)
    {
        emi_amount = amount;
        setBalance(getBalance() - emi_amount);
    }

    public void repay(double amount)
    {
        if(balance == amount)
            setBalance(0);
    }

    public String toString()
    {
        return "\nLoan Account Info:\t" + "\n==========" +
                "\nEMI Loan:\t" + getEmi_amount();
    }

}





public class Bank_Account_Challenge {
    public static void main(String[] args) {

        Account acc = new Account("5001A", "John", "70401 Herakleion", "690000000000", "08/20/1986");
        System.out.println(acc);

        SavingsAccount sav = new SavingsAccount("5001A", "John", "70401 Herakleion", "690000000000", "08/20/1986");
        sav.deposit(100);
        sav.withdraw(40);
        sav.withdraw(30);

        System.out.println(sav);

        LoanAccount loan_acc = new LoanAccount("5001A", "John", "70401 Herakleion", "690000000000", "08/20/1986");
        loan_acc.payEMI(50);

        System.out.println(loan_acc);


    }
}
