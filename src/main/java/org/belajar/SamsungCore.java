package org.belajar;

public class SamsungCore implements Phone , Android {
    public String processor (){
        return "SD1000";
    }

    @Override
    public int spaceInGb() {
        return 20;
    }

    @Override
    public String WA() {
        return "wa aja";
    }
}
