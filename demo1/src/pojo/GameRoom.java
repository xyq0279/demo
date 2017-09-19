package pojo;

import java.util.List;

public class GameRoom {
	private User host;
	private List<User> userList;
	private String scroe;
	public User getHost() {
		return host;
	}
	public void setHost(User host) {
		this.host = host;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public String getScroe() {
		return scroe;
	}
	public void setScroe(String scroe) {
		this.scroe = scroe;
	}
	@Override
	public String toString() {
		return "GameRoom [host=" + host + ", userList=" + userList + ", scroe="
				+ scroe + "]";
	}
	
}
