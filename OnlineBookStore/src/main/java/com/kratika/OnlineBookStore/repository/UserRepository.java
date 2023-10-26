package com.kratika.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kratika.OnlineBookStore.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

}
