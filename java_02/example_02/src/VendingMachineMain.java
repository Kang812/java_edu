public class VendingMachineMain {
    public static void main(String[] args){
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);

        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);

        VendingMachine.printVersion();
        vm1.printVersion();

    }
}
