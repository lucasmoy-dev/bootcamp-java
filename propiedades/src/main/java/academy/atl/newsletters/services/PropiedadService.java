package academy.atl.newsletters.services;

import academy.atl.newsletters.models.Propiedad;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropiedadService implements PropiedadInterface {


    public void agregar(Propiedad propiedad) {
        if (propiedad.getTitulo().equals("")) {
            return;
        }

        // Llamar a la base de datos
    }

    public void modificar(Propiedad propiedad) {
        // funcionalidad para modificar a la bases de datos
    }

    public void eliminar(Long id) {
        // funcionalidad para eliminar a la bases de datos
    }

    public Propiedad get(Long id) {
        return null;
    }

    public List<Propiedad> getAll() {
        return null;
    }

}
