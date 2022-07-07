package com.first.db.service;

import com.first.db.entity.DbEntity;
import com.first.db.repository.DbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbServiceImpl implements DbService {

    @Autowired
    private DbRepository repository;


    @Override
    public void remove() {
        repository.deleteAll();
    }

    @Override
    public void create(DbEntity dbEntity) {
        repository.save(dbEntity);
    }

}
