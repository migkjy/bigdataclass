package org.zerock.persistence;

import org.zerock.domain.MessageDto;

public interface MessageDao {

	public void create(MessageDto mDto) throws Exception;
	
	public MessageDto readMessage(Integer mid) throws Exception;
	
	public void updateState(Integer mid) throws Exception;
}
