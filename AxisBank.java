package Assignment_Week3.Day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("This is method override for Axis Bank");
	}
public static void main(String[] args) {
	AxisBank objAxis=new AxisBank();
	objAxis.deposit();
	BankInfo objBkin = new BankInfo();
	objBkin.deposit();
	objBkin.fixed();
	objBkin.saving();
}
}

