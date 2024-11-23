package com.database.dataservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.datadao.DataDao;
import com.database.dataentity.DataEntity;

@Service
public class DataService {
	@Autowired
	DataDao dd;
	
	public String post(List<DataEntity> a) {
		return dd.post(a);
	}
	public List<DataEntity> get() {
		return dd.get();
	}
}
