/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YANEZ
 */
public class operaciones {
    
    private double valor,total;
    private int monedas, monedasfinal;
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public int getMonedasfinal() {
        return monedasfinal;
    }

    public void setMonedasfinal(int monedasfinal) {
        this.monedasfinal = monedasfinal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public operaciones() {
    }

 public double convertir(){
     
     
     if(monedas == 0 && monedasfinal==1)
         
         total= valor * 24.5;
         
     
     return total;
      
 }

}  