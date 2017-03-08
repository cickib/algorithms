package graph;


/**
 * Created by cickib on 2017.03.08..
 */
public class Main {

    public static void main(String[] args) {

        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);

        n0.setNeighbours(n1);
        n0.setNeighbours(n2);
        n0.setNeighbours(n5);

        n1.setNeighbours(n0);
        n1.setNeighbours(n3);
        n1.setNeighbours(n4);
        n1.setNeighbours(n5);

        n2.setNeighbours(n0);
        n2.setNeighbours(n6);
        n2.setNeighbours(n7);

        n3.setNeighbours(n1);
        n3.setNeighbours(n8);

        n4.setNeighbours(n1);
        n4.setNeighbours(n8);
        n4.setNeighbours(n9);
        n4.setNeighbours(n10);

        n5.setNeighbours(n0);
        n5.setNeighbours(n1);

        n6.setNeighbours(n2);
        n6.setNeighbours(n7);

        n7.setNeighbours(n2);
        n7.setNeighbours(n6);
        n7.setNeighbours(n10);

        n8.setNeighbours(n3);
        n8.setNeighbours(n4);

        n9.setNeighbours(n4);

        n10.setNeighbours(n4);
        n10.setNeighbours(n7);

        depthSearch(n0);
    }

    private static boolean depthSearch(Node startNode) {
        if (startNode.isVisited()) {
            return false;
        }
        startNode.setVisited(true);
        System.out.println(startNode.getValue());
        if (startNode.getNeighbours() != null) {
            for (Node node : startNode.getNeighbours()) {
                depthSearch(node);
            }
        }
        return true;
    }

}
