package FactoryDesignPattern;

public class EmployeeFactory {

    public static Car getCar(String type) {

        if(type.equals("MarutiCar"))
        {
            return new MarutiCar();
        }


        else {
            return new Valvo();
        }


    }
}
