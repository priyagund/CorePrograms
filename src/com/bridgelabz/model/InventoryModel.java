package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class InventoryModel implements Serializable
{
	private List<Rice> rice ;
	private List<Wheat> wheat ;
	private List<Pulse> pulses ;
	public List<Rice> getRice() {
		return rice;
	}
	public void setRice(List<Rice> rice) {
		this.rice = rice;
	}
	public List<Wheat> getWheat() {
		return wheat;
	}
	public void setWheat(List<Wheat> wheat) {
		this.wheat = wheat;
	}
	public List<Pulse> getPulses() {
		return pulses;
	}
	public void setPulses(List<Pulse> pulses) {
		this.pulses = pulses;
	}
	
	

}
