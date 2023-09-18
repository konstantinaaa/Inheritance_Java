class Customer {
    private String name, phoneNo;
    private double balance;

    public Customer(String name, String phoneN, double balance)
    {
        this.name = name;
        this.phoneNo = phoneN;
        this.balance = balance;
    }
    public String getName() {return name;}
    public String getPhoneNo() {return phoneNo;}
    public double getBalance() {return balance;}

    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public boolean payBill()
    {
        if(balance == 0)
            return false;
        else
            return true;
    }
    public String toString()
    {
        return "\nName:\t\t\t" + name + "\nPhone Number:\t" + phoneNo + "\nDoes the customer have a balance?\t" + payBill();
    }


}

class Member extends Customer
{

    public Member(String name, String phoneN, double balance, String customerID, String address, String date_of_birth)
    {
        super(name, phoneN, balance);
        this.customerID = customerID;
        this.address = address;
        this.date_of_birth = date_of_birth;
    }

    private String customerID, address, date_of_birth;

    public String getCustomerID() {return customerID;}
    public String getAddress() {return address;}
    public String getDate_of_birth() {return date_of_birth;}


    public void setAddress(String address)
    {
        this.address = address;
    }

    public String callBack()
    {
        if(getBalance() != 0)
            return "The customer has a balance that needs to be paid off. You should call them for payment.\n";
        else
            return "The customer does not have a balance. You can call them to discuss product discounts.\n";
    }

    public String toString()
    {
        return "Customer ID:\t" + customerID + "\nAddress:\t" + address + "\nDate of Birth:\t" + date_of_birth;
    }


}





public class Customer_Challenge {
    public static void main(String[] args) {

        Customer c = new Customer("John", "6900000000", 20);
        System.out.println("\nCustomer Details:\n==========" + c);

        Member m = new Member("John", "6900000000", 20, "001245", "70500 Heraklion","08/20/2/1998");

        System.out.println("\nMore customer details:\n==========");
        System.out.println(m.callBack());
        System.out.println(m);



    }
}
