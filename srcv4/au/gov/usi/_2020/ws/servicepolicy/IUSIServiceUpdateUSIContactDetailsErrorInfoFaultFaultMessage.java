
package au.gov.usi._2020.ws.servicepolicy;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-02-24T17:30:47.788+11:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "ArrayOfErrorInfo", targetNamespace = "http://usi.gov.au/2020/ws")
public class IUSIServiceUpdateUSIContactDetailsErrorInfoFaultFaultMessage extends Exception {

    private au.gov.usi._2020.ws.ArrayOfErrorInfo arrayOfErrorInfo;

    public IUSIServiceUpdateUSIContactDetailsErrorInfoFaultFaultMessage() {
        super();
    }

    public IUSIServiceUpdateUSIContactDetailsErrorInfoFaultFaultMessage(String message) {
        super(message);
    }

    public IUSIServiceUpdateUSIContactDetailsErrorInfoFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IUSIServiceUpdateUSIContactDetailsErrorInfoFaultFaultMessage(String message, au.gov.usi._2020.ws.ArrayOfErrorInfo arrayOfErrorInfo) {
        super(message);
        this.arrayOfErrorInfo = arrayOfErrorInfo;
    }

    public IUSIServiceUpdateUSIContactDetailsErrorInfoFaultFaultMessage(String message, au.gov.usi._2020.ws.ArrayOfErrorInfo arrayOfErrorInfo, java.lang.Throwable cause) {
        super(message, cause);
        this.arrayOfErrorInfo = arrayOfErrorInfo;
    }

    public au.gov.usi._2020.ws.ArrayOfErrorInfo getFaultInfo() {
        return this.arrayOfErrorInfo;
    }
}
