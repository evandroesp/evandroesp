import java.util.List;

public class TelaAnimal {

	//6
	public void mostraAnimal(Animal a){
		if(a!=null){
			List<Estado> listaEstadosT = a.getRegiao().getEstados(); 
			String relatorio = a.getNome() + " ";
			if(a instanceof Gato)
				relatorio += "(Gato) ";
			else if (a instanceof Cao)
				relatorio += "(Cao) ";
			else 
				relatorio += "(Desconhecido) ";
			relatorio += String.format("%.0f", a.getPeso()) + " Kg, ";
			relatorio += String.format("%.0f", a.velocidade()) + " Km/h, Força=";
			relatorio += String.format("%.0f", a.forca()) + ", Estados: ";
			if(listaEstadosT.isEmpty()){
				relatorio += "Desconhecido!";
			}
			else{
				for(int i=0; i < listaEstadosT.size(); i++){
					relatorio+=listaEstadosT.get(i).getSigla();
					if (i==listaEstadosT.size()-1)
						relatorio+=".";
					else
						relatorio+=", ";
				}
				System.out.println(relatorio);
			}
		}
	}

	//7
	public void mostraAnimaisSul(List<Animal> lista){
		for(Animal animal:lista){
			if(animal.getRegiao().getNome().equals("Região Sul")){
				List<Estado> listaEstadosT = animal.getRegiao().getEstados(); 
				String relatorio = animal.getNome() + " ";
				if(animal instanceof Gato)
					relatorio += "(Gato) ";
				else if (animal instanceof Cao)
					relatorio += "(Cao) ";
				else 
					relatorio += "(Desconhecido) ";
				relatorio += String.format("%.0f", animal.getPeso()) + " Kg, ";
				relatorio += String.format("%.0f", animal.velocidade()) + " Km/h, Força=";
				relatorio += String.format("%.0f", animal.forca()) + ", Estados: ";
				if(listaEstadosT.isEmpty()){
					relatorio += "Desconhecido!";
				}
				else{
					for(int i=0; i < listaEstadosT.size(); i++){
						relatorio+=listaEstadosT.get(i).getSigla();
						if (i==listaEstadosT.size()-1)
							relatorio+=".";
						else
							relatorio+=", ";
					}
					System.out.println(relatorio);
				}
			}
		}
	}

	//8
	public void mostraAnimaisRegiao(List<Animal> lista, Regiao regiao){
		for(Animal animal:lista){
			if(animal.getRegiao().equals(regiao)){
				List<Estado> listaEstadosT = animal.getRegiao().getEstados();
				String relatorio = animal.getNome() + " ";
				if(animal instanceof Gato)
					relatorio += "(Gato) ";
				else if (animal instanceof Cao)
					relatorio += "(Cao) ";
				else 
					relatorio += "(Desconhecido) ";
				relatorio += String.format("%.0f", animal.getPeso()) + " Kg, ";
				relatorio += String.format("%.0f", animal.velocidade()) + " Km/h, Força=";
				relatorio += String.format("%.0f", animal.forca()) + ", Estados: ";
				if(listaEstadosT.isEmpty()){
					relatorio += "Desconhecido!";
				}
				else{
					for(int i=0; i < listaEstadosT.size(); i++){
						relatorio+=listaEstadosT.get(i).getSigla();
						if (i==listaEstadosT.size()-1)
							relatorio+=".";
						else
							relatorio+=", ";
					}
					System.out.println(relatorio);	
				}
			}
		}
	}

}
