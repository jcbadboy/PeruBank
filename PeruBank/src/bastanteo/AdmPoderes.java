package bastanteo;

import java.util.ArrayList;
import java.util.List;

public class AdmPoderes {

	List<Poder> poderes;

	// 2do. En el constructor inicializo
	public AdmPoderes() {
		poderes = new ArrayList<Poder>();
	}

	public void registrarPoder(String codCorto, String nombrePoder,
			String tipoProdServ) throws PoderesException {
		// validar datos
		validarDatosPod(codCorto, nombrePoder, tipoProdServ);

		// validar que no haya duplicados
		validarPodDuplicado(codCorto);

		// Creamos un cliente
		Poder nuevoPoder = new Poder(codCorto, nombrePoder, tipoProdServ);
		// añaden a la lista
		poderes.add(nuevoPoder);

	}

	private void validarPodDuplicado(String codCorto) throws PoderesException {
		if (RepresentanteExiste(codCorto))
			throw new PoderesException("Poder Duplicado");
	}

	private boolean RepresentanteExiste(String codCorto) {
		boolean existe = false;

		// and && , || or
		for (Poder poder : poderes)
			if (poder.getCodCorto().equals(codCorto))
				existe = true;
		return existe;
	}

	private void validarDatosPod(String codCorto, String nombrePoder,
			String tipoProdServ) throws PoderesException {
		String mensaje = "";
		if (codCorto.equals(""))
			mensaje += "Código del Poder no puede ser vacio";
		if (nombrePoder.equals(""))
			mensaje += "\nNombre del Poder no puede ser vacio";
		if (tipoProdServ.equals(""))
			mensaje += "\nTipo del Servicio no puede ser vacio";
		if (!mensaje.equals(""))
			throw new PoderesException(mensaje);

	}

	public Poder buscarPoder(String codCorto) {
		for (Poder poder: poderes)
			if (poder.getCodCorto().equals(codCorto))
                return poder;
        return null;
	}

}
