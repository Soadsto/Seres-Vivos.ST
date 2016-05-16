package seres.vivos;


public class TallaGrande extends VivenAgua {
    //Atributos
    Boolean tentaculos;
    Boolean manchas;
    Boolean trompa;
    
    //Constructor por default

    TallaGrande() {
	tentaculos=false;
	manchas=false;
	trompa=false;
    }
    
    //Constructor con parametros

    TallaGrande(Boolean tentaculos, Boolean manchas, Boolean trompa, Boolean caparazon, Boolean aletas, Boolean t_agua, Boolean comestible, Boolean veneno, Boolean reptiles, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) {
	super(caparazon, aletas, t_agua, comestible, veneno, reptiles, nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	
	this.tentaculos = tentaculos;
	this.manchas = manchas;
	this.trompa = trompa;
    }
    
    //Sets

    public void setTentaculos(Boolean tentaculos) {
	this.tentaculos = tentaculos;
    }

    public void setManchas(Boolean manchas) {
	this.manchas = manchas;
    }

    public void setTrompa(Boolean trompa) {
	this.trompa = trompa;
    }
    
    //Gets

    public Boolean getTentaculos() {
	return tentaculos;
    }

    public Boolean getManchas() {
	return manchas;
    }

    public Boolean getTrompa() {
	return trompa;
    }
    
    //		    Metodos
    public void Velocidad (int velocidad){
	System.out.println(getNombre()+" esta viajando a una velocidad de "+velocidad);
    }
    
    public void Coletear (){
	if ( getCola() == true){
	    System.out.println(getNombre()+" tiene cola, esta coleteando.");
	}
	
	else{
	    System.out.println(getNombre()+" no tiene cola, no puede coletear");
	}
    }
    
    public void OndasSonoras (){
	if ( getNombre().equals("Ballena") || getNombre().equals("Delfin")){
	    System.out.println("Como es una ballena, puede usar ondas sonoras para encontrar objetos frente a ella o a otros miembros de su especie");
	}
	
	else {
	    System.out.println(getNombre()+" no posee la habilidad para usar ondas sonoras.");
	}
    }
}
