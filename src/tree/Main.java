package tree;

public class Main {

    private static void depthSearch(Node startNode){
        startNode.setVisited(true);
        System.out.println(startNode.getValue());

        if(startNode.getChildren() != null) {
            for (Node node : startNode.getChildren()) {
                if (!node.isVisited()) {
                    depthSearch(node);
                }
            }
        } else {
            depthSearch(startNode.getParent());
        }

    }

    public static void main(String[] args) {

        Node n0 = new Node(0);

        Node n1 = new Node(1);
        Node n2 = new Node(2);

        n0.setChildren(n1);
        n0.setChildren(n2);

        n1.setParent(n0);
        n2.setParent(n0);

        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.setChildren(n3);
        n1.setChildren(n4);
        n1.setChildren(n5);

        n3.setParent(n1);
        n4.setParent(n1);
        n5.setParent(n1);

        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);

        n3.setChildren(n8);
        n8.setParent(n3);

        n4.setChildren(n9);
        n4.setChildren(n10);

        n9.setParent(n4);
        n10.setParent(n4);

        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n2.setChildren(n6);
        n2.setChildren(n7);

        n6.setParent(n2);
        n7.setParent(n2);

        depthSearch(n0);
    }



}
