public class Fibonacci2 {
	public static void main(String[] a){
		int u = 0;     // ic = 0
		int v = 1;     // ic = 1
		int w;
		int k = 12;    // ic = 2  
		for(int i = 0; // ic = 3
			i < k;     // ic = 4; saut conditionnel 
		  	i++) {   // ic = 8
		 	w = u + v;   // ic = 5
		   	u = v;  	 // ic = 6
		   	v = w;  	 // ic = 7
		}            // ic = 9; saut inconditionnel
		             //         vers 4   
		System.out.println("fibo(" + k + ")=" + v);
		             // ic =10
	}                // ic = 11; sortie
}


