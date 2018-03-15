package org.sidharth.tests;

import org.sidharth.utils.textcat.TextCategorizer;

public class SimpleCategorizer {
    public static void main(String[] args) {
       String test = "English";
       TextCategorizer guesser = new TextCategorizer();
          guesser.categorize(test);
       System.out.println(test);
    }
 }