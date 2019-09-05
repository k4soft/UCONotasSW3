package co.edu.uco.uconotas.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class TipoDocumentoIdentidadEntity {

    private Integer id;
    private String nombre;
    private String sigla;
    private boolean activo;
}
