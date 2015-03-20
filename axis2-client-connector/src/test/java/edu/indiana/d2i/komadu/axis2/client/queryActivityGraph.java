package edu.indiana.d2i.komadu.axis2.client;

import java.io.IOException;
import java.rmi.RemoteException;

import edu.indiana.d2i.komadu.query.DetailEnumType;
import edu.indiana.d2i.komadu.query.GetActivityGraphRequestDocument;
import edu.indiana.d2i.komadu.query.GetActivityGraphRequestType;
import edu.indiana.d2i.komadu.query.GetActivityGraphResponseDocument;


public class queryActivityGraph {
private KomaduServiceStub stub = null;
    
	public queryActivityGraph(String komaduURL)
	{
		try {
            // create stub
            stub = new KomaduServiceStub(komaduURL);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
    public void getActivityGraph(String activityURI) {
    	try {
    	    System.out.println("\n\n Activity Graph without context \n\n");
    	    GetActivityGraphRequestDocument activityGraphRequest = GetActivityGraphRequestDocument.Factory.newInstance();
    	    GetActivityGraphRequestType actRequestType = GetActivityGraphRequestType.Factory.newInstance();
    	    actRequestType.setInformationDetailLevel(DetailEnumType.FINE);
    	    actRequestType.setActivityURI(activityURI);
    	    activityGraphRequest.setGetActivityGraphRequest(actRequestType);
    	    GetActivityGraphResponseDocument actResponse = stub.getActivityGraph(activityGraphRequest);
    	    System.out.println(actResponse.getGetActivityGraphResponse().getDocument());
    	} catch (RemoteException e) {
    	    e.printStackTrace();
    	}
    }
}

