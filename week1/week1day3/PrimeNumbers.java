package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=100;
		int count=0;
		for(int i=1;i<=input;i++) {
			if(input%i==0) {
				count++;			
				}
		}
		if(count==2) {
			System.out.println("prime number");
			
		}
		else
		{
			System.out.println("not a prime number");
		}
	}

}
