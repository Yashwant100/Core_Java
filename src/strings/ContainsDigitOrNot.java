package strings;

public class ContainsDigitOrNot {

	public static void main(String[] args) {
		// Program to check if String contains digit or not
		String str = "32431";
		boolean isDigit = false;
		
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                isDigit = false;
                break;
            }
        }

        if (isDigit && !str.isEmpty()) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String does not contain only digits");
        }
    }


}
