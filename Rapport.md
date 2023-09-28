## TP 1 Java : Amirhossein Pouynafar - 262575 - Groupe 2 - Mr Forax


# Exercice 1

Voici le code complet de cet exercice :

```java
public class HelloGroland {
  public static void main(String[] args) {
    System.out.println("Hello Groland");
  }
}
```

# Exercice 2

Voici le code complet de cet exercice :

```java
public class PrintArgs {
  public static void main(String[] args) {

    for (var element : args) {
      System.out.format("%s \n", element);
    }      
  }
}
```


1. Pour afficher le premier argument de la ligne de commande, on peut utiliser
cette ligne :
```
System.out.println(args[0]);
```
Si on ne passe pas d'argument à notre prorgramme lors de son exécution,
rien ne sera affiché.

2. La boucle que l'on pourrait écrire en utilisant `length` en Java :
```
for (int i = 0; i < args.length; i++) { // ou bien var i = 0
    System.out.println(args[i]);
    // ou bien : System.out.format("%s \n", args[i]);
}
```

3. Afin d'avoir la même chose avec la syntax `for(Type value : array)`,
on pourra écrire :

```
for (var element : args) {
    System.out.format("%s ", args[i]);
}
```

# Exercice 3

Voici le code complet de cet exercice :

```java
import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {

    Scanner scanner  = new Scanner(System.in);

    // Afficher une demande d'entrée
    System.out.println("Enter a number: ");

    int value_1 = scanner.nextInt(); // variable de type integer
    int value_2 = scanner.nextInt(); // Pareil



    System.out.println(value_1 + value_2); // Nous allons afficher:
    System.out.println(value_1 - value_2); // la soustraction,
    System.out.println(value_1 * value_2); // le produit,
    System.out.println(value_1 / value_2); // le quotient,
    System.out.println(value_1 % value_2); // et le reste.

  }
}
```

2. Scanner scanner : type Objet (scanner est une instance de la classe Scanner)

int value : type primitif (integer)

3. nextInt() n'est pas une fonction, mais une method, cela veut dire qu'elle
est associée à une classe et s'utilise dans ce cadre. On peut constater que
Java est un langage Object Oriented de nature.

4. `java.util` est un package qui contient des classes utilitaires, par exemple
ici la classe `Scanner`.
Cela veut dire qu'on peut ne pas écrire `import java.util.Scanner` au début de
notre programme mais dans ce cas on doit éventuellement écrire
`java.util.Scanner scanner = new java.util.Scanner()` et cela, à force d'être
un peu long, n'est pas le préféré de certains développeurs.

5. Il suffit de refaire cette ligne : `int value_2 = scanner.nextInt()` avec une
 deuxième variable value_2. Et ensuite afficher la somme de value_1 et value_2.


# Exercice 4

Voici le code de l'exercice :

```java
public record Point(int x, int y) {
  public static void main(String[] args) {
    int abscissa = Integer.parseInt(args[0]);
    int ordinate = Integer.parseInt(args[1]);
    System.out.println("Point[x=" + abscissa + ", " + "y=" + ordinate + "]");

    var origin = new Point(abscissa, ordinate);
    origin.toString();
    System.out.println("dist = " + distance(origin));    
  }

  private static double distance(Point p) {
    double res = Math.sqrt(Math.pow(p.x(), 2) + Math.pow(p.y(), 2));
    return res;
  }

  @Override
  public String toString() {
    return "Point[x=" + x + ", " + "y=" + y + "]" ;
  }
}
```

1. Pour compiler le fichier Point.java, on pourrait écrire cela :
`javac Point.java`.
3. le mot-clé static sur une method, veut dire que cette method s'exécute sans
instance, sur la classe.
4. Dans ce cas on aura une exception de type java.lang.NumberFormatException.
6. la method distance sera de cette forme :
`private static double distance(Point p)` .
private : car on ne veut l'utiliser que dans notre record.
static : car c'est une method que n'est pas utilisée sur une instance.
valeur de retour : double



# Exercice 5

Voici un code java qui peut être équivalant de ce code en C :

```java
public class Pascal {
  public static void main(String[] args) {
    System.out.format(" Cn, p = %d\n", pascal (30000, 250));
  }

  public static int pascal(int nBut, int pBut) {
    int[] tab = new int[nBut + 1];
    tab[0] = 1;

    for(int n = 1; n < nBut; n++) {
      tab[n] = 1;

      for(int i = n-1; i > 0; i--) {
        tab[i] = tab[i-1] + tab[i];
      }
    }

    int result=tab[pBut];
    return result;
  }
}
```

Le programme pascal.c a pour temps d'exécution, 0.089 secondes. (Il faut
considérer que nous avons compilé notre fichier .c avec cette commande :
`gcc td01-pascal.c -o Pascal -O3` dont l'option `-O` permet de minimiser le
runtime de ce programme. (on a -O0, -O1, -O2, -O3) )

Alors que le temps d'exécution du même programme en Java est de 0.220 secondes.

Donc finalement le C est plus rapide que le Java.
Cette différence de rapidité est due au fait que le C nous crée un code
assembleur qui est ensuite exécuté directement, alors qu'en java le code est
d'abord transformé en bytecode et ensuite ce bytecode est interprété pour
devenir un morceau de code assembleur.
