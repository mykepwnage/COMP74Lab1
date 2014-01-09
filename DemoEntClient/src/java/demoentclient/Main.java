/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demoentclient;

import ejb.DemoBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author mpwnage12
 */
public class Main {
    @EJB
    private static DemoBeanRemote demoBean;

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(demoBean.Echo("Hello COMP 74"));
    }
}
