import java.util.Scanner;


public class Leapyear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int year;
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter the year");
		year=sc.nextInt();
		sc.close();
		if(year%4==0){
					if(year%100==0){
						if(year%400==0){
							System.out.println("its a leap year"+year);
						}
					}
		}
		else{
			System.out.println("not a leap year");
			
		}
		


	}

}
