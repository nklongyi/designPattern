//4个部分,主题（被观察者）接口、订阅（观察者）接口，具体主题，具体订阅。
//本质是：EDM event 驱动，将观察者绑定到对应的事件，当事件发生变更，通知对应的观察者作出响应。
//这是观察者模式的本质。
public interface issue{
	public void addWatch();
	public void removeWatch();
	public void notifyAllWatchers();
}


public interface watch{
	public void update();
}

public class concreateIssue implements issue{
	private ArrayList<watch> al = new ArrayList<watch>();
	@overide
	public void addWatch(watch wat){
		al.add(wat);
	}

	@overide
	public void removeWatch(watch wat){
		al.remove(wat);
	}

	@overide
	public void notifyAllWatchers(){
		for (int i=0;i<al.size() ;i++ ) {
			Watch wl = al.get(i);
			w1.update();
		}
	}
}

public class concreteWatch implements watch{
	@overide
	public void update(){
		system.out.println("hello words,I have been notified!Thankyou for your efforts");
	} 
}


//demo class show 
public class mainClass{
	public static void main(String[] args) {
		concreateIssue cIss = new concreateIssue();

		concreteWatch cw1 = new concreteWatch();
		concreteWatch cw2 = new concreteWatch();
		concreteWatch cw3 = new concreteWatch();

		cIss.addWatch(cw1);	
		cIss.addWatch(cw2);	
		cIss.addWatch(cw3);

		cIss.notifyAllWatchers();

		//remove one watch
		cIss.removeWatch(cw2);
		cIss.notifyAllWatchers();	
	}
}


