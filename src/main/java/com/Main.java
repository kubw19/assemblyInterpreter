package com;
import com.Visitors.Visitors;
import com.antlr4.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Scanner;


class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        while (a.hasNextLine()) {
            String s = a.nextLine();
            System.out.println(s);
            CharStream stream = CharStreams.fromString("push 12");
            JFKLexer lexer = new JFKLexer(stream);
            CommonTokenStream token = new CommonTokenStream(lexer);
            JFKParser parser = new JFKParser(token);

            //parser.removeErrorListeners();
            //Errors errors = new Errors();
            //parser.addErrorListener(errors);
//        ParseTreeWalker.DEFAULT.walk(list, tree);

            Visitors visitor = new Visitors();
            System.out.println(visitor.visit(parser.push()));

            //System.out.println(parser.push().DIGITS() + "test2");
        }
    }

}