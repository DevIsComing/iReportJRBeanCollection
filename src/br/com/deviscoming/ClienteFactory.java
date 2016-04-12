/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deviscoming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author renan.ramos
 */
public class ClienteFactory {
   public static Collection getCliente(){      
      return setCliente();
  }      
    
   private static Collection setCliente() {
       List<Cliente> clientes = new ArrayList();
       
       Cliente c1 = new Cliente();
       c1.setId(1);
       c1.setNome("Fulano da Silva");
       c1.setEndereco("Rua das Acácias");
       c1.setCidade("São Paulo");
       c1.setEstado("São Paulo");
       
       clientes.add(c1);
       
       Cliente c2 = new Cliente();
       c2.setId(2);
       c2.setNome("Beltrano da Silva");
       c2.setEndereco("Avenida Ipanema");
       c2.setCidade("Rio de Janeiro");
       c2.setEstado("Rio de Janeiro");
       
       clientes.add(c2);       
       
       return clientes;
    }   
}
