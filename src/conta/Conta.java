/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author rulli
 */
public class Conta {
private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

void deposita(double valor){
    this.saldo +=valor;
}
        
void atualiza(double taxa) {
this.saldo += this.saldo * (taxa/100);
}
}
