
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		int myNum = 5;
		String name = "Bipul Chaudhary";
		char ch = 'O';
		double dec = 5.99;
		boolean bool = true;
		
		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println("My name is " + name +".");
		
		// Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1, 2, 3, 4, 5};
		
		System.out.println(arr2[3]);
		
		// for loop
		System.out.println("Looping through array:");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
	}

}
