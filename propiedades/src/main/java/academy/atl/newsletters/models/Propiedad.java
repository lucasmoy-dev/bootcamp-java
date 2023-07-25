package academy.atl.newsletters.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "propiedad")
public class Propiedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(columnDefinition = "DATETIME", name ="fecha_creacion", updatable = false, nullable = false)
    protected Date fechaCreacion;

    @Column(columnDefinition = "DATETIME", name ="fecha_eliminacion", updatable = false, nullable = false)
    private Date fechaEliminacion;

    @Column(name = "precio")
    private String precio;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "m2")
    private String m2;

    @Column(name = "banos")
    private String banos;

    @Column(name = "ano")
    private String ano;

    @Column(name = "habitaciones")
    private String habitaciones;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "latitud")
    private String latitud;

    @Column(name = "longitud")
    private String longitud;

    @Column(name = "estado")
    private String estado;

    @Column(name = "disponible")
    private String disponible;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_vendedor")
    private Vendedor vendedor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_galeria")
    private Galeria galeria;

}
