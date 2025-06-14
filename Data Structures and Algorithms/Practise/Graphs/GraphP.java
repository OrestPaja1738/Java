import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphP {
    public ArrayList<ArrayList<Edge>> g;

    public GraphP(){
        g = new ArrayList<>();
    }
    public void addVertex(){
        g.add(new ArrayList<>());
    }
    public void addEdge(int u,int v){
        g.get(u).add(new Edge(u, v));
    }
    public void getNeighbors(int i){
        for (Edge x : g.get(i)) {
            System.out.println(x.v);
        }
    }
    public int getOutdegree(int i){
        int cnt = 0;

        for (Edge x : g.get(i)) {
            cnt += 1;
        }

        return cnt;
    }
    public int getIndegree(int y){
        int indegree = 0;

        for(int i = 0; i < g.size();i++){
            for (Edge x: g.get(i)) {
                if (x.v == y) {
                    indegree += 1;
                }
            }
        }

        return indegree;
    }
    public void BFS(int starter){
        Queue<Integer> q = new LinkedList<>();
        boolean[] b = new boolean[g.size()];

        b[starter] = true;
        q.add(starter);

        while (!q.isEmpty()) { 
            int curr  = q.poll();
            System.out.println(curr);

            for(Edge x: g.get(curr)){
                if (b[x.v] != true) {
                    b[x.v] = true;
                    q.add(x.v);
                }
            }
        }
    }
    public void DFS(int starter){
        Stack<Integer> s  = new Stack<>();
        boolean[] b = new boolean[g.size()];

        b[starter] = true;
        s.push(starter);

        while (!s.isEmpty()) {
            int curr = s.pop();
            System.out.println(curr);

            for(Edge x : g.get(curr)){
                if (b[x.v] != true) {
                    b[x.v] = true;
                    s.push(x.v);
                }
            }
        }
    }
}
