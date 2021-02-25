/**
 * Visualisez l'exécution de ce programme sur le site 
 * http://pythontutor.com/java.html#mode=edit
 * Le code est trop long, vous devrez peut-être le découper 
 * en plusieurs morceaux.
 */
public class TestTableaux {
    /** nous affichons les valeurs du tableau tab
     * @param tab
     */
    public static  void afficher(int[][] tab) {
	for(int i = 0; i < tab.length; i++) {
	    for(int j = 0; j < tab[i].length; j++) {
		System.out.print(tab[i][j] + " ");
	    }
	    System.out.println();
	}
    }
    
    public static void main(String[] args) {
	/** Un petit rappel :
         *  déclaration et initialisation d'un tableau unidimensionnel
	 */
	int [] t = new int[0];
	
	/**
	 * Nous affichons une chaîne de caractères de la forme [I@56ab7864, où [
	 * nous indique que t est une référence pour un tableau, I que 
	 * le tableau contient des entiers, @ est un séparateur et le 
	 * nombre qui suit donne l'adresse dans le tas du tableau.
	 */
	System.out.println("La valeur de t est " + t);
	
	for(int i = 0; i < t.length; i++) {
	    System.out.println(t[i]);
	}
	
	
	/**
	 * Nous déclarons maintenant un tableau bidimensionnel.
         * Il s'agit en fait d'un abus de langage, puisque s n'est pas 
         * nécessairement une matrice rectangulaire,
         * mais comme nous le verrons par la suite, une référence de 
         * tableau de références de tableaux d'entiers.
	 */
	int[][] s;
	
	
	/** Si on décommente la ligne suivante, on obtient une erreur de compilation.
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	 * The local variable s may not have been initialized	
	 */
	//System.out.println("La valeur de s est " + s);
	
	/** L'initialisation de la variable s peut se faire de différentes manières.
	 *  I) Par étape. Par exemple, nous affectons d'abord la mémoire nécessaire 
	 *  pour un tableau contenant 2 références de tableaux d'entiers.	
	 */
	s = new int [2][];
	
	/** L'affichage produit par l'instruction suivante est de la forme 
	 * [[I@57ba5734 et [[ nous indique que nous avons une référence de tableau 
	 * de références.
	 */
	System.out.println("La valeur de s est " + s);
	
	/** Que pensez-vous que sera affiché après l'exécution 
	 * de la boucle for ?
	 */
	for(int i = 0; i<s.length; i++) {
	    System.out.println("La valeur de s[" + i + "] est " + s[i]);
	}
	
	/** En revanche, si l'on décommente la ligne en dessous où l'on appelle la 
	 * fonction afficher, on obtient une erreur de la forme :
	 * Exception in thread "main" java.lang.NullPointerException
	 *	at TestTableaux.main(TestTableaux.java:23)
	 */
	//afficher(s);
	
	/** On peut affecter les références ainsi obtenues par toute instruction 
	 * permettant d'obtenir une valeur du bon type, c'est-à-dire, dans ce cas,
	 *  des tableaux d'entiers.
	 */
	s[0] = new int[4];
	s[1] = new int[3];
	
	/** Que se passe-t-il si on décommente la ligne suivante ?
	 */
	//afficher(s);
	
	/** Nous pouvons changer les valeurs dans le tableau désigné par s[0]
	 */
	for(int i = 0; i < s[0].length; i++) {
	    s[0][i] = 2 * i;
	}
	afficher(s);
	
	/** Une autre manière d'affecter la référence s[0] est d'utiliser une
	 *  autre valeur du même type qui a déjà été créée.
	 */
	int [] u = new int[5];
	s[0] = u;
	
	/** Quelle valeurs seront affichées après l'exécution des lignes 101, 102 et 103 ?
         */
	u[0] = 3;
	u[1] = 2;
	System.out.println(s[0][0]);
	System.out.println(s[0][1]);
	System.out.println(s[1][0]);
	
	
	/** II) La deuxième façon d'initialiser une variable de type int [][] 
	 * est comme une structure de type matrice, c'est-à-dire un tableau 
	 * rectangulaire bi-dimensionnel. Par exemple ci-dessous, nous avons 
	 * affecté la mémoire pour trois tableaux, chacun contenant deux entiers 
	 * initialisés avec la valeur 0.
	 */
	int [][] v = new int[3][2];
	afficher(v);
	
	/** La troisième façon d'initialiser une variable de type int [][] 
	 * est de partager une référence du même type.
	 */
	int [][]  w = v;
	
    }
}
