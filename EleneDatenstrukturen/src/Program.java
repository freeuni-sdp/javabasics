




public class Program {

	public static void main(String[] args) {
		
		Person x = new Person();
		x.Name = "George";
		x.Age = 38;
		x.Job = "Programmer";
		x.Children = "Elene, Konstantin, Mateo";
		
		Person y = new Person();
		y.Name = "Shorena";
		y.Age = 39;
		y.Job = "teacher";
		y.Children = "Elene, Konstantin, Mateo";
		
		Person z = new Person();
		z.Name = "Elene";
		z.Age = 16;
		z.Job = "Student";
		z.Children = "none";
		
		Person w = new Person();
		w.Name = "Konstantin";
		w.Age = 9;
		w.Job = "Student";
		w.Children = "None";
		
		Person v = new Person();
		v.Name = "Mateo";
		v.Age = 5;
		v.Job = "child";
		v.Children = "None";
		
	
		
		String whoAreYouInterestedIn = args[0];
		String whatAreYouInterestedIn= args[1];
		
		x.printData(whoAreYouInterestedIn, whatAreYouInterestedIn);
		y.printData(whoAreYouInterestedIn, whatAreYouInterestedIn);
		z.printData(whoAreYouInterestedIn, whatAreYouInterestedIn);
		v.printData(whoAreYouInterestedIn, whatAreYouInterestedIn);
		w.printData(whoAreYouInterestedIn, whatAreYouInterestedIn);
	}
}
