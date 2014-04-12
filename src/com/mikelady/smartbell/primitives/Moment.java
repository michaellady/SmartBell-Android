package com.mikelady.smartbell.primitives;


public class Moment {
	public static final boolean TEST = false;
	
	public static final int X = 0;
	public static final int Y = 1;
	public static final int Z = 2;
	
	Long timestamp;
	Float[] euler;
	Float[] linAcc;

	
	public Moment(Long timestamp, Float[] euler, Float[] linacc) {
		this.timestamp = timestamp;
		this.euler = euler;
		this.linAcc = linacc;
	}
	
	public String toString(){
		String s = "";
		
		s = "Moment "+timestamp+" euler[X] "+this.euler[X]+" euler[Y] "+this.euler[Y]+" euler[Z] "+this.euler[Z]+"\n";
		s += " linAcc[X] "+this.linAcc[X]+" linAcc[Y] "+this.linAcc[Y]+" linacc[Z] "+this.linAcc[Z];
		
		return s;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Float[] getEuler() {
		return euler;
	}

	public void setEuler(Float[] euler) {
		this.euler = euler;
	}

	public Float[] getLinAcc() {
		return linAcc;
	}

	public void setLinAcc(Float[] linacc) {
		this.linAcc = linacc;
	}

}
