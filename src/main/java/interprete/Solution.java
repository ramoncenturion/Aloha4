package interprete;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Interpreter interpreter = new Interpreter();
        Scanner entradaEscaner = new Scanner (System.in);
        String line = entradaEscaner.nextLine();
        String response = interpreter.interpretar(line);
        while (!response.equals("exit")) {
        	if (!response.isEmpty()) {        		
        		System.out.println(response);
        	}
            line = entradaEscaner.nextLine();
            response = interpreter.interpretar(line);
        }
    }
}
