//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 02:43:46 PM ICT 
//


package un.unece.uncefact.codelist.standard.unece.addresstype.d14a;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A")
@XmlEnum
public enum AddressTypeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Postal address&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The address is representing a postal address.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("1")
    VALUE_1("1"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Fiscal address&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification of an address as required by fiscal administrations.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("2")
    VALUE_2("2"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Physical address&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The address represents an actual physical location.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("3")
    VALUE_3("3");
    private final String value;

    AddressTypeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressTypeContentType fromValue(String v) {
        for (AddressTypeContentType c: AddressTypeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
