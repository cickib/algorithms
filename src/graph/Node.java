package graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Object value;

    public List<Node> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(Node neighbours) {
        this.neighbours.add(neighbours);
    }

    private List<Node> neighbours;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    private boolean visited;

    public Node(Object value) {
        this.value = value;
        this.visited = false;
        this.neighbours = new ArrayList<>();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
