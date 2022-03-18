package com.cyber009.jcrm.controllers.user;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.cyber009.jcrm.models.Person;

import org.springframework.stereotype.Service;

@Service
public class UserService {
  public UserService() {
  }

  public List<Person> getUser() {
    return List.of(new Person("8776", "lkj", "jhg@gfd.com", LocalDate.of(2000, Month.MARCH, 1)));
  }
}
