public class Account {
    public String contact_No = "0769850308";
    public int pin = 2022;
    public double balance = 0;
    public String name = "Samuel Forane";
    public Account()
    {

    }
    public Account(String contact_No ,int pin , double balance, String name)
    {
        this.contact_No = contact_No;
        this.pin = pin;
        this.balance = balance;
        this.name = name;
    }

    public double getbalance()
    {
        return balance;
    }
    public int getPin()
    {
        return pin;
    }

}
