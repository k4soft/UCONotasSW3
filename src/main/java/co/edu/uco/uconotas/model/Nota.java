package co.edu.uco.uconotas.model;

import java.util.List;

public class Nota {

    private TipoNota tipoNota;
    private List<SubNota> subnotas;

    public TipoNota getTipoNota() {
        return tipoNota;
    }

    public void setSubnotas(List<SubNota> subnotas) {
        this.subnotas = subnotas;
    }
}
