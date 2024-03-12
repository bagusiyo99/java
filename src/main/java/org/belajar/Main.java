package org.belajar;


import org.belajar.vehicles.Bike;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //OOP
//        Car car = new Car("closed", "on", "seated", 10);
//          car
//        System.out.println(car.run());

//        Hp phone = new Hp("samsung");
//        System.out.println(phone.getBrand());  // hp

//        Bike bike = new Bike();
//        bike.handle = "Short";
//        bike.engine = "Petrol";
//
//        System.out.println(bike.handle);
//        System.out.println(bike.engine);


        // core
        SamsungCore phone1 = new SamsungCore();
        String p = phone1.processor();
        System.out.println(p);
        System.out.println(phone1.spaceInGb());
        System.out.println(phone1.WA());


        Iphonecore phone2 = new Iphonecore();
        String s = phone2.processor();
        System.out.println(s);
        System.out.println(phone2.spaceInGb());
        System.out.println(phone2.airdrop());

    }
}