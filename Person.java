/**Programmer: Lucio Plancarte
Created:  26 SEP 2024
Modified: 27 SEP 2024 -Added meat/potatoes
Description: Inheritance
*/

class Person{

	//Class Member Variables
	private String name;
	private int height; //cm
	private int weight; //kg

	//Constructors
	public Person(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public Person(){
		name = "Waluigi";
		height = 185;
		weight = 90;
	}

	//Setters
	public void setName(String name){
		this.name = name;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	//Getters
	public String getName(){
		return name;
	}

	public int getHeight(){
		return height;
	}

	public int getWeight(){
		return weight;
	}

	//toString() override
	@Override
	 public String toString(){
		//TODO: format database-ready string
		return String.format("%s %d %d",name, height, weight);
	}

}
