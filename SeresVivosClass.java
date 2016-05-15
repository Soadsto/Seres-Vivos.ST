
package seres.vivos;


public class SeresVivosClass {
   //Atributos de la clase
    private String nombre;
    private Boolean trespiracion; // true = pulmonar	    false = branqueas
    private String treproduccion;
    private String promvida;
    private String talimentacion;   
    private Boolean dormir;
    
    SeresVivosClass(){	//Constructor por default
        nombre = "Unknow";
	trespiracion= true;
	treproduccion= "Unknow";
	promvida= "Unknow";
        talimentacion = "Unknow";
    }
    
    SeresVivosClass(String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion){ //Constructores con parametros 
	this.nombre=nombre;
	this.trespiracion= true;
	this.treproduccion=treproduccion;
	this.promvida=promvida;
	this.talimentacion=talimentacion;
    }
    
    //Sets
    
    public void setNombre(String nombre){
	this.nombre=nombre;
    }
    
    public void setTrespiracion (Boolean trespiracion){
	this.trespiracion=trespiracion;
    }
    
    public void setTreproduccion (String treproduccion){
	this.treproduccion=treproduccion;
    }
    
    public void setPromvida (String promvida){
	this.promvida=promvida;
    }
    
    public void setTalimentacion (String talimentacion){
	this.talimentacion=talimentacion;
    }
    
    //Gets
    public String getNombre(){
	return nombre;
    }
     
    public Boolean getTrespiracion(){
	return trespiracion;
    }
    
    public String getTreproduccion(){
	return treproduccion;
    }
   
    public String getPromvida(){
	return promvida;
    }
    
    public String getTalimentacion(){
	return talimentacion;
    }
    

	    //Metodos 
    public void Respirar (Boolean trespiracion){    //Metodo para determinar su tipo de respiracion
	this.trespiracion=trespiracion;
	
	if (trespiracion == true){
	    System.out.println("El "+getNombre()+" tiene un tipo de respiracion pulmonar");
	}
	
	if (trespiracion == false){
	    System.out.println("El "+getNombre()+" tiene un tipo de respiracion mediante branqueas");
	}
    }
    
    public void Dormir	(Boolean dormir){
	this.dormir=dormir;
	
	if (dormir == true){
	    System.out.println(""+getNombre()+" esta durmiendo");
	}
	
	if (dormir == false){
	    System.out.println(""+getNombre()+" esta despierto");
	}
	
    }
    
    public void Comunicacion (){
	//Pendiente
    }
}
