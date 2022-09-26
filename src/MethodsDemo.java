
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		
		MethodsDemo2 d1 = new MethodsDemo2();
		System.out.println(d1.getUserData());
		
		String d2 = getName();
		System.out.println(d2);

	}
	
	public String getData() {
		System.out.println("Hello World");
		return "Oggy Chaudhary";
	}
	
	public static String getName() {
		return "I am Static Method";
	}

}
