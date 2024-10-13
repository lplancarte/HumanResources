/**
Programmer: Lucio Plancarte
Created:  27 SEP 2024
Modified: 03 OCT 2024
Description: PersonSet
*/
import java.util.ArrayList;

/**
PersonSet serves as a super class to PersonOrderedSet and PersonImperialSet.
@Class Variables
	ArrayList<Person> friends - ArrayList that keeps Person objects.
	String header - To implement different headers in toString() override, 
					the class uses a protetected class variable that can be 
					accesed by a sub-class.
*/

class PersonSet implements PersonList{

	protected ArrayList<Person> friends = new ArrayList<Person>(10);

	protected String header = null;

	/**
	Adds a Person to the friends ArrayList. Uses built in ArrayList
	function contains to checks for duplicates.
	@param Person p - Person to add to ArrayList.
	@return - void
	*/
	public void add(Person p){
		if(!(friends.contains(p))){
			friends.add(p);
			//System.out.println(p.toString() + " has been added.");

		}
		/*else{
			//System.out.println("DUPLICATE DETECTED");
		}*/
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

	/**
	Loops through the friends ArrayList and returns a formatted list to screen.
	Uses StringBuilder to  build a string using the override toString() method
	in Person class.
	@returns void
	*/
	@Override
	public String toString(){
		//String header = String.format("%s %12s %9s",
		//								"Name","Weight","Height\n");
		//System.out.println(header);
		//check if empty
		if(friends.isEmpty())
			return "Friend List is Empty";

		//add first element
		StringBuilder builder = new StringBuilder(header);
		builder.append(friends.get(0).toString());
		//if more than one exists loop through
		if(friends.size() > 1){
			for(int i = 1; i < friends.size(); i++){
					builder.append(friends.get(i).toString());
			}
		}

		return builder.toString();
	}

}
