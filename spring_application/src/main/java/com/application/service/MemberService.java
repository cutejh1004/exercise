package com.application.service;

import java.sql.SQLException;
import java.util.List;

import com.application.dto.MemberVO;

public interface MemberService {

	List<MemberVO> list() throws SQLException;

	MemberVO getMember(String id) throws SQLException;

	void regist(MemberVO member) throws SQLException;

	void modify(MemberVO member) throws SQLException;

	void remove(String id) throws SQLException;

	void modifyAuthority(String id, List<String> authorities) throws SQLException;
}
