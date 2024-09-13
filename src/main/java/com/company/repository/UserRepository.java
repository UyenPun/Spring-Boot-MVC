package com.company.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.company.domain.User;

// crud: create, read, update, delete
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  User save(User user);
}