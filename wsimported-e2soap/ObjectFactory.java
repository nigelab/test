
package e2s;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the e2s package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static javax.xml.namespace.QName _Byte_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "byte");
    private final static javax.xml.namespace.QName _Token_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "token");
    private final static javax.xml.namespace.QName _HexBinary_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "hexBinary");
    private final static javax.xml.namespace.QName _Short_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "short");
    private final static javax.xml.namespace.QName _GMonthDay_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gMonthDay");
    private final static javax.xml.namespace.QName _GYear_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gYear");
    private final static javax.xml.namespace.QName _Time_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "time");
    private final static javax.xml.namespace.QName _Base64Binary_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary");
    private final static javax.xml.namespace.QName _ENTITY_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "ENTITY");
    private final static javax.xml.namespace.QName _GMonth_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gMonth");
    private final static javax.xml.namespace.QName _ID_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "ID");
    private final static javax.xml.namespace.QName _Boolean_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean");
    private final static javax.xml.namespace.QName _DateTime_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "dateTime");
    private final static javax.xml.namespace.QName _NOTATION_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "NOTATION");
    private final static javax.xml.namespace.QName _NonPositiveInteger_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "nonPositiveInteger");
    private final static javax.xml.namespace.QName _QName_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "QName");
    private final static javax.xml.namespace.QName _AnyURI_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "anyURI");
    private final static javax.xml.namespace.QName _NCName_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "NCName");
    private final static javax.xml.namespace.QName _NMTOKENS_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "NMTOKENS");
    private final static javax.xml.namespace.QName _GDay_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gDay");
    private final static javax.xml.namespace.QName _GYearMonth_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gYearMonth");
    private final static javax.xml.namespace.QName _Float_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "float");
    private final static javax.xml.namespace.QName _Long_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long");
    private final static javax.xml.namespace.QName _NMTOKEN_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "NMTOKEN");
    private final static javax.xml.namespace.QName _Date_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "date");
    private final static javax.xml.namespace.QName _NonNegativeInteger_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "nonNegativeInteger");
    private final static javax.xml.namespace.QName _Array_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Array");
    private final static javax.xml.namespace.QName _UnsignedShort_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedShort");
    private final static javax.xml.namespace.QName _String_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string");
    private final static javax.xml.namespace.QName _IDREF_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "IDREF");
    private final static javax.xml.namespace.QName _Name_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Name");
    private final static javax.xml.namespace.QName _PositiveInteger_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "positiveInteger");
    private final static javax.xml.namespace.QName _Duration_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "duration");
    private final static javax.xml.namespace.QName _ENTITIES_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "ENTITIES");
    private final static javax.xml.namespace.QName _UnsignedLong_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedLong");
    private final static javax.xml.namespace.QName _Language_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "language");
    private final static javax.xml.namespace.QName _Struct_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Struct");
    private final static javax.xml.namespace.QName _Integer_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "integer");
    private final static javax.xml.namespace.QName _UnsignedByte_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedByte");
    private final static javax.xml.namespace.QName _NegativeInteger_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "negativeInteger");
    private final static javax.xml.namespace.QName _AnyType_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "anyType");
    private final static javax.xml.namespace.QName _IDREFS_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "IDREFS");
    private final static javax.xml.namespace.QName _UnsignedInt_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedInt");
    private final static javax.xml.namespace.QName _Int_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int");
    private final static javax.xml.namespace.QName _Decimal_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal");
    private final static javax.xml.namespace.QName _Double_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double");
    private final static javax.xml.namespace.QName _NormalizedString_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "normalizedString");
    private final static javax.xml.namespace.QName _GetApplicationListController_QNAME = new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "controller");
    private final static javax.xml.namespace.QName _GetPropertyConfigValuePropIdArr_QNAME = new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "propIdArr");
    private final static javax.xml.namespace.QName _PerformAlarmActionAlarmIdArray_QNAME = new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "alarmIdArray");
    private final static javax.xml.namespace.QName _SetPropertyConfigValuePropValueArray_QNAME = new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "propValueArray");
    private final static javax.xml.namespace.QName _GetPropertyLogPropId_QNAME = new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "propId");
    private final static javax.xml.namespace.QName _GetThisControllerNameResponseControllerName_QNAME = new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "controllerName");
    private final static javax.xml.namespace.QName _OverridePropertyValueValue_QNAME = new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "value");
    private final static javax.xml.namespace.QName _OverridePropertyValueTime_QNAME = new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "time");
    private final static javax.xml.namespace.QName _GetThisControllerVersionResponseControllerVersion_QNAME = new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "controllerVersion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: e2s
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OverridePropertyValue }
     * 
     */
    public OverridePropertyValue createOverridePropertyValue() {
        return new OverridePropertyValue();
    }

    /**
     * Create an instance of {@link GetPropertyInfo }
     * 
     */
    public GetPropertyInfo createGetPropertyInfo() {
        return new GetPropertyInfo();
    }

    /**
     * Create an instance of {@link PropIdArr }
     * 
     */
    public PropIdArr createPropIdArr() {
        return new PropIdArr();
    }

    /**
     * Create an instance of {@link GetPropertyExpandedStatus }
     * 
     */
    public GetPropertyExpandedStatus createGetPropertyExpandedStatus() {
        return new GetPropertyExpandedStatus();
    }

    /**
     * Create an instance of {@link GetAlarmList }
     * 
     */
    public GetAlarmList createGetAlarmList() {
        return new GetAlarmList();
    }

    /**
     * Create an instance of {@link PerformAlarmAction }
     * 
     */
    public PerformAlarmAction createPerformAlarmAction() {
        return new PerformAlarmAction();
    }

    /**
     * Create an instance of {@link AlarmIdArray }
     * 
     */
    public AlarmIdArray createAlarmIdArray() {
        return new AlarmIdArray();
    }

    /**
     * Create an instance of {@link GetThisControllerName }
     * 
     */
    public GetThisControllerName createGetThisControllerName() {
        return new GetThisControllerName();
    }

    /**
     * Create an instance of {@link GetPropertyInfoResponse }
     * 
     */
    public GetPropertyInfoResponse createGetPropertyInfoResponse() {
        return new GetPropertyInfoResponse();
    }

    /**
     * Create an instance of {@link PropertyInfo }
     * 
     */
    public PropertyInfo createPropertyInfo() {
        return new PropertyInfo();
    }

    /**
     * Create an instance of {@link GetPropertyConfigValue }
     * 
     */
    public GetPropertyConfigValue createGetPropertyConfigValue() {
        return new GetPropertyConfigValue();
    }

    /**
     * Create an instance of {@link SetPropertyConfigValueResponse }
     * 
     */
    public SetPropertyConfigValueResponse createSetPropertyConfigValueResponse() {
        return new SetPropertyConfigValueResponse();
    }

    /**
     * Create an instance of {@link PropertyStatus }
     * 
     */
    public PropertyStatus createPropertyStatus() {
        return new PropertyStatus();
    }

    /**
     * Create an instance of {@link GetAlarmListResponse }
     * 
     */
    public GetAlarmListResponse createGetAlarmListResponse() {
        return new GetAlarmListResponse();
    }

    /**
     * Create an instance of {@link AlarmInfo }
     * 
     */
    public AlarmInfo createAlarmInfo() {
        return new AlarmInfo();
    }

    /**
     * Create an instance of {@link GetThisControllerVersionResponse }
     * 
     */
    public GetThisControllerVersionResponse createGetThisControllerVersionResponse() {
        return new GetThisControllerVersionResponse();
    }

    /**
     * Create an instance of {@link GetThisControllerVersion }
     * 
     */
    public GetThisControllerVersion createGetThisControllerVersion() {
        return new GetThisControllerVersion();
    }

    /**
     * Create an instance of {@link SetPropertyConfigValue }
     * 
     */
    public SetPropertyConfigValue createSetPropertyConfigValue() {
        return new SetPropertyConfigValue();
    }

    /**
     * Create an instance of {@link PropertyValueArray }
     * 
     */
    public PropertyValueArray createPropertyValueArray() {
        return new PropertyValueArray();
    }

    /**
     * Create an instance of {@link GetControllerList }
     * 
     */
    public GetControllerList createGetControllerList() {
        return new GetControllerList();
    }

    /**
     * Create an instance of {@link GetControllerListResponse }
     * 
     */
    public GetControllerListResponse createGetControllerListResponse() {
        return new GetControllerListResponse();
    }

    /**
     * Create an instance of {@link ControllerInfo }
     * 
     */
    public ControllerInfo createControllerInfo() {
        return new ControllerInfo();
    }

    /**
     * Create an instance of {@link GetPropertyLogResponse }
     * 
     */
    public GetPropertyLogResponse createGetPropertyLogResponse() {
        return new GetPropertyLogResponse();
    }

    /**
     * Create an instance of {@link PropertyLogEntry }
     * 
     */
    public PropertyLogEntry createPropertyLogEntry() {
        return new PropertyLogEntry();
    }

    /**
     * Create an instance of {@link GetApplicationListResponse }
     * 
     */
    public GetApplicationListResponse createGetApplicationListResponse() {
        return new GetApplicationListResponse();
    }

    /**
     * Create an instance of {@link ApplicationInfo }
     * 
     */
    public ApplicationInfo createApplicationInfo() {
        return new ApplicationInfo();
    }

    /**
     * Create an instance of {@link GetApplicationList }
     * 
     */
    public GetApplicationList createGetApplicationList() {
        return new GetApplicationList();
    }

    /**
     * Create an instance of {@link OverridePropertyValueResponse }
     * 
     */
    public OverridePropertyValueResponse createOverridePropertyValueResponse() {
        return new OverridePropertyValueResponse();
    }

    /**
     * Create an instance of {@link GetThisControllerNameResponse }
     * 
     */
    public GetThisControllerNameResponse createGetThisControllerNameResponse() {
        return new GetThisControllerNameResponse();
    }

    /**
     * Create an instance of {@link GetPropertyLog }
     * 
     */
    public GetPropertyLog createGetPropertyLog() {
        return new GetPropertyLog();
    }

    /**
     * Create an instance of {@link GetPropertyConfigValueResponse }
     * 
     */
    public GetPropertyConfigValueResponse createGetPropertyConfigValueResponse() {
        return new GetPropertyConfigValueResponse();
    }

    /**
     * Create an instance of {@link PropertyValue }
     * 
     */
    public PropertyValue createPropertyValue() {
        return new PropertyValue();
    }

    /**
     * Create an instance of {@link GetPropertyExpandedStatusResponse }
     * 
     */
    public GetPropertyExpandedStatusResponse createGetPropertyExpandedStatusResponse() {
        return new GetPropertyExpandedStatusResponse();
    }

    /**
     * Create an instance of {@link PropertyExpandedStatus }
     * 
     */
    public PropertyExpandedStatus createPropertyExpandedStatus() {
        return new PropertyExpandedStatus();
    }

    /**
     * Create an instance of {@link PerformAlarmActionResponse }
     * 
     */
    public PerformAlarmActionResponse createPerformAlarmActionResponse() {
        return new PerformAlarmActionResponse();
    }

    /**
     * Create an instance of {@link GDay }
     * 
     */
    public GDay createGDay() {
        return new GDay();
    }

    /**
     * Create an instance of {@link NMTOKENS }
     * 
     */
    public NMTOKENS createNMTOKENS() {
        return new NMTOKENS();
    }

    /**
     * Create an instance of {@link NCName }
     * 
     */
    public NCName createNCName() {
        return new NCName();
    }

    /**
     * Create an instance of {@link AnyURI }
     * 
     */
    public AnyURI createAnyURI() {
        return new AnyURI();
    }

    /**
     * Create an instance of {@link GYearMonth }
     * 
     */
    public GYearMonth createGYearMonth() {
        return new GYearMonth();
    }

    /**
     * Create an instance of {@link NOTATION }
     * 
     */
    public NOTATION createNOTATION() {
        return new NOTATION();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link e2s.QName }
     * 
     */
    public e2s.QName createQName() {
        return new e2s.QName();
    }

    /**
     * Create an instance of {@link NonPositiveInteger }
     * 
     */
    public NonPositiveInteger createNonPositiveInteger() {
        return new NonPositiveInteger();
    }

    /**
     * Create an instance of {@link UnsignedShort }
     * 
     */
    public UnsignedShort createUnsignedShort() {
        return new UnsignedShort();
    }

    /**
     * Create an instance of {@link Array }
     * 
     */
    public Array createArray() {
        return new Array();
    }

    /**
     * Create an instance of {@link Long }
     * 
     */
    public Long createLong() {
        return new Long();
    }

    /**
     * Create an instance of {@link NMTOKEN }
     * 
     */
    public NMTOKEN createNMTOKEN() {
        return new NMTOKEN();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Float }
     * 
     */
    public Float createFloat() {
        return new Float();
    }

    /**
     * Create an instance of {@link NonNegativeInteger }
     * 
     */
    public NonNegativeInteger createNonNegativeInteger() {
        return new NonNegativeInteger();
    }

    /**
     * Create an instance of {@link Short }
     * 
     */
    public Short createShort() {
        return new Short();
    }

    /**
     * Create an instance of {@link GYear }
     * 
     */
    public GYear createGYear() {
        return new GYear();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link GMonthDay }
     * 
     */
    public GMonthDay createGMonthDay() {
        return new GMonthDay();
    }

    /**
     * Create an instance of {@link Byte }
     * 
     */
    public Byte createByte() {
        return new Byte();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link ID }
     * 
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link Boolean }
     * 
     */
    public Boolean createBoolean() {
        return new Boolean();
    }

    /**
     * Create an instance of {@link GMonth }
     * 
     */
    public GMonth createGMonth() {
        return new GMonth();
    }

    /**
     * Create an instance of {@link ENTITY }
     * 
     */
    public ENTITY createENTITY() {
        return new ENTITY();
    }

    /**
     * Create an instance of {@link NegativeInteger }
     * 
     */
    public NegativeInteger createNegativeInteger() {
        return new NegativeInteger();
    }

    /**
     * Create an instance of {@link UnsignedByte }
     * 
     */
    public UnsignedByte createUnsignedByte() {
        return new UnsignedByte();
    }

    /**
     * Create an instance of {@link Integer }
     * 
     */
    public Integer createInteger() {
        return new Integer();
    }

    /**
     * Create an instance of {@link Int }
     * 
     */
    public Int createInt() {
        return new Int();
    }

    /**
     * Create an instance of {@link UnsignedInt }
     * 
     */
    public UnsignedInt createUnsignedInt() {
        return new UnsignedInt();
    }

    /**
     * Create an instance of {@link IDREFS }
     * 
     */
    public IDREFS createIDREFS() {
        return new IDREFS();
    }

    /**
     * Create an instance of {@link NormalizedString }
     * 
     */
    public NormalizedString createNormalizedString() {
        return new NormalizedString();
    }

    /**
     * Create an instance of {@link Double }
     * 
     */
    public Double createDouble() {
        return new Double();
    }

    /**
     * Create an instance of {@link Decimal }
     * 
     */
    public Decimal createDecimal() {
        return new Decimal();
    }

    /**
     * Create an instance of {@link PositiveInteger }
     * 
     */
    public PositiveInteger createPositiveInteger() {
        return new PositiveInteger();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link ENTITIES }
     * 
     */
    public ENTITIES createENTITIES() {
        return new ENTITIES();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link IDREF }
     * 
     */
    public IDREF createIDREF() {
        return new IDREF();
    }

    /**
     * Create an instance of {@link e2s.String }
     * 
     */
    public e2s.String createString() {
        return new e2s.String();
    }

    /**
     * Create an instance of {@link UnsignedLong }
     * 
     */
    public UnsignedLong createUnsignedLong() {
        return new UnsignedLong();
    }

    /**
     * Create an instance of {@link Struct }
     * 
     */
    public Struct createStruct() {
        return new Struct();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HexBinary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "hexBinary")
    public JAXBElement<HexBinary> createHexBinary(HexBinary value) {
        return new JAXBElement<HexBinary>(_HexBinary_QNAME, HexBinary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GMonthDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "gMonthDay")
    public JAXBElement<GMonthDay> createGMonthDay(GMonthDay value) {
        return new JAXBElement<GMonthDay>(_GMonthDay_QNAME, GMonthDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "gYear")
    public JAXBElement<GYear> createGYear(GYear value) {
        return new JAXBElement<GYear>(_GYear_QNAME, GYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "time")
    public JAXBElement<Time> createTime(Time value) {
        return new JAXBElement<Time>(_Time_QNAME, Time.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64Binary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "base64Binary")
    public JAXBElement<Base64Binary> createBase64Binary(Base64Binary value) {
        return new JAXBElement<Base64Binary>(_Base64Binary_QNAME, Base64Binary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ENTITY }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "ENTITY")
    public JAXBElement<ENTITY> createENTITY(ENTITY value) {
        return new JAXBElement<ENTITY>(_ENTITY_QNAME, ENTITY.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "gMonth")
    public JAXBElement<GMonth> createGMonth(GMonth value) {
        return new JAXBElement<GMonth>(_GMonth_QNAME, GMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "ID")
    public JAXBElement<ID> createID(ID value) {
        return new JAXBElement<ID>(_ID_QNAME, ID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "dateTime")
    public JAXBElement<DateTime> createDateTime(DateTime value) {
        return new JAXBElement<DateTime>(_DateTime_QNAME, DateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NOTATION }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "NOTATION")
    public JAXBElement<NOTATION> createNOTATION(NOTATION value) {
        return new JAXBElement<NOTATION>(_NOTATION_QNAME, NOTATION.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonPositiveInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "nonPositiveInteger")
    public JAXBElement<NonPositiveInteger> createNonPositiveInteger(NonPositiveInteger value) {
        return new JAXBElement<NonPositiveInteger>(_NonPositiveInteger_QNAME, NonPositiveInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link e2s.QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "QName")
    public JAXBElement<e2s.QName> createQName(e2s.QName value) {
        return new JAXBElement<e2s.QName>(_QName_QNAME, e2s.QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyURI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "anyURI")
    public JAXBElement<AnyURI> createAnyURI(AnyURI value) {
        return new JAXBElement<AnyURI>(_AnyURI_QNAME, AnyURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NCName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "NCName")
    public JAXBElement<NCName> createNCName(NCName value) {
        return new JAXBElement<NCName>(_NCName_QNAME, NCName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NMTOKENS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "NMTOKENS")
    public JAXBElement<NMTOKENS> createNMTOKENS(NMTOKENS value) {
        return new JAXBElement<NMTOKENS>(_NMTOKENS_QNAME, NMTOKENS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "gDay")
    public JAXBElement<GDay> createGDay(GDay value) {
        return new JAXBElement<GDay>(_GDay_QNAME, GDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GYearMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "gYearMonth")
    public JAXBElement<GYearMonth> createGYearMonth(GYearMonth value) {
        return new JAXBElement<GYearMonth>(_GYearMonth_QNAME, GYearMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NMTOKEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "NMTOKEN")
    public JAXBElement<NMTOKEN> createNMTOKEN(NMTOKEN value) {
        return new JAXBElement<NMTOKEN>(_NMTOKEN_QNAME, NMTOKEN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "date")
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<Date>(_Date_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonNegativeInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "nonNegativeInteger")
    public JAXBElement<NonNegativeInteger> createNonNegativeInteger(NonNegativeInteger value) {
        return new JAXBElement<NonNegativeInteger>(_NonNegativeInteger_QNAME, NonNegativeInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Array }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "Array")
    public JAXBElement<Array> createArray(Array value) {
        return new JAXBElement<Array>(_Array_QNAME, Array.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedShort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "unsignedShort")
    public JAXBElement<UnsignedShort> createUnsignedShort(UnsignedShort value) {
        return new JAXBElement<UnsignedShort>(_UnsignedShort_QNAME, UnsignedShort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link e2s.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "string")
    public JAXBElement<e2s.String> createString(e2s.String value) {
        return new JAXBElement<e2s.String>(_String_QNAME, e2s.String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDREF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "IDREF")
    public JAXBElement<IDREF> createIDREF(IDREF value) {
        return new JAXBElement<IDREF>(_IDREF_QNAME, IDREF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "Name")
    public JAXBElement<Name> createName(Name value) {
        return new JAXBElement<Name>(_Name_QNAME, Name.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositiveInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "positiveInteger")
    public JAXBElement<PositiveInteger> createPositiveInteger(PositiveInteger value) {
        return new JAXBElement<PositiveInteger>(_PositiveInteger_QNAME, PositiveInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ENTITIES }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "ENTITIES")
    public JAXBElement<ENTITIES> createENTITIES(ENTITIES value) {
        return new JAXBElement<ENTITIES>(_ENTITIES_QNAME, ENTITIES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "unsignedLong")
    public JAXBElement<UnsignedLong> createUnsignedLong(UnsignedLong value) {
        return new JAXBElement<UnsignedLong>(_UnsignedLong_QNAME, UnsignedLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Language }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "language")
    public JAXBElement<Language> createLanguage(Language value) {
        return new JAXBElement<Language>(_Language_QNAME, Language.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Struct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "Struct")
    public JAXBElement<Struct> createStruct(Struct value) {
        return new JAXBElement<Struct>(_Struct_QNAME, Struct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "integer")
    public JAXBElement<Integer> createInteger(Integer value) {
        return new JAXBElement<Integer>(_Integer_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedByte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "unsignedByte")
    public JAXBElement<UnsignedByte> createUnsignedByte(UnsignedByte value) {
        return new JAXBElement<UnsignedByte>(_UnsignedByte_QNAME, UnsignedByte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "negativeInteger")
    public JAXBElement<NegativeInteger> createNegativeInteger(NegativeInteger value) {
        return new JAXBElement<NegativeInteger>(_NegativeInteger_QNAME, NegativeInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDREFS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "IDREFS")
    public JAXBElement<IDREFS> createIDREFS(IDREFS value) {
        return new JAXBElement<IDREFS>(_IDREFS_QNAME, IDREFS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "unsignedInt")
    public JAXBElement<UnsignedInt> createUnsignedInt(UnsignedInt value) {
        return new JAXBElement<UnsignedInt>(_UnsignedInt_QNAME, UnsignedInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Int }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "int")
    public JAXBElement<Int> createInt(Int value) {
        return new JAXBElement<Int>(_Int_QNAME, Int.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Decimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "decimal")
    public JAXBElement<Decimal> createDecimal(Decimal value) {
        return new JAXBElement<Decimal>(_Decimal_QNAME, Decimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormalizedString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "normalizedString")
    public JAXBElement<NormalizedString> createNormalizedString(NormalizedString value) {
        return new JAXBElement<NormalizedString>(_NormalizedString_QNAME, NormalizedString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "controller", scope = GetApplicationList.class)
    public JAXBElement<java.lang.String> createGetApplicationListController(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetApplicationListController_QNAME, java.lang.String.class, GetApplicationList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropIdArr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "propIdArr", scope = GetPropertyConfigValue.class)
    public JAXBElement<PropIdArr> createGetPropertyConfigValuePropIdArr(PropIdArr value) {
        return new JAXBElement<PropIdArr>(_GetPropertyConfigValuePropIdArr_QNAME, PropIdArr.class, GetPropertyConfigValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "controller", scope = PerformAlarmAction.class)
    public JAXBElement<java.lang.String> createPerformAlarmActionController(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetApplicationListController_QNAME, java.lang.String.class, PerformAlarmAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmIdArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "alarmIdArray", scope = PerformAlarmAction.class)
    public JAXBElement<AlarmIdArray> createPerformAlarmActionAlarmIdArray(AlarmIdArray value) {
        return new JAXBElement<AlarmIdArray>(_PerformAlarmActionAlarmIdArray_QNAME, AlarmIdArray.class, PerformAlarmAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyValueArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "propValueArray", scope = SetPropertyConfigValue.class)
    public JAXBElement<PropertyValueArray> createSetPropertyConfigValuePropValueArray(PropertyValueArray value) {
        return new JAXBElement<PropertyValueArray>(_SetPropertyConfigValuePropValueArray_QNAME, PropertyValueArray.class, SetPropertyConfigValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "propId", scope = GetPropertyLog.class)
    public JAXBElement<java.lang.String> createGetPropertyLogPropId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetPropertyLogPropId_QNAME, java.lang.String.class, GetPropertyLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropIdArr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "propIdArr", scope = GetPropertyInfo.class)
    public JAXBElement<PropIdArr> createGetPropertyInfoPropIdArr(PropIdArr value) {
        return new JAXBElement<PropIdArr>(_GetPropertyConfigValuePropIdArr_QNAME, PropIdArr.class, GetPropertyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "controllerName", scope = GetThisControllerNameResponse.class)
    public JAXBElement<java.lang.String> createGetThisControllerNameResponseControllerName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetThisControllerNameResponseControllerName_QNAME, java.lang.String.class, GetThisControllerNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "controller", scope = GetAlarmList.class)
    public JAXBElement<java.lang.String> createGetAlarmListController(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetApplicationListController_QNAME, java.lang.String.class, GetAlarmList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropIdArr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "propIdArr", scope = GetPropertyExpandedStatus.class)
    public JAXBElement<PropIdArr> createGetPropertyExpandedStatusPropIdArr(PropIdArr value) {
        return new JAXBElement<PropIdArr>(_GetPropertyConfigValuePropIdArr_QNAME, PropIdArr.class, GetPropertyExpandedStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "value", scope = OverridePropertyValue.class)
    public JAXBElement<java.lang.String> createOverridePropertyValueValue(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_OverridePropertyValueValue_QNAME, java.lang.String.class, OverridePropertyValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "time", scope = OverridePropertyValue.class)
    public JAXBElement<java.lang.String> createOverridePropertyValueTime(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_OverridePropertyValueTime_QNAME, java.lang.String.class, OverridePropertyValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "propId", scope = OverridePropertyValue.class)
    public JAXBElement<java.lang.String> createOverridePropertyValuePropId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetPropertyLogPropId_QNAME, java.lang.String.class, OverridePropertyValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/e2.xsd", name = "controllerVersion", scope = GetThisControllerVersionResponse.class)
    public JAXBElement<java.lang.String> createGetThisControllerVersionResponseControllerVersion(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetThisControllerVersionResponseControllerVersion_QNAME, java.lang.String.class, GetThisControllerVersionResponse.class, value);
    }

}
