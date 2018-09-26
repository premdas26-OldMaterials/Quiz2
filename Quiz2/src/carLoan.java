
public class carLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private double carPrice;
	// price is a double because after taxes, fees, etc. the price most likely will not be an integer
	
	private int downPayment;
	private int loanLength;
	private double interestRate;
	
	public carLoan(double Price, int downPay, int Length, double ir) {
		
		this.carPrice = Price;
		this.downPayment = downPay;
		this.loanLength = Length;
		this.interestRate = ir;
		
	}
	
	public double monthlyPayment() {
		
		double initialBalance = carPrice - downPayment;
		return (initialBalance*Math.pow(1+(interestRate/12), loanLength)*(interestRate/12))/(Math.pow(1+(interestRate/12),  loanLength)-1);
		
	}
	
	public double totalInterest() {
		
		return (monthlyPayment() * loanLength) - carPrice;
		
	}

}
