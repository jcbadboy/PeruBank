package bastanteo;

public class Poder {

	private String codCorto;
	private String nombrePoder;
	private String tipoProdServ;

	public Poder(String codCorto, String nombrePoder, String tipoProdServ) {
		this.codCorto = codCorto;
		this.nombrePoder = nombrePoder;
		this.tipoProdServ = tipoProdServ;
	}

	public String getCodCorto() {
		return codCorto;
	}

	public String getNombrePoder() {
		return nombrePoder;
	}

	public String getTipoProdServ() {
		return tipoProdServ;
	}
	
	

}
