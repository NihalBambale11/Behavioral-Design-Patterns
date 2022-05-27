package ChainOfResponsibilityDesignPattern;

public class DivdNum implements Chain {

	private Chain c;
	int res;

	@Override
	public void nextChainObj(Chain c) {
		this.c=c;
	}

	@Override
	public void calculate(Number req) {
		if(req.getChoice().equalsIgnoreCase("divd")) {
			res=req.getNum1()/req.getNum2();
			System.out.println(req.getNum1()+" / "+req.getNum2()+" = "+res);
		}
		else {
			System.out.println("It is only Applicable to Add ,Sub,mult,Divd ");
		}
	}
}
