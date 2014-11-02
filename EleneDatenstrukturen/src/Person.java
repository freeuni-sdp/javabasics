
public class Person {
	public String Name;
	public int Age;
	public String Job;
	public String Children;
	
	public Person() {};
	
	public Person(String Name, int Age, String Job, String Children){
		
	}
	
	public void printData(String whoAreYouInterestedIn, String whatAreYouInterestedIn) {
		if(!whoAreYouInterestedIn.equals(this.Name)) return;
		
		if(whatAreYouInterestedIn.equals("Age")){
			System.out.println(this.Age);
		}
		if(whatAreYouInterestedIn.equals("Job")){
			System.out.println(this.Job);
		}
		if(whatAreYouInterestedIn.equals("children")){
			System.out.println(this.Children);
		}
	}
	
}
