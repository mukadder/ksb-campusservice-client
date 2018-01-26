
package org.kuali.rice.location.v2_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2018-01-21T16:05:37.310-05:00
 * Generated source version: 2.7.3
 * 
 */
public final class CampusService_CampusServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://rice.kuali.org/location/v2_0", "campusService");

    private CampusService_CampusServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CampusService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CampusService_Service ss = new CampusService_Service(wsdlURL, SERVICE_NAME);
        CampusService port = ss.getCampusServicePort();  
        
        {
        System.out.println("Invoking findAllCampusTypes...");
        org.kuali.rice.location.v2_0.FindAllCampusTypesResponse.CampusTypes _findAllCampusTypes__return = port.findAllCampusTypes();
        System.out.println("findAllCampusTypes.result=" + _findAllCampusTypes__return);


        }
        {
        System.out.println("Invoking getCampusType...");
        org.kuali.rice.location.v2_0.GetCampusType _getCampusType_parameters = null;
        try {
            org.kuali.rice.location.v2_0.GetCampusTypeResponse _getCampusType__return = port.getCampusType(_getCampusType_parameters);
            System.out.println("getCampusType.result=" + _getCampusType__return);

        } catch (RiceIllegalArgumentException e) { 
            System.out.println("Expected exception: RiceIllegalArgumentException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking findCampuses...");
        org.kuali.rice.core.v2_0.QueryByCriteriaType _findCampuses_query = null;
        try {
            org.kuali.rice.location.v2_0.CampusQueryResultsType _findCampuses__return = port.findCampuses(_findCampuses_query);
            System.out.println("findCampuses.result=" + _findCampuses__return);

        } catch (RiceIllegalArgumentException e) { 
            System.out.println("Expected exception: RiceIllegalArgumentException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking findAllCampuses...");
        org.kuali.rice.location.v2_0.FindAllCampusesResponse.Campuses _findAllCampuses__return = port.findAllCampuses();
        System.out.println("findAllCampuses.result=" + _findAllCampuses__return);


        }
        {
        System.out.println("Invoking findCampusTypes...");
        org.kuali.rice.core.v2_0.QueryByCriteriaType _findCampusTypes_query = null;
        try {
            org.kuali.rice.location.v2_0.CampusTypeQueryResultsType _findCampusTypes__return = port.findCampusTypes(_findCampusTypes_query);
            System.out.println("findCampusTypes.result=" + _findCampusTypes__return);

        } catch (RiceIllegalArgumentException e) { 
            System.out.println("Expected exception: RiceIllegalArgumentException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getCampus...");
        org.kuali.rice.location.v2_0.GetCampus _getCampus_parameters = null;
        try {
            org.kuali.rice.location.v2_0.GetCampusResponse _getCampus__return = port.getCampus(_getCampus_parameters);
            System.out.println("getCampus.result=" + _getCampus__return);

        } catch (RiceIllegalArgumentException e) { 
            System.out.println("Expected exception: RiceIllegalArgumentException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}