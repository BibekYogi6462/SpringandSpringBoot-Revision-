package com.bibek.jdbc.dao;

import com.bibek.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertUser(User user) {
        try{
            jdbcTemplate.update("INSERT INTO users (name, email, gender, city) VALUES (?, ?, ?, ?)",
                    user.getName(), user.getEmail(), user.getGender(), user.getCity());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
