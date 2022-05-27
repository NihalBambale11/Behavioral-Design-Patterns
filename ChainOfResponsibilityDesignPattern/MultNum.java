package ChainOfResponsibilityDesignPattern;

public class MultNum implements Chain {

	private Chain c;
	int res;

	@Override
	public void nextChainObj(Chain c) {
		this.c=c;
	}

	@Override
	public void calculate(Number req) {
		if(req.getChoice().equalsIgnoreCase("mult")) {
			res=req.getNum1()*req.getNum2();
			System.out.println(req.getNum1()+" * "+req.getNum2()+" = "+res);
		}
		else {
			c.calculate(req);
		}
	}
}
