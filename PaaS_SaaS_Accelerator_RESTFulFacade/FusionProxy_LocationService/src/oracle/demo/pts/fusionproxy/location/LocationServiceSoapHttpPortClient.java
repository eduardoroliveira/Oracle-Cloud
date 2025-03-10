package oracle.demo.pts.fusionproxy.location;

import com.sun.xml.ws.api.addressing.AddressingVersion;
import com.sun.xml.ws.api.addressing.WSEndpointReference;
import com.sun.xml.ws.developer.WSBindingProvider;
import com.sun.xml.ws.message.StringHeader;

import java.util.UUID;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

public class LocationServiceSoapHttpPortClient
{
  @WebServiceRef
  private static LocationService_Service locationService_Service;

  private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;

  public static void main(String [] args)
  {
    locationService_Service = new LocationService_Service();
    LocationService locationService = locationService_Service.getLocationServiceSoapHttpPort();
    // Get the request context to set the outgoing addressing properties
    WSBindingProvider wsbp = (WSBindingProvider)locationService;
    WSEndpointReference replyTo =
      new WSEndpointReference("http://<replace with the URL of the callback service>", WS_ADDR_VER);
    String uuid = "uuid:" + UUID.randomUUID();

    wsbp.setOutboundHeaders( new StringHeader(WS_ADDR_VER.messageIDTag, uuid), replyTo.createHeader(WS_ADDR_VER.replyToTag));

    // Add your code to call the desired methods.
  }
}
