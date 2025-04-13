# Projet d'Algorithmes de Tri et Recherche

Ce projet implémente trois algorithmes fondamentaux en Java : le tri rapide (QuickSort), le tri par tas (HeapSort), et la recherche dichotomique (BinarySearch). Il inclut également une classe principale (`Main.java`) qui démontre l'utilisation de ces algorithmes à travers plusieurs cas de test variés.

## Structure du Projet

Le projet est composé de quatre fichiers principaux :

1. **QuickSort.java** : Implémentation de l'algorithme de tri rapide.
2. **HeapSort.java** : Implémentation de l'algorithme de tri par tas.
3. **BinarySearch.java** : Implémentation de la recherche dichotomique.
4. **Main.java** : Programme principal qui exécute des cas de test pour chaque algorithme.

## Prérequis

- **Java Development Kit (JDK)** : Version 8 ou supérieure.
- Un environnement de développement (IDE) comme IntelliJ IDEA, Eclipse, ou tout autre compilateur Java.

## Installation

1. Clonez ou téléchargez ce projet dans un répertoire local.
2. Ouvrez le projet dans votre IDE ou naviguez vers le répertoire via un terminal.
3. Assurez-vous que les quatre fichiers Java (`QuickSort.java`, `HeapSort.java`, `BinarySearch.java`, `Main.java`) sont dans le même répertoire.

## Utilisation

### Compilation et Exécution

1. Compilez les fichiers Java avec la commande suivante dans un terminal (si vous n'utilisez pas d'IDE) :
   ```bash
   javac *.java
   ```
2. Exécutez le programme principal :
   ```bash
   java Main
   ```

### Fonctionnement du Programme

Le programme `Main.java` exécute trois sections principales, chacune testant un algorithme avec plusieurs cas d'utilisation :

1. **Tri Rapide (QuickSort)** :
   - Cas 1 : Tri d'un tableau avec des nombres aléatoires.
   - Cas 2 : Tri d'un tableau déjà trié.
   - Cas 3 : Tri d'un tableau avec des doublons.

2. **Tri par Tas (HeapSort)** :
   - Cas 1 : Tri d'un tableau avec des nombres négatifs.
   - Cas 2 : Tri d'un tableau vide.
   - Cas 3 : Tri d'un tableau à un seul élément.

3. **Recherche Dichotomique (BinarySearch)** :
   - Cas 1 : Recherche d'un élément au milieu d'un tableau.
   - Cas 2 : Recherche d'un élément non existant.
   - Cas 3 : Recherche dans un tableau à un seul élément.

Chaque cas affiche le tableau avant et après l'opération (pour les tris) ou le résultat de la recherche, permettant de vérifier le bon fonctionnement des algorithmes.

### Exemple de Sortie

Lors de l'exécution, vous verrez une sortie similaire à celle-ci :

```
=== Partie TRI RAPIDE ===
Cas 1: Tableau aléatoire
Avant tri: 
64 34 25 12 22 11 90 
Après tri: 
11 12 22 25 34 64 90 

[... autres cas ...]

=== Partie TRI PAR TAS ===
Cas 1: Tableau avec nombres négatifs
Avant tri: 
-4 3 -12 8 -1 0 15 
Après tri: 
-12 -4 -1 0 3 8 15 

[... autres cas ...]

=== Partie RECHERCHE DICHOTOMIQUE ===
Cas 1: Recherche élément au milieu
Tableau: 
2 3 4 10 40 50 60 70 
Recherche de 10: Trouvé à l'index 3

[... autres cas ...]
```

## Remarques Importantes

- **Tri Rapide** : L'algorithme utilise un pivot (dernier élément) et a une complexité moyenne de O(n log n).
- **Tri par Tas** : Construit un tas max pour trier en O(n log n), robuste pour tous types de données.
- **Recherche Dichotomique** : Nécessite un tableau trié au préalable et a une complexité de O(log n).
- Les tableaux utilisés dans les tests sont volontairement variés pour démontrer la robustesse des algorithmes face à différents scénarios.

## Auteur

Ce projet a été développé par Arthur HEUMI. Les implémentations et les cas de test ont été conçus pour être pédagogiques et complets, en s'appuyant sur des algorithmes classiques d'informatique.

## Licence

Ce projet est fourni à des fins éducatives. Aucune licence spécifique n'est appliquée, mais veuillez citer l'auteur en cas de réutilisation.