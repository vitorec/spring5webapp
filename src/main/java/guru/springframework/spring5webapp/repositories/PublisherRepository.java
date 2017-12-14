package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Vitor on 14/12/2017.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
