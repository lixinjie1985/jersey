package org.eop.jersey.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author lixinjie
 */
@Path("/hello")
public class HelloSample {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloWorld() {
		return "Hello world!!!";
	}
	
	@Path("{somebody}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloSomebody(@PathParam("somebody") String somebody) {
		return "Hello <b>" + somebody + "</b>";
	}
	
	@Path("/querystring")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloQueryString(@QueryParam("qs1") String qs1, @QueryParam("qs2") String qs2) {
		return "<querystring><hello>" + qs1 + "</hello><hello>" + qs2 + "</hello></querystring>";
	}
}
