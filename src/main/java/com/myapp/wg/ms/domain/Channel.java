package com.myapp.wg.ms.domain;

import org.springframework.data.annotation.Id;


public class Channel {
	
	/**
	 * 
	 */

	String channelName;
	@Id
	int channelId;
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	@Override
	public String toString() {
		return "Channel [channelName=" + channelName + ", channelId=" + channelId + "]";
	}
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

}
