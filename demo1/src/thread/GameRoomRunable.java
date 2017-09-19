package thread;

import java.util.ArrayList;
import java.util.List;

public class GameRoomRunable implements Runnable{
	
	public volatile int score=0;//分数
	public volatile int playerNum=0;//玩家人数
	public volatile List<UserThread> players = new ArrayList<UserThread>();
	public volatile int state =0;
	
	@Override
	public void run() {
		int playerNum = players.size();
		if(state==0){
			System.out.println("房间创建成功，等待玩家加入.....");
		}else if(state==1){
			if(players!=null&&playerNum>0){
				Thread t = players.get(playerNum-1);
				System.out.println("玩家"+t.getName()+"进入房间................");
			}
		}else{
			System.out.println("游戏已经开始，无法加入.............");
		}
		System.out.println("当前房间人数为:"+playerNum+",下注总数为:"+score);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
