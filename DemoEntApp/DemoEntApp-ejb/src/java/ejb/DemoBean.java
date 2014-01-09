/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author mpwnage12
 */
@Stateless
public class DemoBean implements DemoBeanRemote {

    @Override
    public String Echo(String msg) {
        return msg;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    

}
