package Client;
public class BookModel {
	private String titlu;
	private String descriere;
	private String autor;
	private String gen;
	private String an_aparitie;
	private String poza;
	
	public BookModel(String titlu, String descriere, String autor, String gen, String an_aparitie, String poza) {
		super();
		this.titlu = titlu;
		this.descriere = descriere;
		this.autor = autor;
		this.gen = gen;
		this.an_aparitie = an_aparitie;
		this.poza = poza;
	}
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getAn_aparitie() {
		return an_aparitie;
	}
	public void setAn_aparitie(String an_aparitie) {
		this.an_aparitie = an_aparitie;
	}
	public String getPoza() {
		return poza;
	}
	public void setPoza(String poza) {
		this.poza = poza;
	}
	
}
	