package com.amrut.prabhu.redis.hash;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {

    Optional<Person> findByName(String name);
    Optional<Person> searchByLastName(String name);
}
