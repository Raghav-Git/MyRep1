package interface2;

public class AxisBank implements Bank{

	@Override
	public void creditMoney() {
		System.out.println("Axis Bank Credit Money");
	}

	@Override
	public void debitMoney() {
		System.out.println("Axis Bank Debit Money");
	}

	@Override
	public void tranferMoney() {
		System.out.println("Axis Bank Transfer Money");
	}

	public void internationalBanking(){
		System.out.println("Axis Bank International Banking");
	}

	

}
