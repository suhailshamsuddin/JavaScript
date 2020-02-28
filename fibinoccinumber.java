import java.util.Scanner;


public class fibinoccinumber{
	int firstnumber;
	int secondnumber;
	int thirdnumber;
	int limit;
	int i;
	fibinoccinumber(int n){
		limit=n;
		firstnumber=1;
		secondnumber=0;
		
	}
	void generatorfibinocci(){
		for(int i=0;i<limit;i++){
			thirdnumber=firstnumber+secondnumber;
			System.out.println(thirdnumber+" ");
			firstnumber=secondnumber;
			secondnumber=thirdnumber;
			
			
			
		}
	}
	
	 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the total number");
		int limit= sc.nextInt();
		fibinoccinumber f= new fibinoccinumber(limit);
		f.generatorfibinocci();
		
		
		
		// TODO Auto-generated method stub

	}

}
