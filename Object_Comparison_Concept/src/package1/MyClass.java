package package1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * When you create objects, the variables store references to the objects.
		 * So, when you compare objects using the equality testing operator (==), it actually compares the references and not the object values.
		 */
		
		Animal a1 = new Animal("dog");
		Animal a2 = new Animal("dog");
		
		System.out.println(a1==a2);//output would be false because although values are equal but references(memory locations) of both objects are different.

	}

}
