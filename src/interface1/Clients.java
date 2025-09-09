package interface1;

public class Clients {

    public static void main(String[] args) {
        System.out.println("Interface client");

        Client clent1 = new Person();


    }


}

interface Client {
    public void order();
    public void pay();
}

class Person implements Client {
    public void order() {
        System.out.println("Make an order");
    }
    public void pay() {
        System.out.println("Pay for the order");
    }
}
