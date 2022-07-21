package Entidades;

public class Sorvete {

	private long id;
	private String nome;
	private String descricaoIngr;
	private String dataFab;
	private String dataVal;
	private int quantidade;
	private String tipo;
	private String alergicos;

	
	public Sorvete() {
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricaoIngr() {
		return descricaoIngr;
	}
	public void setDescricaoIngr(String descricaoIngr) {
		this.descricaoIngr = descricaoIngr;
	}


	public String getDataFab() {
		return dataFab;
	}
	public void setDataFab(String dataFab) {
		this.dataFab = dataFab;
	}


	public String getDataVal() {
		return dataVal;
	}
	public void setDataVal(String dataVal) {
		this.dataVal = dataVal;
	}


	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getAlergicos() {
		return alergicos;
	}
	public void setAlergicos(String alergicos) {
		this.alergicos = alergicos;
	}
}
