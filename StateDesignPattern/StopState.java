package StateDesignPattern;

public class StopState implements State {

	@Override
	public void doAction(Context c) {
		System.out.println("Player is in Stop State");
	    c.setState(this);
	}
	
	public String toString() {
		return "Stop State";
		
	}

}