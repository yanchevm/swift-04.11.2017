package com.swift.academy.console;

public class ConsoleOutput {
	public static void main(String[] args){
            
        int x = 8;
        int y = 5;
        
        System.out.println(x);
        System.out.println(y + " This is just a string.");
        System.out.println("--------------");
        
        
        System.out.print(x);
        System.out.print(y);
        System.out.println();
        System.out.println("--------------");

        System.out.printf("%d / %d = %d", x, y, (x / y));
        System.out.println();
        System.out.println("--------------");
        
        System.out.printf("%d / %d = %f%n", x, y, (1.0 * x) / y );
        System.out.println("--------------");
        
        float z = (1.0f * x ) / (x + y);
        
        //prints the second argument from the argument list
        //always printing the sign and the number in at least 15 positions 
        //aligned to the left and at exactly 7 digits after the floating point
        //casting it to double and adding an environment-specific new line to the end

        System.out.printf("%2$+-15.7f%n", x, z, y);
        
             
        System.out.println("--------------");
        System.out.println("That's all folks.\n");
        System.out.println("(\\ /)");
        System.out.println("( . .)");
        System.out.println("C(\")(\")");
	}
}
