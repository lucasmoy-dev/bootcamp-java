package academy.atl.newsletters.services;

import academy.atl.newsletters.models.Propiedad;
import academy.atl.newsletters.repository.IPropiedadRepository;
import academy.atl.newsletters.repository.PropiedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropiedadService implements PropiedadInterface {

    @Autowired
    private IPropiedadRepository repository;

    public void agregar(Propiedad propiedad) {
        if (propiedad.getTitulo().equals("")) {
            return;
        }

        repository.save(propiedad);
    }

    public void modificar(Propiedad propiedad) {
        // funcionalidad para modificar a la bases de datos
        repository.save(propiedad);
    }

    public void eliminar(Long id) {
        // funcionalidad para eliminar a la bases de datos
        repository.deleteById(id);
    }

    public Propiedad get(Long id) {
        return repository.findById(id).get();
    }

    public List<Propiedad> getAll() {
        return (List) repository.findAll();
    }

}
