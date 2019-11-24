package com;

public class Registers {
    private static volatile Integer eax = null;
    private static volatile Integer ebx = null;
    private static volatile Integer ecx = null;
    private static volatile Integer edx = null;

    public static void set(String reg, Integer val){
        switch(reg){
            case "%eax":
                eax = Integer.valueOf(val);
                break;
            case "%ebx":
                ebx = Integer.valueOf(val);
                break;
            case "%ecx":
                ecx = Integer.valueOf(val);
                break;
            case "%edx":
                edx = Integer.valueOf(val);
        }
    }
    public static Integer get(String reg){
        Integer toReturn = null;
        switch(reg) {
            case "%eax":
                toReturn = eax;
                break;
            case "%ebx":
                toReturn =  ebx;
                break;
            case "%ecx":
                toReturn = ecx;
                break;
            case "%edx":
                toReturn = edx;
                break;
        }
        return toReturn;
    }
}
