package edu.indiana.d2i.komadu.axis2.client;

import java.io.IOException;
import java.rmi.RemoteException;

import edu.indiana.d2i.komadu.query.EntityDetail;
import edu.indiana.d2i.komadu.query.EntityDetailListType;
import edu.indiana.d2i.komadu.query.EntityIDListType;
import edu.indiana.d2i.komadu.query.GetEntityDetailRequestDocument;
import edu.indiana.d2i.komadu.query.GetEntityDetailRequestType;
import edu.indiana.d2i.komadu.query.GetEntityDetailResponseDocument;

public class findEntityDetails {
	private KomaduServiceStub stub = null;

	public findEntityDetails(String komaduURL) {
		try {
			// create stub
			stub = new KomaduServiceStub(komaduURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void find(String fileIdForDetail)
	{
		 System.out.println("\n\n Get Entity Detail \n\n");
         GetEntityDetailRequestDocument getEntityDetailRequestDocument =
                 GetEntityDetailRequestDocument.Factory.newInstance();
         GetEntityDetailRequestType getEntityDetailRequestType = GetEntityDetailRequestType.Factory.newInstance();
         EntityIDListType idList = EntityIDListType.Factory.newInstance();
         idList.setEntityIDArray(new String[]{fileIdForDetail});
         getEntityDetailRequestType.setEntityIDList(idList);
         getEntityDetailRequestDocument.setGetEntityDetailRequest(getEntityDetailRequestType);
         GetEntityDetailResponseDocument detailResponseDocument;
		try {
			detailResponseDocument = stub.getEntityDetail(getEntityDetailRequestDocument);
			 EntityDetailListType list = detailResponseDocument.getGetEntityDetailResponse().getEntityDetailList();
	         for (EntityDetail detail : list.getEntityDetailArray()) {
	             System.out.println("Entity ID: " + detail.getId());
	             System.out.println("File Name: " + detail.getFileName());
	             System.out.println("File URI: " + detail.getFileURI());
	             System.out.println("File Creation Date: " + detail.getCreationDate());
	             System.out.println("File Owner: " + detail.getOwner());
	             System.out.println("File MD5: " + detail.getMd5());
	         }
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
