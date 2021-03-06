package chapter19.nine;

import java.util.EnumMap;
import java.util.Map;

import chapter19.eight.AlarmPints;

public class EnumMaps {

	public static void main(String[] args) {
		EnumMap<AlarmPints, Command> em=new EnumMap<AlarmPints, Command>(AlarmPints.class);
		
		em.put(AlarmPints.KITCHEN, new Command() {
			
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("Kitchen fire!");
			}
		});
		
		em.put(AlarmPints.BATHROOM, new Command() {
			
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("Bathroom alert");
			}
		});
		
		for(Map.Entry<AlarmPints, Command> e:em.entrySet()){
			System.out.println(e.getKey()+"  ");
			e.getValue().action();
		}
		try {
			em.get(AlarmPints.UNILITY).action();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
