package demo1;

public class InterestCalculator {

	public static void main(String[] args) {
		double principal = 9999; // principle amount
		float rate = 7.8F;  // Rate of interest
		int duration = 60;// duration in months
		double interest = 0;
		String message = "";
		
		if(principal < 10000 || principal > 9000000 )
		{
			message += " Principal must be in range 10000-9000000\n";
		}
		if(rate < 1 || rate > 20) {
			message += " Rate of interest must be in range 1-20\n";
		}
		if(duration < 12 || duration > 120) {
			message += " Duration must be in range 12-120 months\n";
		}
			
		if( message.length()==0) {
			interest = principal * (rate/100/12)* duration;
			System.out.println("Interest would be "+interest);
		}else {
			System.out.println("Errors Detected" );
			System.err.println(message);
		}
		
		char accType = 'S';		// S=Savings, D=Deposits, L=Loan
		switch(accType) {
		case 'S':
			System.out.println("Savings Account");
			break;
			
		case 'D':
			System.out.println("Deposits");
			break;
		case 'L':
			System.out.println("Loans");
			break;
		default:
			System.out.println("Unknown");
		}
	}

}
