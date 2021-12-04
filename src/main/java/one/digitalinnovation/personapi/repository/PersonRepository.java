package one.digitalinnovation.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.personapi.entity.Person;

@Repository
@Component
@EnableJpaRepositories
public interface PersonRepository extends JpaRepository<Person, Long> {	

}
