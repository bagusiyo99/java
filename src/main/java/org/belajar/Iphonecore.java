package org.belajar;

public class Iphonecore implements Phone, IOS {
    public String processor (){
        return "A14";
    }

    @Override
    public int spaceInGb() {
        return 256;
    }

    @Override
    public String airdrop() {
        return "fitur di iphone";
    }
}
