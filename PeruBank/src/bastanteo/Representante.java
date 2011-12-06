package bastanteo;

public class Representante {
	private String tipoDoc;
	private String numDoc;
	private String nomRep;
	private String apePatRep;
	private String apeMatRep;
	private String cargoRep;
	private String grupoBast;

	public Representante(String tipoDoc, String numDoc, String nomRep,
			String apePatRep, String apeMatRep, String cargoRep,
			String grupoBast) {
		this.tipoDoc = tipoDoc;
		this.numDoc = numDoc;
		this.nomRep = nomRep;
		this.apePatRep = apePatRep;
		this.apeMatRep = apeMatRep;
		this.cargoRep = cargoRep;
		this.grupoBast = grupoBast;

	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public String getNomRep() {
		return nomRep;
	}

	public String getApePatRep() {
		return apePatRep;
	}

	public String getApeMatRep() {
		return apeMatRep;
	}

	public String getCargoRep() {
		return cargoRep;
	}

	public String getGrupoBast() {
		return grupoBast;
	}
}
