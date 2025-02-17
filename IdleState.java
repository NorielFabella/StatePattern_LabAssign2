public class IdleState implements VendingMachineState
{

    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {

        if(item == "Cat" || item == "Coke" || item =="Candy") // For now, the available items are cat, coke, and candy
        {
            vendingMachine.setVendingMachineState(new ItemSelectedState());
            System.out.println("Item selected: " + item);
        }
        else
        {
            System.out.println("Item: " + item + " is currently not available...");
        }
        
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Double balance) {
        System.out.println("Can't insert coins right now!");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine, Double balance, String item) {
        System.out.println("No items chosen!");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new OutOfOrderState());
        System.out.println("Vending machine is now out of order!");
    }

    
}
