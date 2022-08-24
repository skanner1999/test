package com.example.test;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RestController
public class TestApplication {

  public static void main(String[] args) throws SQLException {
    Database db = new Database();
    System.out.println(db.getUsers());
    SpringApplication.run(TestApplication.class, args);
  }

}

