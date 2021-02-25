import java.util.Stack;
	
public class TinyTrad {
	public static void main(String[] args) {
		int ic = 0;                       //compteur inst
		//int[] mem = new int[100000];    //pas utilisée
		Stack<Integer> p = new Stack<Integer>();
		
		while(true)
			switch(ic){
			case 0: p.push(ic+1); ic = 500; break;
			//@retour=1 sur la pile + saut inconditionnel vers 500
			case 1: System.exit(0);
			
			//...
			
			case 500: System.out.println("Hello"); ic++; break;
			case 501: ic = p.peek(); break;
			}
	}	
}

