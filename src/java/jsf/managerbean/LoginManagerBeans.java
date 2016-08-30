/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managerbean;

import javax.faces.bean.ManagedBean;



/**
 *
 * @author admin
 */
@ManagedBean
public class LoginManagerBeans {
    
    private String login;
    private String mdp;
    
    public String identification(){
        System.out.println("Login: " + login + " Mdp: " + mdp);
        return "login.xhtml";
    }
    
    public String admin(){
        if(login.equals("admin") && mdp.equals("admin"))
        return "_TEMPLATE2.xhtml";
        
        return "login.xhtml";
     
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    
    
    
    
}
