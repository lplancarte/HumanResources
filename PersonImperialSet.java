/**
Programmer: Lucio Plancarte
Created: 11 Oct 2024

*/

class PersonImperialSet extends PersonSet{

	public PersonImperialSet(){
		super.header = String.format("%-6s %12s %9s\n",
			"Name", "Weight (lbs)", "Height (in)"
		);
	}

	@Override
	public void add(Person p){
		//Convert height from cm to in
		p.setHeight(p.getHeight()/2.54);
		//Convert weight from kg to lbs
		p.setWeight(p.getWeight()*2.205);
		//add
		super.add(p);
	}


}

/**REFERENCES
Lossy conversion. I need to be explicit with compiler.
https://stackoverflow.com/
questions/23748942/possible-lossy-conversion-from-long-to-int
*/
