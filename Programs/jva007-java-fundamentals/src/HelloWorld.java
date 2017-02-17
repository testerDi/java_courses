/**
 * This is the simplest class which prints the “Hello, world” message.
 * @author Peter Pan
 */
public class HelloWorld {
	
	/**
	 * Definition for the "Hello world" message.
	 */
	public static final String HELLO_MESSAGE = "Hello, world"; 

	/**
	 * Main methods which is executed by JVM and prints the message.
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		System.out.println(HELLO_MESSAGE);
		System.out.println(add(2, 3));
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
}