import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i: arr) {
			if (i % 2 == 0) {
				System.out.println(i);
				break;
			}
			else {
				System.out.println(i + " is not an even number");
			}
		}
		
		// Arraylist
		System.out.println("ArrayList: ");
		ArrayList<String> a = new ArrayList<String>();
		a.add("Oggy");
		a.add("Bune");
		a.add("Nane");
		a.add("Aama");
		System.out.println(a.get(3));
	}

}
