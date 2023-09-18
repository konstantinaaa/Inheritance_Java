class TV
{
    public void switchON()
    {
        System.out.println("TV is switched ON.");
    }

    public void changeChannel()
    {
        System.out.println("TV channel has changed.");
    }
}

class SmartTV extends TV
{
    @Override
    public void switchON()
    {
        System.out.println("Smart TV is switched ON.");
    }

    @Override
    public void changeChannel()
    {
        System.out.println("Smart TV channel has changed.");
    }

    public void browse()
    {
        System.out.println("Smart TV browsing.");
    }
}

public class TV_Overriding {
    public static void main(String[] args) {

        TV t = new TV();
        t.switchON();
        t.changeChannel();
        System.out.println();

        SmartTV st = new SmartTV();
        st.switchON();
        st.changeChannel();
        st.browse();

    }
}
