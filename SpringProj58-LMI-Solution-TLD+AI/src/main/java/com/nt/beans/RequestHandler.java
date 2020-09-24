package com.nt.beans;

public class RequestHandler {
    private static int count;
    public RequestHandler() {
    count++;
    System.out.println("RequestHandler::0-param Constructor::"+count);
    }
    public void handleRequest(String data) {
    	System.out.println("Handle request with::  "+data+ " using the object::"+count);
    }
}
