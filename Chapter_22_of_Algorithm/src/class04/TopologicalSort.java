package class04;

import java.util.List;


import class03.DFS;

public class TopologicalSort {
	DFS dfs=new DFS();
		public void topologicalSort(){
			List list=dfs.createGraph();
			dfs.dfs();
			for (int i = 0; i < list.size(); i++) {
				
			}
		}
}
