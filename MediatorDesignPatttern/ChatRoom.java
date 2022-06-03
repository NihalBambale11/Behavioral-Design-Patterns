package MediatorDesignPatttern;

import java.sql.Date;

public class ChatRoom {

	public static void showMessage(User u,String message) {
		System.out.println(new Date(0).toString()+ " [" +u.getName()+"]  "+message);
		//System.out.println(new Date());
	}
}
