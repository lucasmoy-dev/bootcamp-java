package academy.atl.newsletters.controllers;

import academy.atl.newsletters.models.Vendedor;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class VendedorController {

    @PostMapping("/api/vendedor")
    public void agregar(@RequestBody Vendedor vendedor) {
        // funcionalidad para agregar a la bases de datos
    }

    @PutMapping("/api/vendedor/{id}")
    public void modificar(@RequestBody Vendedor vendedor, @PathVariable("id") Long id) {
        // funcionalidad para modificar a la bases de datos
    }

    @DeleteMapping("/api/vendedor/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        // funcionalidad para eliminar a la bases de datos
    }

    @GetMapping("/api/vendedor/{id}")
    public Vendedor get(@PathVariable("id") Long id) {
        Vendedor vendedor = new Vendedor();
        vendedor.setId(1L);
        vendedor.setNombre("Lucas");
        vendedor.setApellido("Moy");
        vendedor.setEmail("asdasd@asdasd.com");
        vendedor.setFechaCreacion(LocalDate.now());
        return vendedor;
    }

    @GetMapping("/api/vendedor")
    public List<Vendedor> getAll() {
        List<Vendedor> lista = new ArrayList<>();
        Vendedor vendedor = new Vendedor();
        vendedor.setId(1L);
        vendedor.setNombre("Lucas");
        vendedor.setApellido("Moy");
        vendedor.setEmail("asdasd@asdasd.com");
        vendedor.setFechaCreacion(LocalDate.now());


        Vendedor vendedor2 = new Vendedor();
        vendedor2.setId(1L);
        vendedor2.setNombre("Sabrina");
        vendedor2.setApellido("Rizzo");
        vendedor2.setEmail("sabrina.rizzo@hotmail.com");
        vendedor2.setFechaCreacion(LocalDate.now());
        lista.add(vendedor);
        lista.add(vendedor2);
        return lista;
    }

}
