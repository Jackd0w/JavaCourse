package laba1;

public class Factorial {
    static void calculateFactorial(int n){
		int result = 1;
		for (int i = 1; i <=n; i ++){
			result = result*i;
		}
		System.out.println(result);
	}	
}
