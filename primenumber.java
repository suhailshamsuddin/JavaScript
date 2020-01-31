import java.util.Scanner;


public class primenumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		boolean isPrime=true;
		sc.close();
		for(i=2;i<n;i++)
		{
			if(n%i==0){
				System.out.println("the number is not prime");
				break;
			}
			
		}
			if(isPrime)
			{
				System.out.println("the number is prime"+n);
			}
		
	}

}
