package co.edu.uco.uconotas.model;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NotaTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void insertaNotasMayorPermitida(){
        var notaParcial = new Nota();
        notaParcial.getTipoNota().setNombre("Parcial");
        notaParcial.getTipoNota().setPorcentaje(30);
        SubNota totalParcial = new SubNota();
        double notaTotalParcial = 6;
        totalParcial.setValor(notaTotalParcial);
        totalParcial.setNombre("Nota total parcial");
        totalParcial.setValorNotaMaxima(ParametroSistema.NOTA_MAXIMA_PERMITIDA);
    }



}