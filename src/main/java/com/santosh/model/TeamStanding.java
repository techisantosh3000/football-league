package com.santosh.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TeamStanding {

	private int countryId;

	@JsonProperty("country_name")
	private String countryName;

	@JsonProperty("league_name")
	private String leagueName;

	@JsonProperty("league_id")
	private int leagueId;

	@JsonProperty("team_name")
	private String teamName;

	@JsonProperty("team_id")
	private int teamId;

	@JsonProperty("overall_league_position")
	private int overallPosition;

	public TeamStanding() {
		super();
	}

	public TeamStanding(int countryId, String countryName, String leagueName, int leagueId, String teamName, int teamId,
			int overallPosition) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.leagueName = leagueName;
		this.leagueId = leagueId;
		this.teamName = teamName;
		this.teamId = teamId;
		this.overallPosition = overallPosition;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public int getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getOverallPosition() {
		return overallPosition;
	}

	public void setOverallPosition(int overallPosition) {
		this.overallPosition = overallPosition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryId;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + leagueId;
		result = prime * result + ((leagueName == null) ? 0 : leagueName.hashCode());
		result = prime * result + overallPosition;
		result = prime * result + teamId;
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamStanding other = (TeamStanding) obj;
		if (countryId != other.countryId)
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (leagueId != other.leagueId)
			return false;
		if (leagueName == null) {
			if (other.leagueName != null)
				return false;
		} else if (!leagueName.equals(other.leagueName))
			return false;
		if (overallPosition != other.overallPosition)
			return false;
		if (teamId != other.teamId)
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TeamStanding [countryId=" + countryId + ", countryName=" + countryName + ", leagueName=" + leagueName
				+ ", leagueId=" + leagueId + ", teamName=" + teamName + ", teamId=" + teamId + ", overallPosition="
				+ overallPosition + "]";
	}

}
