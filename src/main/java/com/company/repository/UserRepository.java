package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.company.domain.User;
import java.util.List;

// crud: create, read, update, delete
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User save(User user); // Insert into user value()

  List<User> findByEmail(String email);
  // Nếu data không "duy nhất", không nên dùng findOne...
  // Có thể dùng 2 cách sau:
  // findFirstByEmail hoặc findTop1ByEmail để lấy 1 kết quả (giới hạn 1 kết quả
  // trả về)

}