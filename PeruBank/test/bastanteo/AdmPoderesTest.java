package bastanteo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AdmPoderesTest {
	@Test
	public void siIngresoDatosDeberiaRegistrarPoderes()
			throws  PoderesException {
		// preparamos el ejemplo
		String codCorto = "CHCO";
		String nombrePoder = "Cobro de Cheques";
		String tipoProdServ = "Activo";


		AdmPoderes admPoder = new AdmPoderes();

		// ejecutar
		admPoder.registrarPoder(codCorto, nombrePoder, tipoProdServ);

		Poder poder = admPoder.buscarPoder(codCorto);
		// Verificar
		assertNotNull(poder);
	}
	
	
	@Test(expected = PoderesException.class)
	public void deberiaValidarDatosRequeridos() throws PoderesException {

		// preparamos el ejemplo
		String codCorto = "";
		String nombrePoder = "Cobro de Cheques";
		String tipoProdServ = "";


		AdmPoderes admPoder = new AdmPoderes();

		// ejecutar
		admPoder.registrarPoder(codCorto, nombrePoder, tipoProdServ);
	}

	@Test(expected = PoderesException.class)
	public void noDeberiaRegistrarRepresentantesDuplicados() throws PoderesException {

		// preparamos el ejemplo
		String codCorto = "CHCO";
		String nombrePoder = "Cobro de Cheques";
		String tipoProdServ = "Activo";


		AdmPoderes admPoder = new AdmPoderes();

		// ejecutar
		admPoder.registrarPoder(codCorto, nombrePoder, tipoProdServ);

		// ejecutar
		admPoder.registrarPoder(codCorto, nombrePoder, tipoProdServ);

	}

}
