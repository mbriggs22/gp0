package searchandsort;

import java.util.ArrayList;
import java.util.Random;

/*
 * Graded Excersize 0 
 * @version April 5th, 2020
 * @author Matt Briggs
 */
public class SearchAndSort {

    private static final Random RNG = new Random();

    /*
     * creates a list of random integers 
     */
       public static List<Integer> createList(int size) {
        /* Borrowed from Leon Tabak
           
           */

        for (int i = 0; i < size; i++) {
            int r = RNG.nextInt(range);
            result.add(n);
        } // for

 } //for loop
  
            for (int n : newList) {
                System.out.printf("%4d", n);
                // Printing list in a column with 4 spaces apart
            } // for loop
        } // else
    } // printList
    /* Find a method that determines the index
    *  of the first integer in a list of integers
    *  that matches a give integer. If there is
    *  no match, should return -1. Use the sequential
    *  search algorithm.
    *
    * @param linearSearh( List<Integer>)
    * @result result of linearSearch