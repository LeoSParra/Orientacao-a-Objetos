/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

/**
 *
 * @author leo
 */
public class Cliente {
    
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;
    
    public Cliente (int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void realizaDeposito (float deposito) {
        this.saldo += saldo;
    }
    
    public void realizaSaque (float saque) {
        if (saque > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
        this.saldo -= saque;
        }
    }
    
    public void mostraDados (){
        System.out.println("Dados: " + this.numeroConta + this.numeroAgencia + this.nome + this.saldo);
    }
    
}
