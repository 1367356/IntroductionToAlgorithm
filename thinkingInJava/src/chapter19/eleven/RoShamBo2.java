package chapter19.eleven;

import static chapter19.eleven.Outcome.*;  //静态导入
public enum RoShamBo2 implements Competitor<RoShamBo2>{
	
	PAPER(DRAM,LOSE,WIN),  //构造函数,构造函数里面的参数顺序代表大小
	SCISSORS(WIN,DRAM,LOSE),
	ROCK(LOSE,WIN,DRAM);
	private Outcome vPAPER,vSCISSORS,vROCK;
	

	private RoShamBo2(Outcome vPAPER, Outcome vSCISSORS, Outcome vROCK) {
		this.vPAPER = vPAPER;
		this.vSCISSORS = vSCISSORS;
		this.vROCK = vROCK;
	}
	
	public Outcome compete(RoShamBo2 competitor) {
		// TODO Auto-generated method stub
		switch (competitor) {
		case PAPER:
			return vPAPER;
		case SCISSORS:
			return vSCISSORS;
		case ROCK:
			return vROCK;
		default:
		}
		return null;
	}
	
	public static void main(String[] args) {
		RoShamBo.play(RoShamBo2.class, 10);
	}
}
