package com.human.service;

import java.util.ArrayList;
import com.human.dao.HobbyDao;
import com.human.dto.HobbyDto;

public class HobbyService {
	private HobbyDao dao=new HobbyDao();
	public ArrayList<HobbyDto> select() {
		return dao.select();
	}
	public void insert(HobbyDto dto) {
		dao.insert(dto);
	}
	public void update(String hobbyDto, int updateId) {
		dao.update(hobbyDto, updateId);
	}
	public void delete(int id) {
		dao.delete(id);
	}
}
