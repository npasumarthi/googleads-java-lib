// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201702.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "TrialAsyncErrorService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201702/TrialAsyncErrorService?wsdl")
public class TrialAsyncErrorService
    extends Service
{

    private final static URL TRIALASYNCERRORSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRIALASYNCERRORSERVICE_EXCEPTION;
    private final static QName TRIALASYNCERRORSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201702", "TrialAsyncErrorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201702/TrialAsyncErrorService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRIALASYNCERRORSERVICE_WSDL_LOCATION = url;
        TRIALASYNCERRORSERVICE_EXCEPTION = e;
    }

    public TrialAsyncErrorService() {
        super(__getWsdlLocation(), TRIALASYNCERRORSERVICE_QNAME);
    }

    public TrialAsyncErrorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns TrialAsyncErrorServiceInterface
     */
    @WebEndpoint(name = "TrialAsyncErrorServiceInterfacePort")
    public TrialAsyncErrorServiceInterface getTrialAsyncErrorServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201702", "TrialAsyncErrorServiceInterfacePort"), TrialAsyncErrorServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TrialAsyncErrorServiceInterface
     */
    @WebEndpoint(name = "TrialAsyncErrorServiceInterfacePort")
    public TrialAsyncErrorServiceInterface getTrialAsyncErrorServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201702", "TrialAsyncErrorServiceInterfacePort"), TrialAsyncErrorServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRIALASYNCERRORSERVICE_EXCEPTION!= null) {
            throw TRIALASYNCERRORSERVICE_EXCEPTION;
        }
        return TRIALASYNCERRORSERVICE_WSDL_LOCATION;
    }

}
