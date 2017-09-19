package thread;


import pojo.GameRoom;
import pojo.User;

public class Game {
	
	public static void main(String[] args) {
		
		User user0 = new User("tom", "id0", 100);
		GameRoomRunable room = new GameRoomRunable();
		Thread t1 = new Thread(room);
		for (int i = 0; i < 5; i++) {
			UserThread t = new UserThread();
			t.user.setId("id"+i);
			t.start();
			room.players.add(t);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
