

/**
 * KomaduService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package edu.indiana.d2i.komadu.axis2.client;

    /*
     *  KomaduService java interface
     */

    public interface KomaduService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getEntityGraphRequest
                
         */

         
                     public edu.indiana.d2i.komadu.query.GetEntityGraphResponseDocument getEntityGraph(

                        edu.indiana.d2i.komadu.query.GetEntityGraphRequestDocument getEntityGraphRequest)
                        throws java.rmi.RemoteException
             ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addActivityEntityRelationship(
         edu.indiana.d2i.komadu.axis2.client.AddActivityEntityRelationshipDocument addActivityEntityRelationship

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param findActivityRequest
                
         */

         
                     public edu.indiana.d2i.komadu.query.FindActivityResponseDocument findActivity(

                        edu.indiana.d2i.komadu.query.FindActivityRequestDocument findActivityRequest)
                        throws java.rmi.RemoteException
             ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addActivityActivityRelationship(
         edu.indiana.d2i.komadu.axis2.client.AddActivityActivityRelationshipDocument addActivityActivityRelationship

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getContextWorkflowGraphRequest
                
         */

         
                     public edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument getContextWorkflowGraph(

                        edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestDocument getContextWorkflowGraphRequest)
                        throws java.rmi.RemoteException
             ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addAgentAgentRelationship(
         edu.indiana.d2i.komadu.axis2.client.AddAgentAgentRelationshipDocument addAgentAgentRelationship

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addAgentActivityRelationship(
         edu.indiana.d2i.komadu.axis2.client.AddAgentActivityRelationshipDocument addAgentActivityRelationship

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addAttributes(
         edu.indiana.d2i.komadu.axis2.client.AddAttributesDocument addAttributes

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getActivityGraphRequest
                
         */

         
                     public edu.indiana.d2i.komadu.query.GetActivityGraphResponseDocument getActivityGraph(

                        edu.indiana.d2i.komadu.query.GetActivityGraphRequestDocument getActivityGraphRequest)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getEntityDetailRequest
                
         */

         
                     public edu.indiana.d2i.komadu.query.GetEntityDetailResponseDocument getEntityDetail(

                        edu.indiana.d2i.komadu.query.GetEntityDetailRequestDocument getEntityDetailRequest)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getAgentGraphRequest
                
         */

         
                     public edu.indiana.d2i.komadu.query.GetAgentGraphResponseDocument getAgentGraph(

                        edu.indiana.d2i.komadu.query.GetAgentGraphRequestDocument getAgentGraphRequest)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getActivityDetailRequest
                
         */

         
                     public edu.indiana.d2i.komadu.query.GetActivityDetailResponseDocument getActivityDetail(

                        edu.indiana.d2i.komadu.query.GetActivityDetailRequestDocument getActivityDetailRequest)
                        throws java.rmi.RemoteException
             ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addEntityEntityRelationship(
         edu.indiana.d2i.komadu.axis2.client.AddEntityEntityRelationshipDocument addEntityEntityRelationship

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addAgentEntityRelationship(
         edu.indiana.d2i.komadu.axis2.client.AddAgentEntityRelationshipDocument addAgentEntityRelationship

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param findEntityRequest
                
         */

         
                     public edu.indiana.d2i.komadu.query.FindEntityResponseDocument findEntity(

                        edu.indiana.d2i.komadu.query.FindEntityRequestDocument findEntityRequest)
                        throws java.rmi.RemoteException
             ;

        

        
       //
       }
    