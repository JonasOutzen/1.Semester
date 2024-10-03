import java.util.ArrayList;

public class Team {

		private String teamName;
		private int teamRank = 1;
		private ArrayList <String> teamMembers;

	public Team(String teamName)	{
		this.teamName = teamName;
		this.teamRank = teamRank;
		this.teamMembers = new ArrayList<>();
	}

	public void setRank(int teamRank)	{
		this.teamRank = teamRank;
	}

	public void addPlayer(String teamMembers) {
		this.teamMembers.add(teamMembers); 
	}

	@Override
	public String toString() {
		String players = String.join("\n", teamMembers);
	return "Team: " + teamName + " " + "Rank: " + teamRank + players;
}
}