package calculator;

import java.util.Scanner;

public class Arithmetic_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		char operator = sc.next().charAt(0);
		int j = sc.nextInt();
		int result = 0;
		switch(operator) {
		case'+' :
			result = i+j;
			System.out.println(result);
			break;
		case'-' :
			result = i-j;
			System.out.println(result);
			break;
		case'*' :
			result = i*j;
			System.out.println(result);
			break;
		case'/' :
			result = i/j;
			System.out.println(result);
			break;
		case'%' :
			result = i%j;
			System.out.println(result);
			break;
		default :
			System.out.println("invalid operator");
			break;
		}

	}



	}


