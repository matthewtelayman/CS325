//Matt Layman 11-21 Demo5.java
//catching exception in other scopes

public class Demo5 {
	public static void main(String[] args) {
		try // call method someMethod
		{
			someMethod();
		} catch (ExceptionB exception) {
			System.err.printf("Handled in main: %s", exception);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	// call method someMethod2
	public static void someMethod() throws Exception {
		try {
			someMethod2();
		} catch (ExceptionA exception) // only catches ExceptionA
		{
			System.err.printf("Handled exceptionA in someMethod: ", exception);
		}
	}

	// throw Exception
	public static void someMethod2() throws Exception {
		throw new ExceptionB();
	}
}

// subclasses of Exception
class ExceptionA extends Exception {
	// empty class body
}

class ExceptionB extends Exception {
	// empty class body
}
