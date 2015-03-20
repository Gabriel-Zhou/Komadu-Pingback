/*
 * XML Type:  entityEntityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.EntityEntityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML entityEntityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class EntityEntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.EntityEntityType
{
    
    public EntityEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY1$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "entity1");
    private static final javax.xml.namespace.QName ENTITY2$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "entity2");
    private static final javax.xml.namespace.QName DERIVATION$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "derivation");
    private static final javax.xml.namespace.QName REVISION$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "revision");
    private static final javax.xml.namespace.QName QUOTATION$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "quotation");
    private static final javax.xml.namespace.QName PRIMARYSOURCE$10 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "primarySource");
    private static final javax.xml.namespace.QName ALTERNATE$12 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "alternate");
    private static final javax.xml.namespace.QName SPECIALIZATION$14 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "specialization");
    private static final javax.xml.namespace.QName MEMBERSHIP$16 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "membership");
    
    
    /**
     * Gets the "entity1" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType getEntity1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().find_element_user(ENTITY1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity1" element
     */
    public void setEntity1(edu.indiana.d2i.komadu.axis2.client.EntityType entity1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().find_element_user(ENTITY1$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().add_element_user(ENTITY1$0);
            }
            target.set(entity1);
        }
    }
    
    /**
     * Appends and returns a new empty "entity1" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType addNewEntity1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().add_element_user(ENTITY1$0);
            return target;
        }
    }
    
    /**
     * Gets the "entity2" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType getEntity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().find_element_user(ENTITY2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity2" element
     */
    public void setEntity2(edu.indiana.d2i.komadu.axis2.client.EntityType entity2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().find_element_user(ENTITY2$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().add_element_user(ENTITY2$2);
            }
            target.set(entity2);
        }
    }
    
    /**
     * Appends and returns a new empty "entity2" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType addNewEntity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().add_element_user(ENTITY2$2);
            return target;
        }
    }
    
    /**
     * Gets the "derivation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.DerivationType getDerivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.DerivationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.DerivationType)get_store().find_element_user(DERIVATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "derivation" element
     */
    public boolean isSetDerivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DERIVATION$4) != 0;
        }
    }
    
    /**
     * Sets the "derivation" element
     */
    public void setDerivation(edu.indiana.d2i.komadu.axis2.client.DerivationType derivation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.DerivationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.DerivationType)get_store().find_element_user(DERIVATION$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.DerivationType)get_store().add_element_user(DERIVATION$4);
            }
            target.set(derivation);
        }
    }
    
    /**
     * Appends and returns a new empty "derivation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.DerivationType addNewDerivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.DerivationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.DerivationType)get_store().add_element_user(DERIVATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "derivation" element
     */
    public void unsetDerivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DERIVATION$4, 0);
        }
    }
    
    /**
     * Gets the "revision" element
     */
    public edu.indiana.d2i.komadu.axis2.client.RevisionType getRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.RevisionType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.RevisionType)get_store().find_element_user(REVISION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "revision" element
     */
    public boolean isSetRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVISION$6) != 0;
        }
    }
    
    /**
     * Sets the "revision" element
     */
    public void setRevision(edu.indiana.d2i.komadu.axis2.client.RevisionType revision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.RevisionType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.RevisionType)get_store().find_element_user(REVISION$6, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.RevisionType)get_store().add_element_user(REVISION$6);
            }
            target.set(revision);
        }
    }
    
    /**
     * Appends and returns a new empty "revision" element
     */
    public edu.indiana.d2i.komadu.axis2.client.RevisionType addNewRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.RevisionType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.RevisionType)get_store().add_element_user(REVISION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "revision" element
     */
    public void unsetRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVISION$6, 0);
        }
    }
    
    /**
     * Gets the "quotation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.QuotationType getQuotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.QuotationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.QuotationType)get_store().find_element_user(QUOTATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quotation" element
     */
    public boolean isSetQuotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUOTATION$8) != 0;
        }
    }
    
    /**
     * Sets the "quotation" element
     */
    public void setQuotation(edu.indiana.d2i.komadu.axis2.client.QuotationType quotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.QuotationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.QuotationType)get_store().find_element_user(QUOTATION$8, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.QuotationType)get_store().add_element_user(QUOTATION$8);
            }
            target.set(quotation);
        }
    }
    
    /**
     * Appends and returns a new empty "quotation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.QuotationType addNewQuotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.QuotationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.QuotationType)get_store().add_element_user(QUOTATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "quotation" element
     */
    public void unsetQuotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUOTATION$8, 0);
        }
    }
    
    /**
     * Gets the "primarySource" element
     */
    public edu.indiana.d2i.komadu.axis2.client.PrimarySourceType getPrimarySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.PrimarySourceType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.PrimarySourceType)get_store().find_element_user(PRIMARYSOURCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "primarySource" element
     */
    public boolean isSetPrimarySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYSOURCE$10) != 0;
        }
    }
    
    /**
     * Sets the "primarySource" element
     */
    public void setPrimarySource(edu.indiana.d2i.komadu.axis2.client.PrimarySourceType primarySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.PrimarySourceType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.PrimarySourceType)get_store().find_element_user(PRIMARYSOURCE$10, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.PrimarySourceType)get_store().add_element_user(PRIMARYSOURCE$10);
            }
            target.set(primarySource);
        }
    }
    
    /**
     * Appends and returns a new empty "primarySource" element
     */
    public edu.indiana.d2i.komadu.axis2.client.PrimarySourceType addNewPrimarySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.PrimarySourceType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.PrimarySourceType)get_store().add_element_user(PRIMARYSOURCE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "primarySource" element
     */
    public void unsetPrimarySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYSOURCE$10, 0);
        }
    }
    
    /**
     * Gets the "alternate" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AlternateType getAlternate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AlternateType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AlternateType)get_store().find_element_user(ALTERNATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "alternate" element
     */
    public boolean isSetAlternate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTERNATE$12) != 0;
        }
    }
    
    /**
     * Sets the "alternate" element
     */
    public void setAlternate(edu.indiana.d2i.komadu.axis2.client.AlternateType alternate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AlternateType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AlternateType)get_store().find_element_user(ALTERNATE$12, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AlternateType)get_store().add_element_user(ALTERNATE$12);
            }
            target.set(alternate);
        }
    }
    
    /**
     * Appends and returns a new empty "alternate" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AlternateType addNewAlternate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AlternateType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AlternateType)get_store().add_element_user(ALTERNATE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "alternate" element
     */
    public void unsetAlternate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTERNATE$12, 0);
        }
    }
    
    /**
     * Gets the "specialization" element
     */
    public edu.indiana.d2i.komadu.axis2.client.SpecializationType getSpecialization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.SpecializationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.SpecializationType)get_store().find_element_user(SPECIALIZATION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "specialization" element
     */
    public boolean isSetSpecialization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIALIZATION$14) != 0;
        }
    }
    
    /**
     * Sets the "specialization" element
     */
    public void setSpecialization(edu.indiana.d2i.komadu.axis2.client.SpecializationType specialization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.SpecializationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.SpecializationType)get_store().find_element_user(SPECIALIZATION$14, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.SpecializationType)get_store().add_element_user(SPECIALIZATION$14);
            }
            target.set(specialization);
        }
    }
    
    /**
     * Appends and returns a new empty "specialization" element
     */
    public edu.indiana.d2i.komadu.axis2.client.SpecializationType addNewSpecialization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.SpecializationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.SpecializationType)get_store().add_element_user(SPECIALIZATION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "specialization" element
     */
    public void unsetSpecialization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIALIZATION$14, 0);
        }
    }
    
    /**
     * Gets the "membership" element
     */
    public edu.indiana.d2i.komadu.axis2.client.MembershipType getMembership()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.MembershipType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.MembershipType)get_store().find_element_user(MEMBERSHIP$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "membership" element
     */
    public boolean isSetMembership()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBERSHIP$16) != 0;
        }
    }
    
    /**
     * Sets the "membership" element
     */
    public void setMembership(edu.indiana.d2i.komadu.axis2.client.MembershipType membership)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.MembershipType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.MembershipType)get_store().find_element_user(MEMBERSHIP$16, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.MembershipType)get_store().add_element_user(MEMBERSHIP$16);
            }
            target.set(membership);
        }
    }
    
    /**
     * Appends and returns a new empty "membership" element
     */
    public edu.indiana.d2i.komadu.axis2.client.MembershipType addNewMembership()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.MembershipType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.MembershipType)get_store().add_element_user(MEMBERSHIP$16);
            return target;
        }
    }
    
    /**
     * Unsets the "membership" element
     */
    public void unsetMembership()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBERSHIP$16, 0);
        }
    }
}
