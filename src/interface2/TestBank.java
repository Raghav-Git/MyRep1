package interface2;

public class TestBank {

	public static void main(String[] args) {

		
		Bank b = new AxisBank();
		b.creditMoney();
		b.debitMoney();
		b.tranferMoney();
		//b.internationalBanking();
		
		System.out.println("************************");
		
		AxisBank a = new AxisBank();
		a.creditMoney();
		a.debitMoney();
		a.tranferMoney();
		a.internationalBanking();
		
	}

}
