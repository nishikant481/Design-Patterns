package FactoryDesignPattern;

public class Valvo implements Car{

      int id;

    @Override
    public String toString() {
        return "Valvo{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }

    public Valvo() {
    }

    public Valvo(int id, String price) {
        this.id = id;
        this.price = price;
    }

    String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
