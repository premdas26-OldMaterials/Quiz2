import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class carLoanTest {

	@Test
	void testMonthlyPayment() {
		carLoan loan1 = new carLoan(35000, 0, 60, 0.1);
		assertEquals(loan1.monthlyPayment(), 743.6465648943916);
	}

	@Test
	void testTotalInterest() {
		carLoan loan1 = new carLoan(35000, 0, 60, 0.1);
		assertEquals(loan1.totalInterest(), 9618.793893663496);
	}

}
