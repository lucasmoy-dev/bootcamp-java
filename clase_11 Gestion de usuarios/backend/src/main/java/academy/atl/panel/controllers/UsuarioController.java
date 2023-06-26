package academy.atl.panel.controllers;

import academy.atl.panel.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    List<Usuario> usuarios = new ArrayList<>();

    @GetMapping("/api/usuarios")
    public List<Usuario> listarUsuarios() {

        return usuarios;
    }

    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuario(@PathVariable String id) {

        for (Usuario user : usuarios) {
            if (id.equals(user.getId().toString())) {
                usuarios.remove(user);
            }
        }

        // Usuario usuarioEncontrado = usuarios.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }


    @PostMapping("/api/usuarios")
    public void agregarUsuario(@RequestBody Usuario user) {
        usuarios.add(user);
    }

}
