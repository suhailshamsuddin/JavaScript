import java.util.Scanner;


public class Add {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1,n2,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n1");
		n1=sc.nextInt();
		System.out.println("enter n2");
		n2=sc.nextInt();
		sc.close();
		sum=n1+n2;
		System.out.println("sum of n1 and n2:"+sum);
		
		
	}

}
