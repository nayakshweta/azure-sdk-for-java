// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HealthcareFhirResourceType. */
public final class HealthcareFhirResourceType extends ExpandableStringEnum<HealthcareFhirResourceType> {
    /** Static value Account for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ACCOUNT = fromString("Account");

    /** Static value ActivityDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ACTIVITY_DEFINITION = fromString("ActivityDefinition");

    /** Static value AdverseEvent for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ADVERSE_EVENT = fromString("AdverseEvent");

    /** Static value AllergyIntolerance for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ALLERGY_INTOLERANCE = fromString("AllergyIntolerance");

    /** Static value Appointment for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType APPOINTMENT = fromString("Appointment");

    /** Static value AppointmentResponse for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType APPOINTMENT_RESPONSE = fromString("AppointmentResponse");

    /** Static value AuditEvent for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType AUDIT_EVENT = fromString("AuditEvent");

    /** Static value Basic for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType BASIC = fromString("Basic");

    /** Static value Binary for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType BINARY = fromString("Binary");

    /** Static value BiologicallyDerivedProduct for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType BIOLOGICALLY_DERIVED_PRODUCT =
            fromString("BiologicallyDerivedProduct");

    /** Static value BodySite for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType BODY_SITE = fromString("BodySite");

    /** Static value BodyStructure for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType BODY_STRUCTURE = fromString("BodyStructure");

    /** Static value Bundle for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType BUNDLE = fromString("Bundle");

    /** Static value CapabilityStatement for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CAPABILITY_STATEMENT = fromString("CapabilityStatement");

    /** Static value CarePlan for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CARE_PLAN = fromString("CarePlan");

    /** Static value CareTeam for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CARE_TEAM = fromString("CareTeam");

    /** Static value CatalogEntry for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CATALOG_ENTRY = fromString("CatalogEntry");

    /** Static value ChargeItem for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CHARGE_ITEM = fromString("ChargeItem");

    /** Static value ChargeItemDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CHARGE_ITEM_DEFINITION = fromString("ChargeItemDefinition");

    /** Static value Claim for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CLAIM = fromString("Claim");

    /** Static value ClaimResponse for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CLAIM_RESPONSE = fromString("ClaimResponse");

    /** Static value ClinicalImpression for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CLINICAL_IMPRESSION = fromString("ClinicalImpression");

    /** Static value CodeSystem for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CODE_SYSTEM = fromString("CodeSystem");

    /** Static value Communication for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType COMMUNICATION = fromString("Communication");

    /** Static value CommunicationRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType COMMUNICATION_REQUEST = fromString("CommunicationRequest");

    /** Static value CompartmentDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType COMPARTMENT_DEFINITION = fromString("CompartmentDefinition");

    /** Static value Composition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType COMPOSITION = fromString("Composition");

    /** Static value ConceptMap for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CONCEPT_MAP = fromString("ConceptMap");

    /** Static value Condition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CONDITION = fromString("Condition");

    /** Static value Consent for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CONSENT = fromString("Consent");

    /** Static value Contract for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType CONTRACT = fromString("Contract");

    /** Static value Coverage for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType COVERAGE = fromString("Coverage");

    /** Static value CoverageEligibilityRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType COVERAGE_ELIGIBILITY_REQUEST =
            fromString("CoverageEligibilityRequest");

    /** Static value CoverageEligibilityResponse for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType COVERAGE_ELIGIBILITY_RESPONSE =
            fromString("CoverageEligibilityResponse");

    /** Static value DataElement for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DATA_ELEMENT = fromString("DataElement");

    /** Static value DetectedIssue for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DETECTED_ISSUE = fromString("DetectedIssue");

    /** Static value Device for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DEVICE = fromString("Device");

    /** Static value DeviceComponent for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DEVICE_COMPONENT = fromString("DeviceComponent");

    /** Static value DeviceDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DEVICE_DEFINITION = fromString("DeviceDefinition");

    /** Static value DeviceMetric for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DEVICE_METRIC = fromString("DeviceMetric");

    /** Static value DeviceRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DEVICE_REQUEST = fromString("DeviceRequest");

    /** Static value DeviceUseStatement for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DEVICE_USE_STATEMENT = fromString("DeviceUseStatement");

    /** Static value DiagnosticReport for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DIAGNOSTIC_REPORT = fromString("DiagnosticReport");

    /** Static value DocumentManifest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DOCUMENT_MANIFEST = fromString("DocumentManifest");

    /** Static value DocumentReference for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DOCUMENT_REFERENCE = fromString("DocumentReference");

    /** Static value DomainResource for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType DOMAIN_RESOURCE = fromString("DomainResource");

    /** Static value EffectEvidenceSynthesis for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType EFFECT_EVIDENCE_SYNTHESIS = fromString("EffectEvidenceSynthesis");

    /** Static value EligibilityRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ELIGIBILITY_REQUEST = fromString("EligibilityRequest");

    /** Static value EligibilityResponse for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ELIGIBILITY_RESPONSE = fromString("EligibilityResponse");

    /** Static value Encounter for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ENCOUNTER = fromString("Encounter");

    /** Static value Endpoint for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ENDPOINT = fromString("Endpoint");

    /** Static value EnrollmentRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ENROLLMENT_REQUEST = fromString("EnrollmentRequest");

    /** Static value EnrollmentResponse for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ENROLLMENT_RESPONSE = fromString("EnrollmentResponse");

    /** Static value EpisodeOfCare for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType EPISODE_OF_CARE = fromString("EpisodeOfCare");

    /** Static value EventDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType EVENT_DEFINITION = fromString("EventDefinition");

    /** Static value Evidence for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType EVIDENCE = fromString("Evidence");

    /** Static value EvidenceVariable for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType EVIDENCE_VARIABLE = fromString("EvidenceVariable");

    /** Static value ExampleScenario for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType EXAMPLE_SCENARIO = fromString("ExampleScenario");

    /** Static value ExpansionProfile for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType EXPANSION_PROFILE = fromString("ExpansionProfile");

    /** Static value ExplanationOfBenefit for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType EXPLANATION_OF_BENEFIT = fromString("ExplanationOfBenefit");

    /** Static value FamilyMemberHistory for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType FAMILY_MEMBER_HISTORY = fromString("FamilyMemberHistory");

    /** Static value Flag for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType FLAG = fromString("Flag");

    /** Static value Goal for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType GOAL = fromString("Goal");

    /** Static value GraphDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType GRAPH_DEFINITION = fromString("GraphDefinition");

    /** Static value Group for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType GROUP = fromString("Group");

    /** Static value GuidanceResponse for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType GUIDANCE_RESPONSE = fromString("GuidanceResponse");

    /** Static value HealthcareService for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType HEALTHCARE_SERVICE = fromString("HealthcareService");

    /** Static value ImagingManifest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType IMAGING_MANIFEST = fromString("ImagingManifest");

    /** Static value ImagingStudy for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType IMAGING_STUDY = fromString("ImagingStudy");

    /** Static value Immunization for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType IMMUNIZATION = fromString("Immunization");

    /** Static value ImmunizationEvaluation for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType IMMUNIZATION_EVALUATION = fromString("ImmunizationEvaluation");

    /** Static value ImmunizationRecommendation for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType IMMUNIZATION_RECOMMENDATION =
            fromString("ImmunizationRecommendation");

    /** Static value ImplementationGuide for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType IMPLEMENTATION_GUIDE = fromString("ImplementationGuide");

    /** Static value InsurancePlan for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType INSURANCE_PLAN = fromString("InsurancePlan");

    /** Static value Invoice for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType INVOICE = fromString("Invoice");

    /** Static value Library for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType LIBRARY = fromString("Library");

    /** Static value Linkage for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType LINKAGE = fromString("Linkage");

    /** Static value List for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType LIST = fromString("List");

    /** Static value Location for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType LOCATION = fromString("Location");

    /** Static value Measure for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEASURE = fromString("Measure");

    /** Static value MeasureReport for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEASURE_REPORT = fromString("MeasureReport");

    /** Static value Media for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDIA = fromString("Media");

    /** Static value Medication for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICATION = fromString("Medication");

    /** Static value MedicationAdministration for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICATION_ADMINISTRATION = fromString("MedicationAdministration");

    /** Static value MedicationDispense for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICATION_DISPENSE = fromString("MedicationDispense");

    /** Static value MedicationKnowledge for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICATION_KNOWLEDGE = fromString("MedicationKnowledge");

    /** Static value MedicationRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICATION_REQUEST = fromString("MedicationRequest");

    /** Static value MedicationStatement for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICATION_STATEMENT = fromString("MedicationStatement");

    /** Static value MedicinalProduct for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICINAL_PRODUCT = fromString("MedicinalProduct");

    /** Static value MedicinalProductAuthorization for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICINAL_PRODUCT_AUTHORIZATION =
            fromString("MedicinalProductAuthorization");

    /** Static value MedicinalProductContraindication for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICINAL_PRODUCT_CONTRAINDICATION =
            fromString("MedicinalProductContraindication");

    /** Static value MedicinalProductIndication for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICINAL_PRODUCT_INDICATION =
            fromString("MedicinalProductIndication");

    /** Static value MedicinalProductIngredient for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICINAL_PRODUCT_INGREDIENT =
            fromString("MedicinalProductIngredient");

    /** Static value MedicinalProductInteraction for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICINAL_PRODUCT_INTERACTION =
            fromString("MedicinalProductInteraction");

    /** Static value MedicinalProductManufactured for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICINAL_PRODUCT_MANUFACTURED =
            fromString("MedicinalProductManufactured");

    /** Static value MedicinalProductPackaged for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICINAL_PRODUCT_PACKAGED = fromString("MedicinalProductPackaged");

    /** Static value MedicinalProductPharmaceutical for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICINAL_PRODUCT_PHARMACEUTICAL =
            fromString("MedicinalProductPharmaceutical");

    /** Static value MedicinalProductUndesirableEffect for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT =
            fromString("MedicinalProductUndesirableEffect");

    /** Static value MessageDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MESSAGE_DEFINITION = fromString("MessageDefinition");

    /** Static value MessageHeader for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MESSAGE_HEADER = fromString("MessageHeader");

    /** Static value MolecularSequence for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType MOLECULAR_SEQUENCE = fromString("MolecularSequence");

    /** Static value NamingSystem for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType NAMING_SYSTEM = fromString("NamingSystem");

    /** Static value NutritionOrder for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType NUTRITION_ORDER = fromString("NutritionOrder");

    /** Static value Observation for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType OBSERVATION = fromString("Observation");

    /** Static value ObservationDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType OBSERVATION_DEFINITION = fromString("ObservationDefinition");

    /** Static value OperationDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType OPERATION_DEFINITION = fromString("OperationDefinition");

    /** Static value OperationOutcome for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType OPERATION_OUTCOME = fromString("OperationOutcome");

    /** Static value Organization for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ORGANIZATION = fromString("Organization");

    /** Static value OrganizationAffiliation for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType ORGANIZATION_AFFILIATION = fromString("OrganizationAffiliation");

    /** Static value Parameters for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PARAMETERS = fromString("Parameters");

    /** Static value Patient for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PATIENT = fromString("Patient");

    /** Static value PaymentNotice for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PAYMENT_NOTICE = fromString("PaymentNotice");

    /** Static value PaymentReconciliation for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PAYMENT_RECONCILIATION = fromString("PaymentReconciliation");

    /** Static value Person for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PERSON = fromString("Person");

    /** Static value PlanDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PLAN_DEFINITION = fromString("PlanDefinition");

    /** Static value Practitioner for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PRACTITIONER = fromString("Practitioner");

    /** Static value PractitionerRole for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PRACTITIONER_ROLE = fromString("PractitionerRole");

    /** Static value Procedure for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PROCEDURE = fromString("Procedure");

    /** Static value ProcedureRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PROCEDURE_REQUEST = fromString("ProcedureRequest");

    /** Static value ProcessRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PROCESS_REQUEST = fromString("ProcessRequest");

    /** Static value ProcessResponse for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PROCESS_RESPONSE = fromString("ProcessResponse");

    /** Static value Provenance for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType PROVENANCE = fromString("Provenance");

    /** Static value Questionnaire for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType QUESTIONNAIRE = fromString("Questionnaire");

    /** Static value QuestionnaireResponse for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType QUESTIONNAIRE_RESPONSE = fromString("QuestionnaireResponse");

    /** Static value ReferralRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType REFERRAL_REQUEST = fromString("ReferralRequest");

    /** Static value RelatedPerson for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType RELATED_PERSON = fromString("RelatedPerson");

    /** Static value RequestGroup for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType REQUEST_GROUP = fromString("RequestGroup");

    /** Static value ResearchDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType RESEARCH_DEFINITION = fromString("ResearchDefinition");

    /** Static value ResearchElementDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType RESEARCH_ELEMENT_DEFINITION =
            fromString("ResearchElementDefinition");

    /** Static value ResearchStudy for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType RESEARCH_STUDY = fromString("ResearchStudy");

    /** Static value ResearchSubject for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType RESEARCH_SUBJECT = fromString("ResearchSubject");

    /** Static value Resource for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType RESOURCE = fromString("Resource");

    /** Static value RiskAssessment for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType RISK_ASSESSMENT = fromString("RiskAssessment");

    /** Static value RiskEvidenceSynthesis for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType RISK_EVIDENCE_SYNTHESIS = fromString("RiskEvidenceSynthesis");

    /** Static value Schedule for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SCHEDULE = fromString("Schedule");

    /** Static value SearchParameter for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SEARCH_PARAMETER = fromString("SearchParameter");

    /** Static value Sequence for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SEQUENCE = fromString("Sequence");

    /** Static value ServiceDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SERVICE_DEFINITION = fromString("ServiceDefinition");

    /** Static value ServiceRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SERVICE_REQUEST = fromString("ServiceRequest");

    /** Static value Slot for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SLOT = fromString("Slot");

    /** Static value Specimen for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SPECIMEN = fromString("Specimen");

    /** Static value SpecimenDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SPECIMEN_DEFINITION = fromString("SpecimenDefinition");

    /** Static value StructureDefinition for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType STRUCTURE_DEFINITION = fromString("StructureDefinition");

    /** Static value StructureMap for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType STRUCTURE_MAP = fromString("StructureMap");

    /** Static value Subscription for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SUBSCRIPTION = fromString("Subscription");

    /** Static value Substance for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SUBSTANCE = fromString("Substance");

    /** Static value SubstanceNucleicAcid for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SUBSTANCE_NUCLEIC_ACID = fromString("SubstanceNucleicAcid");

    /** Static value SubstancePolymer for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SUBSTANCE_POLYMER = fromString("SubstancePolymer");

    /** Static value SubstanceProtein for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SUBSTANCE_PROTEIN = fromString("SubstanceProtein");

    /** Static value SubstanceReferenceInformation for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SUBSTANCE_REFERENCE_INFORMATION =
            fromString("SubstanceReferenceInformation");

    /** Static value SubstanceSourceMaterial for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SUBSTANCE_SOURCE_MATERIAL = fromString("SubstanceSourceMaterial");

    /** Static value SubstanceSpecification for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SUBSTANCE_SPECIFICATION = fromString("SubstanceSpecification");

    /** Static value SupplyDelivery for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SUPPLY_DELIVERY = fromString("SupplyDelivery");

    /** Static value SupplyRequest for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType SUPPLY_REQUEST = fromString("SupplyRequest");

    /** Static value Task for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType TASK = fromString("Task");

    /** Static value TerminologyCapabilities for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType TERMINOLOGY_CAPABILITIES = fromString("TerminologyCapabilities");

    /** Static value TestReport for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType TEST_REPORT = fromString("TestReport");

    /** Static value TestScript for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType TEST_SCRIPT = fromString("TestScript");

    /** Static value ValueSet for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType VALUE_SET = fromString("ValueSet");

    /** Static value VerificationResult for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType VERIFICATION_RESULT = fromString("VerificationResult");

    /** Static value VisionPrescription for HealthcareFhirResourceType. */
    public static final HealthcareFhirResourceType VISION_PRESCRIPTION = fromString("VisionPrescription");

    /**
     * Creates or finds a HealthcareFhirResourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HealthcareFhirResourceType.
     */
    @JsonCreator
    public static HealthcareFhirResourceType fromString(String name) {
        return fromString(name, HealthcareFhirResourceType.class);
    }

    /**
     * Gets known HealthcareFhirResourceType values.
     *
     * @return known HealthcareFhirResourceType values.
     */
    public static Collection<HealthcareFhirResourceType> values() {
        return values(HealthcareFhirResourceType.class);
    }
}
