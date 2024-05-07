package org.hl7.fhir.utilities;

import org.apache.commons.lang3.StringUtils;

/**
 * Abstraction that splits a canonical in form of {@code <url>|<version>} into a URL and a version part.
 */
public class CanonicalPair {

  private final String url;
  private final String version;
  
  /**
   * Static factory method, that invokes the {@link CanonicalPair#CanonicalPair(String) CanonicalPair constructor}
   * with the given argument.
   * @param target the canonical to be split.
   * @return new instance of CanonicalPair
   */
  public static CanonicalPair of(String target) {
    return new CanonicalPair(target);
  }

  /**
   * Wraps the given canonical and if needed splits off the version part.<p>
   * The given parameter {@code target} is expected to be a canonical.
   * @param target
   */
  public CanonicalPair(String target) {
    int pipeIndex = target != null ? target.indexOf('|') : -1;
    if (pipeIndex >= 0) {
      this.url = target.substring(0, pipeIndex);
      this.version = target.substring(pipeIndex+1);
    } else {
      this.url = target;
      this.version = null;
    }
  }

  public String getUrl() {
    return url;
  }

  public String getVersion() {
    return version;
  }
  
  public boolean hasVersion() {
    return version != null;
  }
  
  public String getVersionOr(String alternative) {
    return hasVersion() ? version : alternative;
  }

  public boolean hasNonEmptyVersion() {
    return StringUtils.isNotEmpty(version);
  }
}
