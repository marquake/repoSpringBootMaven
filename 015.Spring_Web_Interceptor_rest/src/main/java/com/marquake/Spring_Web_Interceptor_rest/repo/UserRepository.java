package com.marquake.Spring_Web_Interceptor_rest.repo;

import com.marquake.Spring_Web_Interceptor_rest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
