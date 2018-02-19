package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jUnitJumps = k/j;
        int oneUnitJumps = k%j;
        return jUnitJumps + oneUnitJumps;
    }
}
