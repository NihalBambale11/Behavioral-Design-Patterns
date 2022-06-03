package MediatorDesignPatttern;

public class MediatorDesignPatttern {

	public static void main(String[] args) {
		User Edward = new User("Edward");
		User Ezio= new User("Ezio");
		
		Edward.sendMessage("I am pirate and An Assassin");
		Ezio.sendMessage("I am An Assassin of 3 Phases of Life");
	    Edward.sendMessage("Leave Her Jonny");
	}

}
