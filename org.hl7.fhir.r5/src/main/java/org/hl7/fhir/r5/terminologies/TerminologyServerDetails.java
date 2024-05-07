package org.hl7.fhir.r5.terminologies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hl7.fhir.r5.model.Enumerations.FHIRVersion;
import org.hl7.fhir.utilities.CanonicalPair;

public class TerminologyServerDetails {
  public enum ServerAuthorizationMethod {
    OPEN,
    TOKEN, 
    SMART_ON_FHIR
  }
  private String name;
  private ServerAuthorizationMethod auth;
  private Map<FHIRVersion, String> endpoints = new HashMap<>();
  private List<String> codeSystems = new ArrayList<>();
  
  public boolean handlesSystem(String uri, String version) {
    for (String s : codeSystems) {
      var split = CanonicalPair.of(s);
      if (split.hasVersion()) {
        String u = split.getUrl();
        String v = split.getVersion();
        if (v.equals(version) && (s.equals(uri) || uri.matches(s))) {
          return true;
        }
      } else {
        if (s.equals(uri) || uri.matches(s)) {
          return true;
        }
      }
    }
    return false;
  }

  public String getName() {
    return name;
  }

  public ServerAuthorizationMethod getAuth() {
    return auth;
  }

  public Map<FHIRVersion, String> getEndpoints() {
    return endpoints;
  }

  public List<String> getCodeSystems() {
    return codeSystems;
  }
  
  
}
