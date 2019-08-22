package co.edu.uco.uconotas.model;

public class TipoDocumentoIdentidad {

    private Integer id;
    private String nombre;
    private String sigla;
    private boolean activo;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public boolean isActivo() {
        return activo;
    }
}
