package bai1;

public class Customer extends Person{
    private int blaance;

    public Customer(String name, String address, int blaance) {
        super(name, address);
        this.blaance = blaance;
    }

    @Override
    public void display() {
        System.out.println("Customer name:"+getName());
        System.out.println("Customer address:"+getAddress());
        System.out.println("Customer salary:"+blaance);
    }
}
