package com.veronica.rebenko;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;



@Path("/stock")
public class StockResource {

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response addStock(Stock dataIn) {
    	
    	String addressError = null;
    	String nameError = null;
    	
    	String name = dataIn.getName();
    	String address = dataIn.getAddress();
    	
    	if(address.isEmpty() || address == null || address.trim().length() == 0 ) {
    		addressError = "\"Address\":\"can not be empty \"";
    	}
    	
    	 String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
    	 String nameArray[]=name.split("");
    	    for (int i=0; i < nameArray.length; i++){
    	    	if (specialCharacters.contains(nameArray[i])) {
    	    		nameError = "\"Name\":\"can not contain special symbols - " + name + "\"";
    	        break;
    	    	}  
    	    }
    	

    	if(addressError != null && nameError != null) {
    		return Response.status(500).entity("{" + nameError + "," + addressError + "}").build();
    	}
    	else if(nameError != null) {
    		return Response.status(500).entity("{" + nameError + "}").build();
    	}
    	else if(addressError != null) {
    		return Response.status(500).entity("{" + addressError + "}").build();
    	}
    	
    	return Response.ok().build();
    }
   
}