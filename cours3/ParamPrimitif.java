
public class ParamPrimitif {
	
	public static void f(int a) {
		System.out.println("dans f a = " + a);
		a = a + 1;
		System.out.println("dans f a = " + a);	
	}


	public static void main(String[] args) {
		int n = 7;
		System.out.println("dans main n = " + n);	
		f(n);
		System.out.println("dans main n = " + n);	
		
	}

}
