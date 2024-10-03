public class Student {

	private String name;
	private char group;

public Student(String name, char group){
	this.name = name;
	this.group = group;
}
	public String getName(){
		return name;
	}	

	public void setName(String name){
		this.name = name;
	}
	public char getGroup(){
		return group;
	}	

	public void setName(char group){
		this.group = group;
	}

}