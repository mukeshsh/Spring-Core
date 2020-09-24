package com.nt.beans;

public interface WebContainer  {
	
    RequestHandler createRequestHandler();
    
	default void processRequest(String data) {
		RequestHandler handler=null;
		System.out.println("WebContainer is processing request with data:: "+data+ " by giving it to handler");
		//get Dependent object using dependency lookp
		handler=createRequestHandler();
		//use dependent object
		handler.handleRequest(data);
	}


}
