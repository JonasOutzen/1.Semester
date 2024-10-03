// Task 1
public class Main{
	public static void main(String[] args){
		Team myTeam1 = new Team("Loevebanden");
		myTeam1.setRank(1);
		Team myTeam2 = new Team("Tjoernebanden");
		myTeam2.setRank(2);
		Team myTeam3 = new Team("Boernebanden");
		myTeam3.setRank(3);
		Team myTeam4 = new Team("Bjoernebanden");
		myTeam4.setRank(4);
		Team myTeam5 = new Team("Oernebanden");
		myTeam5.setRank(5);
		


		myTeam1.addPlayer("Jonas");
		myTeam1.addPlayer("Rudolf");
		myTeam1.addPlayer("Eren");
		myTeam1.addPlayer("Jonna");
		myTeam1.addPlayer("Daniel");

		myTeam2.addPlayer("Mia");
		myTeam2.addPlayer("Lars");
		myTeam2.addPlayer("Sara");
		myTeam2.addPlayer("Kasper");
		myTeam2.addPlayer("Amira");

		myTeam3.addPlayer("Oliver");
		myTeam3.addPlayer("Freja");
		myTeam3.addPlayer("Sofia");
		myTeam3.addPlayer("Mathias");
		myTeam3.addPlayer("Nadia");

		myTeam4.addPlayer("Emil");
		myTeam4.addPlayer("Clara");
		myTeam4.addPlayer("Philip");
		myTeam4.addPlayer("Louise");
		myTeam4.addPlayer("Sebastian");

		myTeam5.addPlayer("Noah");
		myTeam5.addPlayer("Ida");
		myTeam5.addPlayer("Victor");
		myTeam5.addPlayer("Ella");
		myTeam5.addPlayer("Felix");



		System.out.println(myTeam1);
		System.out.println(myTeam2);
		System.out.println(myTeam3);
		System.out.println(myTeam4);
		System.out.println(myTeam5);
	
}
}