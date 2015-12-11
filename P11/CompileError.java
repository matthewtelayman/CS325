//Matt Layman 11-18 CompileError.java
//catching base class exception before derived class exception
import java.io.IOException;

public class CompileError {
	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch (Exception exception) // superclass exception
		{
			exception.printStackTrace();
		} catch (IOException ioException) // subclass exception
		{
			System.err.println("IOException");
		}
	}
} // end class CompileError
