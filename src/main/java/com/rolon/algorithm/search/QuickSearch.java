package com.rolon.algorithm.search;

public class QuickSearch {

    public static boolean search(int[] elements, int target){

        int lefIndex =0;
        int rightIndex=elements.length-1;

        while (lefIndex<=rightIndex){
            int center=lefIndex+(rightIndex-lefIndex)/2;
            if(elements[center]==target){
                return true;
            }
            if(elements[center]<target){
                lefIndex=center+1;
            }

            if(elements[center]>target){
                rightIndex=center-1;
            }
        }
            return false;
    }
}
