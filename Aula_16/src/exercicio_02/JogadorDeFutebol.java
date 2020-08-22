package exercicio_02;

public class JogadorDeFutebol {

	private String nome;
	private Integer energia;
	private Integer alegria;
	private Integer gols;
	private Integer experiencia;
	
	public JogadorDeFutebol() {
		
	}
	public JogadorDeFutebol(String nome, Integer energia, Integer alegria, Integer gols, Integer experiencia) {
		this.nome = nome;
		this.energia = energia;
		this.alegria = alegria;
		this.gols = gols;
		this.experiencia = experiencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getEnergia() {
		return energia;
	}
	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	public Integer getAlegria() {
		return alegria;
	}
	public void setAlegria(Integer alegria) {
		this.alegria = alegria;
	}
	public Integer getGols() {
		return gols;
	}
	public void setGols(Integer gols) {
		this.gols = gols;
	}
	public Integer getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}
	
	public String fazerGol(Integer gols) {
		this.gols = gols;
		if (gols < 1) {
			System.out.println("Goooolll!");
			gols = gols +1;
			energia = energia - 5; 
			alegria = alegria + 10;
			
			System.out.println("Goooooollll!!!" + gols + energia + " de energia " + alegria + " de alegria!!!");
		}
		return ("Goooooollll!!!" + gols + energia + " de energia " + alegria + " de alegria!!!");
				
	}
	@Override
	public String toString() {
		return "\n-------JogadorDeFutebol-----\n[nome=" + nome + ", energia=" + energia + ", alegria=" + alegria + ", gols=" + gols
				+ ", experiencia=" + experiencia + "]";
	}
	public String getNome(JogadorDeFutebol i) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEnergia(JogadorDeFutebol i) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getAlegria(JogadorDeFutebol i) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getGols(JogadorDeFutebol i) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getExperiencia(JogadorDeFutebol i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
