package me.afua.restdemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Long> {
    List<Person> findByLastName(@Param("name") String name);

}
