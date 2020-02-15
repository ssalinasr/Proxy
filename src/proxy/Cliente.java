/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Cliente {
    
    public static void main(String[] args) {
        System.out.println("Valor moneda:");
        Scanner l = new Scanner (System.in);
        double mon = l.nextDouble();
        ServicioCambioProxy prox = new ServicioCambioProxy();
        prox.setMoneda(mon);
        prox.ValidezEjecucion();
    }
    
}
