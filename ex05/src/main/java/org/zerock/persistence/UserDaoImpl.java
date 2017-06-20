package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.dto.LoginDto;
import org.zerock.dto.UserDto;

@Repository
public class UserDaoImpl implements UserDao {

	@Inject
	private SqlSession session;
	
	private static String namespace = "org.zerock.mapper.UserMapper";
	
	@Override
	public UserDto login(LoginDto lDto) throws Exception {
		return session.selectOne(namespace + ".login", lDto);
	}

}
