
public class Tiny {
	public static void f() {
		System.out.println("Hello"); // ic = 500 
	} // ic = 501 : la sortie de l'appel de f
	
	public static void main(String[] args) {
		f(); // ic = 0 : appel a la fonction f
	} // ic = 1 : sortie du programme 

}
