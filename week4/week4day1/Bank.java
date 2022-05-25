package week4day1assignment;

public class Bank extends SBI implements PBN {

public void cibilScore() {
	// TODO Auto-generated method stub
	System.out.println("600");
	
}

public void maximumLoanAmount() {
	// TODO Auto-generated method stub
	System.out.println("50");

	
}

public void creditScore() {
	// TODO Auto-generated method stub
	System.out.println("600");

	
	
}

public void minimumBalance() {
	// TODO Auto-generated method stub
	System.out.println("5");

	
}

@Override
public void bankBalance() {
	// TODO Auto-generated method stub
	System.out.println("10000");

}
public static void main(String[] args) {
	

Bank bank=new Bank();
bank.cibilScore();
bank.maximumLoanAmount();
bank.creditScore();
bank.minimumBalance();
bank.bankBalance();

}
}
