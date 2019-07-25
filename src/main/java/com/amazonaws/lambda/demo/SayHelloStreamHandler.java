package com.amazonaws.lambda.demo;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public class SayHelloStreamHandler extends SpeechletRequestStreamHandler {

	public SayHelloStreamHandler(Speechlet speechlet, Set<String> supportedApplicationIds) {
		super(speechlet, supportedApplicationIds);
		// TODO Auto-generated constructor stub
	}
	
	 private static final Set<String> supportedApplicationIds;
	 
	    static {
	        /*
	         * This Id can be found on https://developer.amazon.com/edw/home.html#/
	         * "Edit" the relevant Alexa Skill and put the relevant Application Ids
	         * in this Set.
	         */
	        supportedApplicationIds = new HashSet<String>();
	        supportedApplicationIds.add("amzn1.ask.skill.e64b86ab-3aac-4a4d-827c-b87bab2ba37f");
	        //supportedApplicationIds.add("[Add your Alexa Skill ID and then uncomment and ]";
	        System.out.println("Supported app ids : " + supportedApplicationIds);
	    }
	 
	    public SayHelloStreamHandler() {
	        super(new SayHelloSpeechlet(), supportedApplicationIds);
	    }
}
