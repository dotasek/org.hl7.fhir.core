package org.hl7.fhir.utilities;

/*-
 * #%L
 * org.hl7.fhir.utilities
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


/**
 * Encapsulates StringBuilder to build strings of values separated by comma
 * @author Ewout
 */

public class CommaSeparatedStringBuilder {

  boolean first = true;
  String sep = ", ";
  StringBuilder b = new StringBuilder();
  int count = 0;

  public CommaSeparatedStringBuilder() {
  }
  
  public CommaSeparatedStringBuilder(String sep) {
    this.sep = sep;
  }

  public void append(String value) {
    if (!first)
      b.append(sep);
    b.append(value);
    first = false;
    count++;    
  }
  
  public int length() {
    return b.length();
  }
  
  public int count() {
    return count;
  }

  @Override
  public String toString() {
    return b.toString();
  }

  public void appendIfNotNull(String s) {
   if (!Utilities.noString(s))
     append(s);
    
  }
}
