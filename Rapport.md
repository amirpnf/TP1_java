## TP 1 Java : Amirhossein Pouynafar - 262575 - Groupe 2 - M Forax


# Exercice 2

1. Si on ne passe pas d'argument à notre prorgramme lors de son exécution,
rien ne sera affiché.
2. La boucle que l'on pourrait écrire en utilisant `length` en Java :
```
for (int i = 0; i < args.length; i++) { // ou bien var i = 0
    System.out.format("%s ", args[i]);
}
```

3. Afin d'avoir la même chose avec la syntax `for(Type value: array)` on pourra écrire : 

```
for (var element: args) {
    System.out.format("%s ", args[i]);
}
```

# Exercice 3



2. Scanner scanner : type Objet (scanner est une instance de la classe Scanner)

int value : type primitif (integer)

3. nextInt() n'est pas une fonction, mais une method, cela veut dire qu'elle est associée 
à une classe et s'utilise dans ce cadre. On peut constater que Java est un langage Object Oriented de nature.

4. `java.util` est un package qui contient des classes utilitaires, par exemple ici la classe `Scanner`.
Cela veut dire qu'on peut ne poas écrire `import java.util.Scanner` au début de notre programme mais 
dans ce cas on doit éventuellement écrire `java.util.Scanner scanner = new java.util.Scanner()` et cela,
à force d'être un peu long, n'est pas le préféré de certains développeurs.

5. Il suffit de refaire cette ligne : `int value_2 = scanner.nextInt()` avec une deuxième variable value_2. Et ensuite afficher la somme de value_1 et value_2.


# Exercice 4

1. Pour compiler le fichier Point.java, on pourrait écrire cela : `javac Point.java`
3. le mot-clé static sur une method, veut dire que cette method s'exécute sans instance, sur la classe.
4. Dans ce cas on aura une exception de type java.lang.NumberFormatException.
6. la method distance sera de cette forme : 
`private static double distance(Point p)`  
private : car on ne veut l'utiliser que dans notre record.
static : car c'est une method que n'est pas utilisée sur une instance.
valeur de retour : double



# Exercice 5

Le programme pascal.c a pour temps d'exécution, 0.089 secondes. (Il faut
considérer que nous avons compilé notre fichier .c avec cette commande :
`gcc td01-pascal.c -o Pascal -O3` dont l'option `-O` permet de minimiser le
runtime de ce programme. (on a -O0, -O1, -O2, -O3) ) 

Alors que le temps d'exécution du même programme en Java est de 0.220 secondes.

Donc finalement le C est plus rapide que le Java.
Cette différence de rapidité est due au fait que le C nous crée un code assembleur qui
est ensuite exécuté directement, alors qu'en java le code est d'abord transformé en bytecode et ensuite ce bytecode est interprété pour devenir un morceau de code assembleur.

