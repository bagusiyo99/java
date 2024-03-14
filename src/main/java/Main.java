import org.belajar.Iphonecore;
import org.belajar.SamsungCore;
import org.belajar.Shop;
import org.belajar.vehicles.Bike;

import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        LinkedList<String>names = new LinkedList<>();
        names.add("bagus");
        names.add("dwi");
        names.add("iyo");
        names.add("aji");
        names.add("agus");
        System.out.println(names );
        names.add(2, "dwi");
        System.out.println(names);
















//        Main main = new Main();
//        main.case1(10, 0
//        );

        //String handliding
//        String a = "study";
//        String b = "easy";
//        String c= a+b;
////        System.out.println(c);
//
//        if (b == "Studyesasy"){
//            System.out.println("studyeasy");
//        }else {
//            System.out.println("studyhard");
//        }

//        for (int i = 0; i  < 10; i++){
//            System.out.println(i);
//        }


        //packages
//        Childd childd = new Childd();
//        childd.JPG();
//        childd.USA();

//        Child child = new Child();
//        System.out.println(child.getX());
//        Child child2 = new Child(102);
//        System.out.println(child2.getX());








        //Static inner
//      ToyotaCars.Brand.tagLine();
//        System.out.println(ToyotaCars.Brand.brandName);
//
//        ToyotaCars toyotaCars = new ToyotaCars();
//        ToyotaCars.NonStaticInner.model("city");



        //TestStatic
//        TestStatic objc = new TestStatic();
//        System.out.println(" obj1 staticvar :" +objc.getStaticVar() );
//        objc.setStaticVar(256);
//        System.out.println(" obj1 staticvar :" +objc.getStaticVar() );
//
//
//        TestStatic objc1 = new TestStatic();
//        System.out.println(" obj2 staticvar :" +objc1.getStaticVar() );
//        objc1.setStaticVar(26);
//        System.out.println(" obj1 staticvar :" +objc1.getStaticVar() );

        // User input
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

//    public void case1 (int x, int y){
//        if (y != 0) {
//            System.out.println("x/y="+x/y);
//        } else  {
//            System.out.println("the value of y is 0, a possible exception");
//        }
//    }
//
//    public void case2 (int x, int y){
//        try  {
//            System.out.println("x/y="+x/y);
//
//        } catch (Exception e) {
//            System.out.println("the value of y is 0, a possible exception");
//        }
//    }




}