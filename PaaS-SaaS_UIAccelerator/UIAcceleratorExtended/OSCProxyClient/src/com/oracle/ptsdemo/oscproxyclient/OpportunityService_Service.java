package com.oracle.ptsdemo.oscproxyclient;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="https://my-oraclesalescloud.com/opptyMgmtOpportunities/OpportunityService?wsdl",
  targetNamespace="http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/",
  name="OpportunityService")
public class OpportunityService_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("com.oracle.ptsdemo.oscproxyclient.OpportunityService_Service");
      URL baseUrl = OpportunityService_Service.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            OpportunityService_Service.class.getResource("https://my-oraclesalescloud.com/opptyMgmtOpportunities/OpportunityService?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "https://my-oraclesalescloud.com/opptyMgmtOpportunities/OpportunityService?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "https://my-oraclesalescloud.com/opptyMgmtOpportunities/OpportunityService?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using https://my-oraclesalescloud.com/opptyMgmtOpportunities/OpportunityService?wsdl",
          e);
    }
  }

  public OpportunityService_Service()
  {
    super(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/",
                    "OpportunityService"));
  }

  public OpportunityService_Service(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="OpportunityServiceSoapHttpPort")
  public com.oracle.ptsdemo.oscproxyclient.OpportunityService getOpportunityServiceSoapHttpPort()
  {
    return (com.oracle.ptsdemo.oscproxyclient.OpportunityService) super.getPort(new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/",
                                                                                          "OpportunityServiceSoapHttpPort"),
                                                                                com.oracle.ptsdemo.oscproxyclient.OpportunityService.class);
  }

  @WebEndpoint(name="OpportunityServiceSoapHttpPort")
  public com.oracle.ptsdemo.oscproxyclient.OpportunityService getOpportunityServiceSoapHttpPort(WebServiceFeature... features)
  {
    return (com.oracle.ptsdemo.oscproxyclient.OpportunityService) super.getPort(new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/",
                                                                                          "OpportunityServiceSoapHttpPort"),
                                                                                com.oracle.ptsdemo.oscproxyclient.OpportunityService.class,
                                                                                features);
  }
}
