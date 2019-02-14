import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivosUtil { 


	public static StringBuilder getTextoArquivo(String pPath) {
		StringBuilder vTextoRetorno = new StringBuilder();

		try {
			FileReader arq = new FileReader(pPath);
			BufferedReader lerArq = new BufferedReader(arq);

			String vLinha;
			do{
				vLinha = lerArq.readLine();
				if(vLinha != null){
					vTextoRetorno.append(new String (vLinha.getBytes(), "UTF-8"));
				}
			}while (vLinha != null);

			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}
		return vTextoRetorno;
	}

	public static void escreverEmArquivo(String pPath, StringBuilder pConteudo) throws IOException {
		FileWriter arq = new FileWriter(new File(pPath));
		arq.write(pConteudo.toString());
		arq.close();
	}


}
