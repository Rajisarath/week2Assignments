package week2.day4ass2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Axis deposit");
	}
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		System.out.println("------AxisBank Details------");
		axis.deposit();
		axis.fixed();
		axis.saving();
		
		
	}

}
