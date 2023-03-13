package numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Num to find fact:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		fact= factorial(num);
		System.out.println("Factorial is:"+fact);
		
	}

	static int factorial(int num) {
		if(num==0) {
			return 1;
		}else {
			return num*(factorial(num-1));
		}
		
//		int f=1;
//		for(int i=1;i<=num; i++) {
//			f=f*i;
//		}
//		System.out.println("Factorial is:"+f);
		
		
		
	}

}
