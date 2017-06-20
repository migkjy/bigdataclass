package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MessageDto;

@Repository
public class MessageDaoImpl implements MessageDao {

	@Inject
	private SqlSession session;
	
	private static String namespace = "org.zerock.mapper.MessageMapper";
	
	@Override
	public void create(MessageDto mDto) throws Exception {
		session.insert(namespace+".create", mDto);
	}

	@Override
	public MessageDto readMessage(Integer mid) throws Exception {
		return session.selectOne(namespace+".readMessage", mid);
	}

	@Override
	public void updateState(Integer mid) throws Exception {
		session.update(namespace+".updateState", mid);
	}

}
