package org.zerock.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.MessageDto;
import org.zerock.persistence.MessageDao;
import org.zerock.persistence.PointDao;

@Service
public class MessageServiceImpl implements MessageService {

	@Inject
	private MessageDao messageDao;
	
	@Inject
	private PointDao pointDao;
	
	@Transactional
	@Override
	public void addMessage(MessageDto mDto) throws Exception {
		messageDao.create(mDto);
		pointDao.updatePoint(mDto.getSender(), 10);
	}

	@Override
	public MessageDto readMessage(String uid, Integer mid) throws Exception {
		messageDao.updateState(mid);
		pointDao.updatePoint(uid, 5);
		
		return messageDao.readMessage(mid);
	}

}
