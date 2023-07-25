package academy.atl.newsletters.controllers;

import academy.atl.newsletters.models.Propiedad;
import academy.atl.newsletters.services.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PropiedadController {

    @Autowired
    private PropiedadService propiedadService;

    @PostMapping("/api/propiedad")
    public void agregar(@RequestBody Propiedad propiedad) {
        propiedadService.agregar(propiedad);
    }

    @PutMapping("/api/propiedad/{id}")
    public void modificar(@RequestBody Propiedad propiedad, @PathVariable("id") Long id) {
        propiedadService.modificar(propiedad);
    }

    @DeleteMapping("/api/propiedad/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        propiedadService.eliminar(id);
    }

    @GetMapping("/api/propiedad/{id}")
    public Propiedad get(@PathVariable("id") Long id) {
        Propiedad propiedad = new Propiedad();
        propiedad.setId(1L);
        propiedad.setAno("1945");
        propiedad.setBanos("3");
        propiedad.setTitulo("Departamento al frente de la playa.");
        propiedad.setDescripcion("Hermoso departamento al frente de la playa.");
        propiedad.setLongitud("41.3174241");
        propiedad.setLatitud("2.1399451");
        return propiedad;
    }

    @GetMapping("/api/propiedad")
    public List<Propiedad> getAll() {
        List<Propiedad> lista = new ArrayList<>();
        Propiedad propiedad = new Propiedad();
        propiedad.setId(1L);
        propiedad.setAno("1945");
        propiedad.setBanos("3");
        propiedad.setTitulo("Departamento al frente de la playa.");
        propiedad.setDescripcion("Hermoso departamento al frente de la playa.");
        propiedad.setLongitud("41.3174241");
        propiedad.setLatitud("2.1399451");


        Propiedad propiedad2 = new Propiedad();
        propiedad2.setId(2L);
        propiedad2.setAno("1945");
        propiedad2.setBanos("1");
        propiedad2.setTitulo("Departamento al frente de la Montaña.");
        propiedad2.setDescripcion("Hermoso departamento al frente de la Montaña.");
        propiedad2.setLongitud("42.3174241");
        propiedad2.setLatitud("2.1399451");
        lista.add(propiedad);
        lista.add(propiedad2);
        return lista;
    }
}
