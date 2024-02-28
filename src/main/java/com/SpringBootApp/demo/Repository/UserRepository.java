package com.SpringBootApp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootApp.demo.Model.User;

public interface UserRepository  extends JpaRepository<User, Long> {

	static User saveAll(Object user) {
		// TODO Auto-generated method stub
		return null;
	}

}
