public abstract class Product {
    protected String name;
    protected int price;

    protected Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
