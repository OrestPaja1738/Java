
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class graph{
    public class Edge{
        int u;
        int v;
        int w;

        public Edge(int x,int y,int z){
            u = x;
            v = y;
            w = z;
        }
    }

    ArrayList<ArrayList<Edge>> g;

    public graph(){
        g = new ArrayList<>();
    }

    public void addVertex(){
        g.add(new ArrayList<>());
    }
    public void addEdge(int u,int v,int w){
        g.get(u).add(new Edge(u, v, w));
    }

    public void BFS(int starter){
        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[g.size()];
        ArrayList<Integer> processed = new ArrayList<>();

        isVisited[starter] = true;
        q.add(starter);

        while (!q.isEmpty()) { 
            int tmp = q.poll();
            System.out.println(tmp);
            processed.add(tmp);

            for(Edge x : g.get(tmp)){
                if (isVisited[x.v] == false) {
                    isVisited[x.v] = true;
                    q.add(x.v);
                }
            }
        }
    }
    public void DFS(int starter){
        Stack<Integer> s = new Stack<>();
        boolean isVisited[] = new boolean[g.size()];
        ArrayList<Integer> processed = new ArrayList<>();

        isVisited[starter] = true;
        s.push(starter);

        while (!s.isEmpty()) { 
            int tmp = s.pop();
            System.out.println(tmp);
            processed.add(tmp);

            for(Edge x : g.get(tmp)){
                if (isVisited[x.v] == false) {
                    isVisited[x.v] = true;
                    s.push(x.v);
                }
            }
        }
    }
    public int[] Dijkstra(int starter){
        ArrayList<Integer> T = new ArrayList<>();
        int cost[] = new int[g.size()];
        int parent[] = new int[g.size()];

        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[starter] = 0;
        parent[starter] = -1;

        while (T.size() < g.size()) { 
            int min = Integer.MAX_VALUE;
            int u = -1;
            for(int i = 0; i < cost.length;i++){
                if (cost[i] < min && T.contains(i) == false) {
                    min = cost[i];
                    u = i;
                }
            }

            if (u == -1) {
                break;
            }

            T.add(u);

            for(Edge x : g.get(u)){
                if (cost[u] + x.w < cost[x.v]) {
                    cost[x.v] = cost[u] + x.w;
                    parent[x.v] = u;
                }
            }
        }

        return parent;
    }
}