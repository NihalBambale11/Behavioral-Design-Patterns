package ChainOfResponsibilityDesignPattern;

public class Number {
	private int num1;
	private int num2;
	private String choice;
	
	public Number(int num1,int num2,String choice) {
		this.num1=num1;
		this.num2=num2;
		this.choice=choice;
	}
	
	//getters
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public String getChoice() {
		return choice;
	}

}
