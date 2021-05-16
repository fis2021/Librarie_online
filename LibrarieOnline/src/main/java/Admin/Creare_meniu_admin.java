package Admin;

public class Creare_meniu_admin {
	public void lista_carti()
	{
		Lista_carti_interfata listac=new Lista_carti_interfata();
		listac.setVisible(true);
		
	}
	public void lista_cereri()
	{
		Lista_cereri_interfata listac=new Lista_cereri_interfata();
		listac.setVisible(true);
		
	}
	public void actualizare()
	{
		Actualizare actual=new Actualizare();
		actual.setVisible(true);
	}
}
