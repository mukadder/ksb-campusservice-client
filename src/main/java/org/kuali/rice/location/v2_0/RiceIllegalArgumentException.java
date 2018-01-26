
package org.kuali.rice.location.v2_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.3
 * 2018-01-21T16:05:37.352-05:00
 * Generated source version: 2.7.3
 */

@WebFault(name = "IllegalArgumentFault", targetNamespace = "http://rice.kuali.org/core/v2_0")
public class RiceIllegalArgumentException extends Exception {
    
    private org.kuali.rice.core.v2_0.IllegalArgumentFault illegalArgumentFault;

    public RiceIllegalArgumentException() {
        super();
    }
    
    public RiceIllegalArgumentException(String message) {
        super(message);
    }
    
    public RiceIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public RiceIllegalArgumentException(String message, org.kuali.rice.core.v2_0.IllegalArgumentFault illegalArgumentFault) {
        super(message);
        this.illegalArgumentFault = illegalArgumentFault;
    }

    public RiceIllegalArgumentException(String message, org.kuali.rice.core.v2_0.IllegalArgumentFault illegalArgumentFault, Throwable cause) {
        super(message, cause);
        this.illegalArgumentFault = illegalArgumentFault;
    }

    public org.kuali.rice.core.v2_0.IllegalArgumentFault getFaultInfo() {
        return this.illegalArgumentFault;
    }
}
