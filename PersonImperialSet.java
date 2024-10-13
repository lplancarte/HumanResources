/**
Programmer: Lucio Plancarte
Created: 11 Oct 2024

*/

class PersonImperialSet extends PersonSet{

	@Override
	public void add(Person p){
		//Convert height from cm to in
		p.setHeight(p.getHeight()/0.39);
		//Convert weight from kg to lbs
		p.setWeight(p.getWeight()/2.20);
		//add
		super.add(p);
	}

}

/**REFERENCES
Lossy conversion. I need to be explicit with compiler.
https://stackoverflow.com/
questions/23748942/possible-lossy-conversion-from-long-to-int
*/
