package bastanteo;

import java.util.ArrayList;
import java.util.List;

public class AdmRepresentante {
	// 1ero. defino mi lista de un tipo dado
	List<Representante> representante;

	// 2do. En el constructor inicializo
	public AdmRepresentante() {
		representante = new ArrayList<Representante>();
	}

	public void registrarRepresentante(String tipoDoc, String numDoc,
			String nomRep, String apePatRep, String apeMatRep, String cargoRep,
			String grupoBast) throws RepresentantesException {

		// validar datos
		validarDatosRep(tipoDoc, numDoc, nomRep, apePatRep, apeMatRep,
				cargoRep, grupoBast);

		// validar que no haya duplicados
		validarRepDuplicado(tipoDoc, numDoc);

		// Creamos un cliente
		Representante nuevoRepresentante = new Representante(tipoDoc, numDoc,
				nomRep, apePatRep, apeMatRep, cargoRep, grupoBast);
		// añaden a la lista
		representante.add(nuevoRepresentante);
	}

	private void validarRepDuplicado(String tipoDoc, String numDoc) throws RepresentantesException {
		if (RepresentanteExiste(tipoDoc, numDoc))
			throw new RepresentantesException("Representante Duplicado");
	}

	private boolean RepresentanteExiste(String tipoDoc, String numDoc) {
		boolean existe = false;

		// and && , || or
		for (Representante rep: representante)
			if (rep.getTipoDoc().equals(tipoDoc)
					&& rep.getNumDoc().equals(numDoc))
				existe = true;
		return existe;
	}

	private void validarDatosRep(String tipoDoc, String numDoc, String nomRep,
			String apePatRep, String apeMatRep, String cargoRep,
			String grupoBast) throws RepresentantesException {

		String mensaje = "";
		if (tipoDoc.equals(""))
			mensaje += "Tipo de Documento de Identidad no puede ser vacio";
		if (numDoc.equals(""))
			mensaje += "\nDocumento de Identidad no puede ser vacio";
		if (nomRep.equals(""))
			mensaje += "\nNombre del Representante no puede ser vacio";
		if (apePatRep.equals(""))
			mensaje += "\nApellido Paterno del Representante no puede ser vacio";
		if (apeMatRep.equals(""))
			mensaje += "\nApellido Materno del Representante no puede ser vacio";
		if (cargoRep.equals(""))
			mensaje += "\nCargo del Representante no puede ser vacio";
		if (grupoBast.equals(""))
			mensaje += "\nGrupo de Bastanteo del Representante no puede ser vacio";
		if (!mensaje.equals(""))
			throw new RepresentantesException(mensaje);

	}

	public Representante buscarRepresentante(String tipoDoc, String numDoc) {
		for (Representante rep: representante)
			if (rep.getTipoDoc().equals(tipoDoc)
					&& rep.getNumDoc().equals(numDoc))
                return rep;
        return null;
	}

}
