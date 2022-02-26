package com.rest.examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import com.rest.examples.Passengers.gender;
import com.rest.examples.Passengers.status;

@Path("/pnr")
public class PnrService {
	
	@GET
	public PnrStatus check(@QueryParam("PnrNo") int pnrNo , @Context HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		PnrStatus pnrstatus1 = new PnrStatus();
		pnrstatus1.setPnrno(pnrNo);
		pnrstatus1.setTrainno(5677);
		pnrstatus1.setTraveldate(LocalDate.of(2022, 12, 28));
		
		List<Passengers> passenger = new ArrayList<>();
		Passengers p1 = new Passengers();
		p1.setName("subi");
		p1.setGender(gender.FEMALE);
		p1.setStatus(status.CONFIRMED);
		
		Passengers p2 = new Passengers();
		p2.setName("subhiksha");
		p2.setGender(gender.FEMALE);
		p2.setStatus(status.CONFIRMED);
		
		passenger.add(p1);
		passenger.add(p2);
		pnrstatus1.setPassangers(passenger);
		
		return pnrstatus1;
		
		
	}

}
