package academy.atl.newsletters.repository;

import academy.atl.newsletters.models.Propiedad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropRepository
        extends CrudRepository<Propiedad, Long> {
}