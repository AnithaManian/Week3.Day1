package Assignment_Week3.Day1;

public class Computer {

	public void computerModel() {
		System.out.println("The Computer Model is");
	}

	public static void main(String[] args) {
		Computer obj=new Computer();
		obj.computerModel();
		Desktop desktopObj = new Desktop();
		//to access inhertited method from Parent
		desktopObj.desktopSize();
		desktopObj.computerModel();
		
	}
}
