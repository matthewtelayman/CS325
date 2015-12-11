//Matt Layman 11-19 Demo3.java
//constructor that throws an exception

class SomeClass {
	// constructor throws exception
	public SomeClass() throws Exception {
		throw new Exception();
	}
}

public class Demo3 {
	public static void main(String[] args) {
		SomeClass testObject;

		try // instantiate someexception object
		{
			testObject = new SomeClass();
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}
