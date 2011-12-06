package bastanteo;

import java.util.ArrayList;
import java.util.List;

public class AdmBastanteoPoderes {


	List<BastanteoPoderes> bastanteoPoderes;

	// 2do. En el constructor inicializo
	public AdmBastanteoPoderes() {
		bastanteoPoderes = new ArrayList<BastanteoPoderes>();
	}
	
	public void registrarPoder(String grupoBast, String[] listPoderes,
			String tipoInterv, String[] listGrupoBast, Double monto,
			String fechaVenc) {

		BastanteoPoderes nuevoBastPoder = new BastanteoPoderes(grupoBast,
				listPoderes, tipoInterv, listGrupoBast, monto, fechaVenc);
		
		bastanteoPoderes.add(nuevoBastPoder);
		
	}
}
