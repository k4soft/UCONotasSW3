package co.edu.uco.uconotas.entity;

import co.edu.uco.uconotas.model.TipoDocumentoIdentidad;
import co.edu.uco.uconotas.model.TipoRol;

public class PersonaEntity {


    private Long id;
    private String nombre;
    private String apellido;
    private TipoDocumentoIdentidad tipoDocumentoIdentidad;
    private String nroDocumento;
    private String correo;
    private String telefono;
    private TipoRol tipoRol;
    private String fechaNacimiento;


}
