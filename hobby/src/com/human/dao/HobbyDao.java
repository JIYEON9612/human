package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.human.dto.HobbyDto;
import com.human.util.DBConn;

public class HobbyDao {
	public ArrayList<HobbyDto> select(){
		ArrayList<HobbyDto> resultDtos=new ArrayList<HobbyDto>();
		ResultSet rs=DBConn.statementQuery(String.format("select * from hobby"));
		try {
			while(rs.next()) {
				resultDtos.add(new HobbyDto(rs.getInt("id"),rs.getString("hobby")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return resultDtos;
	}
	public HobbyDto selectId(int id) {
		HobbyDto resultDtos=new HobbyDto();
		ResultSet rs=DBConn.statementQuery(String.format("select * from hobby where id=&d", id));
		if(rs!=null) {
			try {
				rs.next();
				resultDtos=new HobbyDto(rs.getInt("id"),rs.getString("hobby"));
			}catch(SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}return resultDtos;
	}
	public void insert(HobbyDto dto) {
		String sql=String.format("insert into hobby values(%d,'%s')", dto.getId(),dto.getHobby());
		DBConn.statementQuery(sql);
		System.out.println("[입력 완료]");
	}
	public void update(String upHobby, int id) {
		String sql=String.format("update hobby set hobby='%s' where id=%d", id, upHobby);
		DBConn.statementQuery(sql);
		System.out.println("[수정 완료]");
	}
	public void delete(int id) {
		String sql=String.format("delete hobby where id=%d", id);
		DBConn.statementQuery(sql);
		System.out.println("[삭제 완료]");
	}
}
