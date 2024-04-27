
    import java.util.*;
    public class Day78 {
    static class Edge {
        int src;
        int des;
        
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }


    public static boolean has_path(ArrayList<Edge> graph[], int src, int des, boolean vis[]) {
        if (src == des) {
            return true;
        }
        vis[src]=true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            if (!vis[e.des] && has_path(graph, e.des, des, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        for(int i=0;i<V;i++){
          graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 5));
  
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 6));
        graph[1].add(new Edge(1, 3, 3));
  
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
  
        graph[3].add(new Edge(3, 1, 8));
        graph[3].add(new Edge(3, 2, 4));
  
        graph[4].add(new Edge(4, 2, 2));
        System.out.println(has_path(graph, 1, 5, new boolean[V]));
    }
}

