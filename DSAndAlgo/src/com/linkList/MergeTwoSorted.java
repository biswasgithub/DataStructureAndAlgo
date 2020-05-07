package com.linkList;

import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class MergeTwoSorted 
{ 
    // Merge arr1[0..n1-1] and arr2[0..n2-1]  
    // into arr3[0..n1+n2-1] 
    public static void mergeArrays(int[] arr1, int[] arr2) 
    { 
    	
        int n1 = arr1.length;
        int n2 = arr2.length; 
        int[] arr3 = new int[n1+n2]; 
        
        int i = 0, j = 0, k = 0; 

        while (i<n1 && j <n2) 
        { 
            if (arr1[i] < arr2[j]) 
                arr3[k++] = arr1[i++]; 
            else
                arr3[k++] = arr2[j++]; 
        } 
        while (i < n1) 
            arr3[k++] = arr1[i++]; 

        while (j < n2) 
            arr3[k++] = arr2[j++]; 
        
        
        System.out.println("Array after merging"); 
        for (int x=0; x < n1+n2; x++) 
            System.out.print(arr3[x] + " ");
    } 
      
    public static void main (String[] args)  
    { 
        int[] arr1 = {1, 3, 5, 7}; 
 
      
        int[] arr2 = {2, 4, 6, 8}; 

      

          
        mergeArrays(arr1, arr2); 
      
         
    } 
} 
  