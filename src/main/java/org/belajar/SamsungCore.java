package org.belajar;

public class SamsungCore implements Phone , Android {
    public String processor (){ //interfaces
        return "SD1000";
    }

    @Override
    public int spaceInGb() { // Interface with Polymorphism and multiple inheritance
        return 20;
    }

    @Override
    public String WA() { //abstract
        return "wa aja";
    }
}
