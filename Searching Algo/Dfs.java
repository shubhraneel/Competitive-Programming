
import java.util.*;
 
public class DFS
{
	int V;    
    
   
    LinkedList<Integer> adjList[]; 
 
			DFS(int v)
			{
				V = v;
				adjList = new LinkedList[v];
				for (int i=0; i<v; ++i)
				{
					adjList[i] = new LinkedList();  
				}
			}
			
			
			
    //adding edges to graph 
    void addEdgesToGraph(int v, int u)
    {
        adjList[v].add(u);   
    }
	
  
			void DFTraversal(int v,int visited[])
			{
				visited[v] = 1;
				System.out.print(v + " ");
				Iterator<Integer> i = adjList[v].listIterator();
				while (i.hasNext())
				{
					int n = i.next();
					if (visited[n]==0)
						DFTraversal(n, visited);
				}
			}
	
  
			void DFSearch(int v)
			{
						
				int visited[] = new int[V];
						
				DFTraversal(v, visited);
					for (int i=1;i<V;i++)
					{
						if(visited[i]==0)
							{
							 DFTraversal(i, visited);
							}
					}
			}
				 
		public static void main(String args[])
		{
			DFS d1 = new DFS(8);
			
			d1.addEdgesToGraph(1,2);
			//  Add Node in graph
			
			d1.DFSearch(1);         // For search
		}
}