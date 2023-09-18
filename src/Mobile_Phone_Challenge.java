class CellPhone
{
    public String phoneNo, imieNo; // International Mobile Equipment Identity;

    public String getPhoneNo() {return phoneNo;}
    public String getImieNo() {return imieNo;}

    public String call(String s)
    {
        return "INCOMING CALL: " + s;
    }

    public CellPhone(String phoneNo, String imieNo)
    {
        this.phoneNo = phoneNo;
        this.imieNo = imieNo;
    }

    public String toString()
    {
        return "Phone Number:\t" + phoneNo + "\nIMIE Number:\t" + imieNo;
    }
}

class SmartPhone extends CellPhone
{

    public SmartPhone(String phoneNo, String imieNo)
    {
        super(phoneNo, imieNo);
    }

    private String macNo; // A MAC address is a unique identifier that helps identify your machine on any network.

    public String getMacNo() {return macNo;}

    public void setMacNo(String macNo) {this.macNo = macNo;}

    public String play(String s)
    {
        return  "Phone Number:\t" + phoneNo + "\nIMIE Number:\t" + imieNo + "\nMAC Number:\t" + macNo + "\nMusic is:\t" + s;
    }

}


public class Mobile_Phone_Challenge {
    public static void main(String[] args) {

        CellPhone c = new CellPhone("6900000000", "789652143");
        System.out.println(c.call("Office"));
        System.out.println("\nPhone's Details:\n============\n" + c);

        SmartPhone s = new SmartPhone("6988888888", "785412");
        s.setMacNo("8563214");
        System.out.println("\n\nSmartphone Details:\n==========\n" + s.play("ON"));



    }
}
