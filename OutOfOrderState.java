public class OutOfOrderState implements VendingMachineState
{

    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Vending machine is out of order! Can't select items!");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Double balance) {
        System.out.println("Vending machine is out of order! Can't insert coins!");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine, Double balance, String item) {
        System.out.println("Vending machine is out of order! Can't dispense items!");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is out of order already!");
    }

   
   
    
}