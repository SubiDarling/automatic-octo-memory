package com.rest.examples;

import java.time.LocalDate;
import java.util.List;

public class PnrStatus {
	
	private int pnrno;
	private int trainno;
	public int getPnrno() {
		return pnrno;
	}

	public void setPnrno(int pnrno) {
		this.pnrno = pnrno;
	}

	public int getTrainno() {
		return trainno;
	}

	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}

	public LocalDate getTraveldate() {
		return traveldate;
	}

	public void setTraveldate(LocalDate traveldate) {
		this.traveldate = traveldate;
	}

	public List<Passengers> getPassangers() {
		return passangers;
	}

	public  void setPassangers(List<Passengers> passangers) {
		this.passangers = passangers;
	}

	private LocalDate traveldate;
	
	private List<Passengers> passangers;

}
