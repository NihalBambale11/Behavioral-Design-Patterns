package ChainOfResponsibilityDesignPattern;

public interface Chain {
	
	public void nextChainObj(Chain c);
	public void calculate(Number req);

}
