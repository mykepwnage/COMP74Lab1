/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author mpwnage12
 */
@Remote
public interface DemoBeanRemote {

    String Echo(String msg);
    
}
