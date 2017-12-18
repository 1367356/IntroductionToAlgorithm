package chapter17.nine.three;

public class Individual implements Comparable<Individual>{

	private static long counter=0;
	private final long id=counter++;
	private String name;
	public Individual(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public Individual() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+(name==null?"":""+name);
	}
	public long id(){
		return id;
	}
	public boolean equals(Object obj){
		return obj instanceof Individual && id==((Individual)obj).id;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result=17;
		if(name!=null){
			result=37*result+name.hashCode();
		}
		result=37*result+(int)id;
		return result;
	}
	public int compareTo(Individual arg) {
		// TODO Auto-generated method stub
		String first=getClass().getSimpleName();
		String argFirst=arg.getClass().getSimpleName();
		int firstCompare=first.compareTo(argFirst);
		if(firstCompare!=0){
			return firstCompare;
		}
		if(name!=null && arg.name!=null){
			int secondCompare=name.compareTo(arg.name);
			if(secondCompare!=0){
				return secondCompare;
			}
		}
		return (arg.id<id?-1:(arg.id==id ? 0:1));
	}

}
