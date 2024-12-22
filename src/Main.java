import FactoryDesignPattern.Car;
import FactoryDesignPattern.EmployeeFactory;
import FactoryDesignPattern.MarutiCar;
import FactoryDesignPattern.Valvo;
import SingletonDesignPattern.Samosa;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {



    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//        Samosa samosa1 = Samosa.getSamosa();
//
//        Samosa samosa2 = Samosa.getSamosa();

//        System.out.println("samosa1 :" +" "+samosa1.hashCode());
//        System.out.println("samosa2 :" + samosa2.hashCode());



        // Reflection API

//        Samosa samosa3 = Samosa.getSamosa();
//        System.out.println("samosa3 :"+samosa3.hashCode());
//
//       Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//       constructor.setAccessible(true);
//       Samosa samosaNew  = constructor.newInstance();
//
//        System.out.println(samosaNew.hashCode());

// Car car = new MarutiCar("20",1,"suzuki");
//
//        System.out.println(car.toString());


      Car marutiCar =  EmployeeFactory.getCar("MarutiCar");

      System.out.println(marutiCar.toString());
    }
}