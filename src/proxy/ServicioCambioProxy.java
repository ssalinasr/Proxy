/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author sebas
 */
public class ServicioCambioProxy extends ServicioCambioImpl{
    
    private ServicioCambioImpl sc;
    private double moneda;
    
    public ServicioCambioProxy(){
        this.sc = new ServicioCambioImpl();
    }

    public double getMoneda() {
        return moneda;
    }

    public void setMoneda(double moneda) {
        this.moneda = moneda;
    }
     /**
      * Función del proxy:
      * Establece la validez de la moneda, si es correcta
      * ejecuta la conversión y permite los pagos internacionales
      * de lo contrario no sucede nada
      */     
    public void ValidezEjecucion(){
        if(this.moneda >= 0){
            sc.cambioDolares(this.getMoneda());
            sc.cambioEuros(this.getMoneda());
            System.out.println("...");
            System.out.println("Proceso Realizado con éxito");
            if(sc.isExe()){
                System.out.println("...");
                System.out.println("Ahora puede realizar transacciones internacionales");
            }
            else{
                System.out.println("...");
                System.out.println("Transacciones internacioneales imposibles");
            }
        }
        else{
            System.out.println("Error: El valor moneda no es válido");
        }
    }
   
}
