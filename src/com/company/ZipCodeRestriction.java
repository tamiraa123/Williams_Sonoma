package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Williams Sonoma - Software Engineer - Backend End problem merging interval
 *
 * @author Tamir Baldandorj
 * @version 1.0
 * @since Oct 28, 2020
 */

public class ZipCodeRestriction {


    /***
     * Merging intervals of zip code
     * @param input all series of zip code with 5 digits
     * @return merged intervals
     */
    public static int[][] mergeDestination(int[][] input){
        if (input == null)
            throw new IllegalArgumentException("Processing fail. Got a null");
        //Sorting all intervals of zip code by first element
        Arrays.sort(input, Comparator.comparingInt(a -> a[0]));

        //Storing all merged elements into mergedZipRange
        LinkedList<int[]> mergedZipRange = new LinkedList<>();

        for (int[] zipRange : input) {
            //checking zip code length is 5
            if(!checkLength(zipRange[0]))
                throw new IllegalArgumentException("Zip code must 5 digit");

            //adding first element of input
            if (mergedZipRange.isEmpty())
                mergedZipRange.addLast(zipRange);

            //checking last element if merged zipcode is more than current zipcode
            if (zipRange[0] < mergedZipRange.getLast()[1])
                mergedZipRange.getLast()[1] = Math.max(zipRange[1], mergedZipRange.getLast()[1]);
            else
                mergedZipRange.addLast(zipRange);
        }

        //converting LinkedList to array
        return mergedZipRange.toArray(new int[mergedZipRange.size()][]);
    }

    /**
     * Checking zipCode length is exact 5.
     *
     * @param zipCode zip code
     * @return if zip code length is more or less than 5 it returns false else true.
     */
    private static boolean checkLength(int zipCode){
        return zipCode > 9999 && zipCode < 1000000;
    }
}
