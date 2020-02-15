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
public class ServicioCambioImpl implements ServicioCambio {

    public boolean isExe() {
        return exe;
    }

    public void setExe(boolean exe) {
        this.exe = exe;
    }
    
    private boolean exe;
    
    /**
     * Clase de comversion de moneda, además
     * activa el permiso de transacción de acuerdo a la validez de la moneda
     * convirtiendola y haciendo posible el paso siguiente
     */
    public ServicioCambioImpl(){
        this.exe = false;
    }
    
    /**
     * Cambio pesos a dolares
     * @param pesos
     * @return 
     */
    @Override
    public double cambioDolares(double pesos) {
        double res = pesos*0.00030;
        System.out.println("Cambio a dolares realizado...");
        System.out.println(res);
        this.exe = true;
        return (res);
      
    }

    /**
     * cambio pesos a Euros
     * @param pesos
     * @return 
     */
    @Override
    public double cambioEuros(double pesos) {
        double res = pesos*0.00027;
        System.out.println("Cambio a Euros realizado...");
        System.out.println(res);
        this.exe = true;
        return res;
    }
    
 
}
