package academy.atl.panel.models;

import lombok.*;

@Data @AllArgsConstructor
public class Usuario {

    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

}
