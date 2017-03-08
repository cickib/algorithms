package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cickib on 2017.03.08..
 */
public class Node {
    private Object value;
    private Node parent;
    private List<Node> children;

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
        this.children = new ArrayList<>();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(Node child) {
        this.children.add(child);
    }
}
