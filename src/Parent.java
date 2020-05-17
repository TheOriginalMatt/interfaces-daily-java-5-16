public class Parent {
	public static void main(String args[]) {
		MySimpleIntObject intObj1 = new MySimpleIntObject();
		MySimpleIntObject intObj2 = new MySimpleIntObject();

		MySimpleStrObject strObj1 = new MySimpleStrObject();
		MySimpleStrObject strObj2 = new MySimpleStrObject();

		intObj1.setObj(15);
		strObj1.setObj("15");

		intObj2.setObj(15);
		strObj2.setObj("15");

		System.out.println(intObj1);
		System.out.println(strObj1);		

		System.out.println(intObj1.equals(intObj2));
		System.out.println(strObj1.equals(strObj2));

		System.out.println(intObj1.equals(strObj1));
		System.out.println(strObj1.equals(intObj2));

		// The following line will throw an error
		// intObj2.setObj("25");

		System.out.println(intObj1.equals(intObj2));
	}
}