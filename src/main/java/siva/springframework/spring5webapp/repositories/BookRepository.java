package siva.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import siva.springframework.spring5webapp.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
