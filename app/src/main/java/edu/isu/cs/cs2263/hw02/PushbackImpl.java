package edu.isu.cs.cs2263.hw02;

import java.util.StringTokenizer;

public class PushbackImpl implements PushbackTokenizer{

    private StringTokenizer st;
    private String currentToken;

    //needs a constructor to give something to the string tokenizer
    public PushbackImpl(String s) {
        st = new StringTokenizer(s);
    }

    //implementing the methods to the string Tokenizer
    @Override
    public String nextToken() {
        //storing it locally so it can be pushed back
        currentToken= st.nextToken();
        return currentToken;
    }

    @Override
    public boolean hasMoreTokens() {
        return st.hasMoreTokens();
    }

    @Override
    public void pushback() {
        //initializes a new string to tokenize with the word to add back in
        String temp = currentToken;
        // adds the remaining tokens to the string with spaces in between
        while (st.hasMoreTokens()){
            temp += " "+st.nextToken() ;
        }
        // makes a new tokenizer with the word added back in
        st = new StringTokenizer(temp);

    }
}
