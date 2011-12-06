package bastanteo;

import static org.junit.Assert.assertNotNull;

import java.awt.List;

import org.junit.Test;

public class AdmBastanteoPoderesTest {

	@Test
	public void siIngresoDatosDeberiaRegistrarBastanteoPoderes()
			throws BastanteoPoderesException  {
		// preparamos el ejemplo
		String grupoBast = "A";
		String[] listPoderes = {"CHCO" , "EFRE"};
		String tipoInterv = "A Sola Firma";
		String[] listGrupoBast = {"B" , "C"};
		Double monto = 6000.00;
		String fechaVenc = "19/05/2011";

		AdmBastanteoPoderes admBastanteoPoderes = new AdmBastanteoPoderes();

		// ejecutar
		admBastanteoPoderes.registrarPoder(grupoBast, listPoderes, tipoInterv, listGrupoBast, monto, fechaVenc);

		/*BastanteoPoderes poder = admBastanteoPoderes.buscarPoder(codCorto);
		// Verificar
		assertNotNull(BastanteoPoderes);*/
	}

}
