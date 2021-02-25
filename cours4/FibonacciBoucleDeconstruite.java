public class FibonacciBoucleDeconstruite {
	public static void main(String[] a){
		int u = 0;  // ic = 0: u stocké à mem[0]
		int v = 1;  // ic = 1: v stocké à mem[1]
		int w;    // w stocké à mem[2]
		int k = 12; // ic = 2: k stocké à mem[3]
		int i = 0;  // ic = 3: i stocké à mem[4]
		while(true)
			if(i < k){   // ic = 4: saut cond. vers 10
				w = u + v; // ic = 5
				u = v;   // ic = 6
				v = w;   // ic = 7
		        i++;   // ic = 8
			} else break;  //ic = 9 saut inconditionnel
		    System.out.println("fibo(" + k + ")=" + v);
		    // ic = 10
	}  // ic = 11 : sortie
}


