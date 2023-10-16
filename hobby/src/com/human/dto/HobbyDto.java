package com.human.dto;

import java.util.Objects;

public class HobbyDto {
	private Integer hobbyid;
	private String hobby;
	
	@Override
	public String toString() {
		return "HobbyDto [hobbyid=" + hobbyid + ", hobby=" + hobby + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(hobby, hobbyid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HobbyDto other = (HobbyDto) obj;
		return Objects.equals(hobby, other.hobby) && Objects.equals(hobbyid, other.hobbyid);
	}
	public HobbyDto() {}
	public HobbyDto(Integer hobbyid, String hobby) {
		super();
		this.hobbyid = hobbyid;
		this.hobby = hobby;
	}
	public Integer getId() {
		return hobbyid;
	}
	public void setId(Integer hobbyid) {
		this.hobbyid = hobbyid;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
