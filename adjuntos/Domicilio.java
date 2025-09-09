// Clase Domicilio

public class Domicilio{
    private String calle;
    private int numero;

  public Domicilio(String calle, int numero){
    if (calle != null && !calle.trim().isEmpty()){
      this.calle = calle;
    }
    if (numero > 0) {
      this.numero = numero;
    }
  }
public boolean esCompleto(){
  if (!calle.isEmpty() && numero > 0)
    return true;
  else
    return false;
}
  @Override
  public String toString() {
    return calle + " " + numero;
  } 
}

public class Persona{

  private String nomber;
  private int edad;
  private String dni;
  private char sexo;
  private double peso;
  private double altura;
  private Domicilio domicilio;

  public Persona(String nombre){
    if(nombre != null && !nombre.trim().isEmpty()){
      this.nombre = nombre;
    }
    this.domicilio = new Domicilio("", 0);
  }
  public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura, Domicilio domicilio){
    if (nombre != null && !nombre.trim().isEmpty()){
      this.nombre = nombre;
    }
    if (edad > = 0){
      this.edad = edad;
    }
    if (dni != null && !dni.trim().isEmpty()){
      this.dni = dni;
    }
    if (comprobarSexo(sexo)){
      this.sexo = sexo;
    }
    if (peso >= 0){
      this.peso = peso;
    }
    if (altura >= 0){
      this.altura = altura;
    }
    // asigna el objeto completo
    this.domicilio = domicilio;
  }
  public boolean esMayorDeEdad(){
    if(edad >= 18){
      return true;
      else
      return false;
    }
    return esMayordeEdad; 
  }
  private 
}
