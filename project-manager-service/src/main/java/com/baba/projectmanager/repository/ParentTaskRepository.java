package com.baba.projectmanager.repository;

import com.baba.projectmanager.entity.ParentTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentTaskRepository extends JpaRepository<ParentTask, Long> {

}
