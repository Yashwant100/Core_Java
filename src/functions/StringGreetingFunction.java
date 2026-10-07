package functions;

public class StringGreetingFunction {
	public static void main(String[] args) {
		// Program to illustrate greting funtion using name
		// function calling 
		String personalised = myGreet("Yashwant");
		System.out.println(personalised);
	}

	// Function definition
	private static String myGreet(String name) {
		String message = "Hello " +name;
		return message;
	}

}
