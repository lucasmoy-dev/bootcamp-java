package academy.atl.newsletters.repository;

import academy.atl.newsletters.models.Propiedad;
import academy.atl.newsletters.services.PropiedadInterface;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PropiedadRepository implements PropiedadInterface {

    @PersistenceContext
    EntityManager conexion;

    @Override
    public void agregar(Propiedad propiedad) {

    }

    @Override
    public void modificar(Propiedad propiedad) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Propiedad get(Long id) {
        List<Propiedad> resultados = conexion.createNativeQuery("FROM Propiedad p WHERE p.id = " + id)
                .getResultList();
        return resultados.get(0);
    }

    @Override
    public List<Propiedad> getAll() {
        return null;
    }

}
