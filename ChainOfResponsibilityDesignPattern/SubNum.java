package ChainOfResponsibilityDesignPattern;

public class SubNum implements Chain {

	private Chain c;
	int res;

	@Override
	public void nextChainObj(Chain c) {
		this.c=c;
	}

	@Override
	public void calculate(Number req) {
		if(req.getChoice().equalsIgnoreCase("sub")) {
			res=req.getNum1()-req.getNum2();
			System.out.println(req.getNum1()+" - "+req.getNum2()+" = "+res);
		}
		else {
			c.calculate(req);
		}
	}
	
}
