//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.27 at 11:03:34 AM EST 
//


package org.mediawiki.xml.export_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="first-letter"/>
 *     &lt;enumeration value="case-sensitive"/>
 *     &lt;enumeration value="case-insensitive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaseType")
@XmlEnum
public enum CaseType {

    @XmlEnumValue("first-letter")
    FIRST_LETTER("first-letter"),
    @XmlEnumValue("case-sensitive")
    CASE_SENSITIVE("case-sensitive"),
    @XmlEnumValue("case-insensitive")
    CASE_INSENSITIVE("case-insensitive");
    private final String value;

    CaseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaseType fromValue(String v) {
        for (CaseType c: CaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
