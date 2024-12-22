package FactoryDesignPattern;

public class MarutiCar implements Car{
   int id;
   String price;
   String name;

    @Override
    public String toString() {
        return "MarutiCar{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public MarutiCar() {
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MarutiCar(String price, int id, String name) {
        this.price = price;
        this.id = id;
        this.name = name;
    }


}
