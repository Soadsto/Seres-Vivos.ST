package seres.vivos;


public class VivenTierra extends Oviparos {
    //Atributos
    Boolean pico;
    Boolean uñas;
    Boolean nido;
    Boolean patas;
    
    //Constructor

    VivenTierra() {
    pico = false;
    uñas = false;
    nido = false;
    patas = false;
    }
    
    //Constructor con parametros

    VivenTierra(Boolean pico, Boolean patas, Boolean uñas, Boolean nido, Boolean comestible, Boolean veneno, Boolean reptiles, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) {
	super(comestible, veneno, reptiles, nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	this.pico = pico;
	this.uñas = uñas;
	this.nido = nido;
	this.patas = patas;
    }
    
    //Sets

    public void setPico(Boolean pico) {
	this.pico = pico;
    }

    public void setUñas(Boolean uñas) {
	this.uñas = uñas;
    }

    public void setNido(Boolean nido) {
	this.nido = nido;
    }
    
    //Gets

    public Boolean getPico() {
	return pico;
    }

    public Boolean getUñas() {
	return uñas;
    }

    public Boolean getNido() {
	return nido;
    }
    
    //	   Metodos
    
    public void CNidos(){
	if (uñas == true || pico == true){
	    System.out.println(getNombre()+" puede construir nidos debido a que posee pico y uñas que se lo permiten.");
	}
	else{
	    System.out.println("Debido a que "+getNombre()+" no posee ni pico ni garras no puede construir un nido.");
	}
	    
    }
    
    public void Crecer(){
	System.out.println(getNombre()+" puede crecer.");
    }
    
    public void Correr(){
	if (patas == true){
	    System.out.println(getNombre()+" es una especie que puede correr.");
	}
	else{
	    System.out.println(getNombre()+" no es una especie que pueda correr");
	}
    }
    
    
}
