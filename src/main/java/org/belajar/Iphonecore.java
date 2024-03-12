package org.belajar;

public class Iphonecore implements Phone, IOS {
    public String processor (){ //interfaces
        return "A14";
    }

    @Override
    public int spaceInGb() { // Interface with Polymorphism and multiple inheritance
        return 256;
    }

    @Override
    public String airdrop() {
        return "fitur di iphone";
    }
}
