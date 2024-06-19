public class Persona
{
    private String nombre, correo;
    private int cedula, edad, telefono;
    private double altura;
    
    public Persona(){
    }
    
    public Persona(String nombre,String correo, int cedula, int edad, int telefono, double altura){
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.altura = altura;
    }

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie correo*/
    public String getCorreo(){
        return this.correo;
    }//end method getCorreo

    /**SET Method Propertie correo*/
    public void setCorreo(String correo){
        this.correo = correo;
    }//end method setCorreo

    /**GET Method Propertie cedula*/
    public int getCedula(){
        return this.cedula;
    }//end method getCedula

    /**SET Method Propertie cedula*/
    public void setCedula(int cedula){
        this.cedula = cedula;
    }//end method setCedula

    /**GET Method Propertie edad*/
    public int getEdad(){
        return this.edad;
    }//end method getEdad

    /**SET Method Propertie edad*/
    public void setEdad(int edad){
        this.edad = edad;
    }//end method setEdad

    /**GET Method Propertie telefono*/
    public int getTelefono(){
        return this.telefono;
    }//end method getTelefono

    /**SET Method Propertie telefono*/
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }//end method setTelefono

    /**GET Method Propertie altura*/
    public double getAltura(){
        return this.altura;
    }//end method getAltura

    /**SET Method Propertie altura*/
    public void setAltura(double altura){
        this.altura = altura;
    }//end method setAltura
}