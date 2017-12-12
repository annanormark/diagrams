package codeE1;

import java.util.*;

public class Matcher {
	private ArrayList<Responder> allResponders;
	
	public ArrayList<Responder> makeMatch(Request request){
		return new ArrayList<Responder>();
	}
	
	public ArrayList<Responder> remakeMatch(ArrayList<Responder> oldMatch, Request request){
		return new ArrayList<Responder>();
	}
	
	public Boolean findGoodResponders() {
		return true;
	}
	
	public ArrayList<Responder> getAllRepsonders() {
		return allResponders;
	}
}
