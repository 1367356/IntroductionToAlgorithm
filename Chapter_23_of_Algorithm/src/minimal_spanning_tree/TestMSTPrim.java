package minimal_spanning_tree;

public class TestMSTPrim {
			public static void main(String[] args) {
				MSTPrim mst=new MSTPrim();
				mst.createGraph();
				mst.getWeightArray();
				mst.printWeightGraph();
				mst.mstprim(5);
			}
}
