package String_Tokenizer;

import java.util.StringTokenizer;

public class String_Tokenizer_1 {
    public static void main(String[] args) {
        StringTokenizer stk = new StringTokenizer("Welcome to DIEMS College");
        System.out.println("Total number of Tokens : " + stk.countTokens());

        while (stk.hasMoreElements()) {
            System.out.println(stk.nextToken());
        }

    }
}

