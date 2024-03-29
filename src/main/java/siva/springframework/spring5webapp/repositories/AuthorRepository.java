package siva.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import siva.springframework.spring5webapp.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
