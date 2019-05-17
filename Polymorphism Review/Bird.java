public class Bird extends Animal{

	private boolean canFly;

	public Bird(boolean fly, String name){
		super(name);
		this.canFly = fly;
	}
	public boolean getCanFly(){
		return canFly;
	}

	public String toString(){
		return super.toString() + "\nCan Fly: "+canFly;
	}
}