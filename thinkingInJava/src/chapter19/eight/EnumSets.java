package chapter19.eight;

import java.util.EnumSet;
import static chapter19.eight.AlarmPints.*;

public class EnumSets {

	public static void main(String[] args) {
		EnumSet<AlarmPints> points=EnumSet.noneOf(AlarmPints.class);
		
		points.add(BATHROOM);
		System.out.println(points);
		points.addAll(EnumSet.of(OFFICE1, OFFICE2, OFFICE3));
		System.out.println(points);
		points.allOf(AlarmPints.class);
		System.out.println(points);
	}
}
