public class StudentClient{
	
	public static void main(String[] args) {
		Student s = new Student("Jones", 'A'); 
		s.getName();
		s.getGroup();
		System.out.println("Name: " + s.getName() + " " + "Group: " + s.getGroup());
	}
}


