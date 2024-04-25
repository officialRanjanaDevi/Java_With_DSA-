import java.util.*;
public class Day76 { 
        static class Edge{
            int src;
            int des;
            int wt;
            Edge(int s,int d,int w){
                this.src=s;
                this.des=d;
                this.wt=w;
            }
        } 
        public static void bfs(ArrayList<Edge> graph[]){
            Queue<Integer> q=new LinkedList<>();
            boolean vis[]=new boolean[graph.length];
            q.add(0);
            while(!q.isEmpty()){
                int curr=q.remove();
                if(!vis[curr]){
                    System.out.println(curr+" ");
                    vis[curr]=true;
                    for(int i=0;i<graph[curr].size();i++){
                        Edge e=graph[curr].get(i);
                        q.add(e.des);
                    }
                }
            }
        } 
        public static void main(String args[]){
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
          bfs(graph);    
        }     
}

}
