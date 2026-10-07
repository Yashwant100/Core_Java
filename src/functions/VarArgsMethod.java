package functions;

import java.util.Arrays;

public class VarArgsMethod {

	public static void main(String[] args) {
		// Program to illustarte the use of Var-Args method
		//Function calling
		fun(2,4,6,7,9,10);

	}
	// Var-Args method definition
	static void fun(int... args) {
		System.out.println(Arrays.toString(args));
	}

}
/*
 * Var-Args Method : When a mathod takes variable number of argument then it is known as Var-Args Method.
 *                   it acts as an arrays internally and can accept any number of arguments.*/
 