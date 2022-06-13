package UE02_AddAndSearch;

public class Tree {
    private Node root;

    public void add(int number) {
        Node newNode = new Node(number);

        // Baum ist noch leer
        if (root == null)
            root = newNode;

        // Sonst richtige Stelle suchen und dort einfügen
        else {
            // Variante 1: Rekursiv
            addRecursive(root, newNode);
            // Variante 2: Schleife
            //addLoop(root, newNode);

        }
    }



    // Add - Variante Rekursion
    private void addRecursive(Node currentNode, Node newNode) {
        if (currentNode.getNumber() > newNode.getNumber())
        {
            // Ist die linke Position von CurrentNode frei?
            if (currentNode.getLeft() == null)
            {
                currentNode.setLeft(newNode);
            }
            // Linke Position ist schon belegt
            else
            {
                addRecursive(currentNode.getLeft(), newNode);
            }
        }
        else if (currentNode.getNumber() < newNode.getNumber())
        {
            // Ist die rechte Position von currentNode frei?
            if (currentNode.getRight() == null)
            {
                currentNode.setRight(newNode);
            }
            // Rechte Position ist schon belegt
            else
            {
                addRecursive(currentNode.getRight(), newNode);
            }
        }
    }

    // Add - Variante Loop
    private void addLoop(Node startNode, Node newNode) {
        Node currentNode=startNode;
//
//       // FALL1: Baum ist leer
//        if(startNode == null){
//            newNode=startNode;
//        }
//
//
//        //Fall2: Baum ist nicht leer
//        else {
//            Node currentNode = root;
        boolean nodeAdedd= false;
            while (nodeAdedd = false) {

                //neue wert ist kleiner als current wert:

                if (newNode.getNumber() < currentNode.getNumber()) {
                //fall: es gibt keine left Knoden
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(newNode);
                        nodeAdedd=true;
                    }
                    //fall: left es gibt schon
                    else {
                        currentNode = currentNode.getLeft();
                    }
                }

                    //neue wert ist grösser als aktuellen


               else if(newNode.getNumber() > currentNode.getNumber()){
                   //Gibt es einen rechtes Kind
                    if(currentNode.getRight()==null){
                        currentNode.setRight(newNode);
                        nodeAdedd=true;
                    }
                    else{
                        currentNode=currentNode.getRight();
                    }

                   //weiter springen zum rechten Kind
                    currentNode=currentNode.getRight();



            }
        }
    }





    public Node searchNumber(int number) {
        System.out.print("SearchNumber - ");

        // TODO: Entweder Variante 1 oder 2 einkommentieren
        // Variante 1: Aufruf Rekursiv
        return searchNumberRecursive(root, number);
        // Variante 2: Aufruf Schleife
        //return searchNumberLoop(number);
    }

    // Suche - Variante Rekursion
    private Node searchNumberRecursive(Node currentNode, int number) {
        // TODO: Implementierung hinzufügen
        return null;
    }

    // Suche - Variante Schleife
    private Node searchNumberLoop(int number) {
        Node currentNode = root;
//Fall: wert es gibt nicht in  Bäume:
        if(currentNode==null){
            return null;
        }
//FAL: steht gerade am gesuchten Knoten
        else if(currentNode.getNumber()==number){
           return currentNode;
       }
//FalL:  Gesuchte Wert ist kleiner als aktueller
else if(currentNode.getNumber()>number) {
    currentNode.getRight()  //TODO
            }
       return null;
    }

    /**
     * Funktion zur Ausgabe des gesamten Baums.
     */
    public void printTree() {
        printTree(root, "");
    }

    /**
     * Funktion zur Ausgabe des Baums unterhalb eines Knotens
     *
     * @param currentNode Knoten, dessen Teilbaum ausgegeben werden soll
     * @param prefix      Zur Einr�ckung
     */
    public void printTree(Node currentNode, String prefix) {
        if (currentNode == null) {
            return;
        }
        System.out.println(prefix + currentNode.getNumber());
        printTree(currentNode.getLeft(), prefix + "L ");
        printTree(currentNode.getRight(), prefix + "R ");
    }


}
