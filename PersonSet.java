/**
Programmer: Lucio Plancarte
Created:  27 SEP 2024
Modified: 03 OCT 2024
Description: PersonSet
*/
import java.util.ArrayList;

class PersonSet implements PersonList{

	protected ArrayList<Person> friends = new ArrayList<Person>(10);

	/**
	Adds a Person to the friends ArrayList. Uses built in ArrayList
	function contains to checks for duplicates.
	@param Person p - Person to add to ArrayList.
	@return - void
	*/
	public void add(Person p){
		if(!(friends.contains(p))){
			friends.add(p);
			System.out.println(p.toString() + " has been added.");

		}else{
			System.out.println("DUPLICATE DETECTED");
		}
	}

	/**
	Gets a Person from the friends Arraylist. Uses built in ArrayList
	function get().
	@param int index - Used to get Person object from friends ArrayList.
	@returns Person - Person from ArrayList at index provided in parameter.
	*/
	public Person get(int index){
		return friends.get(index);
	}

}
