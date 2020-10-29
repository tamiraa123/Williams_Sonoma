package com.company;

import java.util.Arrays;

/**
 * Williams Sonoma - Software Engineer - Backend End problem merging interval
 *
 * @author Tamir Baldandorj
 * @version 1.0
 * @since Oct 28, 2020
 */

public class Main {
	/**
	 * This is the main() method for the driver program.
	 *
	 * @param args stores the incoming command line arguments for the program.
	 */
    public static void main(String[] args) {
    	//dummy input
	    int[][] input = new int[][]{{49679, 52015},
                {49800, 50000}, {51500, 53479},
                {45012, 46937}, {54012, 59607},
                {45500, 45590}, {45999, 47900},
                {44000, 45000}, {43012, 45950}};

	    int[][] output = ZipCodeRestriction.mergeDestination(input);
	    //Prints result of mergeDestination() method
	    System.out.println(Arrays.deepToString(output));
    }
}
