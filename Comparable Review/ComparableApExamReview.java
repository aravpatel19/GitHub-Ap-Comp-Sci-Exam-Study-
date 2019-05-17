public class ComparableApExamReview{
	public static void main(String[]args){

		String ar = "arav";
		String m = "mithil";
		String k = "khushi";
		String av = "avani";

		/*if first is less than second,
		then negative number will be returned.*/
		System.out.println(ar.compareTo(m));

		System.out.println();

		/*if first is greater than second,
		then positive number will be returned.*/
		System.out.println(k.compareTo(av));

		System.out.println();

		/*If equal,
		then zero will be returned.*/
		System.out.println(av.compareTo(av));
	}
}