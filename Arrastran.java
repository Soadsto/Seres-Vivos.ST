
package seres.vivos;


public class Arrastran extends Viviparos {
    //Atributos	   
    private Boolean colmillo;
    private Boolean veneno;
    private int longitud;

    //Constructor por default
    Arrastran() {
	super();
	colmillo = false;
	veneno = false;
	longitud= 0;
    }
    
    //Constructor con parametros
    public Arrastran(Boolean colmillo, Boolean veneno, int longitud, boolean domestico, String habitat, boolean fertilidad, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) {
	super(domestico, habitat, fertilidad, nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	this.colmillo = colmillo;
	this.veneno = veneno;
	this.longitud = longitud;
    }
    
    //Sets 
    
    public void setColmillo (Boolean colmillo){
	this.colmillo=colmillo;
    }
    
    public void setVeneno (Boolean veneno){
	this.veneno=veneno;
    }
    
    public void setLongitud (int longitud){
	this.longitud=longitud;
    }
    
    //Gets
    
    public Boolean getColmillo (){
	return colmillo;
    }
    
    public Boolean getVeneno (){
	return veneno;
    }
    
    public int getLongitud (){
	return longitud;
    }
    
    //		Metodos
    
    public void MudarPiel (){
	if (colmillo == true){
	    if (veneno == true){
		System.out.println(getNombre()+" puede mudar de piel.");
	    }
	}
	else
	    System.out.println(getNombre()+"No puede mudar de piel");
    }
    
    public void Nadar (){
	System.out.println(getNombre()+" esta nadando");
    }
    
    public void Trepar (){
	System.out.println(getNombre()+" esta trepando");
    }
}
