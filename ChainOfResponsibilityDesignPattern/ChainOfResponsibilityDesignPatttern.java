package ChainOfResponsibilityDesignPattern;

import java.util.Scanner;

public class ChainOfResponsibilityDesignPatttern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Chain c1 = new AddNum();
		Chain c2 = new SubNum();
		Chain c3 = new MultNum();
		Chain c4 = new DivdNum();
		
		c1.nextChainObj(c2);
		c2.nextChainObj(c3);
		c3.nextChainObj(c4);
		
		int a,b;
		String ch;
		System.out.println("Enter the num1 num2 and chocie");
		a=scan.nextInt();
		b=scan.nextInt();
		ch=scan.next();
		
		Number req = new Number(a,b,ch);
		c1.calculate(req);

	}

}
