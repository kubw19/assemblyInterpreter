package com;

public class Registers {
    private static Integer eax = null;
    private static Integer ebx = null;
    private static Integer ecx = null;
    private static Integer edx = null;

    public static enum Reg {
        EAX(eax), EBX(ebx), ECX(ecx), EDX(edx);
        Integer value;
        private Reg(Integer register){
            this.value = register;
        }
    }

    public static void set(Reg reg, Integer val){
        reg.value = val;
    }

    public static Integer get(Reg reg){
        return reg.value;
    }
}
