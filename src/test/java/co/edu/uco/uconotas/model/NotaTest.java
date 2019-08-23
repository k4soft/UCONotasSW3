package co.edu.uco.uconotas.model;


import co.edu.uco.uconotas.model.businessexception.NotaMinimaPermitidaException;
import co.edu.uco.uconotas.model.businessexception.ValorMaximoPermitidoException;
import co.edu.uco.uconotas.model.mensaje.Mensaje;
import org.junit.Assert;
import org.junit.Before;
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

    Nota notaParcial;

    @Before
    public void setUp(){
       notaParcial = new Nota();
    }

    @Test
    public void insertaNotasMayorPermitida() throws ValorMaximoPermitidoException, NotaMinimaPermitidaException {
        exception.expect(ValorMaximoPermitidoException.class);
        exception.expectMessage(Mensaje.Nota.NOTA_MAYOR_A_LA_PERMITIDA);
        notaParcial.getTipoNota().setNombre("Parcial");
        notaParcial.getTipoNota().setPorcentaje(30);
        SubNota totalParcial = new SubNota();
        totalParcial.setNombre("Nota total parcial");
        totalParcial.setValorNotaMaxima(ParametroSistema.NOTA_MAXIMA_PERMITIDA);
        double notaTotalParcial = 6;
        totalParcial.setValor(notaTotalParcial);
    }

    @Test
    public void insertarNotaMinimaNoPermitida() throws ValorMaximoPermitidoException, NotaMinimaPermitidaException {
        exception.expect(NotaMinimaPermitidaException.class);
        exception.expectMessage(Mensaje.Nota.NOTA_MINIMA_A_LA_PERMITIDA);
        notaParcial.getTipoNota().setNombre("Parcial");
        notaParcial.getTipoNota().setPorcentaje(30);
        SubNota totalParcial = new SubNota();
        totalParcial.setNombre("Nota total parcial");
        totalParcial.setValorNotaMaxima(ParametroSistema.NOTA_MAXIMA_PERMITIDA);
        double notaTotalParcial = -1;
        totalParcial.setValor(notaTotalParcial);
    }

    @Test
    public void insertarNotaValida() throws ValorMaximoPermitidoException, NotaMinimaPermitidaException {
        notaParcial.getTipoNota().setNombre("Parcial");
        notaParcial.getTipoNota().setPorcentaje(30);
        SubNota totalParcial = new SubNota();
        totalParcial.setNombre("Nota total parcial");
        totalParcial.setValorNotaMaxima(ParametroSistema.NOTA_MAXIMA_PERMITIDA);
        double notaTotalParcial = 2;
        totalParcial.setValor(notaTotalParcial);
        Assert.assertEquals(notaTotalParcial,totalParcial.getValor(),0.5);
    }





}