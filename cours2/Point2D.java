/**
 * Visualisez l'exécution de ce programme sur le site 
 * http://pythontutor.com/java.html#mode=edit
 */
public class Point2D {
    public char nom;
    public double x;
    public double y;
    
    public Point2D(char nom, double x, double y) {
	this.x = x;
	this.y = y;
	this.nom = nom;
    }
    
    public Point2D(char nom) {
	this.nom = nom;
    }
    
    public Point2D(char nom, double x) {
	this.nom = nom;
	this.x =x;
    }
    
    /**
       public Point2D(char nom, double y) {
       this.nom = nom;
       this.y = y;
       }
    */
    
    public void afficher() {
	System.out.println(this.nom + "(" + this.x +" , " + this.y +")");
    }
    
    public boolean equals(Point2D a) {
	return this.nom == a.nom && this.x == a.x && this.y == a.y;
    }
    
    public static void main(String[] args) {
	/** Des points à retenir !
	 * Les objets sont obtenus par l'instanciation d'une classe
	 * L'opérateur new permet d'obtenir une telle nouvelle instance 
	 * Les objets java ne sont jamais manipulés directement, mais via des références
	 * Les objets résident toujours dans le tas
	 */
	
	/** Trois choses se produisent lorsque nous exécutons la ligne suivante :
         *  -- la déclaration de la variable a comme référence pour un objet de 
         *     type Point2D et l'allocation dans la pile d'un espace de stockage 
         *     de cette référence
         *  -- la création d'un objet de type Point2D dans le tas ayant des 
         *     coordonnées (0,1) et le nom 'A'
         *  -- le lien entre la référence a et cet objet nouvellement créé.
         */
	Point2D a = new Point2D('A',0,1);
	
	/** Nous affichons une chaîne de la forme Point2D@d716361
	 */
	System.out.println(a);
	
	/** Pour afficher le contenu du point a, 
	 * nous devons écrire notre propre méthode.
	 */
	a.afficher();
	
	/** Nous pouvons utiliser les autres constructeurs de la classe
	 */
	Point2D b = new Point2D('B',3.56);
	b.afficher();
	
	Point2D c = new Point2D('C');
	c.afficher();
	
	/** Nous pouvons maintenant créer un tableau de points
	 */
	Point2D [] t = new Point2D[3];
	t[0] = a;
	t[1] = b;
	t[2] = c;
	
	/** Ci-dessous, nous allons imprimer une chaîne de la forme [LPoint2D;@78308db1,
	 *  -- [ indique que t est une référence à un tableau; 
	 *  -- le caractère L indique que dans ce tableau nous n'avons pas de type primitif;
	 *  -- Point2D est le type des objets du tableau;
	 *  -- après le séparateur @, nous avons l'adresse mémoire.
	 */
	System.out.println(t);
	
	/** 
         * Manipulation des références
         * Nous l'avons déjà vu :
         * -- l'affectation
         * -- l'accès à un élément d'un tableau 
         * -- l'accès à un attribut d'un objet ou à une méthode
         * Par la suite:
         * -- comparaisons de références
         * */
	Point2D d = new Point2D('D',2,1);
	Point2D d1 = new Point2D('D',2,1);
	if (d==null) {
	    System.out.println("null");
	} else {
	    d.afficher();
	}
	
	/** Nous testons ici si les deux variables contiennent la même valeur. 
	 *  Mais nous comparons les adresses mémoire et rien de plus !
	 */
	System.out.println(d==d1);
	
	/** Même si les champs d et d1 contiennent la même valeur, les deux objets 
	 *  sont différents! 
	 *  Si on veut vérifier l'équivalence des deux objets, il faut définir notre 
	 *  propre méthode equals (en adaptant la méthode de la classe Object).
	 */
	System.out.println(d.equals(d1));
    }
}
