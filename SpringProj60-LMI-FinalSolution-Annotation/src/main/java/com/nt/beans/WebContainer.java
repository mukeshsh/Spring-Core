package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("container")
@Scope("singleton")
public interface WebContainer  {
	@Lookup("handler")
   public abstract RequestHandler createRequestHandler();
    
	default void processRequest(String data) {
		RequestHandler handler=null;
		System.out.println("WebContainer is processing request with data:: "+data+ " by giving it to handler");
		//get Dependent object using dependency lookp
		handler=createRequestHandler();
		//use dependent object
		handler.handleRequest(data);
	}


}
