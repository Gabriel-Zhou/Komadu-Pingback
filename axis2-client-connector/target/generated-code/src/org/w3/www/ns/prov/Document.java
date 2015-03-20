/*
 * XML Type:  Document
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.Document
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov;


/**
 * An XML Document(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public interface Document extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("document8b60type");
    
    /**
     * Gets array of all "entity" elements
     */
    org.w3.www.ns.prov.Entity[] getEntityArray();
    
    /**
     * Gets ith "entity" element
     */
    org.w3.www.ns.prov.Entity getEntityArray(int i);
    
    /**
     * Returns number of "entity" element
     */
    int sizeOfEntityArray();
    
    /**
     * Sets array of all "entity" element
     */
    void setEntityArray(org.w3.www.ns.prov.Entity[] entityArray);
    
    /**
     * Sets ith "entity" element
     */
    void setEntityArray(int i, org.w3.www.ns.prov.Entity entity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entity" element
     */
    org.w3.www.ns.prov.Entity insertNewEntity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entity" element
     */
    org.w3.www.ns.prov.Entity addNewEntity();
    
    /**
     * Removes the ith "entity" element
     */
    void removeEntity(int i);
    
    /**
     * Gets array of all "activity" elements
     */
    org.w3.www.ns.prov.Activity[] getActivityArray();
    
    /**
     * Gets ith "activity" element
     */
    org.w3.www.ns.prov.Activity getActivityArray(int i);
    
    /**
     * Returns number of "activity" element
     */
    int sizeOfActivityArray();
    
    /**
     * Sets array of all "activity" element
     */
    void setActivityArray(org.w3.www.ns.prov.Activity[] activityArray);
    
    /**
     * Sets ith "activity" element
     */
    void setActivityArray(int i, org.w3.www.ns.prov.Activity activity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activity" element
     */
    org.w3.www.ns.prov.Activity insertNewActivity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activity" element
     */
    org.w3.www.ns.prov.Activity addNewActivity();
    
    /**
     * Removes the ith "activity" element
     */
    void removeActivity(int i);
    
    /**
     * Gets array of all "wasGeneratedBy" elements
     */
    org.w3.www.ns.prov.Generation[] getWasGeneratedByArray();
    
    /**
     * Gets ith "wasGeneratedBy" element
     */
    org.w3.www.ns.prov.Generation getWasGeneratedByArray(int i);
    
    /**
     * Returns number of "wasGeneratedBy" element
     */
    int sizeOfWasGeneratedByArray();
    
    /**
     * Sets array of all "wasGeneratedBy" element
     */
    void setWasGeneratedByArray(org.w3.www.ns.prov.Generation[] wasGeneratedByArray);
    
    /**
     * Sets ith "wasGeneratedBy" element
     */
    void setWasGeneratedByArray(int i, org.w3.www.ns.prov.Generation wasGeneratedBy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasGeneratedBy" element
     */
    org.w3.www.ns.prov.Generation insertNewWasGeneratedBy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasGeneratedBy" element
     */
    org.w3.www.ns.prov.Generation addNewWasGeneratedBy();
    
    /**
     * Removes the ith "wasGeneratedBy" element
     */
    void removeWasGeneratedBy(int i);
    
    /**
     * Gets array of all "used" elements
     */
    org.w3.www.ns.prov.Usage[] getUsedArray();
    
    /**
     * Gets ith "used" element
     */
    org.w3.www.ns.prov.Usage getUsedArray(int i);
    
    /**
     * Returns number of "used" element
     */
    int sizeOfUsedArray();
    
    /**
     * Sets array of all "used" element
     */
    void setUsedArray(org.w3.www.ns.prov.Usage[] usedArray);
    
    /**
     * Sets ith "used" element
     */
    void setUsedArray(int i, org.w3.www.ns.prov.Usage used);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "used" element
     */
    org.w3.www.ns.prov.Usage insertNewUsed(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "used" element
     */
    org.w3.www.ns.prov.Usage addNewUsed();
    
    /**
     * Removes the ith "used" element
     */
    void removeUsed(int i);
    
    /**
     * Gets array of all "wasInformedBy" elements
     */
    org.w3.www.ns.prov.Communication[] getWasInformedByArray();
    
    /**
     * Gets ith "wasInformedBy" element
     */
    org.w3.www.ns.prov.Communication getWasInformedByArray(int i);
    
    /**
     * Returns number of "wasInformedBy" element
     */
    int sizeOfWasInformedByArray();
    
    /**
     * Sets array of all "wasInformedBy" element
     */
    void setWasInformedByArray(org.w3.www.ns.prov.Communication[] wasInformedByArray);
    
    /**
     * Sets ith "wasInformedBy" element
     */
    void setWasInformedByArray(int i, org.w3.www.ns.prov.Communication wasInformedBy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasInformedBy" element
     */
    org.w3.www.ns.prov.Communication insertNewWasInformedBy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasInformedBy" element
     */
    org.w3.www.ns.prov.Communication addNewWasInformedBy();
    
    /**
     * Removes the ith "wasInformedBy" element
     */
    void removeWasInformedBy(int i);
    
    /**
     * Gets array of all "wasStartedBy" elements
     */
    org.w3.www.ns.prov.Start[] getWasStartedByArray();
    
    /**
     * Gets ith "wasStartedBy" element
     */
    org.w3.www.ns.prov.Start getWasStartedByArray(int i);
    
    /**
     * Returns number of "wasStartedBy" element
     */
    int sizeOfWasStartedByArray();
    
    /**
     * Sets array of all "wasStartedBy" element
     */
    void setWasStartedByArray(org.w3.www.ns.prov.Start[] wasStartedByArray);
    
    /**
     * Sets ith "wasStartedBy" element
     */
    void setWasStartedByArray(int i, org.w3.www.ns.prov.Start wasStartedBy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasStartedBy" element
     */
    org.w3.www.ns.prov.Start insertNewWasStartedBy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasStartedBy" element
     */
    org.w3.www.ns.prov.Start addNewWasStartedBy();
    
    /**
     * Removes the ith "wasStartedBy" element
     */
    void removeWasStartedBy(int i);
    
    /**
     * Gets array of all "wasEndedBy" elements
     */
    org.w3.www.ns.prov.End[] getWasEndedByArray();
    
    /**
     * Gets ith "wasEndedBy" element
     */
    org.w3.www.ns.prov.End getWasEndedByArray(int i);
    
    /**
     * Returns number of "wasEndedBy" element
     */
    int sizeOfWasEndedByArray();
    
    /**
     * Sets array of all "wasEndedBy" element
     */
    void setWasEndedByArray(org.w3.www.ns.prov.End[] wasEndedByArray);
    
    /**
     * Sets ith "wasEndedBy" element
     */
    void setWasEndedByArray(int i, org.w3.www.ns.prov.End wasEndedBy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasEndedBy" element
     */
    org.w3.www.ns.prov.End insertNewWasEndedBy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasEndedBy" element
     */
    org.w3.www.ns.prov.End addNewWasEndedBy();
    
    /**
     * Removes the ith "wasEndedBy" element
     */
    void removeWasEndedBy(int i);
    
    /**
     * Gets array of all "wasInvalidatedBy" elements
     */
    org.w3.www.ns.prov.Invalidation[] getWasInvalidatedByArray();
    
    /**
     * Gets ith "wasInvalidatedBy" element
     */
    org.w3.www.ns.prov.Invalidation getWasInvalidatedByArray(int i);
    
    /**
     * Returns number of "wasInvalidatedBy" element
     */
    int sizeOfWasInvalidatedByArray();
    
    /**
     * Sets array of all "wasInvalidatedBy" element
     */
    void setWasInvalidatedByArray(org.w3.www.ns.prov.Invalidation[] wasInvalidatedByArray);
    
    /**
     * Sets ith "wasInvalidatedBy" element
     */
    void setWasInvalidatedByArray(int i, org.w3.www.ns.prov.Invalidation wasInvalidatedBy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasInvalidatedBy" element
     */
    org.w3.www.ns.prov.Invalidation insertNewWasInvalidatedBy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasInvalidatedBy" element
     */
    org.w3.www.ns.prov.Invalidation addNewWasInvalidatedBy();
    
    /**
     * Removes the ith "wasInvalidatedBy" element
     */
    void removeWasInvalidatedBy(int i);
    
    /**
     * Gets array of all "wasDerivedFrom" elements
     */
    org.w3.www.ns.prov.Derivation[] getWasDerivedFromArray();
    
    /**
     * Gets ith "wasDerivedFrom" element
     */
    org.w3.www.ns.prov.Derivation getWasDerivedFromArray(int i);
    
    /**
     * Returns number of "wasDerivedFrom" element
     */
    int sizeOfWasDerivedFromArray();
    
    /**
     * Sets array of all "wasDerivedFrom" element
     */
    void setWasDerivedFromArray(org.w3.www.ns.prov.Derivation[] wasDerivedFromArray);
    
    /**
     * Sets ith "wasDerivedFrom" element
     */
    void setWasDerivedFromArray(int i, org.w3.www.ns.prov.Derivation wasDerivedFrom);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasDerivedFrom" element
     */
    org.w3.www.ns.prov.Derivation insertNewWasDerivedFrom(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasDerivedFrom" element
     */
    org.w3.www.ns.prov.Derivation addNewWasDerivedFrom();
    
    /**
     * Removes the ith "wasDerivedFrom" element
     */
    void removeWasDerivedFrom(int i);
    
    /**
     * Gets array of all "agent" elements
     */
    org.w3.www.ns.prov.Agent[] getAgentArray();
    
    /**
     * Gets ith "agent" element
     */
    org.w3.www.ns.prov.Agent getAgentArray(int i);
    
    /**
     * Returns number of "agent" element
     */
    int sizeOfAgentArray();
    
    /**
     * Sets array of all "agent" element
     */
    void setAgentArray(org.w3.www.ns.prov.Agent[] agentArray);
    
    /**
     * Sets ith "agent" element
     */
    void setAgentArray(int i, org.w3.www.ns.prov.Agent agent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "agent" element
     */
    org.w3.www.ns.prov.Agent insertNewAgent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "agent" element
     */
    org.w3.www.ns.prov.Agent addNewAgent();
    
    /**
     * Removes the ith "agent" element
     */
    void removeAgent(int i);
    
    /**
     * Gets array of all "wasAttributedTo" elements
     */
    org.w3.www.ns.prov.Attribution[] getWasAttributedToArray();
    
    /**
     * Gets ith "wasAttributedTo" element
     */
    org.w3.www.ns.prov.Attribution getWasAttributedToArray(int i);
    
    /**
     * Returns number of "wasAttributedTo" element
     */
    int sizeOfWasAttributedToArray();
    
    /**
     * Sets array of all "wasAttributedTo" element
     */
    void setWasAttributedToArray(org.w3.www.ns.prov.Attribution[] wasAttributedToArray);
    
    /**
     * Sets ith "wasAttributedTo" element
     */
    void setWasAttributedToArray(int i, org.w3.www.ns.prov.Attribution wasAttributedTo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasAttributedTo" element
     */
    org.w3.www.ns.prov.Attribution insertNewWasAttributedTo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasAttributedTo" element
     */
    org.w3.www.ns.prov.Attribution addNewWasAttributedTo();
    
    /**
     * Removes the ith "wasAttributedTo" element
     */
    void removeWasAttributedTo(int i);
    
    /**
     * Gets array of all "wasAssociatedWith" elements
     */
    org.w3.www.ns.prov.Association[] getWasAssociatedWithArray();
    
    /**
     * Gets ith "wasAssociatedWith" element
     */
    org.w3.www.ns.prov.Association getWasAssociatedWithArray(int i);
    
    /**
     * Returns number of "wasAssociatedWith" element
     */
    int sizeOfWasAssociatedWithArray();
    
    /**
     * Sets array of all "wasAssociatedWith" element
     */
    void setWasAssociatedWithArray(org.w3.www.ns.prov.Association[] wasAssociatedWithArray);
    
    /**
     * Sets ith "wasAssociatedWith" element
     */
    void setWasAssociatedWithArray(int i, org.w3.www.ns.prov.Association wasAssociatedWith);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasAssociatedWith" element
     */
    org.w3.www.ns.prov.Association insertNewWasAssociatedWith(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasAssociatedWith" element
     */
    org.w3.www.ns.prov.Association addNewWasAssociatedWith();
    
    /**
     * Removes the ith "wasAssociatedWith" element
     */
    void removeWasAssociatedWith(int i);
    
    /**
     * Gets array of all "actedOnBehalfOf" elements
     */
    org.w3.www.ns.prov.Delegation[] getActedOnBehalfOfArray();
    
    /**
     * Gets ith "actedOnBehalfOf" element
     */
    org.w3.www.ns.prov.Delegation getActedOnBehalfOfArray(int i);
    
    /**
     * Returns number of "actedOnBehalfOf" element
     */
    int sizeOfActedOnBehalfOfArray();
    
    /**
     * Sets array of all "actedOnBehalfOf" element
     */
    void setActedOnBehalfOfArray(org.w3.www.ns.prov.Delegation[] actedOnBehalfOfArray);
    
    /**
     * Sets ith "actedOnBehalfOf" element
     */
    void setActedOnBehalfOfArray(int i, org.w3.www.ns.prov.Delegation actedOnBehalfOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actedOnBehalfOf" element
     */
    org.w3.www.ns.prov.Delegation insertNewActedOnBehalfOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actedOnBehalfOf" element
     */
    org.w3.www.ns.prov.Delegation addNewActedOnBehalfOf();
    
    /**
     * Removes the ith "actedOnBehalfOf" element
     */
    void removeActedOnBehalfOf(int i);
    
    /**
     * Gets array of all "wasInfluencedBy" elements
     */
    org.w3.www.ns.prov.Influence[] getWasInfluencedByArray();
    
    /**
     * Gets ith "wasInfluencedBy" element
     */
    org.w3.www.ns.prov.Influence getWasInfluencedByArray(int i);
    
    /**
     * Returns number of "wasInfluencedBy" element
     */
    int sizeOfWasInfluencedByArray();
    
    /**
     * Sets array of all "wasInfluencedBy" element
     */
    void setWasInfluencedByArray(org.w3.www.ns.prov.Influence[] wasInfluencedByArray);
    
    /**
     * Sets ith "wasInfluencedBy" element
     */
    void setWasInfluencedByArray(int i, org.w3.www.ns.prov.Influence wasInfluencedBy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasInfluencedBy" element
     */
    org.w3.www.ns.prov.Influence insertNewWasInfluencedBy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasInfluencedBy" element
     */
    org.w3.www.ns.prov.Influence addNewWasInfluencedBy();
    
    /**
     * Removes the ith "wasInfluencedBy" element
     */
    void removeWasInfluencedBy(int i);
    
    /**
     * Gets array of all "specializationOf" elements
     */
    org.w3.www.ns.prov.Specialization[] getSpecializationOfArray();
    
    /**
     * Gets ith "specializationOf" element
     */
    org.w3.www.ns.prov.Specialization getSpecializationOfArray(int i);
    
    /**
     * Returns number of "specializationOf" element
     */
    int sizeOfSpecializationOfArray();
    
    /**
     * Sets array of all "specializationOf" element
     */
    void setSpecializationOfArray(org.w3.www.ns.prov.Specialization[] specializationOfArray);
    
    /**
     * Sets ith "specializationOf" element
     */
    void setSpecializationOfArray(int i, org.w3.www.ns.prov.Specialization specializationOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specializationOf" element
     */
    org.w3.www.ns.prov.Specialization insertNewSpecializationOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specializationOf" element
     */
    org.w3.www.ns.prov.Specialization addNewSpecializationOf();
    
    /**
     * Removes the ith "specializationOf" element
     */
    void removeSpecializationOf(int i);
    
    /**
     * Gets array of all "alternateOf" elements
     */
    org.w3.www.ns.prov.Alternate[] getAlternateOfArray();
    
    /**
     * Gets ith "alternateOf" element
     */
    org.w3.www.ns.prov.Alternate getAlternateOfArray(int i);
    
    /**
     * Returns number of "alternateOf" element
     */
    int sizeOfAlternateOfArray();
    
    /**
     * Sets array of all "alternateOf" element
     */
    void setAlternateOfArray(org.w3.www.ns.prov.Alternate[] alternateOfArray);
    
    /**
     * Sets ith "alternateOf" element
     */
    void setAlternateOfArray(int i, org.w3.www.ns.prov.Alternate alternateOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alternateOf" element
     */
    org.w3.www.ns.prov.Alternate insertNewAlternateOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alternateOf" element
     */
    org.w3.www.ns.prov.Alternate addNewAlternateOf();
    
    /**
     * Removes the ith "alternateOf" element
     */
    void removeAlternateOf(int i);
    
    /**
     * Gets array of all "hadMember" elements
     */
    org.w3.www.ns.prov.Membership[] getHadMemberArray();
    
    /**
     * Gets ith "hadMember" element
     */
    org.w3.www.ns.prov.Membership getHadMemberArray(int i);
    
    /**
     * Returns number of "hadMember" element
     */
    int sizeOfHadMemberArray();
    
    /**
     * Sets array of all "hadMember" element
     */
    void setHadMemberArray(org.w3.www.ns.prov.Membership[] hadMemberArray);
    
    /**
     * Sets ith "hadMember" element
     */
    void setHadMemberArray(int i, org.w3.www.ns.prov.Membership hadMember);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hadMember" element
     */
    org.w3.www.ns.prov.Membership insertNewHadMember(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hadMember" element
     */
    org.w3.www.ns.prov.Membership addNewHadMember();
    
    /**
     * Removes the ith "hadMember" element
     */
    void removeHadMember(int i);
    
    /**
     * Gets array of all "mentionOf" elements
     */
    org.w3.www.ns.prov.Mention[] getMentionOfArray();
    
    /**
     * Gets ith "mentionOf" element
     */
    org.w3.www.ns.prov.Mention getMentionOfArray(int i);
    
    /**
     * Returns number of "mentionOf" element
     */
    int sizeOfMentionOfArray();
    
    /**
     * Sets array of all "mentionOf" element
     */
    void setMentionOfArray(org.w3.www.ns.prov.Mention[] mentionOfArray);
    
    /**
     * Sets ith "mentionOf" element
     */
    void setMentionOfArray(int i, org.w3.www.ns.prov.Mention mentionOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mentionOf" element
     */
    org.w3.www.ns.prov.Mention insertNewMentionOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mentionOf" element
     */
    org.w3.www.ns.prov.Mention addNewMentionOf();
    
    /**
     * Removes the ith "mentionOf" element
     */
    void removeMentionOf(int i);
    
    /**
     * Gets array of all "plan" elements
     */
    org.w3.www.ns.prov.Plan[] getPlanArray();
    
    /**
     * Gets ith "plan" element
     */
    org.w3.www.ns.prov.Plan getPlanArray(int i);
    
    /**
     * Returns number of "plan" element
     */
    int sizeOfPlanArray();
    
    /**
     * Sets array of all "plan" element
     */
    void setPlanArray(org.w3.www.ns.prov.Plan[] planArray);
    
    /**
     * Sets ith "plan" element
     */
    void setPlanArray(int i, org.w3.www.ns.prov.Plan plan);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "plan" element
     */
    org.w3.www.ns.prov.Plan insertNewPlan(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "plan" element
     */
    org.w3.www.ns.prov.Plan addNewPlan();
    
    /**
     * Removes the ith "plan" element
     */
    void removePlan(int i);
    
    /**
     * Gets array of all "wasRevisionOf" elements
     */
    org.w3.www.ns.prov.Revision[] getWasRevisionOfArray();
    
    /**
     * Gets ith "wasRevisionOf" element
     */
    org.w3.www.ns.prov.Revision getWasRevisionOfArray(int i);
    
    /**
     * Returns number of "wasRevisionOf" element
     */
    int sizeOfWasRevisionOfArray();
    
    /**
     * Sets array of all "wasRevisionOf" element
     */
    void setWasRevisionOfArray(org.w3.www.ns.prov.Revision[] wasRevisionOfArray);
    
    /**
     * Sets ith "wasRevisionOf" element
     */
    void setWasRevisionOfArray(int i, org.w3.www.ns.prov.Revision wasRevisionOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasRevisionOf" element
     */
    org.w3.www.ns.prov.Revision insertNewWasRevisionOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasRevisionOf" element
     */
    org.w3.www.ns.prov.Revision addNewWasRevisionOf();
    
    /**
     * Removes the ith "wasRevisionOf" element
     */
    void removeWasRevisionOf(int i);
    
    /**
     * Gets array of all "wasQuotedFrom" elements
     */
    org.w3.www.ns.prov.Quotation[] getWasQuotedFromArray();
    
    /**
     * Gets ith "wasQuotedFrom" element
     */
    org.w3.www.ns.prov.Quotation getWasQuotedFromArray(int i);
    
    /**
     * Returns number of "wasQuotedFrom" element
     */
    int sizeOfWasQuotedFromArray();
    
    /**
     * Sets array of all "wasQuotedFrom" element
     */
    void setWasQuotedFromArray(org.w3.www.ns.prov.Quotation[] wasQuotedFromArray);
    
    /**
     * Sets ith "wasQuotedFrom" element
     */
    void setWasQuotedFromArray(int i, org.w3.www.ns.prov.Quotation wasQuotedFrom);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wasQuotedFrom" element
     */
    org.w3.www.ns.prov.Quotation insertNewWasQuotedFrom(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wasQuotedFrom" element
     */
    org.w3.www.ns.prov.Quotation addNewWasQuotedFrom();
    
    /**
     * Removes the ith "wasQuotedFrom" element
     */
    void removeWasQuotedFrom(int i);
    
    /**
     * Gets array of all "hadPrimarySource" elements
     */
    org.w3.www.ns.prov.PrimarySource[] getHadPrimarySourceArray();
    
    /**
     * Gets ith "hadPrimarySource" element
     */
    org.w3.www.ns.prov.PrimarySource getHadPrimarySourceArray(int i);
    
    /**
     * Returns number of "hadPrimarySource" element
     */
    int sizeOfHadPrimarySourceArray();
    
    /**
     * Sets array of all "hadPrimarySource" element
     */
    void setHadPrimarySourceArray(org.w3.www.ns.prov.PrimarySource[] hadPrimarySourceArray);
    
    /**
     * Sets ith "hadPrimarySource" element
     */
    void setHadPrimarySourceArray(int i, org.w3.www.ns.prov.PrimarySource hadPrimarySource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hadPrimarySource" element
     */
    org.w3.www.ns.prov.PrimarySource insertNewHadPrimarySource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hadPrimarySource" element
     */
    org.w3.www.ns.prov.PrimarySource addNewHadPrimarySource();
    
    /**
     * Removes the ith "hadPrimarySource" element
     */
    void removeHadPrimarySource(int i);
    
    /**
     * Gets array of all "person" elements
     */
    org.w3.www.ns.prov.Person[] getPersonArray();
    
    /**
     * Gets ith "person" element
     */
    org.w3.www.ns.prov.Person getPersonArray(int i);
    
    /**
     * Returns number of "person" element
     */
    int sizeOfPersonArray();
    
    /**
     * Sets array of all "person" element
     */
    void setPersonArray(org.w3.www.ns.prov.Person[] personArray);
    
    /**
     * Sets ith "person" element
     */
    void setPersonArray(int i, org.w3.www.ns.prov.Person person);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "person" element
     */
    org.w3.www.ns.prov.Person insertNewPerson(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "person" element
     */
    org.w3.www.ns.prov.Person addNewPerson();
    
    /**
     * Removes the ith "person" element
     */
    void removePerson(int i);
    
    /**
     * Gets array of all "organization" elements
     */
    org.w3.www.ns.prov.Organization[] getOrganizationArray();
    
    /**
     * Gets ith "organization" element
     */
    org.w3.www.ns.prov.Organization getOrganizationArray(int i);
    
    /**
     * Returns number of "organization" element
     */
    int sizeOfOrganizationArray();
    
    /**
     * Sets array of all "organization" element
     */
    void setOrganizationArray(org.w3.www.ns.prov.Organization[] organizationArray);
    
    /**
     * Sets ith "organization" element
     */
    void setOrganizationArray(int i, org.w3.www.ns.prov.Organization organization);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "organization" element
     */
    org.w3.www.ns.prov.Organization insertNewOrganization(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "organization" element
     */
    org.w3.www.ns.prov.Organization addNewOrganization();
    
    /**
     * Removes the ith "organization" element
     */
    void removeOrganization(int i);
    
    /**
     * Gets array of all "softwareAgent" elements
     */
    org.w3.www.ns.prov.SoftwareAgent[] getSoftwareAgentArray();
    
    /**
     * Gets ith "softwareAgent" element
     */
    org.w3.www.ns.prov.SoftwareAgent getSoftwareAgentArray(int i);
    
    /**
     * Returns number of "softwareAgent" element
     */
    int sizeOfSoftwareAgentArray();
    
    /**
     * Sets array of all "softwareAgent" element
     */
    void setSoftwareAgentArray(org.w3.www.ns.prov.SoftwareAgent[] softwareAgentArray);
    
    /**
     * Sets ith "softwareAgent" element
     */
    void setSoftwareAgentArray(int i, org.w3.www.ns.prov.SoftwareAgent softwareAgent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "softwareAgent" element
     */
    org.w3.www.ns.prov.SoftwareAgent insertNewSoftwareAgent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "softwareAgent" element
     */
    org.w3.www.ns.prov.SoftwareAgent addNewSoftwareAgent();
    
    /**
     * Removes the ith "softwareAgent" element
     */
    void removeSoftwareAgent(int i);
    
    /**
     * Gets array of all "bundle" elements
     */
    org.w3.www.ns.prov.Bundle[] getBundleArray();
    
    /**
     * Gets ith "bundle" element
     */
    org.w3.www.ns.prov.Bundle getBundleArray(int i);
    
    /**
     * Returns number of "bundle" element
     */
    int sizeOfBundleArray();
    
    /**
     * Sets array of all "bundle" element
     */
    void setBundleArray(org.w3.www.ns.prov.Bundle[] bundleArray);
    
    /**
     * Sets ith "bundle" element
     */
    void setBundleArray(int i, org.w3.www.ns.prov.Bundle bundle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bundle" element
     */
    org.w3.www.ns.prov.Bundle insertNewBundle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bundle" element
     */
    org.w3.www.ns.prov.Bundle addNewBundle();
    
    /**
     * Removes the ith "bundle" element
     */
    void removeBundle(int i);
    
    /**
     * Gets array of all "collection" elements
     */
    org.w3.www.ns.prov.Collection[] getCollectionArray();
    
    /**
     * Gets ith "collection" element
     */
    org.w3.www.ns.prov.Collection getCollectionArray(int i);
    
    /**
     * Returns number of "collection" element
     */
    int sizeOfCollectionArray();
    
    /**
     * Sets array of all "collection" element
     */
    void setCollectionArray(org.w3.www.ns.prov.Collection[] collectionArray);
    
    /**
     * Sets ith "collection" element
     */
    void setCollectionArray(int i, org.w3.www.ns.prov.Collection collection);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "collection" element
     */
    org.w3.www.ns.prov.Collection insertNewCollection(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "collection" element
     */
    org.w3.www.ns.prov.Collection addNewCollection();
    
    /**
     * Removes the ith "collection" element
     */
    void removeCollection(int i);
    
    /**
     * Gets array of all "emptyCollection" elements
     */
    org.w3.www.ns.prov.EmptyCollection[] getEmptyCollectionArray();
    
    /**
     * Gets ith "emptyCollection" element
     */
    org.w3.www.ns.prov.EmptyCollection getEmptyCollectionArray(int i);
    
    /**
     * Returns number of "emptyCollection" element
     */
    int sizeOfEmptyCollectionArray();
    
    /**
     * Sets array of all "emptyCollection" element
     */
    void setEmptyCollectionArray(org.w3.www.ns.prov.EmptyCollection[] emptyCollectionArray);
    
    /**
     * Sets ith "emptyCollection" element
     */
    void setEmptyCollectionArray(int i, org.w3.www.ns.prov.EmptyCollection emptyCollection);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "emptyCollection" element
     */
    org.w3.www.ns.prov.EmptyCollection insertNewEmptyCollection(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "emptyCollection" element
     */
    org.w3.www.ns.prov.EmptyCollection addNewEmptyCollection();
    
    /**
     * Removes the ith "emptyCollection" element
     */
    void removeEmptyCollection(int i);
    
    /**
     * Gets array of all "dictionary" elements
     */
    org.w3.www.ns.prov.Dictionary[] getDictionaryArray();
    
    /**
     * Gets ith "dictionary" element
     */
    org.w3.www.ns.prov.Dictionary getDictionaryArray(int i);
    
    /**
     * Returns number of "dictionary" element
     */
    int sizeOfDictionaryArray();
    
    /**
     * Sets array of all "dictionary" element
     */
    void setDictionaryArray(org.w3.www.ns.prov.Dictionary[] dictionaryArray);
    
    /**
     * Sets ith "dictionary" element
     */
    void setDictionaryArray(int i, org.w3.www.ns.prov.Dictionary dictionary);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dictionary" element
     */
    org.w3.www.ns.prov.Dictionary insertNewDictionary(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dictionary" element
     */
    org.w3.www.ns.prov.Dictionary addNewDictionary();
    
    /**
     * Removes the ith "dictionary" element
     */
    void removeDictionary(int i);
    
    /**
     * Gets array of all "emptyDictionary" elements
     */
    org.w3.www.ns.prov.EmptyDictionary[] getEmptyDictionaryArray();
    
    /**
     * Gets ith "emptyDictionary" element
     */
    org.w3.www.ns.prov.EmptyDictionary getEmptyDictionaryArray(int i);
    
    /**
     * Returns number of "emptyDictionary" element
     */
    int sizeOfEmptyDictionaryArray();
    
    /**
     * Sets array of all "emptyDictionary" element
     */
    void setEmptyDictionaryArray(org.w3.www.ns.prov.EmptyDictionary[] emptyDictionaryArray);
    
    /**
     * Sets ith "emptyDictionary" element
     */
    void setEmptyDictionaryArray(int i, org.w3.www.ns.prov.EmptyDictionary emptyDictionary);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "emptyDictionary" element
     */
    org.w3.www.ns.prov.EmptyDictionary insertNewEmptyDictionary(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "emptyDictionary" element
     */
    org.w3.www.ns.prov.EmptyDictionary addNewEmptyDictionary();
    
    /**
     * Removes the ith "emptyDictionary" element
     */
    void removeEmptyDictionary(int i);
    
    /**
     * Gets array of all "hadDictionaryMember" elements
     */
    org.w3.www.ns.prov.DictionaryMembership[] getHadDictionaryMemberArray();
    
    /**
     * Gets ith "hadDictionaryMember" element
     */
    org.w3.www.ns.prov.DictionaryMembership getHadDictionaryMemberArray(int i);
    
    /**
     * Returns number of "hadDictionaryMember" element
     */
    int sizeOfHadDictionaryMemberArray();
    
    /**
     * Sets array of all "hadDictionaryMember" element
     */
    void setHadDictionaryMemberArray(org.w3.www.ns.prov.DictionaryMembership[] hadDictionaryMemberArray);
    
    /**
     * Sets ith "hadDictionaryMember" element
     */
    void setHadDictionaryMemberArray(int i, org.w3.www.ns.prov.DictionaryMembership hadDictionaryMember);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hadDictionaryMember" element
     */
    org.w3.www.ns.prov.DictionaryMembership insertNewHadDictionaryMember(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hadDictionaryMember" element
     */
    org.w3.www.ns.prov.DictionaryMembership addNewHadDictionaryMember();
    
    /**
     * Removes the ith "hadDictionaryMember" element
     */
    void removeHadDictionaryMember(int i);
    
    /**
     * Gets array of all "derivedByInsertionFrom" elements
     */
    org.w3.www.ns.prov.Insertion[] getDerivedByInsertionFromArray();
    
    /**
     * Gets ith "derivedByInsertionFrom" element
     */
    org.w3.www.ns.prov.Insertion getDerivedByInsertionFromArray(int i);
    
    /**
     * Returns number of "derivedByInsertionFrom" element
     */
    int sizeOfDerivedByInsertionFromArray();
    
    /**
     * Sets array of all "derivedByInsertionFrom" element
     */
    void setDerivedByInsertionFromArray(org.w3.www.ns.prov.Insertion[] derivedByInsertionFromArray);
    
    /**
     * Sets ith "derivedByInsertionFrom" element
     */
    void setDerivedByInsertionFromArray(int i, org.w3.www.ns.prov.Insertion derivedByInsertionFrom);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "derivedByInsertionFrom" element
     */
    org.w3.www.ns.prov.Insertion insertNewDerivedByInsertionFrom(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "derivedByInsertionFrom" element
     */
    org.w3.www.ns.prov.Insertion addNewDerivedByInsertionFrom();
    
    /**
     * Removes the ith "derivedByInsertionFrom" element
     */
    void removeDerivedByInsertionFrom(int i);
    
    /**
     * Gets array of all "derivedByRemovalFrom" elements
     */
    org.w3.www.ns.prov.Removal[] getDerivedByRemovalFromArray();
    
    /**
     * Gets ith "derivedByRemovalFrom" element
     */
    org.w3.www.ns.prov.Removal getDerivedByRemovalFromArray(int i);
    
    /**
     * Returns number of "derivedByRemovalFrom" element
     */
    int sizeOfDerivedByRemovalFromArray();
    
    /**
     * Sets array of all "derivedByRemovalFrom" element
     */
    void setDerivedByRemovalFromArray(org.w3.www.ns.prov.Removal[] derivedByRemovalFromArray);
    
    /**
     * Sets ith "derivedByRemovalFrom" element
     */
    void setDerivedByRemovalFromArray(int i, org.w3.www.ns.prov.Removal derivedByRemovalFrom);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "derivedByRemovalFrom" element
     */
    org.w3.www.ns.prov.Removal insertNewDerivedByRemovalFrom(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "derivedByRemovalFrom" element
     */
    org.w3.www.ns.prov.Removal addNewDerivedByRemovalFrom();
    
    /**
     * Removes the ith "derivedByRemovalFrom" element
     */
    void removeDerivedByRemovalFrom(int i);
    
    /**
     * Gets array of all "others" elements
     */
    org.w3.www.ns.prov.Others[] getOthersArray();
    
    /**
     * Gets ith "others" element
     */
    org.w3.www.ns.prov.Others getOthersArray(int i);
    
    /**
     * Returns number of "others" element
     */
    int sizeOfOthersArray();
    
    /**
     * Sets array of all "others" element
     */
    void setOthersArray(org.w3.www.ns.prov.Others[] othersArray);
    
    /**
     * Sets ith "others" element
     */
    void setOthersArray(int i, org.w3.www.ns.prov.Others others);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "others" element
     */
    org.w3.www.ns.prov.Others insertNewOthers(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "others" element
     */
    org.w3.www.ns.prov.Others addNewOthers();
    
    /**
     * Removes the ith "others" element
     */
    void removeOthers(int i);
    
    /**
     * Gets array of all "bundleContent" elements
     */
    org.w3.www.ns.prov.NamedBundle[] getBundleContentArray();
    
    /**
     * Gets ith "bundleContent" element
     */
    org.w3.www.ns.prov.NamedBundle getBundleContentArray(int i);
    
    /**
     * Returns number of "bundleContent" element
     */
    int sizeOfBundleContentArray();
    
    /**
     * Sets array of all "bundleContent" element
     */
    void setBundleContentArray(org.w3.www.ns.prov.NamedBundle[] bundleContentArray);
    
    /**
     * Sets ith "bundleContent" element
     */
    void setBundleContentArray(int i, org.w3.www.ns.prov.NamedBundle bundleContent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bundleContent" element
     */
    org.w3.www.ns.prov.NamedBundle insertNewBundleContent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bundleContent" element
     */
    org.w3.www.ns.prov.NamedBundle addNewBundleContent();
    
    /**
     * Removes the ith "bundleContent" element
     */
    void removeBundleContent(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.www.ns.prov.Document newInstance() {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.www.ns.prov.Document newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.www.ns.prov.Document parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.www.ns.prov.Document parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.www.ns.prov.Document parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.www.ns.prov.Document parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.www.ns.prov.Document parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.www.ns.prov.Document parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.www.ns.prov.Document parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.www.ns.prov.Document parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.www.ns.prov.Document parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.www.ns.prov.Document parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.www.ns.prov.Document parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.www.ns.prov.Document parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.www.ns.prov.Document parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.www.ns.prov.Document parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.www.ns.prov.Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.www.ns.prov.Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.www.ns.prov.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
