/*
* pakage java de base
*/

public class Test {
	private String nom ;
	private String prenom ;
	private int age ;
	private char sexe;


	public void Test(){
		//contructeur de la classe
	}
	// autres methodes et fonction

	// definition des getteurs des attributs
	public int getAge(){
		return this.age;
	}
	public String getNom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.prenom ;
	}
	publi char getSexe(){
		return this.sexe;
	}

	// les setteurs des attributs
	public void setNom(String nom){
		this.nom = nom;
	}
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	public void setAge( int age){
		this.age = age ;
	}
	public void setSexe(char sexe){
		this.sexe = sexe ;
	}
}