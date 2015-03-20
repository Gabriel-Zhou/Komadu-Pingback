/*
 * XML Type:  NamedBundle
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.NamedBundle
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * An XML NamedBundle(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public class NamedBundleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.NamedBundle
{
    
    public NamedBundleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "entity");
    private static final javax.xml.namespace.QName ACTIVITY$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "activity");
    private static final javax.xml.namespace.QName WASGENERATEDBY$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasGeneratedBy");
    private static final javax.xml.namespace.QName USED$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "used");
    private static final javax.xml.namespace.QName WASINFORMEDBY$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasInformedBy");
    private static final javax.xml.namespace.QName WASSTARTEDBY$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasStartedBy");
    private static final javax.xml.namespace.QName WASENDEDBY$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasEndedBy");
    private static final javax.xml.namespace.QName WASINVALIDATEDBY$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasInvalidatedBy");
    private static final javax.xml.namespace.QName WASDERIVEDFROM$16 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasDerivedFrom");
    private static final javax.xml.namespace.QName AGENT$18 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "agent");
    private static final javax.xml.namespace.QName WASATTRIBUTEDTO$20 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasAttributedTo");
    private static final javax.xml.namespace.QName WASASSOCIATEDWITH$22 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasAssociatedWith");
    private static final javax.xml.namespace.QName ACTEDONBEHALFOF$24 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "actedOnBehalfOf");
    private static final javax.xml.namespace.QName WASINFLUENCEDBY$26 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasInfluencedBy");
    private static final javax.xml.namespace.QName SPECIALIZATIONOF$28 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "specializationOf");
    private static final javax.xml.namespace.QName ALTERNATEOF$30 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "alternateOf");
    private static final javax.xml.namespace.QName HADMEMBER$32 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "hadMember");
    private static final javax.xml.namespace.QName MENTIONOF$34 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "mentionOf");
    private static final javax.xml.namespace.QName PLAN$36 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "plan");
    private static final javax.xml.namespace.QName WASREVISIONOF$38 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasRevisionOf");
    private static final javax.xml.namespace.QName WASQUOTEDFROM$40 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasQuotedFrom");
    private static final javax.xml.namespace.QName HADPRIMARYSOURCE$42 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "hadPrimarySource");
    private static final javax.xml.namespace.QName PERSON$44 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "person");
    private static final javax.xml.namespace.QName ORGANIZATION$46 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "organization");
    private static final javax.xml.namespace.QName SOFTWAREAGENT$48 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "softwareAgent");
    private static final javax.xml.namespace.QName BUNDLE$50 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "bundle");
    private static final javax.xml.namespace.QName COLLECTION$52 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "collection");
    private static final javax.xml.namespace.QName EMPTYCOLLECTION$54 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "emptyCollection");
    private static final javax.xml.namespace.QName DICTIONARY$56 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "dictionary");
    private static final javax.xml.namespace.QName EMPTYDICTIONARY$58 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "emptyDictionary");
    private static final javax.xml.namespace.QName HADDICTIONARYMEMBER$60 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "hadDictionaryMember");
    private static final javax.xml.namespace.QName DERIVEDBYINSERTIONFROM$62 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "derivedByInsertionFrom");
    private static final javax.xml.namespace.QName DERIVEDBYREMOVALFROM$64 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "derivedByRemovalFrom");
    private static final javax.xml.namespace.QName OTHERS$66 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "others");
    private static final javax.xml.namespace.QName ID$68 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "id");
    
    
    /**
     * Gets array of all "entity" elements
     */
    public org.w3.www.ns.prov.Entity[] getEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITY$0, targetList);
            org.w3.www.ns.prov.Entity[] result = new org.w3.www.ns.prov.Entity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entity" element
     */
    public org.w3.www.ns.prov.Entity getEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Entity target = null;
            target = (org.w3.www.ns.prov.Entity)get_store().find_element_user(ENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entity" element
     */
    public int sizeOfEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY$0);
        }
    }
    
    /**
     * Sets array of all "entity" element
     */
    public void setEntityArray(org.w3.www.ns.prov.Entity[] entityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityArray, ENTITY$0);
        }
    }
    
    /**
     * Sets ith "entity" element
     */
    public void setEntityArray(int i, org.w3.www.ns.prov.Entity entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Entity target = null;
            target = (org.w3.www.ns.prov.Entity)get_store().find_element_user(ENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entity" element
     */
    public org.w3.www.ns.prov.Entity insertNewEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Entity target = null;
            target = (org.w3.www.ns.prov.Entity)get_store().insert_element_user(ENTITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entity" element
     */
    public org.w3.www.ns.prov.Entity addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Entity target = null;
            target = (org.w3.www.ns.prov.Entity)get_store().add_element_user(ENTITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entity" element
     */
    public void removeEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY$0, i);
        }
    }
    
    /**
     * Gets array of all "activity" elements
     */
    public org.w3.www.ns.prov.Activity[] getActivityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITY$2, targetList);
            org.w3.www.ns.prov.Activity[] result = new org.w3.www.ns.prov.Activity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "activity" element
     */
    public org.w3.www.ns.prov.Activity getActivityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Activity target = null;
            target = (org.w3.www.ns.prov.Activity)get_store().find_element_user(ACTIVITY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "activity" element
     */
    public int sizeOfActivityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITY$2);
        }
    }
    
    /**
     * Sets array of all "activity" element
     */
    public void setActivityArray(org.w3.www.ns.prov.Activity[] activityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityArray, ACTIVITY$2);
        }
    }
    
    /**
     * Sets ith "activity" element
     */
    public void setActivityArray(int i, org.w3.www.ns.prov.Activity activity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Activity target = null;
            target = (org.w3.www.ns.prov.Activity)get_store().find_element_user(ACTIVITY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activity" element
     */
    public org.w3.www.ns.prov.Activity insertNewActivity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Activity target = null;
            target = (org.w3.www.ns.prov.Activity)get_store().insert_element_user(ACTIVITY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activity" element
     */
    public org.w3.www.ns.prov.Activity addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Activity target = null;
            target = (org.w3.www.ns.prov.Activity)get_store().add_element_user(ACTIVITY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "activity" element
     */
    public void removeActivity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITY$2, i);
        }
    }
    
    /**
     * Gets array of all "wasGeneratedBy" elements
     */
    public org.w3.www.ns.prov.Generation[] getWasGeneratedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASGENERATEDBY$4, targetList);
            org.w3.www.ns.prov.Generation[] result = new org.w3.www.ns.prov.Generation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasGeneratedBy" element
     */
    public org.w3.www.ns.prov.Generation getWasGeneratedByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Generation target = null;
            target = (org.w3.www.ns.prov.Generation)get_store().find_element_user(WASGENERATEDBY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasGeneratedBy" element
     */
    public int sizeOfWasGeneratedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASGENERATEDBY$4);
        }
    }
    
    /**
     * Sets array of all "wasGeneratedBy" element
     */
    public void setWasGeneratedByArray(org.w3.www.ns.prov.Generation[] wasGeneratedByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasGeneratedByArray, WASGENERATEDBY$4);
        }
    }
    
    /**
     * Sets ith "wasGeneratedBy" element
     */
    public void setWasGeneratedByArray(int i, org.w3.www.ns.prov.Generation wasGeneratedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Generation target = null;
            target = (org.w3.www.ns.prov.Generation)get_store().find_element_user(WASGENERATEDBY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasGeneratedBy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasGeneratedBy" element
     */
    public org.w3.www.ns.prov.Generation insertNewWasGeneratedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Generation target = null;
            target = (org.w3.www.ns.prov.Generation)get_store().insert_element_user(WASGENERATEDBY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasGeneratedBy" element
     */
    public org.w3.www.ns.prov.Generation addNewWasGeneratedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Generation target = null;
            target = (org.w3.www.ns.prov.Generation)get_store().add_element_user(WASGENERATEDBY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasGeneratedBy" element
     */
    public void removeWasGeneratedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASGENERATEDBY$4, i);
        }
    }
    
    /**
     * Gets array of all "used" elements
     */
    public org.w3.www.ns.prov.Usage[] getUsedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USED$6, targetList);
            org.w3.www.ns.prov.Usage[] result = new org.w3.www.ns.prov.Usage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "used" element
     */
    public org.w3.www.ns.prov.Usage getUsedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Usage target = null;
            target = (org.w3.www.ns.prov.Usage)get_store().find_element_user(USED$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "used" element
     */
    public int sizeOfUsedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USED$6);
        }
    }
    
    /**
     * Sets array of all "used" element
     */
    public void setUsedArray(org.w3.www.ns.prov.Usage[] usedArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(usedArray, USED$6);
        }
    }
    
    /**
     * Sets ith "used" element
     */
    public void setUsedArray(int i, org.w3.www.ns.prov.Usage used)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Usage target = null;
            target = (org.w3.www.ns.prov.Usage)get_store().find_element_user(USED$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(used);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "used" element
     */
    public org.w3.www.ns.prov.Usage insertNewUsed(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Usage target = null;
            target = (org.w3.www.ns.prov.Usage)get_store().insert_element_user(USED$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "used" element
     */
    public org.w3.www.ns.prov.Usage addNewUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Usage target = null;
            target = (org.w3.www.ns.prov.Usage)get_store().add_element_user(USED$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "used" element
     */
    public void removeUsed(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USED$6, i);
        }
    }
    
    /**
     * Gets array of all "wasInformedBy" elements
     */
    public org.w3.www.ns.prov.Communication[] getWasInformedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASINFORMEDBY$8, targetList);
            org.w3.www.ns.prov.Communication[] result = new org.w3.www.ns.prov.Communication[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasInformedBy" element
     */
    public org.w3.www.ns.prov.Communication getWasInformedByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Communication target = null;
            target = (org.w3.www.ns.prov.Communication)get_store().find_element_user(WASINFORMEDBY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasInformedBy" element
     */
    public int sizeOfWasInformedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASINFORMEDBY$8);
        }
    }
    
    /**
     * Sets array of all "wasInformedBy" element
     */
    public void setWasInformedByArray(org.w3.www.ns.prov.Communication[] wasInformedByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasInformedByArray, WASINFORMEDBY$8);
        }
    }
    
    /**
     * Sets ith "wasInformedBy" element
     */
    public void setWasInformedByArray(int i, org.w3.www.ns.prov.Communication wasInformedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Communication target = null;
            target = (org.w3.www.ns.prov.Communication)get_store().find_element_user(WASINFORMEDBY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasInformedBy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasInformedBy" element
     */
    public org.w3.www.ns.prov.Communication insertNewWasInformedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Communication target = null;
            target = (org.w3.www.ns.prov.Communication)get_store().insert_element_user(WASINFORMEDBY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasInformedBy" element
     */
    public org.w3.www.ns.prov.Communication addNewWasInformedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Communication target = null;
            target = (org.w3.www.ns.prov.Communication)get_store().add_element_user(WASINFORMEDBY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasInformedBy" element
     */
    public void removeWasInformedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASINFORMEDBY$8, i);
        }
    }
    
    /**
     * Gets array of all "wasStartedBy" elements
     */
    public org.w3.www.ns.prov.Start[] getWasStartedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASSTARTEDBY$10, targetList);
            org.w3.www.ns.prov.Start[] result = new org.w3.www.ns.prov.Start[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasStartedBy" element
     */
    public org.w3.www.ns.prov.Start getWasStartedByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Start target = null;
            target = (org.w3.www.ns.prov.Start)get_store().find_element_user(WASSTARTEDBY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasStartedBy" element
     */
    public int sizeOfWasStartedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASSTARTEDBY$10);
        }
    }
    
    /**
     * Sets array of all "wasStartedBy" element
     */
    public void setWasStartedByArray(org.w3.www.ns.prov.Start[] wasStartedByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasStartedByArray, WASSTARTEDBY$10);
        }
    }
    
    /**
     * Sets ith "wasStartedBy" element
     */
    public void setWasStartedByArray(int i, org.w3.www.ns.prov.Start wasStartedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Start target = null;
            target = (org.w3.www.ns.prov.Start)get_store().find_element_user(WASSTARTEDBY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasStartedBy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasStartedBy" element
     */
    public org.w3.www.ns.prov.Start insertNewWasStartedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Start target = null;
            target = (org.w3.www.ns.prov.Start)get_store().insert_element_user(WASSTARTEDBY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasStartedBy" element
     */
    public org.w3.www.ns.prov.Start addNewWasStartedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Start target = null;
            target = (org.w3.www.ns.prov.Start)get_store().add_element_user(WASSTARTEDBY$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasStartedBy" element
     */
    public void removeWasStartedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASSTARTEDBY$10, i);
        }
    }
    
    /**
     * Gets array of all "wasEndedBy" elements
     */
    public org.w3.www.ns.prov.End[] getWasEndedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASENDEDBY$12, targetList);
            org.w3.www.ns.prov.End[] result = new org.w3.www.ns.prov.End[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasEndedBy" element
     */
    public org.w3.www.ns.prov.End getWasEndedByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.End target = null;
            target = (org.w3.www.ns.prov.End)get_store().find_element_user(WASENDEDBY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasEndedBy" element
     */
    public int sizeOfWasEndedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASENDEDBY$12);
        }
    }
    
    /**
     * Sets array of all "wasEndedBy" element
     */
    public void setWasEndedByArray(org.w3.www.ns.prov.End[] wasEndedByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasEndedByArray, WASENDEDBY$12);
        }
    }
    
    /**
     * Sets ith "wasEndedBy" element
     */
    public void setWasEndedByArray(int i, org.w3.www.ns.prov.End wasEndedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.End target = null;
            target = (org.w3.www.ns.prov.End)get_store().find_element_user(WASENDEDBY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasEndedBy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasEndedBy" element
     */
    public org.w3.www.ns.prov.End insertNewWasEndedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.End target = null;
            target = (org.w3.www.ns.prov.End)get_store().insert_element_user(WASENDEDBY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasEndedBy" element
     */
    public org.w3.www.ns.prov.End addNewWasEndedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.End target = null;
            target = (org.w3.www.ns.prov.End)get_store().add_element_user(WASENDEDBY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasEndedBy" element
     */
    public void removeWasEndedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASENDEDBY$12, i);
        }
    }
    
    /**
     * Gets array of all "wasInvalidatedBy" elements
     */
    public org.w3.www.ns.prov.Invalidation[] getWasInvalidatedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASINVALIDATEDBY$14, targetList);
            org.w3.www.ns.prov.Invalidation[] result = new org.w3.www.ns.prov.Invalidation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasInvalidatedBy" element
     */
    public org.w3.www.ns.prov.Invalidation getWasInvalidatedByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Invalidation target = null;
            target = (org.w3.www.ns.prov.Invalidation)get_store().find_element_user(WASINVALIDATEDBY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasInvalidatedBy" element
     */
    public int sizeOfWasInvalidatedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASINVALIDATEDBY$14);
        }
    }
    
    /**
     * Sets array of all "wasInvalidatedBy" element
     */
    public void setWasInvalidatedByArray(org.w3.www.ns.prov.Invalidation[] wasInvalidatedByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasInvalidatedByArray, WASINVALIDATEDBY$14);
        }
    }
    
    /**
     * Sets ith "wasInvalidatedBy" element
     */
    public void setWasInvalidatedByArray(int i, org.w3.www.ns.prov.Invalidation wasInvalidatedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Invalidation target = null;
            target = (org.w3.www.ns.prov.Invalidation)get_store().find_element_user(WASINVALIDATEDBY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasInvalidatedBy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasInvalidatedBy" element
     */
    public org.w3.www.ns.prov.Invalidation insertNewWasInvalidatedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Invalidation target = null;
            target = (org.w3.www.ns.prov.Invalidation)get_store().insert_element_user(WASINVALIDATEDBY$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasInvalidatedBy" element
     */
    public org.w3.www.ns.prov.Invalidation addNewWasInvalidatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Invalidation target = null;
            target = (org.w3.www.ns.prov.Invalidation)get_store().add_element_user(WASINVALIDATEDBY$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasInvalidatedBy" element
     */
    public void removeWasInvalidatedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASINVALIDATEDBY$14, i);
        }
    }
    
    /**
     * Gets array of all "wasDerivedFrom" elements
     */
    public org.w3.www.ns.prov.Derivation[] getWasDerivedFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASDERIVEDFROM$16, targetList);
            org.w3.www.ns.prov.Derivation[] result = new org.w3.www.ns.prov.Derivation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasDerivedFrom" element
     */
    public org.w3.www.ns.prov.Derivation getWasDerivedFromArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Derivation target = null;
            target = (org.w3.www.ns.prov.Derivation)get_store().find_element_user(WASDERIVEDFROM$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasDerivedFrom" element
     */
    public int sizeOfWasDerivedFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASDERIVEDFROM$16);
        }
    }
    
    /**
     * Sets array of all "wasDerivedFrom" element
     */
    public void setWasDerivedFromArray(org.w3.www.ns.prov.Derivation[] wasDerivedFromArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasDerivedFromArray, WASDERIVEDFROM$16);
        }
    }
    
    /**
     * Sets ith "wasDerivedFrom" element
     */
    public void setWasDerivedFromArray(int i, org.w3.www.ns.prov.Derivation wasDerivedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Derivation target = null;
            target = (org.w3.www.ns.prov.Derivation)get_store().find_element_user(WASDERIVEDFROM$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasDerivedFrom);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasDerivedFrom" element
     */
    public org.w3.www.ns.prov.Derivation insertNewWasDerivedFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Derivation target = null;
            target = (org.w3.www.ns.prov.Derivation)get_store().insert_element_user(WASDERIVEDFROM$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasDerivedFrom" element
     */
    public org.w3.www.ns.prov.Derivation addNewWasDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Derivation target = null;
            target = (org.w3.www.ns.prov.Derivation)get_store().add_element_user(WASDERIVEDFROM$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasDerivedFrom" element
     */
    public void removeWasDerivedFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASDERIVEDFROM$16, i);
        }
    }
    
    /**
     * Gets array of all "agent" elements
     */
    public org.w3.www.ns.prov.Agent[] getAgentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENT$18, targetList);
            org.w3.www.ns.prov.Agent[] result = new org.w3.www.ns.prov.Agent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "agent" element
     */
    public org.w3.www.ns.prov.Agent getAgentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Agent target = null;
            target = (org.w3.www.ns.prov.Agent)get_store().find_element_user(AGENT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "agent" element
     */
    public int sizeOfAgentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENT$18);
        }
    }
    
    /**
     * Sets array of all "agent" element
     */
    public void setAgentArray(org.w3.www.ns.prov.Agent[] agentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agentArray, AGENT$18);
        }
    }
    
    /**
     * Sets ith "agent" element
     */
    public void setAgentArray(int i, org.w3.www.ns.prov.Agent agent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Agent target = null;
            target = (org.w3.www.ns.prov.Agent)get_store().find_element_user(AGENT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "agent" element
     */
    public org.w3.www.ns.prov.Agent insertNewAgent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Agent target = null;
            target = (org.w3.www.ns.prov.Agent)get_store().insert_element_user(AGENT$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "agent" element
     */
    public org.w3.www.ns.prov.Agent addNewAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Agent target = null;
            target = (org.w3.www.ns.prov.Agent)get_store().add_element_user(AGENT$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "agent" element
     */
    public void removeAgent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENT$18, i);
        }
    }
    
    /**
     * Gets array of all "wasAttributedTo" elements
     */
    public org.w3.www.ns.prov.Attribution[] getWasAttributedToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASATTRIBUTEDTO$20, targetList);
            org.w3.www.ns.prov.Attribution[] result = new org.w3.www.ns.prov.Attribution[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasAttributedTo" element
     */
    public org.w3.www.ns.prov.Attribution getWasAttributedToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Attribution target = null;
            target = (org.w3.www.ns.prov.Attribution)get_store().find_element_user(WASATTRIBUTEDTO$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasAttributedTo" element
     */
    public int sizeOfWasAttributedToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASATTRIBUTEDTO$20);
        }
    }
    
    /**
     * Sets array of all "wasAttributedTo" element
     */
    public void setWasAttributedToArray(org.w3.www.ns.prov.Attribution[] wasAttributedToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasAttributedToArray, WASATTRIBUTEDTO$20);
        }
    }
    
    /**
     * Sets ith "wasAttributedTo" element
     */
    public void setWasAttributedToArray(int i, org.w3.www.ns.prov.Attribution wasAttributedTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Attribution target = null;
            target = (org.w3.www.ns.prov.Attribution)get_store().find_element_user(WASATTRIBUTEDTO$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasAttributedTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasAttributedTo" element
     */
    public org.w3.www.ns.prov.Attribution insertNewWasAttributedTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Attribution target = null;
            target = (org.w3.www.ns.prov.Attribution)get_store().insert_element_user(WASATTRIBUTEDTO$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasAttributedTo" element
     */
    public org.w3.www.ns.prov.Attribution addNewWasAttributedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Attribution target = null;
            target = (org.w3.www.ns.prov.Attribution)get_store().add_element_user(WASATTRIBUTEDTO$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasAttributedTo" element
     */
    public void removeWasAttributedTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASATTRIBUTEDTO$20, i);
        }
    }
    
    /**
     * Gets array of all "wasAssociatedWith" elements
     */
    public org.w3.www.ns.prov.Association[] getWasAssociatedWithArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASASSOCIATEDWITH$22, targetList);
            org.w3.www.ns.prov.Association[] result = new org.w3.www.ns.prov.Association[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasAssociatedWith" element
     */
    public org.w3.www.ns.prov.Association getWasAssociatedWithArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Association target = null;
            target = (org.w3.www.ns.prov.Association)get_store().find_element_user(WASASSOCIATEDWITH$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasAssociatedWith" element
     */
    public int sizeOfWasAssociatedWithArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASASSOCIATEDWITH$22);
        }
    }
    
    /**
     * Sets array of all "wasAssociatedWith" element
     */
    public void setWasAssociatedWithArray(org.w3.www.ns.prov.Association[] wasAssociatedWithArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasAssociatedWithArray, WASASSOCIATEDWITH$22);
        }
    }
    
    /**
     * Sets ith "wasAssociatedWith" element
     */
    public void setWasAssociatedWithArray(int i, org.w3.www.ns.prov.Association wasAssociatedWith)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Association target = null;
            target = (org.w3.www.ns.prov.Association)get_store().find_element_user(WASASSOCIATEDWITH$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasAssociatedWith);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasAssociatedWith" element
     */
    public org.w3.www.ns.prov.Association insertNewWasAssociatedWith(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Association target = null;
            target = (org.w3.www.ns.prov.Association)get_store().insert_element_user(WASASSOCIATEDWITH$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasAssociatedWith" element
     */
    public org.w3.www.ns.prov.Association addNewWasAssociatedWith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Association target = null;
            target = (org.w3.www.ns.prov.Association)get_store().add_element_user(WASASSOCIATEDWITH$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasAssociatedWith" element
     */
    public void removeWasAssociatedWith(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASASSOCIATEDWITH$22, i);
        }
    }
    
    /**
     * Gets array of all "actedOnBehalfOf" elements
     */
    public org.w3.www.ns.prov.Delegation[] getActedOnBehalfOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTEDONBEHALFOF$24, targetList);
            org.w3.www.ns.prov.Delegation[] result = new org.w3.www.ns.prov.Delegation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "actedOnBehalfOf" element
     */
    public org.w3.www.ns.prov.Delegation getActedOnBehalfOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Delegation target = null;
            target = (org.w3.www.ns.prov.Delegation)get_store().find_element_user(ACTEDONBEHALFOF$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "actedOnBehalfOf" element
     */
    public int sizeOfActedOnBehalfOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTEDONBEHALFOF$24);
        }
    }
    
    /**
     * Sets array of all "actedOnBehalfOf" element
     */
    public void setActedOnBehalfOfArray(org.w3.www.ns.prov.Delegation[] actedOnBehalfOfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(actedOnBehalfOfArray, ACTEDONBEHALFOF$24);
        }
    }
    
    /**
     * Sets ith "actedOnBehalfOf" element
     */
    public void setActedOnBehalfOfArray(int i, org.w3.www.ns.prov.Delegation actedOnBehalfOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Delegation target = null;
            target = (org.w3.www.ns.prov.Delegation)get_store().find_element_user(ACTEDONBEHALFOF$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(actedOnBehalfOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actedOnBehalfOf" element
     */
    public org.w3.www.ns.prov.Delegation insertNewActedOnBehalfOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Delegation target = null;
            target = (org.w3.www.ns.prov.Delegation)get_store().insert_element_user(ACTEDONBEHALFOF$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actedOnBehalfOf" element
     */
    public org.w3.www.ns.prov.Delegation addNewActedOnBehalfOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Delegation target = null;
            target = (org.w3.www.ns.prov.Delegation)get_store().add_element_user(ACTEDONBEHALFOF$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "actedOnBehalfOf" element
     */
    public void removeActedOnBehalfOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTEDONBEHALFOF$24, i);
        }
    }
    
    /**
     * Gets array of all "wasInfluencedBy" elements
     */
    public org.w3.www.ns.prov.Influence[] getWasInfluencedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASINFLUENCEDBY$26, targetList);
            org.w3.www.ns.prov.Influence[] result = new org.w3.www.ns.prov.Influence[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasInfluencedBy" element
     */
    public org.w3.www.ns.prov.Influence getWasInfluencedByArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Influence target = null;
            target = (org.w3.www.ns.prov.Influence)get_store().find_element_user(WASINFLUENCEDBY$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasInfluencedBy" element
     */
    public int sizeOfWasInfluencedByArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASINFLUENCEDBY$26);
        }
    }
    
    /**
     * Sets array of all "wasInfluencedBy" element
     */
    public void setWasInfluencedByArray(org.w3.www.ns.prov.Influence[] wasInfluencedByArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasInfluencedByArray, WASINFLUENCEDBY$26);
        }
    }
    
    /**
     * Sets ith "wasInfluencedBy" element
     */
    public void setWasInfluencedByArray(int i, org.w3.www.ns.prov.Influence wasInfluencedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Influence target = null;
            target = (org.w3.www.ns.prov.Influence)get_store().find_element_user(WASINFLUENCEDBY$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasInfluencedBy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasInfluencedBy" element
     */
    public org.w3.www.ns.prov.Influence insertNewWasInfluencedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Influence target = null;
            target = (org.w3.www.ns.prov.Influence)get_store().insert_element_user(WASINFLUENCEDBY$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasInfluencedBy" element
     */
    public org.w3.www.ns.prov.Influence addNewWasInfluencedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Influence target = null;
            target = (org.w3.www.ns.prov.Influence)get_store().add_element_user(WASINFLUENCEDBY$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasInfluencedBy" element
     */
    public void removeWasInfluencedBy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASINFLUENCEDBY$26, i);
        }
    }
    
    /**
     * Gets array of all "specializationOf" elements
     */
    public org.w3.www.ns.prov.Specialization[] getSpecializationOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPECIALIZATIONOF$28, targetList);
            org.w3.www.ns.prov.Specialization[] result = new org.w3.www.ns.prov.Specialization[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "specializationOf" element
     */
    public org.w3.www.ns.prov.Specialization getSpecializationOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Specialization target = null;
            target = (org.w3.www.ns.prov.Specialization)get_store().find_element_user(SPECIALIZATIONOF$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "specializationOf" element
     */
    public int sizeOfSpecializationOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIALIZATIONOF$28);
        }
    }
    
    /**
     * Sets array of all "specializationOf" element
     */
    public void setSpecializationOfArray(org.w3.www.ns.prov.Specialization[] specializationOfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(specializationOfArray, SPECIALIZATIONOF$28);
        }
    }
    
    /**
     * Sets ith "specializationOf" element
     */
    public void setSpecializationOfArray(int i, org.w3.www.ns.prov.Specialization specializationOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Specialization target = null;
            target = (org.w3.www.ns.prov.Specialization)get_store().find_element_user(SPECIALIZATIONOF$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(specializationOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specializationOf" element
     */
    public org.w3.www.ns.prov.Specialization insertNewSpecializationOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Specialization target = null;
            target = (org.w3.www.ns.prov.Specialization)get_store().insert_element_user(SPECIALIZATIONOF$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specializationOf" element
     */
    public org.w3.www.ns.prov.Specialization addNewSpecializationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Specialization target = null;
            target = (org.w3.www.ns.prov.Specialization)get_store().add_element_user(SPECIALIZATIONOF$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "specializationOf" element
     */
    public void removeSpecializationOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIALIZATIONOF$28, i);
        }
    }
    
    /**
     * Gets array of all "alternateOf" elements
     */
    public org.w3.www.ns.prov.Alternate[] getAlternateOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALTERNATEOF$30, targetList);
            org.w3.www.ns.prov.Alternate[] result = new org.w3.www.ns.prov.Alternate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alternateOf" element
     */
    public org.w3.www.ns.prov.Alternate getAlternateOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Alternate target = null;
            target = (org.w3.www.ns.prov.Alternate)get_store().find_element_user(ALTERNATEOF$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alternateOf" element
     */
    public int sizeOfAlternateOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTERNATEOF$30);
        }
    }
    
    /**
     * Sets array of all "alternateOf" element
     */
    public void setAlternateOfArray(org.w3.www.ns.prov.Alternate[] alternateOfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alternateOfArray, ALTERNATEOF$30);
        }
    }
    
    /**
     * Sets ith "alternateOf" element
     */
    public void setAlternateOfArray(int i, org.w3.www.ns.prov.Alternate alternateOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Alternate target = null;
            target = (org.w3.www.ns.prov.Alternate)get_store().find_element_user(ALTERNATEOF$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alternateOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alternateOf" element
     */
    public org.w3.www.ns.prov.Alternate insertNewAlternateOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Alternate target = null;
            target = (org.w3.www.ns.prov.Alternate)get_store().insert_element_user(ALTERNATEOF$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alternateOf" element
     */
    public org.w3.www.ns.prov.Alternate addNewAlternateOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Alternate target = null;
            target = (org.w3.www.ns.prov.Alternate)get_store().add_element_user(ALTERNATEOF$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "alternateOf" element
     */
    public void removeAlternateOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTERNATEOF$30, i);
        }
    }
    
    /**
     * Gets array of all "hadMember" elements
     */
    public org.w3.www.ns.prov.Membership[] getHadMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HADMEMBER$32, targetList);
            org.w3.www.ns.prov.Membership[] result = new org.w3.www.ns.prov.Membership[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hadMember" element
     */
    public org.w3.www.ns.prov.Membership getHadMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Membership target = null;
            target = (org.w3.www.ns.prov.Membership)get_store().find_element_user(HADMEMBER$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hadMember" element
     */
    public int sizeOfHadMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HADMEMBER$32);
        }
    }
    
    /**
     * Sets array of all "hadMember" element
     */
    public void setHadMemberArray(org.w3.www.ns.prov.Membership[] hadMemberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hadMemberArray, HADMEMBER$32);
        }
    }
    
    /**
     * Sets ith "hadMember" element
     */
    public void setHadMemberArray(int i, org.w3.www.ns.prov.Membership hadMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Membership target = null;
            target = (org.w3.www.ns.prov.Membership)get_store().find_element_user(HADMEMBER$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hadMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hadMember" element
     */
    public org.w3.www.ns.prov.Membership insertNewHadMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Membership target = null;
            target = (org.w3.www.ns.prov.Membership)get_store().insert_element_user(HADMEMBER$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hadMember" element
     */
    public org.w3.www.ns.prov.Membership addNewHadMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Membership target = null;
            target = (org.w3.www.ns.prov.Membership)get_store().add_element_user(HADMEMBER$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "hadMember" element
     */
    public void removeHadMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HADMEMBER$32, i);
        }
    }
    
    /**
     * Gets array of all "mentionOf" elements
     */
    public org.w3.www.ns.prov.Mention[] getMentionOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MENTIONOF$34, targetList);
            org.w3.www.ns.prov.Mention[] result = new org.w3.www.ns.prov.Mention[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mentionOf" element
     */
    public org.w3.www.ns.prov.Mention getMentionOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Mention target = null;
            target = (org.w3.www.ns.prov.Mention)get_store().find_element_user(MENTIONOF$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mentionOf" element
     */
    public int sizeOfMentionOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENTIONOF$34);
        }
    }
    
    /**
     * Sets array of all "mentionOf" element
     */
    public void setMentionOfArray(org.w3.www.ns.prov.Mention[] mentionOfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mentionOfArray, MENTIONOF$34);
        }
    }
    
    /**
     * Sets ith "mentionOf" element
     */
    public void setMentionOfArray(int i, org.w3.www.ns.prov.Mention mentionOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Mention target = null;
            target = (org.w3.www.ns.prov.Mention)get_store().find_element_user(MENTIONOF$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mentionOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mentionOf" element
     */
    public org.w3.www.ns.prov.Mention insertNewMentionOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Mention target = null;
            target = (org.w3.www.ns.prov.Mention)get_store().insert_element_user(MENTIONOF$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mentionOf" element
     */
    public org.w3.www.ns.prov.Mention addNewMentionOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Mention target = null;
            target = (org.w3.www.ns.prov.Mention)get_store().add_element_user(MENTIONOF$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "mentionOf" element
     */
    public void removeMentionOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENTIONOF$34, i);
        }
    }
    
    /**
     * Gets array of all "plan" elements
     */
    public org.w3.www.ns.prov.Plan[] getPlanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLAN$36, targetList);
            org.w3.www.ns.prov.Plan[] result = new org.w3.www.ns.prov.Plan[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "plan" element
     */
    public org.w3.www.ns.prov.Plan getPlanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Plan target = null;
            target = (org.w3.www.ns.prov.Plan)get_store().find_element_user(PLAN$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "plan" element
     */
    public int sizeOfPlanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLAN$36);
        }
    }
    
    /**
     * Sets array of all "plan" element
     */
    public void setPlanArray(org.w3.www.ns.prov.Plan[] planArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(planArray, PLAN$36);
        }
    }
    
    /**
     * Sets ith "plan" element
     */
    public void setPlanArray(int i, org.w3.www.ns.prov.Plan plan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Plan target = null;
            target = (org.w3.www.ns.prov.Plan)get_store().find_element_user(PLAN$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(plan);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "plan" element
     */
    public org.w3.www.ns.prov.Plan insertNewPlan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Plan target = null;
            target = (org.w3.www.ns.prov.Plan)get_store().insert_element_user(PLAN$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "plan" element
     */
    public org.w3.www.ns.prov.Plan addNewPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Plan target = null;
            target = (org.w3.www.ns.prov.Plan)get_store().add_element_user(PLAN$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "plan" element
     */
    public void removePlan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLAN$36, i);
        }
    }
    
    /**
     * Gets array of all "wasRevisionOf" elements
     */
    public org.w3.www.ns.prov.Revision[] getWasRevisionOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASREVISIONOF$38, targetList);
            org.w3.www.ns.prov.Revision[] result = new org.w3.www.ns.prov.Revision[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasRevisionOf" element
     */
    public org.w3.www.ns.prov.Revision getWasRevisionOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Revision target = null;
            target = (org.w3.www.ns.prov.Revision)get_store().find_element_user(WASREVISIONOF$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasRevisionOf" element
     */
    public int sizeOfWasRevisionOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASREVISIONOF$38);
        }
    }
    
    /**
     * Sets array of all "wasRevisionOf" element
     */
    public void setWasRevisionOfArray(org.w3.www.ns.prov.Revision[] wasRevisionOfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasRevisionOfArray, WASREVISIONOF$38);
        }
    }
    
    /**
     * Sets ith "wasRevisionOf" element
     */
    public void setWasRevisionOfArray(int i, org.w3.www.ns.prov.Revision wasRevisionOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Revision target = null;
            target = (org.w3.www.ns.prov.Revision)get_store().find_element_user(WASREVISIONOF$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasRevisionOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasRevisionOf" element
     */
    public org.w3.www.ns.prov.Revision insertNewWasRevisionOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Revision target = null;
            target = (org.w3.www.ns.prov.Revision)get_store().insert_element_user(WASREVISIONOF$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasRevisionOf" element
     */
    public org.w3.www.ns.prov.Revision addNewWasRevisionOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Revision target = null;
            target = (org.w3.www.ns.prov.Revision)get_store().add_element_user(WASREVISIONOF$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasRevisionOf" element
     */
    public void removeWasRevisionOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASREVISIONOF$38, i);
        }
    }
    
    /**
     * Gets array of all "wasQuotedFrom" elements
     */
    public org.w3.www.ns.prov.Quotation[] getWasQuotedFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WASQUOTEDFROM$40, targetList);
            org.w3.www.ns.prov.Quotation[] result = new org.w3.www.ns.prov.Quotation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wasQuotedFrom" element
     */
    public org.w3.www.ns.prov.Quotation getWasQuotedFromArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Quotation target = null;
            target = (org.w3.www.ns.prov.Quotation)get_store().find_element_user(WASQUOTEDFROM$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wasQuotedFrom" element
     */
    public int sizeOfWasQuotedFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASQUOTEDFROM$40);
        }
    }
    
    /**
     * Sets array of all "wasQuotedFrom" element
     */
    public void setWasQuotedFromArray(org.w3.www.ns.prov.Quotation[] wasQuotedFromArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wasQuotedFromArray, WASQUOTEDFROM$40);
        }
    }
    
    /**
     * Sets ith "wasQuotedFrom" element
     */
    public void setWasQuotedFromArray(int i, org.w3.www.ns.prov.Quotation wasQuotedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Quotation target = null;
            target = (org.w3.www.ns.prov.Quotation)get_store().find_element_user(WASQUOTEDFROM$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wasQuotedFrom);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasQuotedFrom" element
     */
    public org.w3.www.ns.prov.Quotation insertNewWasQuotedFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Quotation target = null;
            target = (org.w3.www.ns.prov.Quotation)get_store().insert_element_user(WASQUOTEDFROM$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasQuotedFrom" element
     */
    public org.w3.www.ns.prov.Quotation addNewWasQuotedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Quotation target = null;
            target = (org.w3.www.ns.prov.Quotation)get_store().add_element_user(WASQUOTEDFROM$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "wasQuotedFrom" element
     */
    public void removeWasQuotedFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASQUOTEDFROM$40, i);
        }
    }
    
    /**
     * Gets array of all "hadPrimarySource" elements
     */
    public org.w3.www.ns.prov.PrimarySource[] getHadPrimarySourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HADPRIMARYSOURCE$42, targetList);
            org.w3.www.ns.prov.PrimarySource[] result = new org.w3.www.ns.prov.PrimarySource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hadPrimarySource" element
     */
    public org.w3.www.ns.prov.PrimarySource getHadPrimarySourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.PrimarySource target = null;
            target = (org.w3.www.ns.prov.PrimarySource)get_store().find_element_user(HADPRIMARYSOURCE$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hadPrimarySource" element
     */
    public int sizeOfHadPrimarySourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HADPRIMARYSOURCE$42);
        }
    }
    
    /**
     * Sets array of all "hadPrimarySource" element
     */
    public void setHadPrimarySourceArray(org.w3.www.ns.prov.PrimarySource[] hadPrimarySourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hadPrimarySourceArray, HADPRIMARYSOURCE$42);
        }
    }
    
    /**
     * Sets ith "hadPrimarySource" element
     */
    public void setHadPrimarySourceArray(int i, org.w3.www.ns.prov.PrimarySource hadPrimarySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.PrimarySource target = null;
            target = (org.w3.www.ns.prov.PrimarySource)get_store().find_element_user(HADPRIMARYSOURCE$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hadPrimarySource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hadPrimarySource" element
     */
    public org.w3.www.ns.prov.PrimarySource insertNewHadPrimarySource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.PrimarySource target = null;
            target = (org.w3.www.ns.prov.PrimarySource)get_store().insert_element_user(HADPRIMARYSOURCE$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hadPrimarySource" element
     */
    public org.w3.www.ns.prov.PrimarySource addNewHadPrimarySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.PrimarySource target = null;
            target = (org.w3.www.ns.prov.PrimarySource)get_store().add_element_user(HADPRIMARYSOURCE$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "hadPrimarySource" element
     */
    public void removeHadPrimarySource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HADPRIMARYSOURCE$42, i);
        }
    }
    
    /**
     * Gets array of all "person" elements
     */
    public org.w3.www.ns.prov.Person[] getPersonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSON$44, targetList);
            org.w3.www.ns.prov.Person[] result = new org.w3.www.ns.prov.Person[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "person" element
     */
    public org.w3.www.ns.prov.Person getPersonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Person target = null;
            target = (org.w3.www.ns.prov.Person)get_store().find_element_user(PERSON$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "person" element
     */
    public int sizeOfPersonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSON$44);
        }
    }
    
    /**
     * Sets array of all "person" element
     */
    public void setPersonArray(org.w3.www.ns.prov.Person[] personArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personArray, PERSON$44);
        }
    }
    
    /**
     * Sets ith "person" element
     */
    public void setPersonArray(int i, org.w3.www.ns.prov.Person person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Person target = null;
            target = (org.w3.www.ns.prov.Person)get_store().find_element_user(PERSON$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(person);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "person" element
     */
    public org.w3.www.ns.prov.Person insertNewPerson(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Person target = null;
            target = (org.w3.www.ns.prov.Person)get_store().insert_element_user(PERSON$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "person" element
     */
    public org.w3.www.ns.prov.Person addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Person target = null;
            target = (org.w3.www.ns.prov.Person)get_store().add_element_user(PERSON$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "person" element
     */
    public void removePerson(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSON$44, i);
        }
    }
    
    /**
     * Gets array of all "organization" elements
     */
    public org.w3.www.ns.prov.Organization[] getOrganizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATION$46, targetList);
            org.w3.www.ns.prov.Organization[] result = new org.w3.www.ns.prov.Organization[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "organization" element
     */
    public org.w3.www.ns.prov.Organization getOrganizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Organization target = null;
            target = (org.w3.www.ns.prov.Organization)get_store().find_element_user(ORGANIZATION$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "organization" element
     */
    public int sizeOfOrganizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATION$46);
        }
    }
    
    /**
     * Sets array of all "organization" element
     */
    public void setOrganizationArray(org.w3.www.ns.prov.Organization[] organizationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationArray, ORGANIZATION$46);
        }
    }
    
    /**
     * Sets ith "organization" element
     */
    public void setOrganizationArray(int i, org.w3.www.ns.prov.Organization organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Organization target = null;
            target = (org.w3.www.ns.prov.Organization)get_store().find_element_user(ORGANIZATION$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organization);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "organization" element
     */
    public org.w3.www.ns.prov.Organization insertNewOrganization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Organization target = null;
            target = (org.w3.www.ns.prov.Organization)get_store().insert_element_user(ORGANIZATION$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "organization" element
     */
    public org.w3.www.ns.prov.Organization addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Organization target = null;
            target = (org.w3.www.ns.prov.Organization)get_store().add_element_user(ORGANIZATION$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "organization" element
     */
    public void removeOrganization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATION$46, i);
        }
    }
    
    /**
     * Gets array of all "softwareAgent" elements
     */
    public org.w3.www.ns.prov.SoftwareAgent[] getSoftwareAgentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOFTWAREAGENT$48, targetList);
            org.w3.www.ns.prov.SoftwareAgent[] result = new org.w3.www.ns.prov.SoftwareAgent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "softwareAgent" element
     */
    public org.w3.www.ns.prov.SoftwareAgent getSoftwareAgentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.SoftwareAgent target = null;
            target = (org.w3.www.ns.prov.SoftwareAgent)get_store().find_element_user(SOFTWAREAGENT$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "softwareAgent" element
     */
    public int sizeOfSoftwareAgentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWAREAGENT$48);
        }
    }
    
    /**
     * Sets array of all "softwareAgent" element
     */
    public void setSoftwareAgentArray(org.w3.www.ns.prov.SoftwareAgent[] softwareAgentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(softwareAgentArray, SOFTWAREAGENT$48);
        }
    }
    
    /**
     * Sets ith "softwareAgent" element
     */
    public void setSoftwareAgentArray(int i, org.w3.www.ns.prov.SoftwareAgent softwareAgent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.SoftwareAgent target = null;
            target = (org.w3.www.ns.prov.SoftwareAgent)get_store().find_element_user(SOFTWAREAGENT$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(softwareAgent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "softwareAgent" element
     */
    public org.w3.www.ns.prov.SoftwareAgent insertNewSoftwareAgent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.SoftwareAgent target = null;
            target = (org.w3.www.ns.prov.SoftwareAgent)get_store().insert_element_user(SOFTWAREAGENT$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "softwareAgent" element
     */
    public org.w3.www.ns.prov.SoftwareAgent addNewSoftwareAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.SoftwareAgent target = null;
            target = (org.w3.www.ns.prov.SoftwareAgent)get_store().add_element_user(SOFTWAREAGENT$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "softwareAgent" element
     */
    public void removeSoftwareAgent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWAREAGENT$48, i);
        }
    }
    
    /**
     * Gets array of all "bundle" elements
     */
    public org.w3.www.ns.prov.Bundle[] getBundleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUNDLE$50, targetList);
            org.w3.www.ns.prov.Bundle[] result = new org.w3.www.ns.prov.Bundle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bundle" element
     */
    public org.w3.www.ns.prov.Bundle getBundleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Bundle target = null;
            target = (org.w3.www.ns.prov.Bundle)get_store().find_element_user(BUNDLE$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bundle" element
     */
    public int sizeOfBundleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUNDLE$50);
        }
    }
    
    /**
     * Sets array of all "bundle" element
     */
    public void setBundleArray(org.w3.www.ns.prov.Bundle[] bundleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bundleArray, BUNDLE$50);
        }
    }
    
    /**
     * Sets ith "bundle" element
     */
    public void setBundleArray(int i, org.w3.www.ns.prov.Bundle bundle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Bundle target = null;
            target = (org.w3.www.ns.prov.Bundle)get_store().find_element_user(BUNDLE$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bundle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bundle" element
     */
    public org.w3.www.ns.prov.Bundle insertNewBundle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Bundle target = null;
            target = (org.w3.www.ns.prov.Bundle)get_store().insert_element_user(BUNDLE$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bundle" element
     */
    public org.w3.www.ns.prov.Bundle addNewBundle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Bundle target = null;
            target = (org.w3.www.ns.prov.Bundle)get_store().add_element_user(BUNDLE$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "bundle" element
     */
    public void removeBundle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUNDLE$50, i);
        }
    }
    
    /**
     * Gets array of all "collection" elements
     */
    public org.w3.www.ns.prov.Collection[] getCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLLECTION$52, targetList);
            org.w3.www.ns.prov.Collection[] result = new org.w3.www.ns.prov.Collection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "collection" element
     */
    public org.w3.www.ns.prov.Collection getCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Collection target = null;
            target = (org.w3.www.ns.prov.Collection)get_store().find_element_user(COLLECTION$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "collection" element
     */
    public int sizeOfCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLECTION$52);
        }
    }
    
    /**
     * Sets array of all "collection" element
     */
    public void setCollectionArray(org.w3.www.ns.prov.Collection[] collectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(collectionArray, COLLECTION$52);
        }
    }
    
    /**
     * Sets ith "collection" element
     */
    public void setCollectionArray(int i, org.w3.www.ns.prov.Collection collection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Collection target = null;
            target = (org.w3.www.ns.prov.Collection)get_store().find_element_user(COLLECTION$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(collection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "collection" element
     */
    public org.w3.www.ns.prov.Collection insertNewCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Collection target = null;
            target = (org.w3.www.ns.prov.Collection)get_store().insert_element_user(COLLECTION$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "collection" element
     */
    public org.w3.www.ns.prov.Collection addNewCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Collection target = null;
            target = (org.w3.www.ns.prov.Collection)get_store().add_element_user(COLLECTION$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "collection" element
     */
    public void removeCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLECTION$52, i);
        }
    }
    
    /**
     * Gets array of all "emptyCollection" elements
     */
    public org.w3.www.ns.prov.EmptyCollection[] getEmptyCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMPTYCOLLECTION$54, targetList);
            org.w3.www.ns.prov.EmptyCollection[] result = new org.w3.www.ns.prov.EmptyCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "emptyCollection" element
     */
    public org.w3.www.ns.prov.EmptyCollection getEmptyCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyCollection target = null;
            target = (org.w3.www.ns.prov.EmptyCollection)get_store().find_element_user(EMPTYCOLLECTION$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "emptyCollection" element
     */
    public int sizeOfEmptyCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPTYCOLLECTION$54);
        }
    }
    
    /**
     * Sets array of all "emptyCollection" element
     */
    public void setEmptyCollectionArray(org.w3.www.ns.prov.EmptyCollection[] emptyCollectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(emptyCollectionArray, EMPTYCOLLECTION$54);
        }
    }
    
    /**
     * Sets ith "emptyCollection" element
     */
    public void setEmptyCollectionArray(int i, org.w3.www.ns.prov.EmptyCollection emptyCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyCollection target = null;
            target = (org.w3.www.ns.prov.EmptyCollection)get_store().find_element_user(EMPTYCOLLECTION$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(emptyCollection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "emptyCollection" element
     */
    public org.w3.www.ns.prov.EmptyCollection insertNewEmptyCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyCollection target = null;
            target = (org.w3.www.ns.prov.EmptyCollection)get_store().insert_element_user(EMPTYCOLLECTION$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "emptyCollection" element
     */
    public org.w3.www.ns.prov.EmptyCollection addNewEmptyCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyCollection target = null;
            target = (org.w3.www.ns.prov.EmptyCollection)get_store().add_element_user(EMPTYCOLLECTION$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "emptyCollection" element
     */
    public void removeEmptyCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPTYCOLLECTION$54, i);
        }
    }
    
    /**
     * Gets array of all "dictionary" elements
     */
    public org.w3.www.ns.prov.Dictionary[] getDictionaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DICTIONARY$56, targetList);
            org.w3.www.ns.prov.Dictionary[] result = new org.w3.www.ns.prov.Dictionary[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dictionary" element
     */
    public org.w3.www.ns.prov.Dictionary getDictionaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Dictionary target = null;
            target = (org.w3.www.ns.prov.Dictionary)get_store().find_element_user(DICTIONARY$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dictionary" element
     */
    public int sizeOfDictionaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DICTIONARY$56);
        }
    }
    
    /**
     * Sets array of all "dictionary" element
     */
    public void setDictionaryArray(org.w3.www.ns.prov.Dictionary[] dictionaryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dictionaryArray, DICTIONARY$56);
        }
    }
    
    /**
     * Sets ith "dictionary" element
     */
    public void setDictionaryArray(int i, org.w3.www.ns.prov.Dictionary dictionary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Dictionary target = null;
            target = (org.w3.www.ns.prov.Dictionary)get_store().find_element_user(DICTIONARY$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dictionary);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dictionary" element
     */
    public org.w3.www.ns.prov.Dictionary insertNewDictionary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Dictionary target = null;
            target = (org.w3.www.ns.prov.Dictionary)get_store().insert_element_user(DICTIONARY$56, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dictionary" element
     */
    public org.w3.www.ns.prov.Dictionary addNewDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Dictionary target = null;
            target = (org.w3.www.ns.prov.Dictionary)get_store().add_element_user(DICTIONARY$56);
            return target;
        }
    }
    
    /**
     * Removes the ith "dictionary" element
     */
    public void removeDictionary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DICTIONARY$56, i);
        }
    }
    
    /**
     * Gets array of all "emptyDictionary" elements
     */
    public org.w3.www.ns.prov.EmptyDictionary[] getEmptyDictionaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMPTYDICTIONARY$58, targetList);
            org.w3.www.ns.prov.EmptyDictionary[] result = new org.w3.www.ns.prov.EmptyDictionary[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "emptyDictionary" element
     */
    public org.w3.www.ns.prov.EmptyDictionary getEmptyDictionaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyDictionary target = null;
            target = (org.w3.www.ns.prov.EmptyDictionary)get_store().find_element_user(EMPTYDICTIONARY$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "emptyDictionary" element
     */
    public int sizeOfEmptyDictionaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPTYDICTIONARY$58);
        }
    }
    
    /**
     * Sets array of all "emptyDictionary" element
     */
    public void setEmptyDictionaryArray(org.w3.www.ns.prov.EmptyDictionary[] emptyDictionaryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(emptyDictionaryArray, EMPTYDICTIONARY$58);
        }
    }
    
    /**
     * Sets ith "emptyDictionary" element
     */
    public void setEmptyDictionaryArray(int i, org.w3.www.ns.prov.EmptyDictionary emptyDictionary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyDictionary target = null;
            target = (org.w3.www.ns.prov.EmptyDictionary)get_store().find_element_user(EMPTYDICTIONARY$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(emptyDictionary);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "emptyDictionary" element
     */
    public org.w3.www.ns.prov.EmptyDictionary insertNewEmptyDictionary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyDictionary target = null;
            target = (org.w3.www.ns.prov.EmptyDictionary)get_store().insert_element_user(EMPTYDICTIONARY$58, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "emptyDictionary" element
     */
    public org.w3.www.ns.prov.EmptyDictionary addNewEmptyDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyDictionary target = null;
            target = (org.w3.www.ns.prov.EmptyDictionary)get_store().add_element_user(EMPTYDICTIONARY$58);
            return target;
        }
    }
    
    /**
     * Removes the ith "emptyDictionary" element
     */
    public void removeEmptyDictionary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPTYDICTIONARY$58, i);
        }
    }
    
    /**
     * Gets array of all "hadDictionaryMember" elements
     */
    public org.w3.www.ns.prov.DictionaryMembership[] getHadDictionaryMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HADDICTIONARYMEMBER$60, targetList);
            org.w3.www.ns.prov.DictionaryMembership[] result = new org.w3.www.ns.prov.DictionaryMembership[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hadDictionaryMember" element
     */
    public org.w3.www.ns.prov.DictionaryMembership getHadDictionaryMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.DictionaryMembership target = null;
            target = (org.w3.www.ns.prov.DictionaryMembership)get_store().find_element_user(HADDICTIONARYMEMBER$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hadDictionaryMember" element
     */
    public int sizeOfHadDictionaryMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HADDICTIONARYMEMBER$60);
        }
    }
    
    /**
     * Sets array of all "hadDictionaryMember" element
     */
    public void setHadDictionaryMemberArray(org.w3.www.ns.prov.DictionaryMembership[] hadDictionaryMemberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hadDictionaryMemberArray, HADDICTIONARYMEMBER$60);
        }
    }
    
    /**
     * Sets ith "hadDictionaryMember" element
     */
    public void setHadDictionaryMemberArray(int i, org.w3.www.ns.prov.DictionaryMembership hadDictionaryMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.DictionaryMembership target = null;
            target = (org.w3.www.ns.prov.DictionaryMembership)get_store().find_element_user(HADDICTIONARYMEMBER$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hadDictionaryMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hadDictionaryMember" element
     */
    public org.w3.www.ns.prov.DictionaryMembership insertNewHadDictionaryMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.DictionaryMembership target = null;
            target = (org.w3.www.ns.prov.DictionaryMembership)get_store().insert_element_user(HADDICTIONARYMEMBER$60, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hadDictionaryMember" element
     */
    public org.w3.www.ns.prov.DictionaryMembership addNewHadDictionaryMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.DictionaryMembership target = null;
            target = (org.w3.www.ns.prov.DictionaryMembership)get_store().add_element_user(HADDICTIONARYMEMBER$60);
            return target;
        }
    }
    
    /**
     * Removes the ith "hadDictionaryMember" element
     */
    public void removeHadDictionaryMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HADDICTIONARYMEMBER$60, i);
        }
    }
    
    /**
     * Gets array of all "derivedByInsertionFrom" elements
     */
    public org.w3.www.ns.prov.Insertion[] getDerivedByInsertionFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DERIVEDBYINSERTIONFROM$62, targetList);
            org.w3.www.ns.prov.Insertion[] result = new org.w3.www.ns.prov.Insertion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "derivedByInsertionFrom" element
     */
    public org.w3.www.ns.prov.Insertion getDerivedByInsertionFromArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Insertion target = null;
            target = (org.w3.www.ns.prov.Insertion)get_store().find_element_user(DERIVEDBYINSERTIONFROM$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "derivedByInsertionFrom" element
     */
    public int sizeOfDerivedByInsertionFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DERIVEDBYINSERTIONFROM$62);
        }
    }
    
    /**
     * Sets array of all "derivedByInsertionFrom" element
     */
    public void setDerivedByInsertionFromArray(org.w3.www.ns.prov.Insertion[] derivedByInsertionFromArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(derivedByInsertionFromArray, DERIVEDBYINSERTIONFROM$62);
        }
    }
    
    /**
     * Sets ith "derivedByInsertionFrom" element
     */
    public void setDerivedByInsertionFromArray(int i, org.w3.www.ns.prov.Insertion derivedByInsertionFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Insertion target = null;
            target = (org.w3.www.ns.prov.Insertion)get_store().find_element_user(DERIVEDBYINSERTIONFROM$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(derivedByInsertionFrom);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "derivedByInsertionFrom" element
     */
    public org.w3.www.ns.prov.Insertion insertNewDerivedByInsertionFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Insertion target = null;
            target = (org.w3.www.ns.prov.Insertion)get_store().insert_element_user(DERIVEDBYINSERTIONFROM$62, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "derivedByInsertionFrom" element
     */
    public org.w3.www.ns.prov.Insertion addNewDerivedByInsertionFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Insertion target = null;
            target = (org.w3.www.ns.prov.Insertion)get_store().add_element_user(DERIVEDBYINSERTIONFROM$62);
            return target;
        }
    }
    
    /**
     * Removes the ith "derivedByInsertionFrom" element
     */
    public void removeDerivedByInsertionFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DERIVEDBYINSERTIONFROM$62, i);
        }
    }
    
    /**
     * Gets array of all "derivedByRemovalFrom" elements
     */
    public org.w3.www.ns.prov.Removal[] getDerivedByRemovalFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DERIVEDBYREMOVALFROM$64, targetList);
            org.w3.www.ns.prov.Removal[] result = new org.w3.www.ns.prov.Removal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "derivedByRemovalFrom" element
     */
    public org.w3.www.ns.prov.Removal getDerivedByRemovalFromArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Removal target = null;
            target = (org.w3.www.ns.prov.Removal)get_store().find_element_user(DERIVEDBYREMOVALFROM$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "derivedByRemovalFrom" element
     */
    public int sizeOfDerivedByRemovalFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DERIVEDBYREMOVALFROM$64);
        }
    }
    
    /**
     * Sets array of all "derivedByRemovalFrom" element
     */
    public void setDerivedByRemovalFromArray(org.w3.www.ns.prov.Removal[] derivedByRemovalFromArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(derivedByRemovalFromArray, DERIVEDBYREMOVALFROM$64);
        }
    }
    
    /**
     * Sets ith "derivedByRemovalFrom" element
     */
    public void setDerivedByRemovalFromArray(int i, org.w3.www.ns.prov.Removal derivedByRemovalFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Removal target = null;
            target = (org.w3.www.ns.prov.Removal)get_store().find_element_user(DERIVEDBYREMOVALFROM$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(derivedByRemovalFrom);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "derivedByRemovalFrom" element
     */
    public org.w3.www.ns.prov.Removal insertNewDerivedByRemovalFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Removal target = null;
            target = (org.w3.www.ns.prov.Removal)get_store().insert_element_user(DERIVEDBYREMOVALFROM$64, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "derivedByRemovalFrom" element
     */
    public org.w3.www.ns.prov.Removal addNewDerivedByRemovalFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Removal target = null;
            target = (org.w3.www.ns.prov.Removal)get_store().add_element_user(DERIVEDBYREMOVALFROM$64);
            return target;
        }
    }
    
    /**
     * Removes the ith "derivedByRemovalFrom" element
     */
    public void removeDerivedByRemovalFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DERIVEDBYREMOVALFROM$64, i);
        }
    }
    
    /**
     * Gets array of all "others" elements
     */
    public org.w3.www.ns.prov.Others[] getOthersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OTHERS$66, targetList);
            org.w3.www.ns.prov.Others[] result = new org.w3.www.ns.prov.Others[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "others" element
     */
    public org.w3.www.ns.prov.Others getOthersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Others target = null;
            target = (org.w3.www.ns.prov.Others)get_store().find_element_user(OTHERS$66, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "others" element
     */
    public int sizeOfOthersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERS$66);
        }
    }
    
    /**
     * Sets array of all "others" element
     */
    public void setOthersArray(org.w3.www.ns.prov.Others[] othersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(othersArray, OTHERS$66);
        }
    }
    
    /**
     * Sets ith "others" element
     */
    public void setOthersArray(int i, org.w3.www.ns.prov.Others others)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Others target = null;
            target = (org.w3.www.ns.prov.Others)get_store().find_element_user(OTHERS$66, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(others);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "others" element
     */
    public org.w3.www.ns.prov.Others insertNewOthers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Others target = null;
            target = (org.w3.www.ns.prov.Others)get_store().insert_element_user(OTHERS$66, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "others" element
     */
    public org.w3.www.ns.prov.Others addNewOthers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Others target = null;
            target = (org.w3.www.ns.prov.Others)get_store().add_element_user(OTHERS$66);
            return target;
        }
    }
    
    /**
     * Removes the ith "others" element
     */
    public void removeOthers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERS$66, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public javax.xml.namespace.QName getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$68);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ID$68);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$68) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(javax.xml.namespace.QName id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$68);
            }
            target.setQNameValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlQName id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ID$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ID$68);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$68);
        }
    }
}
