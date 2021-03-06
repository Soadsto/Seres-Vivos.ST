
package seres.vivos;


public class Viviparos extends Animales {
    //Atributos
    private boolean domestico;
    private String habitat;
    private boolean fertilidad;
    
    Viviparos (){	//Constructor por default
	super();
	domestico=false;
	fertilidad=false;
	habitat="Unknow";
    }

    public Viviparos(boolean domestico, String habitat, boolean fertilidad, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) { //Constructor con parametros
	super(nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	this.domestico = domestico;
	this.habitat = habitat;
	this.fertilidad = fertilidad;
    }
 
    //Sets 
    
    public void setDomestico (Boolean domestico){
	this.domestico=domestico;
    }
    
    public void setFertilidad (Boolean fertilidad){
	this.fertilidad=fertilidad;
    }
    
    public void setHabitat (String habitat){
	this.habitat=habitat;
    }
    
    //Gets
    public Boolean getDomestico (){
	return domestico;
    }
    
    public Boolean getFertilidad (){
	return domestico;
    }
    
    public String getHabitat(){
	return habitat;
    }
    
    //	    Metodods
    public void Amamantar (){
	System.out.println(getNombre()+" esta amamantando a su cria.");
    }
    
    public void Comunicar (){
	System.out.println(getNombre()+" se esta comunicando.");
    }
    
    public void Cortejar (){
	if (fertilidad == true){
	    System.out.println("Debido a que "+getNombre()+" esta en su periodo de fertilidad esta cortejando.");
	}
	
	else 
	    System.out.println("Debido a que "+getNombre()+" NO esta en su periodo de fertilidad no esta interesado en estar cortejando.");
    }
}