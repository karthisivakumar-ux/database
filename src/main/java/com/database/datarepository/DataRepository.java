package com.database.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.dataentity.DataEntity;

public interface DataRepository extends JpaRepository<DataEntity,Integer> {

}
