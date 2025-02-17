public class VendingMachine
{
    private String item;
    private Double balance = 0.0;
    private VendingMachineState vendingMachineState; 
    
    public VendingMachine(VendingMachineState vendingMachineState)
    {
        this.vendingMachineState = vendingMachineState;
    }

    public VendingMachineState getVendingMachineState()
    {
        return this.vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState)
    {
        this.vendingMachineState = vendingMachineState;
    }


    public Double getBalance()
    {
        return this.balance;
    }

    public void setBalance(Double balance)
    {
        this.balance = balance;
    }

    public String getItem()
    {
        return this.item;
    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public void selectItem(String item)
    {
        setItem(item);
        vendingMachineState.selectItem(this, item);
    }
 
    public void insertCoin(Double balance)
    {
        vendingMachineState.insertCoin(this, balance);
    }
 
    public void dispenseItem()
    {
        vendingMachineState.dispenseItem(this, balance, item);
    }
 
    public void setOutOfOrder()
    {
        vendingMachineState.setOutOfOrder(this);
    }


}
