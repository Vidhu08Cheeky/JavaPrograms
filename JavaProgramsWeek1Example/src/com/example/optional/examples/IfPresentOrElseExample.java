package com.example.optional.examples;

import java.util.Optional;

public class IfPresentOrElseExample {

	public static void main(String[] args) {
		// create a Optional 
        Optional<Integer> op  = Optional.empty(); 
  
        // print value 
        System.out.println("Optional: "
                           + op); 
  
        // apply ifPresentOrElse 
        op.ifPresentOrElse( 
            (value) 
                -> { System.out.println( 
                         "Value is present, its: "
                         + value); }, 
            () 
                -> { System.out.println( 
                         "Value is empty"); }); 
    } 

	}


