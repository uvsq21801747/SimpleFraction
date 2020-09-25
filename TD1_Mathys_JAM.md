# TD 1
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/).
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants
* Vous déposerez une archive contenant l'ensemble de votre travail sur Moodle.

## Partie en présentiel : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le projet Java `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    En cochant des cases, on initialise le repo avec un commit initiale. Sinon, le repo est vide et donc n'est pas clonable

    Pour la suite, ne cochez aucune de ces cases.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    git config --global user.name "Mathys JAM"
    git config --global user.email "mathys.jam@ens.uvsq.fr"
    ```
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    git init
    ```
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    git add *
    git commit -m"Added main class and Fraction declaration"
    ```
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    SimpleFraction test = new SimpleFraction();
    assert test.toString() = "NAN"
    ```
1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    git remote add origin https://github.com/uvsq21801747/SimpleFraction
    git push -u origin master
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    Ce fichier utilise la syntaxe markdown
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    git pull
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    bin/
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    git rm --cached .classpath .project .settings/
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    .classpath
    .project
    .settings/
    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Use the SSH protocol with Bitbucket Cloud](https://confluence.atlassian.com/bitbucket/use-the-ssh-protocol-with-bitbucket-cloud-221449711.html)).
    generer une clé ssh
    ajouter la clé ssh au gestionnaire de clé
    (ajouter un password a la clé)
    ajouter la clé sur github
    changer le remote pour utiliser le protocole SSH au lieu de https

## Partie en distanciel : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, ...).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, ...).

1. Quel OS et quel shell de commande utilisez-vous ?
    Linux/Fedora
    bash
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    man ls
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        ls -lkS
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        wc -l <nom_fichier>
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        grep "uneVariable" Main.java
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        ls -r | grep "uneVariable" *.java
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        find . -type f -name "README.md"
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        diff <fic1> <fic2>
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        ssh permet de gerer l'agent ssh, et donc par exemple de se connecter a une forge en utilisant le protocole ssh et non https
    * `screen`/`tmux`
        permet de creer et gerer plusieurs terminal dans une seul fenetre. Peut etre utile pour avoir un terminal pour la compilation, un terminal vim...
    * `curl`/[HTTPie](https://httpie.org/)
        permet de transferer des données avec un serveur, en réception ou en emission 
    * [jq](https://stedolan.github.io/jq/)
        jq permet de filtrer des données sous forme JSON

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), ...).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    Eclipse
    Idea Intellij

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    File/Properties/Ressource
1. Comment choisir le JDK à utiliser dans un projet ?
    File/Properties/Java Build Path
1. Comment préciser la version Java des sources dans un projet ?
    File/Properties/Java Compiler
1. Comment ajouter une bibliothèque externe dans un projet ?
    File/Properties/Java Build Path -> libraries
1. Comment reformater un fichier source Java ?
    Clic droit -> format -> Format
1. Comment trouver la déclaration d'une variable ou méthode ?
    Cliquer sur la variable -> F3
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    ctrl+espace
1. Comment renommer une classe dans l'ensemble du projet ?
    Clic droit -> refactor -> rename
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    Run/run configurations -> arguments
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    F11 | Run/Debug
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    La création simplifié des classe (avec final abstract, changer la classe parent..), la gestion des packages, le debugger et la refactorisation sont des élements trés utile
