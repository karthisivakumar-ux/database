package com.database.datadao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.database.dataentity.DataEntity;
import com.database.datarepository.DataRepository;

@Repository
public class DataDao {
	@Autowired
	DataRepository dr;
	
	public String post(List<DataEntity> a) {
		dr.saveAll(a);
		return "posted successfully";
	}
	public List<DataEntity> get() {
		return dr.findAll();
	}

}
