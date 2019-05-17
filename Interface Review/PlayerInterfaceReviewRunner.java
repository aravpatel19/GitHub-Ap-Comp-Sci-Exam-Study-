public class PlayerInterfaceReviewRunner{
	public static void main(String[]args){

		Daniel person1 = new Daniel("Daniel", 100, 50);

		/*
		Daniel person2 = new Player();
		will not work because interfaces cannot
		be instantiated.
		*/

		Player person2 = new Daniel("Daniel", 100, 50);

	}
}