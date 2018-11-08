package com.cg.jpastart.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trip {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int tripiId;
	String fromCity;
	String toCity;
	@Embedded
	SeatInfo info;
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tripiId;
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
		Trip other = (Trip) obj;
		if (tripiId != other.tripiId)
			return false;
		return true;
	}
@Override
	public String toString() {
		return "Trip [tripiId=" + tripiId + ", fromCity=" + fromCity
				+ ", toCity=" + toCity + ", info=" + info + "]";
	}
public int getTripiId() {
		return tripiId;
	}
	public void setTripiId(int tripiId) {
		this.tripiId = tripiId;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public SeatInfo getInfo() {
		return info;
	}
	public void setInfo(SeatInfo info) {
		this.info = info;
	}


}
