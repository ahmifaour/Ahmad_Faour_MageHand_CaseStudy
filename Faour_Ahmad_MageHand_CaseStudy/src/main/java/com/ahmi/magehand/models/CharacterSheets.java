package com.ahmi.magehand.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class CharacterSheets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long csId;

	@Column(name = "Character Name", length = 50, nullable = false)
	private String cName;

	@Column(name = "Character Race", length = 50, nullable = false)
	private String cRace;

	@Column(name = "Character Class", length = 50, nullable = false)
	private String cClass;

	@Column(name = "Character Ability Scores", length = 150, nullable = false)
	private String cScores;

	@Column(name = "Character Spells", length = 1000)
	private String cSpells;

	@Column(name = "Character Items", length = 1000)
	private String cItems;

	public CharacterSheets() {

	}

	public CharacterSheets(Long csId, String cName, String cRace, String cClass, String cScores, String cSpells,
			String cItems) {

		this.csId = csId;
		this.cName = cName;
		this.cRace = cRace;
		this.cClass = cClass;
		this.cScores = cScores;
		this.cSpells = cSpells;
		this.cItems = cItems;
	}

	public Long getCsId() {
		return csId;
	}

	public void setCsId(Long csId) {
		this.csId = csId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcRace() {
		return cRace;
	}

	public void setcRace(String cRace) {
		this.cRace = cRace;
	}

	public String getcClass() {
		return cClass;
	}

	public void setcClass(String cClass) {
		this.cClass = cClass;
	}

	public String getcScores() {
		return cScores;
	}

	public void setcScores(String cScores) {
		this.cScores = cScores;
	}

	public String getcSpells() {
		return cSpells;
	}

	public void setcSpells(String cSpells) {
		this.cSpells = cSpells;
	}

	public String getcItems() {
		return cItems;
	}

	public void setcItems(String cItems) {
		this.cItems = cItems;
	}

	@Override
	public String toString() {
		return "CharacterSheets [csId=" + csId + ", cName=" + cName + ", cRace=" + cRace + ", cClass=" + cClass
				+ ", cScores=" + cScores + ", cSpells=" + cSpells + ", cItems=" + cItems + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cClass, cItems, cName, cRace, cScores, cSpells, csId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharacterSheets other = (CharacterSheets) obj;
		return Objects.equals(cClass, other.cClass) && Objects.equals(cItems, other.cItems)
				&& Objects.equals(cName, other.cName) && Objects.equals(cRace, other.cRace)
				&& Objects.equals(cScores, other.cScores) && Objects.equals(cSpells, other.cSpells)
				&& Objects.equals(csId, other.csId);
	}

}
