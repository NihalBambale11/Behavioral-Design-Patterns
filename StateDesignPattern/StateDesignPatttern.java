package StateDesignPattern;

public class StateDesignPatttern {

	public static void main(String[] args) {
		Context c = new Context();
		
		
		StartState ss = new StartState();
		ss.doAction(c);
		System.out.println(c.getState());
		
		System.out.println();
		
		StopState st = new StopState();
		st.doAction(c);
		System.out.println(c.getState());
	}

}
