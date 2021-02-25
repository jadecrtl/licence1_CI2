public class FibonacciTrad {
	public static void main(String[] a){
		int ic = 0;    //compteur d'instructions
		int[] mem = new int[100000];  //mémoire à plat
		boolean fin = false; //test pour sortie
		while(!fin) {
			switch(ic){           
			case 0: mem[0] = 0; ic++; break;
			case 1: mem[1] = 1; ic++; break;
			case 2: mem[3] = 12; ic++; break;
			case 3: mem[4] = 0; ic++; break;
			case 4: if(!(mem[4] < mem[3])) {ic = 10;}
			else ic++; break;
			case 5: mem[2] = mem[0] + mem[1]; ic++; break;
			case 6: mem[0] = mem[1]; ic++ ;break;
		    case 7: mem[1] = mem[2]; ic++; break;
		    case 8: mem[4]++; ic++; break;
		    case 9: ic = 4; break; //saut inconditionnel 
		    case 10: System.out.println("fibo(" + mem[3] + ")=" + mem[1]); ic++; break;
		    case 11: fin = true;
			}
		} 	
	} 
}

