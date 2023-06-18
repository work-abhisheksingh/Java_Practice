package StringCode;

import java.util.Scanner;

public class DistrubuteTicket {
	public static int distributeTicket(int N, int K) {
		int lastPerson = 0;

		// To find the last person, we need to determine the number of complete cycles
		// that can be formed
		// in the given queue of N people. Each complete cycle consists of 2K people.
		int completeCycles = N / (2 * K);

		// To calculate the position of the last person, we need to determine the
		// remainder (R) of N divided by (2 * K).
		// If R is less than K, it means the last person is in the first part of the
		// cycle.
		// Otherwise, the last person is in the second part of the cycle.
		int R = N % K;

		   if(R==0){
	            if(completeCycles%2==0){
	                return (1+((completeCycles/2)*K));
	            }else{
	               
	                return ((completeCycles/2)*K+K);
	            }
	        }else{
	            if(completeCycles%2==0){
	                return ((completeCycles/2)*K)+R;
	            }else{
	               
	                return 1+(((completeCycles/2)+(completeCycles%2))*K);
	            }
	        }
	    }
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N: Means Enter the number of People in the Queue");
		int N = sc.nextInt();
		System.out.println("Enter the Value of K: Means Enter the value by which you want to divide the ticket");
		int K = sc.nextInt();
		int lastPerson = distributeTicket(N, K);
		System.out.println("Last person to get the ticket: " + lastPerson);

		sc.close();
	}

}
