import java.util.ArrayList;
import java.util.Arrays;

public class Exercise8 {

    public class EdgeDijkstra {
        public int u;
        public int v;
        public int w;

        public EdgeDijkstra(int x,int y,int z){
            u = x;
            v = y;
            w = z;
        }
    }

    public class DijkstraGraph {

        public ArrayList<ArrayList<EdgeDijkstra>> g;
        
        public DijkstraGraph(){
            g = new ArrayList<>();
        }
        public void addVertex(){
            g.add(new ArrayList<>());
        }
        public void addEdge(int u,int v,int w){
            g.get(u).add(new EdgeDijkstra(u, v, w));
        }

        public int[] DijkstraAlgo(int start){
            int cost[] = new int[g.size()];
            Arrays.fill(cost, Integer.MAX_VALUE);
            cost[start] = 0;
            int parent[] = new int[g.size()];
            parent[start] = -1;

            ArrayList<Integer> T = new ArrayList<>();

            while (T.size() < g.size()) {
                //searching minimum value for picking the node for expansion
                int min = Integer.MAX_VALUE;
                int u = -1;

                for(int i = 0; i < cost.length;i++){
                    if (!T.contains(i) && cost[i] < min) {
                        min = cost[i];
                        u = i;
                    }
                }

                if (u == -1) {
                    break;
                }

                T.add(u);//since the node for expansion has been chosen,mark it as visited since
                        //it will be used for expansion
                for (EdgeDijkstra x : g.get(u)) {
                    if (!T.contains(x.v) && cost[u] + x.w < cost[x.v]) {
                        cost[x.v] = cost[u] + x.w; //updating cost array accordingly
                        parent[x.v] = u; //also update parent array
                    }
                }
            }
            return cost;//return the cost array
        }
    }
}
