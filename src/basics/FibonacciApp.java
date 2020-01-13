package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  double a[] = {1,2,3,4,5.3};
  int c[] = {1,2,3,4,200};
			System.out.println(sumUp(5));
			System.out.println(factorial(6));
			System.out.println(average(a));
			System.out.println(getMaxValue(c));
	}

	
	
	public static int fib(int n) {
		if (n==0){
			return 0;
		} else if (n==1){
			
			return 1;
		} else {
			
			return (fib(n-1) + fib(n-2));
		}
		
		
		}
	
//Question 1	
	public static int sumUp(int n){
		if(n ==0){
			return 0;
		} else {
			return n + sumUp(n-1);
		}
		
		
	}
	
//Question 2 
	public static int factorial(int n){
		
		if(n==0){
			return 1;
		} else {
			return n * factorial(n-1);
		}
		
	}
	
	public static double average( double[] a){
		double sumUp = 0;
		for(int i = 0; i < a.length ; i++){
			 sumUp += a[i];
		}
		double result = sumUp / a.length;
		return result;
	}
	
	public static int getMaxValue(int[] numbers){
		  int maxValue = numbers[0];
		  for(int i=1;i < numbers.length;i++){
		    if(numbers[i] > maxValue){
			  maxValue = numbers[i];
			}
		  }
		  return maxValue;
		}
	
	
	public static int getminValue(int[] numbers){
		  int maxValue = numbers[0];
		  for(int i=1;i < numbers.length;i++){
		    if(numbers[i] > maxValue){
			  maxValue = numbers[i];
			}
		  }
		  return maxValue;
		}
		
}

