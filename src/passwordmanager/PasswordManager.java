/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordmanager;

import java.util.Scanner;

/**
 *
 * @author renan
 */
import java.util.Scanner;
public class PasswordManager {

       public static void main(String[] args) {
        
    
       Scanner sc = new Scanner (System.in);
    
       Credential cred1 = new Credential();
       Credential cred2 = new Credential();
       Credential cred3 = new Credential();
   
       // set os dados da credencial
       cred1.setCredential("Gmail", "bella@gmail.com", "1322");
       cred2.setCredential("Istragram", "Alan90", "ramos1990");
       cred3.setCredential("Twitter","@alysont", "onepiece123");  
    
       // crie um vetor e adicione as credenciais
       Credential[] vault = new Credential[3];
       vault[0] = cred1;
       vault[1] = cred2;
       vault[2] = cred3;
    
       // procure pela credencial baseando-se no na pesquisa do usuario
        System.out.println("Which type of credential are you looking for?");
        String query = sc.next();
        
        // loop de busca
        for(int i=0; i<3; i++){
            for(int c=0; c<3; c++){
                
                //compare o input com as informacoes de cada credencial
          
                if(vault[i].getCredential()[c].equals(query)){
                  System.out.println("result: "+ vault[i].getInfo());
                }
            }  
       
        }

    }
}


class Credential{
    String description;
    String username;
    String password;
    
    //metodo para set
    public void setCredential(String desc, String uname, String pass){
        description = desc;
        username = uname;
        password = pass;
    }
    //metodo com vetor para pegar cada info em sua devida posicao
    public String[] getCredential(){
        String[] output = new String[]{description, username, password};
               return output;
    }
    //metodo para printar informacao completa de 1 registro
    public String getInfo(){
        String output = description + " : " + username + " : " + password;
        return output;
    }
}   