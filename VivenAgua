
package seres.vivos;


public class VivenAgua extends Oviparos{
    //Atributos
    private Boolean caparazon;
    private Boolean aletas;
    private Boolean t_agua; //true = agua salada, false= agua dulce
    
    //Constructor con parametros

    VivenAgua(Boolean caparazon, Boolean aletas, Boolean t_agua, Boolean comestible, Boolean veneno, Boolean reptiles, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) {
	
	super(comestible, veneno, reptiles, nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	
	this.caparazon = caparazon;
	this.aletas = aletas;
	this.t_agua = t_agua;
    }
    
    //Constructor por default

    VivenAgua() {
	caparazon = false;
	aletas = false;
	t_agua = false;
    }
    
    //Sets
    
    public void setCaparazon(Boolean caparazon) {
	this.caparazon = caparazon;
    }

    public void setAletas(Boolean aletas) {
	this.aletas = aletas;
    }

    public void setT_agua(Boolean t_agua) {
	this.t_agua = t_agua;
    }
    
    //Gets

    public Boolean getCaparazon() {
	return caparazon;
    }

    public Boolean getAletas() {
	return aletas;
    }

    public Boolean getT_agua() {
	return t_agua;
    }
    
    //	    Metodos
    
    public void Nadar (){
	if (aletas == true ){
		   System.out.println(getNombre()+" puede nadar, tiene aletas que se lo periten");
	}
	
	else{
	    System.out.println("Debido que "+getNombre()+"no posee aletas no puede nadar");
	}
    }
    
    public void Respirar (){
	if (t_agua == false || caparazon == true || getTrespiracion() == false ){
	    System.out.println(getNombre()+" puede respirar momentaneamente fuera del agua.");
	}
	
	else {
	    System.out.println(getNombre()+" no puede respirar fuera del agua");
	}
    }
    
    public void Camuflajear(){
	if (t_agua == true || getTrespiracion() == false){
	    System.out.println(getNombre()+" puede camuflajearse.");
	}
	else{
	    System.out.println(getNombre()+" no tiene la habilidad de camuflajearse.");
	}
    }
    
}
