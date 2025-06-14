import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise7 {
    
    class Node {
        int val;
        List<Node> neighbors;
        Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }
    }

    public Node cloneGraph(Node node) {
        
        if (node == null) return null;
        
        Map<Node, Node> visited = new HashMap<>();
        
        return clone(node, visited);
    }
    
    private Node clone(Node node, Map<Node, Node> visited) {
        
        if (visited.containsKey(node)) return visited.get(node);
        Node copy = new Node(node.val);
        visited.put(node, copy);

        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(clone(neighbor, visited));
        }

        return copy;
    }

}
