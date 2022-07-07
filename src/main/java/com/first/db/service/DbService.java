package com.first.db.service;

import com.first.db.entity.DbEntity;

public interface DbService {

    void remove();
    void create(DbEntity dbEntity);

}
