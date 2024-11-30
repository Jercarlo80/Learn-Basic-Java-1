import java.util.Scanner;


public class FirstJavaProgram {

	public static void main(String[] args) {
		//Output
		System.out.println("Hello Java");
		System.out.print("Hello Java2");
		System.out.printf("%s\n", "Hello Java3");
		//Primitive Data Type
		int numberInt = 5;
		long numberLong = 7;
		float numberFloat = (float) 2.5;
		double numberDouble = 10;
		char alphabet = 'A';
		boolean bool = true;
		
		System.out.println("Integer Number: "+numberInt);
		System.out.println("Long Number: "+numberLong);
		System.out.println("Float Number: "+numberFloat);
		System.out.println("Double Number: "+numberDouble);
		System.out.println("Alphabet: "+alphabet);
		System.out.println("Boolean: "+bool);
		
		//Input
		Scanner scan = new Scanner(System.in);
		
		String name;
		int age;
		float gpa;
		
		System.out.println("Input Name: ");
		name = scan.nextLine();
		
		System.out.println("Input Age: ");
		age = scan.nextInt();
		
		System.out.println("Input GPA: ");
		gpa = scan.nextFloat();
		
		System.out.printf("Hello my name is "+name +"\tI am\t"+age + "\tyears old\t" + "\tand my GPA is\t "+gpa);
		
//		//Aritmatic Operator
		int number1 = 100;
		int number2 = 200;
		int sumNumber1 = number1 + number2;
		int sumNumber2 = number1 - number2;
		int sumNumber3 = number1 * number2;
		int sumNumber4 = number1 / number2;
		int sumNumber5 = number1 % number2;
	
		System.out.println("First Number: "+number1);
		System.out.println("Second Number: "+number2);
		
		System.out.println(sumNumber1);
		System.out.println(sumNumber2);
		System.out.println(sumNumber3);
		System.out.println(sumNumber4);
		System.out.println(sumNumber5);
		
		// Selection
		int number1 = 4;
		int number2 = 2;
		
		if (number1 < number2) {
			System.out.println("The number1 is"+number1);
		} else if(number1 == number2) {
			System.out.println("The number1 is equal between those numbers");
		} else {
			System.out.println("The number2 is"+number2);
		}

		int menu = 5;
		switch (menu) {
			case 1:
				System.out.println("Menu 1");
			break;
			
			case 2:
				System.out.println("Menu 2");
			break;
			
			case 3:
				System.out.println("Menu 3");
			break;
			default:
				System.out.println("Default Number");
			
		}
		
		// Repetition /Iteration /Looping
		// for
		
		for(int i = 2; i >= 1 && i <= 10; i++) {
			if(i == 8) {
				break;
			}
			if(i == 4) {
				continue;
			}
			System.out.println("Number is "+i);
		}
	
		// do while
		int number1;
		
		do {
			System.out.println("Input number [1...10]: ");
			number1 = scan.nextInt(); scan.nextLine();
		}while(number1 < 1 || number1 > 10);
		
		//while
		int number1;
		System.out.println("Input number: ");
		number1 = scan.nextInt();
		
		while(number1 > 1) {
			System.out.println("Number 1: "+number1);
			number1++;
			if(number1 == 10) {
				break;
			}
		}
	}

}
