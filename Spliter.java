package treino;

public class Spliter {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in); System.out.println(
		 * "Escreva uma string: ");
		 */
		String string = "0921|Lucas|33.00:0932|Pedro|123.00:0921|Lucas|20.00:0934|Ze|100.00:0935|Lucas|200.00";
		String string2 = "N:S:S:N:S";
		String namoradas[] = string2.split(":");
		
		String camada1[] = string.split(":");
		double maiorSalario = 0;
		double menorSalario = 1000000000.00;
		double somaSalario = 0;
		double media;
		String verify = "";
		for(int j = 0; j < camada1.length; j++){
			String camada2[] = camada1[j].split("\\|");
			
			if(verify.contains(camada2[0])){
				System.out.println("Id " + (j + 1) + " nao é unico");
				}
			else{
				System.out.println("Id "+ (j + 1) + " é unico");
			}
			verify = verify.concat(camada2[0] + "$");
			somaSalario = Double.parseDouble(camada2[2])+ somaSalario;
			media = somaSalario / (j + 1);
			
			if(Double.parseDouble(camada2[2]) > maiorSalario){
				maiorSalario = Double.parseDouble(camada2[2]);
			}
			
			if(menorSalario > Double.parseDouble(camada2[2])){
				menorSalario = Double.parseDouble(camada2[2]);
			}
		}	
		
		int quantidadeLucas = 0;
		int quantidadePedro = 0;
		int namoradasLucas = 0;
		int namoradasPedro = 0;
		int pedroSemNamorada = 0;
		
		
		for (int i = 0; i < camada1.length; i++) {
			
			if (camada1[i].equalsIgnoreCase("Lucas")) {
				quantidadeLucas++;
				if (namoradas[i].equals("S")) {
					namoradasLucas++;
				}
			}

			else if (camada1[i].equalsIgnoreCase("Pedro")) {
				quantidadePedro++;
				if (namoradas[i].equals("S")) {
					namoradasPedro++;
				} else if (namoradas[i].equals("N")) {
					pedroSemNamorada++;
				}
			}
			
		}
		
		System.out.println("Quantidade de Lucas: " + quantidadeLucas);
		System.out.println("Quantidade de Pedros: " + quantidadePedro);
		System.out.println("Lucases Namorantes: " + namoradasLucas);

	}
	
}
