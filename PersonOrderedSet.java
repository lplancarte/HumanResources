/**
Programmer: Lucio Plancarte
Created: 11 Oct 2024

*/
import java.util.Collections;
class PersonOrderedSet extends PersonSet{
	public PersonOrderedSet(){
		super.header = String.format("%-6s %12s %9s\n",
			"Name", "Height (cm)", "Weight (kg)"
		);
	}

	@Override
	public void add(Person p){
		//Add Names in Alphabetical Order
		//Add using super class
		super.add(p);
		//Sort
		Collections.sort(super.friends);


	}

}
