package chapter19.eleven;

public class Scissors implements Item{

	public Outcome compete(Item it) {
		// TODO Auto-generated method stub
		return it.eval(this);
	}

	public Outcome eval(Paper p) {
		// TODO Auto-generated method stub
		return Outcome.DRAM;
	}

	public Outcome eval(Scissors s) {
		// TODO Auto-generated method stub
		return Outcome.WIN;
	}

	public Outcome eval(Rock r) {
		// TODO Auto-generated method stub
		return Outcome.LOSE;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Scissors";
	}
}
