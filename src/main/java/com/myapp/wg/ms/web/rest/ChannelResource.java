package com.myapp.wg.ms.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.myapp.wg.ms.domain.Channel;

@RestController
@RequestMapping("/api")
public class ChannelResource {
	
	 
	    @RequestMapping(value = "/channels",
	        method = RequestMethod.GET,
	        produces = MediaType.APPLICATION_JSON_VALUE)
	   
	    public ResponseEntity<List<Channel>> getAllChannels() {
	       
	 
	        List<Channel> channels = new ArrayList<Channel>();
	        Channel ch = new Channel();
	        ch.setChannelId(1); 
	        ch.setChannelName("ESPN");
	        
	        Channel ch2 = new Channel();
	        ch2.setChannelId(2); 
	        ch2.setChannelName("hbo");
	        channels.add(ch);
	        channels.add(ch2);
	         
	        return new ResponseEntity<List<Channel>>(channels, HttpStatus.OK);
	    }

}
