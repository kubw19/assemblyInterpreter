package com;

import com.antlr4.JFKLexer;
import com.antlr4.JFKParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Parser {
    public static void ASCIISentence(String str)
    {
        int l = str.length();
        int convert;
        for (int i = 0; i < l; i++) {
            convert = str.charAt(i);
            System.out.print(convert);
        }
    }
    public static JFKParser parse(String s) throws ParseCancellationException {
        //System.out.println(s);
        CharStream stream = CharStreams.fromString(s);
        JFKLexer lexer = new JFKLexer(stream);
        CommonTokenStream token = new CommonTokenStream(lexer);
        ErrorListener errorListener = new ErrorListener();
        JFKParser parser = new JFKParser(token);

        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        return parser;
    }
}
