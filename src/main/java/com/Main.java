package com;
import com.Visitors.Visitors;
import com.antlr4.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.Scanner;


class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Registers.set(Registers.Reg.EAX, 124);
        while (a.hasNextLine()) {
            JFKParser parser = Parser.parse(a.nextLine());
            Visitors visitor = new Visitors();

            try{
                visitor.visit(parser.entry());
            }
            catch (ParseCancellationException ex){
                System.err.println("ERROR");
            }
            //System.out.println();
        }
}

}