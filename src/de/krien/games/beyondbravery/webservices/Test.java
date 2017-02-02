package de.krien.games.beyondbravery.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/test")
public class Test {

	@SuppressWarnings("serial")
	private static List<String> heroes = new ArrayList<String>() {{
		add("Hero1");
		add("Hero2");
	}};
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		StringBuilder stringBuilder = new StringBuilder();
		for(String hero : heroes) {
			stringBuilder.append(hero);
		}
		return Response.status(200).entity(stringBuilder.toString()).build();
	}

}
