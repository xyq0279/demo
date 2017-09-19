package pojo;

public class User {
	private String name;
	private String id;
	private int score;
	public User() {
	}
	public User(String name, String id, int score) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", score=" + score + "]";
	}
	
}
