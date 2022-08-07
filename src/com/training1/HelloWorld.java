package com.training1;
import java.util.Scanner;


public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("Enter input numbers");
		Scanner sc = new Scanner(System.in);
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		System.out.println("Enter operation (+,-,*,/,%)");
		char op = sc.next().charAt(0);
		System.out.println("Answer is: ");
		if(op=='+') {
			System.out.println(var1+var2);
		}
		else if(op=='-') {
			if(var1>var2) {
				System.out.println(var1-var2);
			}
			else {
				System.out.println(var2-var1);
			}
		}
		else if(op=='*') {
				System.out.println("test");
				System.out.println(var1*var2);
		}
		else if(op=='/') {
				if(var1>var2) {
						System.out.println(var1/var2);
				}
				else {
							System.out.println(var2/var1);
						}
		}
		else if(op=='%'){
				if(var1>var2) {
						System.out.println(var1%var2);
				}
		else {
							System.out.println(var2%var1);
			}
				}
				
		}
}


