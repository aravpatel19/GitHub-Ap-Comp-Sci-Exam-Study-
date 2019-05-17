public class Daniel implements Player{

	private String name;
	private int hp;
	private int maxDam;

	public Daniel(String name, int health, int maximumDamage){
		this.name = name;
		this.hp = health;
		this.maxDam = maximumDamage;
	}
	public String getName(){
		return name;
	}
	public int getHP(){
		return hp;
	}
	public int getMaxDam(){
		return maxDam;
	}
}