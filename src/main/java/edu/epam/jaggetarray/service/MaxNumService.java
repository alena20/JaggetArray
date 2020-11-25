package edu.epam.jaggetarray.service;

import edu.epam.jaggetarray.api.ICompare;

public class MaxNumService implements ICompare {

    @Override
    public int compare(int[] one, int[] two) {
        if (getLargestNumber(one) > getLargestNumber(two)) {
            return 1;
        } else if (getLargestNumber(one) < getLargestNumber(two)) {
            return -1;
        }
        return 0;
    }

    public int getLargestNumber(int[] array) {
        int largestNumber = array[0];
        for (Integer number : array) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        return largestNumber;
    }
}
