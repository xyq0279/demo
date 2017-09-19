package thread;

import pojo.User;

public class UserThread extends Thread{
	public volatile User user = new User();
	public void run() {
		
	}
}
