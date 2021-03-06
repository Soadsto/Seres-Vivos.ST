
package seres.vivos;


public class Vuelan extends Viviparos {
    //Atributos
    private Boolean alas;
    private Boolean plumas;
    private int altura_vuelan;

    Vuelan(Boolean alas, Boolean plumas, int altura_vuelan, boolean domestico, String habitat, boolean fertilidad, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) {	//Constructor con parametros
	super(domestico, habitat, fertilidad, nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	this.alas = alas;
	this.plumas = plumas;
	this.altura_vuelan = altura_vuelan;
    }

    Vuelan() {	    //Constructor por default
	alas = false;
	plumas= false;
	altura_vuelan = 0;
    }
    
    //Sets
    public void setAlas (Boolean alas){
	this.alas=alas;
    }
    
    public void setPlumas (Boolean plumas){
	this.plumas=plumas;
    }
    
    public void setAltura_vuelan (int altura_vuelan){
	this.altura_vuelan=altura_vuelan;
    }
    
    //Gets 
    public Boolean getAlas (){
	return alas;
    }
    
    public Boolean getPlumas (){
	return plumas;
    }
    
    public int setAltura_vuelan (){
	return altura_vuelan;
    }
    
    //		Metodos
    
    public void Planear (){
	if (alas == true ){
	    System.out.println(getNombre()+" debido a que posee alas, puede planear.");
	}
	else 
	    System.out.println(getNombre()+" debido a que NO posee alas, no puede planear.");
    }
    
    public void Pescar (){
     if (alas == true){
	 if (getJerarquia_cadal() == true ){
	    System.out.println(getNombre()+" es un depredador y puede volar, por lo tanto puede pescar.");
	}
	 else 
	     System.out.println(getNombre()+" no es un depredador, a pesar de que puede volar, no puede pescar");
      }
	
    }
    
    public void Cantar (){
	System.out.println(getNombre()+" esta cantando.");
    }
}
