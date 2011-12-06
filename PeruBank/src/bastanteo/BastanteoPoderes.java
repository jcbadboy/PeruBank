package bastanteo;

public class BastanteoPoderes {

	private String grupoBast;
	private String[] listPoderes;
	private String tipoInterv;
	private String[] listGrupoBast;
	private Double monto;
	private String fechaVenc;

	public BastanteoPoderes(String grupoBast, String[] listPoderes,
			String tipoInterv, String[] listGrupoBast, Double monto,
			String fechaVenc) {
		this.grupoBast = grupoBast;
		this.listPoderes = listPoderes;
		this.tipoInterv = tipoInterv;
		this.listGrupoBast = listGrupoBast;
		this.monto = monto;
		this.fechaVenc = fechaVenc;

	}

	public String getGrupoBast() {
		return grupoBast;
	}

	public String[] getListPoderes() {
		return listPoderes;
	}

	public String getTipoInterv() {
		return tipoInterv;
	}

	public String[] getListGrupoBast() {
		return listGrupoBast;
	}

	public Double getMonto() {
		return monto;
	}

	public String getFechaVenc() {
		return fechaVenc;
	}

	public String getListPoderesIndex(int i) {
		return listPoderes[i];
	}

	public String getListGrupoBastIndex(int i) {
		return listGrupoBast[i];
	}

}
