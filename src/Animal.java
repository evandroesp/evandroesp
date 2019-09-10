public abstract class Animal{
	
	private String nome;
	private float peso;
	private Regiao regiao; 

	public abstract float velocidade();
	
	public String getNome(){
		return nome;
	}

	public float getPeso() {
		return peso;
	}

	public Regiao getRegiao(){
		return regiao;
	}
	
	public float forca() {
		return getPeso()*velocidade();
	}
	
	public Animal(String n, float p){
		nome=n;
		peso=p;
	}
	
	public void setRegiao(Regiao reg){
		regiao = reg;
	}
}
	