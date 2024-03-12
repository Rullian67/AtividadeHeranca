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
public class ContaPoupanca extends Conta{
    
    void atualiza(double taxa) {
           super.atualiza(taxa * 3);
}
}
