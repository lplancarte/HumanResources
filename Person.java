/**Programmer: Lucio Plancarte
Created:  26 SEP 2024
Modified: 27 SEP 2024 -Added meat/potatoes
Description: Inheritance
*/

class Person implements Comparable<Person>{

	//Class Member Variables
	private String name;
	private double height; //cm
	private double weight; //kg

	//Constructors
	public Person(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public Person(){
		name = "Waluigi";
		height = 185;
		weight = 90;
	}

	public Person(Person prometheus){
		this.name = prometheus.name;
		this.height = prometheus.height;
		this.weight = prometheus.weight;
	}

	//Setters
	public void setName(String name){
		this.name = name;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}

	//Getters
	public String getName(){
		return name;
	}

	public double getHeight(){
		return height;
	}

	public double getWeight(){
		return weight;
	}

	//Overrides
	@Override
	 public String toString(){
		//TODO: format database-ready string
		return String.format("%-6s %9.0f %9.0f\n",name, height, weight);
	}

	@Override
	public boolean equals(Object o){
		if(o == null){
			return false;
		}

		if(o == this){
			return true;
		}

		if(!(o instanceof Person)){
			return false;
		}

		Person p;
		p = (Person) o;
		if(p.getName().equals(this.getName())&& //LLP: fixed String compare
		   p.getHeight() == this.getHeight() &&
		   p.getWeight() == this.getWeight()){
			return true;
		}else
			return false;

	}

	/**
	0: equal
	<0 : less than
	>0 : greater than
	*/
	@Override
	public int compareTo(Person cain){
		return this.getName().compareTo(cain.getName());
	}


}
