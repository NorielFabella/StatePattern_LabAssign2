public class DispensingState implements VendingMachineState
{

    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Can't select items right now!");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Double balance) {
        System.out.println("Can't insert coins right now!");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine, Double balance, String item) {
        System.out.println(vendingMachine.getItem() + " dispensed!");
        vendingMachine.setVendingMachineState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Can't change vending machine's state to out of order right now!");
    }

   
    
}