public interface VendingMachineState
{
    void selectItem(VendingMachine vendingMachine, String item);
    void insertCoin(VendingMachine vendingMachine, Double balance);
    void dispenseItem(VendingMachine vendingMachine, Double balance, String item);
    void setOutOfOrder(VendingMachine vendingMachine);
  
}