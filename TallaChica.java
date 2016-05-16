package seres.vivos;


public class TallaChica extends VivenAgua {
    //Atribuos 
    Boolean pinzas;
    String dureza;
    Boolean manada;
    
    //Constructor

    public TallaChica() {
	pinzas = false;
	dureza = "Unknow";
	manada =false;
    }
    
    //Constructor con parametros

    public TallaChica(Boolean pinzas, String dureza, Boolean manada, Boolean caparazon, Boolean aletas, Boolean t_agua, Boolean comestible, Boolean veneno, Boolean reptiles, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) {
	super(caparazon, aletas, t_agua, comestible, veneno, reptiles, nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	
	this.pinzas = pinzas;
	this.dureza = dureza;
	this.manada = manada;
    }
    //Sets

    public void setPinzas(Boolean pinzas) {
	this.pinzas = pinzas;
    }

    public void setDureza(String dureza) {
	this.dureza = dureza;
    }

    public void setManada(Boolean manada) {
	this.manada = manada;
    }
    
    //Gets

    public Boolean getPinzas() {
	return pinzas;
    }

    public String getDureza() {
	return dureza;
    }

    public Boolean getManada() {
	return manada;
    }
    
    //		Metodos
    
    public void LuzPropia(){
	System.out.println(getNombre()+" esta generando su propia luz");
    }
    
    public void mordisco(){
	if (getJerarquia_cadal() == true){
	    System.out.println(getNombre()+" es un depredador, puede soltar mordiscos");
	}
	
	else {
	    System.out.println(getNombre()+" no es un depredador, no suelta mordiscos");
	}
    }
    
    public void Bucear (){
	if (getAletas() == true){
	    System.out.println(getNombre()+" esta buceando.");
	}
	
	else{
	    System.out.println(getNombre()+" no puede bucear.");
	}
    }
}

