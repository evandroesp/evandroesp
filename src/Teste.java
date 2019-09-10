import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		//2
		Regiao regiaoSul = new Regiao("Região Sul", 15);
		Estado rs = new Estado("RS");
		Estado sc = new Estado("SC");
		Estado pr = new Estado("PR");
		regiaoSul.incluiEstado(rs);
		regiaoSul.incluiEstado(sc);
		regiaoSul.incluiEstado(pr);

		Regiao regiaoNorte = new Regiao("Região Norte", 30);
		Estado am = new Estado("AM");
		Estado pa = new Estado("PA");
		Estado rr = new Estado("RR");
		regiaoNorte.incluiEstado(am);
		regiaoNorte.incluiEstado(pa);
		regiaoNorte.incluiEstado(rr);

		//3
		Animal rex1 = new Cao("Rex 1", 10);
		Animal rex2 = new Cao("Rex 2", 20);
		Animal rex3 = new Cao("Rex 3", 30);
		rex1.setRegiao(regiaoSul);
		rex2.setRegiao(regiaoSul);
		rex3.setRegiao(regiaoSul);

		Animal mimi1 = new Gato("Mimi 1", 1);
		Animal mimi2 = new Gato("Mimi 2", 2);
		Animal mimi3 = new Gato("Mimi 3", 3);
		mimi1.setRegiao(regiaoSul);
		mimi2.setRegiao(regiaoSul);
		mimi3.setRegiao(regiaoSul);

		Animal rex4 = new Cao("Rex 4", 14);
		Animal rex5 = new Cao("Rex 5", 15);
		Animal rex6 = new Cao("Rex 6", 16);
		rex4.setRegiao(regiaoNorte);
		rex5.setRegiao(regiaoNorte);
		rex6.setRegiao(regiaoNorte);

		Animal mimi4 = new Gato("Mimi 4", 4);
		Animal mimi5 = new Gato("Mimi 5", 5);
		Animal mimi6 = new Gato("Mimi 6", 6);
		mimi4.setRegiao(regiaoNorte);
		mimi5.setRegiao(regiaoNorte);
		mimi6.setRegiao(regiaoNorte);

		//4
		List<Animal> listaAnimais = new ArrayList<Animal>();
		listaAnimais.add(rex1);
		listaAnimais.add(rex2);
		listaAnimais.add(rex3);
		listaAnimais.add(mimi1);
		listaAnimais.add(mimi2);
		listaAnimais.add(mimi3);
		listaAnimais.add(rex4);
		listaAnimais.add(rex5);
		listaAnimais.add(rex6);
		listaAnimais.add(mimi4);
		listaAnimais.add(mimi5);
		listaAnimais.add(mimi6);

		//5
		//List<Animal> listaVazia = new ArrayList<Animal>();

		System.out.println("\n5");
		if(listaAnimais.isEmpty()){
			System.out.println("Lista Vazia!");
		}
		else{
			for(Animal animal:listaAnimais){
				List<Estado> listaEstadosT = animal.getRegiao().getEstados(); 
				//List<Estado> listaEstadosT = new ArrayList<>();
				String relatorio = animal.getNome() + " ";
				if(animal instanceof Gato)
					relatorio += "(Gato), ";
				else if (animal instanceof Cao)
					relatorio += "(Cao), ";
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
				}
				System.out.println(relatorio);
			}
		}

		//6
		System.out.println("\n6");
		TelaAnimal telaAnimal = new TelaAnimal();
		telaAnimal.mostraAnimal(rex1);
		telaAnimal.mostraAnimal(rex4);
		telaAnimal.mostraAnimal(mimi2);
		telaAnimal.mostraAnimal(mimi6);

		//7
		System.out.println("\n7");
		telaAnimal.mostraAnimaisSul(listaAnimais);

		//8
		System.out.println("\n8");
		telaAnimal.mostraAnimaisRegiao(listaAnimais,regiaoNorte);

		//9
		System.out.println("\n9");
		
		Animal rexDino = new Cao("Dino Rex", 10);
		/*
		Regiao regiaoSudeste = new Regiao("Região Sudeste", 10);
		Estado sp = new Estado("SP");
		Estado mg = new Estado("MG");
		Estado rj = new Estado("RJ");
		regiaoSudeste.incluiEstado(sp);
		regiaoSudeste.incluiEstado(mg);
		regiaoSudeste.incluiEstado(rj);
		rexDino.setRegiao(regiaoSudeste);
		*/
		Regiao polarQuente = new Regiao("Região Polar Quente", 10);
		rexDino.setRegiao(polarQuente);
		
		Regiao regiaoNordeste = new Regiao("Região Nordeste", 40);
		Estado ma = new Estado("MA");
		Estado rn = new Estado("RN");
		Estado to = new Estado("TO");
		regiaoNordeste.incluiEstado(ma);
		regiaoNordeste.incluiEstado(rn);
		regiaoNordeste.incluiEstado(to);
		Animal mimosa = new Gato("Mimosa", 1);
		mimosa.setRegiao(regiaoNordeste);

		listaAnimais.add(rexDino);
		listaAnimais.add(mimosa);

		if(listaAnimais.isEmpty()){
			System.out.println("Lista Vazia!");
		}
		else{
			for(Animal animal:listaAnimais){
				List<Estado> listaEstadosT = animal.getRegiao().getEstados(); 
				//List<Estado> listaEstadosT = new ArrayList<>();
				String relatorio = animal.getNome() + " ";
				if(animal instanceof Gato)
					relatorio += "(Gato), ";
				else if (animal instanceof Cao)
					relatorio += "(Cao), ";
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
				}
				System.out.println(relatorio);
			}
		}
	}
}



