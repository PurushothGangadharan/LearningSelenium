package week1day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c,i,n=10;
		System.out.println(a);
        System.out.println(b);
        for(i=2;i<n;i++)
        {
        	c=a+b;
        	System.out.println(""+c);
        	a=b;
        	b=c;
        }
	}

}
