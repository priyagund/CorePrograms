
/******************************************************************************
* 
 Purpose:  Binary Search tree using
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   12-09-2019
*
******************************************************************************/package com.bridgelabz.dtatstructure;

class BinarySearchTree { 
	  
   
    long catalan(int n) { 
        long res = 0; 
          
        // Base case 
        if (n <= 1) { 
            return 1; 
        } 
        for (int i = 0; i < n; i++) { 
            res += catalan(i) * catalan(n - i - 1); 
        } 
        return (long) (res%(Math.pow(10, 8)+7)); 
    } 
  
    public static void main(String[] args) { 
    	BinarySearchTree cn = new BinarySearchTree(); 
       
    	   System.out.print(cn.catalan(100) + " "); 
	
           
        
    } 
} 
