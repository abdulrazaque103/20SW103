/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        IDandPassword  idandPasswords =new IDandPassword();
        
        LoginPage loginPage=new LoginPage(idandPasswords.getLoginInfo());
    }
    
}
