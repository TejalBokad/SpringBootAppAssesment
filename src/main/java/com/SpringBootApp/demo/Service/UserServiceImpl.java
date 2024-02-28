package com.SpringBootApp.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootApp.demo.Model.User;
import com.SpringBootApp.demo.Repository.UserRepository;

@Service
public class UserServiceImpl {
	
	@Autowired
    private UserRepository userRepository;
	private Object User;

    public String generatePassword(String firstName, String middleName, String lastName) {
        String firstChars = firstName.substring(0, Math.min(firstName.length(), 2)).toLowerCase();
        String middleChars = middleName.substring(0, Math.min(middleName.length(), 2)).toLowerCase();
        String lastChars = lastName.substring(0, Math.min(lastName.length(), 2)).toLowerCase();
        String randomDigits = String.valueOf((int)(Math.random() * 900) + 100);
        return firstChars + middleChars + lastChars + randomDigits;

}
    public User saveUser(User user) {
        return UserRepository.saveAll(User);
    }
    
}
