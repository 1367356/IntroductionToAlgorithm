package chapter10.eitht.two;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理并触发事件的实际控制框架
 * @author admin
 *
 */
public class Controller {

	private List<Event> eventList=new ArrayList();
	public void addEvent(Event c){
		eventList.add(c);
	}
	public void run() {
		// TODO Auto-generated method stub
		while(eventList.size()>0){
//				for(Event e:new ArrayList<Event>(eventList)){
//					if(e.ready()){
//						System.out.println(e);
//						e.action();
//						eventList.remove(e);
//					}
//				}
			for (int i = 0; i < eventList.size(); i++) {
				if(eventList.get(i).ready()){
					System.out.println(eventList.get(i));
					eventList.get(i).action();
					eventList.remove(eventList.get(i));
				}
			}
		}
	}
}
