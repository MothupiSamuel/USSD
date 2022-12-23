public class Transaction extends Account  {
    private double send_money;
    private double withdraw;
    public Transaction()
    {
    }

    public Transaction(String contact_No,int pim,double balance ,double send_money, double withdraw)
    {
        super.contact_No = contact_No;
        super.pin  = pin;
        super.balance = balance;
        this.send_money = send_money;
        this.withdraw = withdraw;
    }
    public double getbalance()
    {
        return balance;
    }
    public double getSendMoney()
    {
        return send_money;
    }
    public double getWihdraw()
    {
        return withdraw;
    }
    public int getPin()
    {
        return pin;
    }
    public String getContact_No()
    {
        return contact_No;
    }
}