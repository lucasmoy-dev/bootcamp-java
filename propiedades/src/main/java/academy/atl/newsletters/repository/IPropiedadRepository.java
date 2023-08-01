package academy.atl.newsletters.repository;

import academy.atl.newsletters.models.Propiedad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropiedadRepository extends CrudRepository<Propiedad, Long> {

    //@Query("SELECT * FROM propiedad where nombre like '%sfsdfsd%'")
   // public Iterable<Propiedad> buscar();

}
