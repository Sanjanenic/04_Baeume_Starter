//package DEmo1;
//
//import UE04_RotateTree.Node;
//
//public class BinaryTree {
//    private Node root;
//
//    public void addNode(int numer) {
//        //Knotrn erstellen
//        Node newNode = new Node();
//        newNode.setNumber(numer);
//
//        //fall1: Baum ist leer
//
//        if (root == newNode) {
//            root = newNode;
//        }
//        //Fall2: Baum ist nicht leer
//        else {
//            Node currentNode = root;
//            while (....){
//
//                //Neuer Wert ist kleiner als aktueller
//                if (newNode.getNumber() < currentNode.getNumber()) {
//
//                    //Linkes Kind nicht gesetz, dort einfugen
//                    if (currentNode.getLeft() == null) {
//                        currentNode.setLeft(newNode);
//                    }
//                    //Fall: linked Kind ist gesetz
//                    else {
//                        currentNode = currentNode.getLeft();
//                    }
//                    //Neuer Wert ist grösser als aktuellen Konoten
//                    else{
//                        //RechtesbKind nicht gesetzt
//                        if (currentNode.getRight() == null) {
//                            currentNode.setRight(newNode);
//                            //Rechtes Kind ist gesetzt
//                        } else {
//                            currentNode.currentNode.getRight();
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//
//    public Node searchNode(Node currentNode,int number){
//        //Search wert 25
//        //Fall 4 : wert rs gibt gar nichts in Baüme, wert=7 zB
//         if(currentNode==null){
//            return null;  //ovaj fall se radi na pocetku
//
//        }
//        //F1: steht gerade am gesuchten Knoten
//         else if(currentNode.getNumer()==number){
//            retourn currentNode.getNumber();
//        }
//        //Fal2: Gesuchte Wert ist kleiner als aktueller
//        else if(number< currentNode.getNumer()){
//            return searchNode(currentNode.getLeft(), number)
//
//        }
//        //Fall3: Gesuchte Wert ist grösse ald aktueller KNoten
//        else (number< currentNode.getNumer()){
//            return searchNode(currentNode.getRight(), number);
//        }
//
//
//
//    }
//
//}