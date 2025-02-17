public class ItemSelectedState implements VendingMachineState
{

    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Item: " + vendingMachine.getItem() + "already selected!");

    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, Double balance) {
        Double balance2 = 0.0;

        if(balance <= 0)
        {
            System.out.println("No coins inserted");
        }
        else
        {
            balance2 += balance;
            vendingMachine.setBalance(vendingMachine.getBalance() + balance2);
            System.out.println("Current balance: " + vendingMachine.getBalance());
        }
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine, Double balance, String item) {
        vendingMachine.setVendingMachineState(new DispensingState());
        vendingMachine.dispenseItem();
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Can't change vending machine's state to out of order right now!");
    }

   


    
}
