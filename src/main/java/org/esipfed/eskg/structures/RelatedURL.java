/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.07 at 01:56:59 PM PDT 
//

package org.esipfed.eskg.structures;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}URL_Content_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}URL" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "urlContentType", "url", "description" })
@XmlRootElement(name = "Related_URL")
public class RelatedURL {

  @XmlElement(name = "URL_Content_Type")
  protected URLContentType urlContentType;
  @XmlElement(name = "URL", required = true)
  protected List<String> url;
  @XmlElement(name = "Description")
  protected String description;

  /**
   * Gets the value of the urlContentType property.
   * 
   * @return possible object is {@link URLContentType }
   * 
   */
  public URLContentType getURLContentType() {
    return urlContentType;
  }

  /**
   * Sets the value of the urlContentType property.
   * 
   * @param value
   *          allowed object is {@link URLContentType }
   * 
   */
  public void setURLContentType(URLContentType value) {
    this.urlContentType = value;
  }

  /**
   * Gets the value of the url property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the url property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getURL().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   * 
   * 
   */
  public List<String> getURL() {
    if (url == null) {
      url = new ArrayList<String>();
    }
    return this.url;
  }

  /**
   * Gets the value of the description property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setDescription(String value) {
    this.description = value;
  }

}
