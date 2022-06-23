package TeamStatistics_FeignServer.TeamStatistics_FeignServer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team_performance")
public class Team_Performance {
	@Id
	@Column(name="team_id")
	String teamId;
	@Column(name="won")
	int won;
	@Column(name="runnerup")
	int runnerUp;
	public Team_Performance()
	{
	}
	
	public Team_Performance(String teamId, int won, int runnerUp) {
		super();
		this.teamId = teamId;
		this.won = won;
		this.runnerUp = runnerUp;
	}


	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public int getRunnerUp() {
		return runnerUp;
	}
	public void setRunnerUp(int runnerUp) {
		this.runnerUp = runnerUp;
	}
	@Override
	public String toString() {
		return "TeamPerformance [teamId=" + teamId + ", won=" + won + ", runnerUp=" + runnerUp + "]";
	}
}

