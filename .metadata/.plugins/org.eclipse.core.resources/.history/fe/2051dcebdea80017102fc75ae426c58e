package maxflowMincutBak;


public class TestDijkstraAlgorithm {

	public static void main(String[] args) {
		int vertex=2;
		int end=4;
		DijkstraAlgorithm da=new DijkstraAlgorithm(100,0);
		da.createGraph("/data.txt");
		da.printGraph();
		da.printWeightGraph();
		da.shortestPathOfBFS(vertex,end);   //也可以在printShortestPathOfBFS中调用，在这里不调用，如果两个都调用
		                                                                         //则数据添加了两遍。
		da.printShortestPathOfBFS(vertex,end);
	}
}
