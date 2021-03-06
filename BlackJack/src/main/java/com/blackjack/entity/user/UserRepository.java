package com.blackjack.entity.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	 @Query("select u from User u where u.userName = ?1")
	   User getUser(String user_name);
}
