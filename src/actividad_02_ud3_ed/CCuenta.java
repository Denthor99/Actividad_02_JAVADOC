/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * Clase con visibilidad publica
 * @author Daniel Alfonso Rodriguez Santos
 * @version 1.2
 */
public class CCuenta {
/**
 * Declaracion de campos. Visibilidad restringida a la clase y al paquete
 */

     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  /**
   * Metodo constructor sin parametros
   */
    public CCuenta ()
    {
    }
   /**
    * Metodo constructor con parametros de esta clase
    * @param nom Nombre del titular de la cuenta
    * @param cue Cuenta del titular
    * @param sal Saldo de la cuuenta del titular
    * @param tipo El tipo de interes que tiene el titular
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * Metodo que asigna el campo nombre al parametro nom
   * @param nom 
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    
    /**
     * Metodo que nos devuelve el valor del campo nombre
     * @return nombre 
     */
    public String obtenerNombre()
    {
        return nombre;
    }
    
    /**
     * Metodo que nos devuelve el valor del campo saldo
     * @return saldo 
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     * Metodo donde el usuario debe introducir un parametro de tipo double para realizar una acción, que en este caso es aumentar el campo saldo
     * @param cantidad
     * @throws Exception 
     * La excepcion nos indicará que el valor que hemos introducido en el paramtero cantidad es negativo, por lo que el metodo se detendrá si no se cumple la condición
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * Metodo donde el usuario debe introducir un parametro de tipo double para realizar una acción, que en este caso sería decrementar el campo saldo
    * @param cantidad
    * @throws Exception
    * Las excepciones nos indicaran que si el valor de cantidad es negativo y el valor de cantidad sea mayor que el del metodo estado (que contiene el valor del campo saldo), no se puede continuar con el metodo
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * Metodo que nos devuelve el valor del campo cuenta
     * @return cuenta 
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }
    
  /**
   * Metodo setter que nos permite trabajar con el campo cuenta en otra clase
   * @param cuenta 
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Metodo setter que nos permite trabajar con el campo saldo en otra clase
   * @param saldo 
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  /**
   * Metodo getter que nos permite trabajar con el campo tipoInteres en otra clase
   * @return tipoInterés
   */
 
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * Metodo setter que nos permite trabajar con el campo tipoInteres en otra clase
   * @param tipoInterés 
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
