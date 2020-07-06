package com.santosh.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Leagues {

	@JsonProperty("country_id")

	private int countryId;

	@JsonProperty("country_name")
	private String countryName;

	@JsonProperty("league_name")
	private String leagueName;

	@JsonProperty("league_id")
	private int leagueId;

	public Leagues() {
		super();
	}

	public Leagues(int countryId, String countryName, String leagueName, int leagueId) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.leagueName = leagueName;
		this.leagueId = leagueId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryId;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + leagueId;
		result = prime * result + ((leagueName == null) ? 0 : leagueName.hashCode());
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
		Leagues other = (Leagues) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "Leagues [countryId=" + countryId + ", countryName=" + countryName + ", leagueName=" + leagueName
				+ ", leagueId=" + leagueId + "]";
	}

}
