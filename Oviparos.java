

package seres.vivos;


public class Oviparos extends Animales {
   
    //Atributos
    private Boolean comestible;
    private Boolean veneno;
    private Boolean reptiles;
    
    //Contructor con parmetros
    Oviparos(Boolean comestible, Boolean veneno, Boolean reptiles, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) {
	super(nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	
	this.comestible = comestible;
	this.veneno = veneno;
	this.reptiles = reptiles;
    }
    
    //Contructor por default  
    Oviparos() {
	this.comestible = comestible;
	this.veneno = veneno;
	this.reptiles = reptiles;
    }
  
    //	Sets
    
    public void setComestible (Boolean comestible){
	this.comestible=comestible;
    }
    
    public void setVeneno (Boolean veneno){
	this.veneno=veneno;
    }
    
    public void setReptiles (Boolean reptiles){
	this.reptiles=reptiles;
    }
    
    // Gets 

    public Boolean getComestible() {
	return comestible;
    }

    public Boolean getVeneno() {
	return veneno;
    }

    public Boolean getReptiles() {
	return reptiles;
    }
    
    //		Metodos
    public void Esconder (){
	System.out.println(getNombre()+" se esta escondiendo.");
    }
    
    public void Empollar (){
	System.out.println(getNombre()+" esta empollando sus huevos");
    }
    
    public void Migar (){
	System.out.println(getNombre()+" esta migrando.");
    }
}


