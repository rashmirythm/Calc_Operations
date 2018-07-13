package calc;
  
public class Calculation {  
  
    public static int findMax(int arr[]){  
        int max=arr[0];  
        int x=0;
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
		x++;
        } 
			System.out.println("Checking");
        return max; 
    }  
	
	public static int findCube(int num)
	{
		int cube = num * num * num;
		return cube;
	}
	
	public static int findSqr(int num)
	{
		int sqr = num * num;
		return sqr;
	}
	
	public static int add(int num1, int num2)
	{
		int add = num1 + num2;
		return add;
	}
	
	public static int sub(int num1, int num2)
	{
		int sub = num1 - num2;
		return sub;
	}
	
	public static int mul(int num1, int num2)
	{
		int mul = num1 * num2;
		return mul;
	}
	
	public static int div(int num1, int num2)
	{
		int div = num1 / num2;
		return div;
	}
	
	public static int mod(int num1, int num2)
	{
		int mod = num1 % num2;
		return mod;
	}
} 
