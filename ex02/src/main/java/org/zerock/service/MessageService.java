package org.zerock.service;

import org.zerock.domain.MessageDto;

public interface MessageService {
	public void addMessage(MessageDto mDto) throws Exception;
	
	public MessageDto readMessage(String uid, Integer mid) throws Exception;
	
}
