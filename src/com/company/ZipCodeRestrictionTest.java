package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Williams Sonoma - Software Engineer - Backend End problem merging interval
 * Testing
 *
 * @author Tamir Baldandorj
 * @version 1.0
 * @since Oct 28, 2020
 */

@SuppressWarnings("ALL")
public class ZipCodeRestrictionTest {
    /**
     * Test of Merge Destination.
     */
    @Test
    public void mergeDestination() {
        int[][] input = new int[][]{{49679, 52015},
                {49800, 50000}, {51500, 53479},
                {45012, 46937}, {54012, 59607},
                {45500, 45590}, {45999, 47900},
                {44000, 45000}, {43012, 45950}};

        int[][] output = new int[][]{{43012, 47900},
                {49679, 53479}, {54012, 59607}};

        assertArrayEquals(ZipCodeRestriction.mergeDestination(input), output);
    }

    /**
     * Test of mergeDestination method
     * checking exception message for null input.
     */
    @Test
    public void mergeDestinationIsNull(){
        try{
            ZipCodeRestriction.mergeDestination(null);
        }
        catch(Exception exception){
            assertEquals("Processing fail. Got a null",exception.getMessage());
        }
    }

    /**
     * Test of mergeDestination method
     * checking exception message for bad format zip code.
     */
    @Test
    public void mergeDestinationCheckLength(){
        int[][] input = new int[][]{{49679, 52015},
                {49800, 500001}, {51500, 53479}};
        try{
            ZipCodeRestriction.mergeDestination(input);
        }
        catch(Exception exception){
            assertEquals("Zip code must 5 digit",exception.getMessage());
        }
    }
}