package me.aoa4eva.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import me.aoa4eva.demo.models.Person;

public interface PersonRepository extends CrudRepository<Person,Long> {

}
