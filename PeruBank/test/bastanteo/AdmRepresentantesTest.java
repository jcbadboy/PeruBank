package bastanteo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdmRepresentantesTest {

	@Test
	public void siIngresoDatosDeberiaRegistrarRepresentante()
			throws RepresentantesException {
		// preparamos el ejemplo
		String tipoDoc = "DNI";
		String numDoc = "43942179";
		String nomRep = "Luis Alberto";
		String apePatRep = "Pedreros";
		String apeMatRep = "Albornoz";
		String cargoRep = "Consultor TI";
		String grupoBast = "A";

		AdmRepresentante admRep = new AdmRepresentante();

		// ejecutar
		admRep.registrarRepresentante(tipoDoc, numDoc, nomRep, apePatRep,
				apeMatRep, cargoRep, grupoBast);

		Representante representante = admRep.buscarRepresentante(tipoDoc, numDoc);
		// Verificar
		assertNotNull(representante);
	}

	@Test(expected = RepresentantesException.class)
	public void deberiaValidarDatosRequeridos() throws RepresentantesException {

		// preparamos el ejemplo
		String tipoDoc = "DNI";
		String numDoc = "";
		String nomRep = "Luis Alberto";
		String apePatRep = "Pedreros";
		String apeMatRep = "Albornoz";
		String cargoRep = "Consultor TI";
		String grupoBast = "A";

		AdmRepresentante admRep = new AdmRepresentante();

		// ejecutar
		admRep.registrarRepresentante(tipoDoc, numDoc, nomRep, apePatRep,
				apeMatRep, cargoRep, grupoBast);

	}

	@Test(expected = RepresentantesException.class)
	public void noDeberiaRegistrarRepresentantesDuplicados() throws RepresentantesException {
		// preparamos el escenario
		String tipoDoc = "DNI";
		String numDoc = "";
		String nomRep = "Luis Alberto";
		String apePatRep = "Pedreros";
		String apeMatRep = "Albornoz";
		String cargoRep = "Consultor TI";
		String grupoBast = "A";

		AdmRepresentante admRep = new AdmRepresentante();

		// ejecutar
		admRep.registrarRepresentante(tipoDoc, numDoc, nomRep, apePatRep,
				apeMatRep, cargoRep, grupoBast);

		// ejecutar
		admRep.registrarRepresentante(tipoDoc, numDoc, nomRep, apePatRep,
				apeMatRep, cargoRep, grupoBast);

	}

}
