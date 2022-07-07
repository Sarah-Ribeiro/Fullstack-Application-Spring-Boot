package com.first.db.repository;

import com.first.db.entity.DbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbRepository extends JpaRepository<DbEntity, Long> {

}
