public class Person {
	private String name;

	public Person(String name) {
		setName(name);
	}

	public void setName(String name) {

		if(name != "" && name.length() > 0){
			this.name = name;
		}
	public String getName() {
		return name;
	}
}