import org.belajar.Iphonecore;
import org.belajar.SamsungCore;
import org.belajar.Shop;
import org.belajar.vehicles.Bike;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TestStatic objc = new TestStatic();
        System.out.println(" obj1 staticvar :" +objc.getStaticVar() );
        objc.setStaticVar(256);
        System.out.println(" obj1 staticvar :" +objc.getStaticVar() );


        TestStatic objc1 = new TestStatic();
        System.out.println(" obj2 staticvar :" +objc1.getStaticVar() );
        objc1.setStaticVar(26);
        System.out.println(" obj1 staticvar :" +objc1.getStaticVar() );

//        System.out.println("what's your name");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);
//        scanner.close();


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
//        SamsungCore phone1 = new SamsungCore(); //interfaces
//        String p = phone1.processor(); //interfaces
//        System.out.println(p);//interfaces
//        System.out.println(phone1.spaceInGb());// Interface with Polymorphism and multiple inheritance
//        System.out.println(phone1.WA()); //abstract
//
//
//        Iphonecore phone2 = new Iphonecore(); //interfaces
//        String s = phone2.processor();//interfaces
//        System.out.println(s); //interfaces
//        System.out.println(phone2.spaceInGb());// Interface with Polymorphism and multiple inheritance
//        System.out.println(phone2.airdrop());  //abstract


//        Shop shop = new Shop() ;
//        shop.shopStatus();
//        shop.getLock().setLocking(false);
//        shop.shopStatus();

    }
}