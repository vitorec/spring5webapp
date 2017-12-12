package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Vitor on 07/12/2017.
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{
}
