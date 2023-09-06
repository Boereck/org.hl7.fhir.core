package org.hl7.fhir.convertors.conv40_50.resources40_50;

import org.hl7.fhir.convertors.context.ConversionContext40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.general40_50.CodeableConcept40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.general40_50.Identifier40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.metadata40_50.ContactDetail40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.metadata40_50.UsageContext40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.Boolean40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.Canonical40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.DateTime40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.Id40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.MarkDown40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.String40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.Uri40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.Url40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.special40_50.Reference40_50;
import org.hl7.fhir.convertors.conv43_50.datatypes43_50.primitive43_50.Url43_50;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r5.model.CanonicalType;
import org.hl7.fhir.r5.model.CodeableConcept;
import org.hl7.fhir.r5.model.ContactDetail;
import org.hl7.fhir.r5.model.Enumeration;
import org.hl7.fhir.r5.model.Enumerations.PublicationStatus;
import org.hl7.fhir.r5.model.Reference;
import org.hl7.fhir.r5.model.Requirements.ConformanceExpectation;
import org.hl7.fhir.r5.model.Requirements.RequirementsStatementComponent;
import org.hl7.fhir.r5.model.UrlType;
import org.hl7.fhir.r5.model.UsageContext;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
// Generated on Sun, Feb 24, 2019 11:37+1100 for FHIR v4.0.0
public class Requirements40_50 {

  public static final String URL_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.url";
  public static final String VERSION_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.version";
  public static final String NAME_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.name";
  public static final String TITLE_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.title";
  public static final String STATUS_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.status";
  public static final String EXPERIMENTAL_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.experimental";
  public static final String DATE_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.date";
  public static final String PUBLISHER_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.publisher";
  public static final String CONTACT_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.contact";
  public static final String DESCRIPTION_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.description";
  public static final String USE_CONTEXT_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.useContext";
  public static final String JURISDICTION_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.jurisdiction";
  public static final String PURPOSE_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.purpose";
  public static final String COPYRIGHT_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.copyright";
  public static final String COPYRIGHT_LABEL_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.copyrightLabel";
  public static final String DERIVED_FROM_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.derivedFrom";
  public static final String ACTOR_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.actor";
  public static final String REFERENCE_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.reference";
  public static final String STATEMENT_EXTENSION_URL = "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement";

  private static final String[] IGNORED_EXTENSION_URLS = new String[]{
    URL_EXTENSION_URL,
    VERSION_EXTENSION_URL,
    NAME_EXTENSION_URL,
    TITLE_EXTENSION_URL,
    STATUS_EXTENSION_URL,
    EXPERIMENTAL_EXTENSION_URL,
    DATE_EXTENSION_URL,
    PUBLISHER_EXTENSION_URL,
    CONTACT_EXTENSION_URL,
    DESCRIPTION_EXTENSION_URL,
    USE_CONTEXT_EXTENSION_URL,
    JURISDICTION_EXTENSION_URL,
    PURPOSE_EXTENSION_URL,
    COPYRIGHT_EXTENSION_URL,
    COPYRIGHT_LABEL_EXTENSION_URL,
    DERIVED_FROM_EXTENSION_URL,
    ACTOR_EXTENSION_URL,
    REFERENCE_EXTENSION_URL,
    STATEMENT_EXTENSION_URL
  };

  public static org.hl7.fhir.r5.model.Requirements convertRequirements(org.hl7.fhir.r4.model.Basic src) throws FHIRException {
    if (src == null)
      return null;
    if (!src.getCode().hasCoding("http://hl7.org/fhir/fhir-types", "Requirements")) {
      throw new FHIRException("Error in logic: this basic resource is not an Requirements");
    }
    org.hl7.fhir.r5.model.Requirements tgt = new org.hl7.fhir.r5.model.Requirements();

    ConversionContext40_50.INSTANCE.getVersionConvertor_40_50().copyDomainResource(src, tgt, IGNORED_EXTENSION_URLS);
    
    for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier40_50.convertIdentifier(t));

    if (src.hasExtension(URL_EXTENSION_URL)) {
      tgt.setUrlElement(Uri40_50.convertUri((org.hl7.fhir.r4.model.UriType) src.getExtensionByUrl(URL_EXTENSION_URL).getValue()));
    }
    if (src.hasExtension(VERSION_EXTENSION_URL)) {
      tgt.setVersionElement(String40_50.convertString((org.hl7.fhir.r4.model.StringType) src.getExtensionByUrl(VERSION_EXTENSION_URL).getValue()));
    }
    if (src.hasExtension(NAME_EXTENSION_URL)) {
      tgt.setNameElement(String40_50.convertString((org.hl7.fhir.r4.model.StringType) src.getExtensionByUrl(NAME_EXTENSION_URL).getValue()));
    }
    if (src.hasExtension(TITLE_EXTENSION_URL)) {
      tgt.setTitleElement(String40_50.convertString((org.hl7.fhir.r4.model.StringType) src.getExtensionByUrl(TITLE_EXTENSION_URL).getValue()));
    }
    if (src.hasExtension(STATUS_EXTENSION_URL)) {
      tgt.setStatus(PublicationStatus.fromCode(src.getExtensionByUrl(STATUS_EXTENSION_URL).getValue().primitiveValue()));
    }
    if (src.hasExtension(EXPERIMENTAL_EXTENSION_URL)) {
      tgt.setExperimentalElement(Boolean40_50.convertBoolean((org.hl7.fhir.r4.model.BooleanType) src.getExtensionByUrl(EXPERIMENTAL_EXTENSION_URL).getValue()));
    }
    if (src.hasExtension(DATE_EXTENSION_URL)) {
      tgt.setDateElement(DateTime40_50.convertDateTime((org.hl7.fhir.r4.model.DateTimeType) src.getExtensionByUrl(DATE_EXTENSION_URL).getValue()));
    }
    if (src.hasExtension(PUBLISHER_EXTENSION_URL)) {
      tgt.setPublisherElement(String40_50.convertString((org.hl7.fhir.r4.model.StringType) src.getExtensionByUrl(PUBLISHER_EXTENSION_URL).getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl(CONTACT_EXTENSION_URL)) {
      tgt.addContact(ContactDetail40_50.convertContactDetail((org.hl7.fhir.r4.model.ContactDetail) ext.getValue()));
    }
    if (src.hasExtension(DESCRIPTION_EXTENSION_URL)) {
      tgt.setPublisherElement(MarkDown40_50.convertMarkdown((org.hl7.fhir.r4.model.MarkdownType) src.getExtensionByUrl(DESCRIPTION_EXTENSION_URL).getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl(USE_CONTEXT_EXTENSION_URL)) {
      tgt.addUseContext(UsageContext40_50.convertUsageContext((org.hl7.fhir.r4.model.UsageContext) ext.getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl(JURISDICTION_EXTENSION_URL)) {
      tgt.addJurisdiction(CodeableConcept40_50.convertCodeableConcept((org.hl7.fhir.r4.model.CodeableConcept) ext.getValue()));
    }
    if (src.hasExtension(PURPOSE_EXTENSION_URL)) {
      tgt.setPurposeElement(MarkDown40_50.convertMarkdown((org.hl7.fhir.r4.model.MarkdownType) src.getExtensionByUrl(PURPOSE_EXTENSION_URL).getValue()));
    }
    if (src.hasExtension(COPYRIGHT_EXTENSION_URL)) {
      tgt.setCopyrightElement(MarkDown40_50.convertMarkdown((org.hl7.fhir.r4.model.MarkdownType) src.getExtensionByUrl(COPYRIGHT_EXTENSION_URL).getValue()));
    }
    if (src.hasExtension(COPYRIGHT_LABEL_EXTENSION_URL)) {
      tgt.setCopyrightLabelElement(String40_50.convertString((org.hl7.fhir.r4.model.StringType) src.getExtensionByUrl(COPYRIGHT_LABEL_EXTENSION_URL).getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl(DERIVED_FROM_EXTENSION_URL)) {
      tgt.getDerivedFrom().add(Canonical40_50.convertCanonical((org.hl7.fhir.r4.model.CanonicalType) ext.getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl(ACTOR_EXTENSION_URL)) {
      tgt.getActor().add(Canonical40_50.convertCanonical((org.hl7.fhir.r4.model.CanonicalType) ext.getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl(REFERENCE_EXTENSION_URL)) {
      tgt.getReference().add(Url40_50.convertUrl((org.hl7.fhir.r4.model.UrlType) ext.getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl(STATEMENT_EXTENSION_URL)) {
      convertRequirementsStatement(ext, tgt.addStatement());
    }
    return tgt;
  }


  public static org.hl7.fhir.r4.model.Basic convertRequirements(org.hl7.fhir.r5.model.Requirements src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Basic tgt = new org.hl7.fhir.r4.model.Basic();
    ConversionContext40_50.INSTANCE.getVersionConvertor_40_50().copyDomainResource(src, tgt);
    tgt.getCode().getCodingFirstRep().setSystem("http://hl7.org/fhir/fhir-types").setCode("Requirements"); // note use of R5 type system
    
    for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier40_50.convertIdentifier(t));
    if (src.hasUrl()) {
      tgt.addExtension(URL_EXTENSION_URL, Uri40_50.convertUri(src.getUrlElement()));
    }
    if (src.hasVersion()) {
      tgt.addExtension(VERSION_EXTENSION_URL, String40_50.convertString(src.getVersionElement()));
    }
    if (src.hasName()) {
      tgt.addExtension(NAME_EXTENSION_URL, String40_50.convertString(src.getNameElement()));
    }
    if (src.hasTitle()) {
      tgt.addExtension(TITLE_EXTENSION_URL, String40_50.convertString(src.getTitleElement()));
    }
    if (src.hasStatus()) {
      tgt.addExtension(STATUS_EXTENSION_URL, new org.hl7.fhir.r4.model.CodeType(src.getStatus().toCode()));
    }
    if (src.hasExperimental()) {
      tgt.addExtension(EXPERIMENTAL_EXTENSION_URL, Boolean40_50.convertBoolean(src.getExperimentalElement()));
    }
    if (src.hasDate()) {
      tgt.addExtension(DATE_EXTENSION_URL, DateTime40_50.convertDateTime(src.getDateElement()));
    }
    if (src.hasPublisher()) {
      tgt.addExtension(PUBLISHER_EXTENSION_URL, String40_50.convertString(src.getPublisherElement()));
    }
    for (ContactDetail cd : src.getContact()) {
      tgt.addExtension(CONTACT_EXTENSION_URL, ContactDetail40_50.convertContactDetail(cd));
    }
    if (src.hasDescription()) {
      tgt.addExtension(DESCRIPTION_EXTENSION_URL, MarkDown40_50.convertMarkdown(src.getDescriptionElement()));
    }
    for (UsageContext cd : src.getUseContext()) {
      tgt.addExtension(USE_CONTEXT_EXTENSION_URL, UsageContext40_50.convertUsageContext(cd));
    }
    for (CodeableConcept cd : src.getJurisdiction()) {
      tgt.addExtension(JURISDICTION_EXTENSION_URL, CodeableConcept40_50.convertCodeableConcept(cd));
    }
    if (src.hasPurpose()) {
      tgt.addExtension(PURPOSE_EXTENSION_URL, MarkDown40_50.convertMarkdown(src.getPurposeElement()));
    }
    if (src.hasCopyright()) {
      tgt.addExtension(COPYRIGHT_EXTENSION_URL, MarkDown40_50.convertMarkdown(src.getCopyrightElement()));
    }
    if (src.hasCopyrightLabel()) {
      tgt.addExtension(COPYRIGHT_LABEL_EXTENSION_URL, String40_50.convertString(src.getCopyrightLabelElement()));
    }
    for (CanonicalType ref : src.getDerivedFrom()) {
      tgt.addExtension(DERIVED_FROM_EXTENSION_URL, Canonical40_50.convertCanonical(ref));
    }
    for (CanonicalType ref : src.getActor()) {
      tgt.addExtension(ACTOR_EXTENSION_URL, Canonical40_50.convertCanonical(ref));
    }
    for (UrlType ref : src.getReference()) {
      tgt.addExtension(REFERENCE_EXTENSION_URL, Url40_50.convertUrl(ref));
    }
    for (RequirementsStatementComponent ref : src.getStatement()) {
      org.hl7.fhir.r4.model.Extension tgte = new org.hl7.fhir.r4.model.Extension(STATEMENT_EXTENSION_URL);
      tgt.addExtension(tgte);
      convertRequirementsStatement(ref, tgte);
    }

    return tgt;
  }

  private static void convertRequirementsStatement(RequirementsStatementComponent src, Extension tgt) {
    ConversionContext40_50.INSTANCE.getVersionConvertor_40_50().copyElement(src, tgt);
    if (src.hasKey()) {
      tgt.addExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.key", Id40_50.convertId(src.getKeyElement()));
    }
    if (src.hasLabel()) {
      tgt.addExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.label", String40_50.convertString(src.getLabelElement()));
    }
    for (Enumeration<ConformanceExpectation> t : src.getConformance()) {
      tgt.addExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.conformance", new org.hl7.fhir.r4.model.CodeType(t.getCode()));
    }
    if (src.hasRequirement()) {
      tgt.addExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.requirement", MarkDown40_50.convertMarkdown(src.getRequirementElement()));
    }
    if (src.hasDerivedFrom()) {
      tgt.addExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.derivedFrom", String40_50.convertString(src.getDerivedFromElement()));
    }
    for (UrlType ref : src.getSatisfiedBy()) {
      tgt.addExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.satisfiedBy", Url40_50.convertUrl(ref));
    }
    for (UrlType ref : src.getReference()) {
      tgt.addExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.reference", Url40_50.convertUrl(ref));
    }
    for (Reference ref : src.getSource()) {
      tgt.addExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.source", Reference40_50.convertReference(ref));
    }
  }


  private static void convertRequirementsStatement(Extension src, RequirementsStatementComponent tgt) {
    ConversionContext40_50.INSTANCE.getVersionConvertor_40_50().copyElement(src, tgt, 
        "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.key",
        "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.label",
        "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.conformance",
        "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.requirement",
        "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.derivedFrom",
        "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.satisfiedBy",
        "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.reference",
        "http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.source"
        );
    if (src.hasExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.key")) {
      tgt.setKeyElement(Id40_50.convertId((org.hl7.fhir.r4.model.IdType) src.getExtensionByUrl("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.key").getValue()));
    }
    if (src.hasExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.label")) {
      tgt.setLabelElement(String40_50.convertString((org.hl7.fhir.r4.model.StringType) src.getExtensionByUrl("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.label").getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.conformance")) {
      tgt.addConformance(ConformanceExpectation.fromCode(ext.getValue().primitiveValue()));
    }
    if (src.hasExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.requirement")) {
      tgt.setRequirementElement(MarkDown40_50.convertMarkdown((org.hl7.fhir.r4.model.MarkdownType) src.getExtensionByUrl("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.requirement").getValue()));
    }
    if (src.hasExtension("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.derivedFrom")) {
      tgt.setDerivedFromElement(String40_50.convertString((org.hl7.fhir.r4.model.StringType) src.getExtensionByUrl("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.derivedFrom").getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.satisfiedBy")) {
      tgt.getSatisfiedBy().add(Url40_50.convertUrl((org.hl7.fhir.r4.model.UrlType) ext.getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.reference")) {
      tgt.getReference().add(Url40_50.convertUrl((org.hl7.fhir.r4.model.UrlType) ext.getValue()));
    }
    for (org.hl7.fhir.r4.model.Extension ext : src.getExtensionsByUrl("http://hl7.org/fhir/5.0/StructureDefinition/extension-Requirements.statement.source")) {
      tgt.getSource().add(Reference40_50.convertReference((org.hl7.fhir.r4.model.Reference) ext.getValue()));
    }
  }
}