
public class Person {
	public String Name;
	public int Age;
	public String Job;
	public String Children;
	
	public Person() {};
	
	public Person(String name, int age, String job, String children){
		this.Name = name;
		this.Age = age;
		this.Job = job;
		this.Children = children;
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
