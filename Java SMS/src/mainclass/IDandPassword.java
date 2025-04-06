/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;
import java.util.HashMap;

class IDandPassword {
    
    HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPassword(){
		
		logininfo.put("Razaque","school");
		
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}
