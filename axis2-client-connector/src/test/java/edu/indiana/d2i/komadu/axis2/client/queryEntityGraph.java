package edu.indiana.d2i.komadu.axis2.client;

import java.io.IOException;
import java.rmi.RemoteException;

import edu.indiana.d2i.komadu.query.DetailEnumType;
import edu.indiana.d2i.komadu.query.GetEntityGraphRequestDocument;
import edu.indiana.d2i.komadu.query.GetEntityGraphRequestType;
import edu.indiana.d2i.komadu.query.GetEntityGraphResponseDocument;

public class queryEntityGraph {
	private KomaduServiceStub stub = null;
    
	public queryEntityGraph(String komaduURL)
	{
		try {
            // create stub
            stub = new KomaduServiceStub(komaduURL);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
    public void getEntityGraph(String entityURI) {
    	try {
            System.out.println("\n\n Entity Graph without context \n\n");
            GetEntityGraphRequestDocument entityGraphRequest = GetEntityGraphRequestDocument.Factory.newInstance();
            GetEntityGraphRequestType entityRequestType = GetEntityGraphRequestType.Factory.newInstance();
            entityRequestType.setInformationDetailLevel(DetailEnumType.FINE);
            entityRequestType.setEntityURI(entityURI);
            entityRequestType.setEntityType(edu.indiana.d2i.komadu.query.EntityEnumType.FILE);
            entityGraphRequest.setGetEntityGraphRequest(entityRequestType);
            GetEntityGraphResponseDocument entityResponse = stub.getEntityGraph(entityGraphRequest);
            System.out.println(entityResponse.getGetEntityGraphResponse().getDocument());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
