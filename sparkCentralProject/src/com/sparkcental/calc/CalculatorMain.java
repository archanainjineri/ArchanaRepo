/*
 * Test the Calculator Implementation:
 * 
 * Author: Archana Injineri
 */

package com.sparkcental.calc;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {

		//Calc obj
		Calculator calcObj = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Infix Expression here ");
		String inputExpr = scanner.next();
		
		//Covert Infix to postfix Expression
		String postfixExpression = calcObj.convertToPostfix(inputExpr);

		//Display the output of expression
		System.out.println("Expression "+inputExpr+" is evaluated to " + 
							calcObj.evalExpression(postfixExpression));
		scanner.close();
	}

}
