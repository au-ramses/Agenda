/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Vector;
/**
 *
 * @author ramses
 */
public class Agenda {

     private Vector listaContatos;
     
     public Agenda(){
         listaContatos = new Vector();
     }
    
    public String adicionarContato(Contato novoContato){
        listaContatos.add(novoContato);
        return "Contato Cadastrado com sucesso !!";
    }
}
