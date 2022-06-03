package StateDesignPattern;

public class StartState implements State {

	@Override
	public void doAction(Context c) {
		System.out.println("Player is in Start State");
	    c.setState(this);
	}
	
	public String toString() {
		return "Start State";
		
	}

}
