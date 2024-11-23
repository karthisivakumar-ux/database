package com.database.datacontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.database.dataentity.DataEntity;
import com.database.dataservice.DataService;

@RestController
@RequestMapping(value="/get")
public class Datacontroller {
	@Autowired
	DataService ds;
	@PostMapping(value="/data")
	
	public String post(@RequestBody List<DataEntity> a) {
		return ds.post(a);
	}
	@GetMapping(value="/data")
	public List<DataEntity> get() {
		return ds.get();
	}

}
