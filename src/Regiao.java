import java.util.*;

public class Regiao {

	private String nome;
	private float tempMedia;
	
	private List<Estado> listaEstados;
	
	
	public Regiao(String n, float t){
	nome = n;
	tempMedia = t;
	listaEstados = new ArrayList<Estado>();
	}

	public String getNome() {
		return nome;
	}

	public float getTempMedia() {
		return tempMedia;
	}
	
	public List<Estado> getEstados(){
		return listaEstados;
	}

	public void incluiEstado(Estado e){
		if (e!=null)
			listaEstados.add(e);
	}

}
