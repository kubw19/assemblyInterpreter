package com;

import java.util.ArrayList;

public class Stack {
    private static ArrayList<Integer> stack = new ArrayList<Integer>();

    public static void push(Integer val){
        stack.add(val);
    }

    public static void display(){
        for(Integer val: stack){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static String last(){
        Integer last = stack.get(stack.size() - 1);
        String toReturn;
        if (last == null){
            toReturn = "???";
        }
        else toReturn = stack.get(stack.size() - 1).toString();
        stack.remove(last);
        return toReturn;
    }
}
