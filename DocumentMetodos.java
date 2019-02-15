import java.util.ArrayList;
import java.util.List;

public class DocumentMetodos {
	public DocumentMetodos() {
	}

	public static boolean existeSentenca(String pHTML, String pSentenca) {
		Boolean vExiste = Boolean.FALSE;
		String vConteudoDocument = pHTML;
		int vIndiceSentenca = vConteudoDocument.indexOf(pSentenca);
		if (vIndiceSentenca > 0) {
			vExiste = Boolean.TRUE;
		}
		return vExiste.booleanValue();
	}

	public static String getConteudoMarcadores(String pTexto, String pMarcadorInicio, String pMarcadorFim) {
		String vRetorno = "";
		int vBegin = pTexto.indexOf(pMarcadorInicio);
		int vEnd = 0;
		if (vBegin >= 0) {
			vBegin += pMarcadorInicio.length();
			vEnd = pTexto.indexOf(pMarcadorFim, vBegin);
			if (vBegin < vEnd) {
				vRetorno = pTexto.substring(vBegin, vEnd);
				vRetorno = vRetorno.trim();
				
			}
		}

		return vRetorno;
	}

	public static String getConteudoMarcadores(String pHTML, String pMarcadorInicio, String pMarcadorFim,
			 int pIndiceInicioBusca) {
		String vRetorno = "";
		String vConteudoDocument = pHTML.toString();
		int vBegin = vConteudoDocument.indexOf(pMarcadorInicio, pIndiceInicioBusca);
		int vEnd = 0;
		if (vBegin >= 0) {
			vBegin += pMarcadorInicio.length();
			vEnd = vConteudoDocument.indexOf(pMarcadorFim, vBegin);
			if (vBegin < vEnd) {
				vRetorno = vConteudoDocument.substring(vBegin, vEnd);
				vRetorno = vRetorno.trim();
				
			}
		}

		return vRetorno;
	}

	public static List<String> getListaConteudoMarcadores(String pHTML, String pMarcadorInicio, String pMarcadorFim) {
		String vRetorno = "";
		String vConteudoDocument = pHTML;
		int vBegin = 0;
		int vEnd = 0;
		List<String> vListaHTML = new ArrayList<String>();
		while (vBegin > -1) {
			vBegin = vConteudoDocument.indexOf(pMarcadorInicio, vBegin);
			if (vBegin > -1) {
				vBegin += pMarcadorInicio.length();
				vEnd = vConteudoDocument.indexOf(pMarcadorFim, vBegin);
				if (vBegin < vEnd) {
					vRetorno = vConteudoDocument.substring(vBegin, vEnd);
					vRetorno = vRetorno.trim();
					
					vListaHTML.add(vRetorno);

					vEnd += pMarcadorFim.length();
					vBegin = vEnd;
				}
			}
		}

		return vListaHTML;
	}
}

/*
 * Location:
 * \\gemini\Softwares\Releases\GATEWAY2\GATEWAY2-UTILS\gateway_utils_v20170619_p01
 * .jar Qualified Name:
 * br.com.neurotech.gateway2.utils.documents.reuso.DocumentMetodos Java Class
 * Version: 7 (51.0) JD-Core Version: 0.7.0.1
 */