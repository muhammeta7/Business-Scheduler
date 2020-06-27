package com.example.scheduler.repositories;

import com.example.scheduler.models.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDaoRepository extends CrudRepository<DAOUser, Long> {
}
