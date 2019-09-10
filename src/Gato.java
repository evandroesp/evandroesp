
public class Gato extends Animal{

	public Gato(String n, float p) {
		super(n, p);
		// TODO Auto-generated constructor stub
	}

	public float velocidade() {
		if(getRegiao().getTempMedia()<20)
			return 30;
		else
			return 40;
	}



}
