/*
 * XML Type:  activityEntityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.ActivityEntityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML activityEntityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class ActivityEntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.ActivityEntityType
{
    
    public ActivityEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITY$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "activity");
    private static final javax.xml.namespace.QName ENTITY$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "entity");
    private static final javax.xml.namespace.QName USAGE$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "usage");
    private static final javax.xml.namespace.QName GENERATION$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "generation");
    private static final javax.xml.namespace.QName START$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "start");
    private static final javax.xml.namespace.QName END$10 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "end");
    private static final javax.xml.namespace.QName INVALIDATION$12 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "invalidation");
    private static final javax.xml.namespace.QName ATTRIBUTES$14 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attributes");
    
    
    /**
     * Gets the "activity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityType getActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().find_element_user(ACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activity" element
     */
    public void setActivity(edu.indiana.d2i.komadu.axis2.client.ActivityType activity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().find_element_user(ACTIVITY$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().add_element_user(ACTIVITY$0);
            }
            target.set(activity);
        }
    }
    
    /**
     * Appends and returns a new empty "activity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityType addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().add_element_user(ACTIVITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "entity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType getEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().find_element_user(ENTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity" element
     */
    public void setEntity(edu.indiana.d2i.komadu.axis2.client.EntityType entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().find_element_user(ENTITY$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().add_element_user(ENTITY$2);
            }
            target.set(entity);
        }
    }
    
    /**
     * Appends and returns a new empty "entity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().add_element_user(ENTITY$2);
            return target;
        }
    }
    
    /**
     * Gets the "usage" element
     */
    public edu.indiana.d2i.komadu.axis2.client.UsageType getUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.UsageType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.UsageType)get_store().find_element_user(USAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usage" element
     */
    public boolean isSetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "usage" element
     */
    public void setUsage(edu.indiana.d2i.komadu.axis2.client.UsageType usage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.UsageType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.UsageType)get_store().find_element_user(USAGE$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.UsageType)get_store().add_element_user(USAGE$4);
            }
            target.set(usage);
        }
    }
    
    /**
     * Appends and returns a new empty "usage" element
     */
    public edu.indiana.d2i.komadu.axis2.client.UsageType addNewUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.UsageType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.UsageType)get_store().add_element_user(USAGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "usage" element
     */
    public void unsetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USAGE$4, 0);
        }
    }
    
    /**
     * Gets the "generation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.GenerationType getGeneration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.GenerationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.GenerationType)get_store().find_element_user(GENERATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "generation" element
     */
    public boolean isSetGeneration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERATION$6) != 0;
        }
    }
    
    /**
     * Sets the "generation" element
     */
    public void setGeneration(edu.indiana.d2i.komadu.axis2.client.GenerationType generation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.GenerationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.GenerationType)get_store().find_element_user(GENERATION$6, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.GenerationType)get_store().add_element_user(GENERATION$6);
            }
            target.set(generation);
        }
    }
    
    /**
     * Appends and returns a new empty "generation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.GenerationType addNewGeneration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.GenerationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.GenerationType)get_store().add_element_user(GENERATION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "generation" element
     */
    public void unsetGeneration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERATION$6, 0);
        }
    }
    
    /**
     * Gets the "start" element
     */
    public edu.indiana.d2i.komadu.axis2.client.StartType getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.StartType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.StartType)get_store().find_element_user(START$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "start" element
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(START$8) != 0;
        }
    }
    
    /**
     * Sets the "start" element
     */
    public void setStart(edu.indiana.d2i.komadu.axis2.client.StartType start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.StartType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.StartType)get_store().find_element_user(START$8, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.StartType)get_store().add_element_user(START$8);
            }
            target.set(start);
        }
    }
    
    /**
     * Appends and returns a new empty "start" element
     */
    public edu.indiana.d2i.komadu.axis2.client.StartType addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.StartType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.StartType)get_store().add_element_user(START$8);
            return target;
        }
    }
    
    /**
     * Unsets the "start" element
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(START$8, 0);
        }
    }
    
    /**
     * Gets the "end" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EndType getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EndType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EndType)get_store().find_element_user(END$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "end" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$10) != 0;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(edu.indiana.d2i.komadu.axis2.client.EndType end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EndType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EndType)get_store().find_element_user(END$10, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.EndType)get_store().add_element_user(END$10);
            }
            target.set(end);
        }
    }
    
    /**
     * Appends and returns a new empty "end" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EndType addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EndType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EndType)get_store().add_element_user(END$10);
            return target;
        }
    }
    
    /**
     * Unsets the "end" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$10, 0);
        }
    }
    
    /**
     * Gets the "invalidation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.InvalidationType getInvalidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.InvalidationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.InvalidationType)get_store().find_element_user(INVALIDATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "invalidation" element
     */
    public boolean isSetInvalidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVALIDATION$12) != 0;
        }
    }
    
    /**
     * Sets the "invalidation" element
     */
    public void setInvalidation(edu.indiana.d2i.komadu.axis2.client.InvalidationType invalidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.InvalidationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.InvalidationType)get_store().find_element_user(INVALIDATION$12, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.InvalidationType)get_store().add_element_user(INVALIDATION$12);
            }
            target.set(invalidation);
        }
    }
    
    /**
     * Appends and returns a new empty "invalidation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.InvalidationType addNewInvalidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.InvalidationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.InvalidationType)get_store().add_element_user(INVALIDATION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "invalidation" element
     */
    public void unsetInvalidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVALIDATION$12, 0);
        }
    }
    
    /**
     * Gets the "attributes" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributesType getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$14) != 0;
        }
    }
    
    /**
     * Sets the "attributes" element
     */
    public void setAttributes(edu.indiana.d2i.komadu.axis2.client.AttributesType attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$14, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$14);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "attributes" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributesType addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$14);
            return target;
        }
    }
    
    /**
     * Unsets the "attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$14, 0);
        }
    }
}
