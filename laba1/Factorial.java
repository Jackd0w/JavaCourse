package laba1;

public class Factorial {

	private int number;
	private int factorial;
	public Factorial(int n){
		this.number = n;
	}; 
	public int getNum() {
		return number;
	}
	public void setNum(int n) {
		this.number = n;
	}

	public int getFactorial() {
		return factorial;
	}


    public void calculateFactorial(){
		int result = 1;
		for (int i = 1; i <= number; ++i){
			result = result*i;
		}
		System.out.println(result);
	}	
}
