package com.bridgelabz.oops;

import java.io.Serializable;
import java.util.List;

public class InventoryModel implements Serializable
{
List<Grains> grains;

public List<Grains> getGrains() {
	return grains;
}

public void setGrains(List<Grains> grains) {
	this.grains = grains;
}

  
}
