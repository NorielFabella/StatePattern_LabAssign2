public class VendingDemo
{
    public static void main(String[] args)
    {
        VendingMachine vendingMachine = new VendingMachine(new OutOfOrderState());
        vendingMachine.dispenseItem();
        vendingMachine.selectItem("Cat");
        vendingMachine.setOutOfOrder();
        vendingMachine.insertCoin(20.0);
        vendingMachine.dispenseItem();
        vendingMachine.dispenseItem();
        vendingMachine.setVendingMachineState(new IdleState());
        vendingMachine.dispenseItem();
        vendingMachine.selectItem("Cat");
        vendingMachine.setOutOfOrder();
        vendingMachine.insertCoin(20.0);
        vendingMachine.dispenseItem();
        vendingMachine.dispenseItem();

    }
}