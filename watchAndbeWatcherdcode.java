
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


