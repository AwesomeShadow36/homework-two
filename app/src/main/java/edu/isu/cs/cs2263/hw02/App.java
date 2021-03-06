/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.isu.cs.cs2263.hw02;

import java.util.StringTokenizer;
//Braxton Grover
public class App {

    public static void main(String[] args) {

        //making the object
        PushbackImpl test = new PushbackImpl("Like a Scientist");

        //to prove it does move onto the next one and not reset the whole thing
        System.out.println(test.nextToken());

        //making sure pushback does work with what is left of the string
        while (test.hasMoreTokens()){
            System.out.println(test.nextToken());
            test.pushback();
            System.out.println(test.nextToken());
        }
    }
}
