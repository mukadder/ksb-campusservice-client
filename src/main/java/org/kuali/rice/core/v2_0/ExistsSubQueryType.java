
package org.kuali.rice.core.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ExistsSubQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExistsSubQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rice.kuali.org/core/v2_0}abstractPredicate">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}and"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}equal"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}equalIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}existsSubQuery"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}greaterThan"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}greaterThanOrEqual"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}in"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}inIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}lessThan"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}lessThanOrEqual"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}like"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}likeIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notEqual"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notEqualIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notIn"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notInIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notLikeIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notLike"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notNull"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}null"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}or"/>
 *         &lt;/choice>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="subQueryType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExistsSubQueryType", propOrder = {
    "and",
    "equal",
    "equalIgnoreCase",
    "existsSubQuery",
    "greaterThan",
    "greaterThanOrEqual",
    "in",
    "inIgnoreCase",
    "lessThan",
    "lessThanOrEqual",
    "like",
    "likeIgnoreCase",
    "notEqual",
    "notEqualIgnoreCase",
    "notIn",
    "notInIgnoreCase",
    "notLikeIgnoreCase",
    "notLike",
    "notNull",
    "_null",
    "or",
    "any"
})
public class ExistsSubQueryType
    extends AbstractPredicate
{

    protected AndType and;
    protected EqualType equal;
    protected EqualIgnoreCaseType equalIgnoreCase;
    protected ExistsSubQueryType existsSubQuery;
    protected GreaterThanType greaterThan;
    protected GreaterThanOrEqualType greaterThanOrEqual;
    protected InType in;
    protected InIgnoreCaseType inIgnoreCase;
    protected LessThanType lessThan;
    protected LessThanOrEqualType lessThanOrEqual;
    protected LikeType like;
    protected LikeIgnoreCaseType likeIgnoreCase;
    protected NotEqualType notEqual;
    protected NotEqualIgnoreCaseType notEqualIgnoreCase;
    protected NotInType notIn;
    protected NotInIgnoreCaseType notInIgnoreCase;
    protected NotLikeIgnoreCaseType notLikeIgnoreCase;
    protected NotLikeType notLike;
    protected NotNullType notNull;
    @XmlElement(name = "null")
    protected NullType _null;
    protected OrType or;
    @XmlAnyElement
    protected List<Element> any;
    @XmlAttribute(name = "subQueryType", required = true)
    protected String subQueryType;

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link AndType }
     *     
     */
    public AndType getAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndType }
     *     
     */
    public void setAnd(AndType value) {
        this.and = value;
    }

    /**
     * Gets the value of the equal property.
     * 
     * @return
     *     possible object is
     *     {@link EqualType }
     *     
     */
    public EqualType getEqual() {
        return equal;
    }

    /**
     * Sets the value of the equal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EqualType }
     *     
     */
    public void setEqual(EqualType value) {
        this.equal = value;
    }

    /**
     * Gets the value of the equalIgnoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link EqualIgnoreCaseType }
     *     
     */
    public EqualIgnoreCaseType getEqualIgnoreCase() {
        return equalIgnoreCase;
    }

    /**
     * Sets the value of the equalIgnoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link EqualIgnoreCaseType }
     *     
     */
    public void setEqualIgnoreCase(EqualIgnoreCaseType value) {
        this.equalIgnoreCase = value;
    }

    /**
     * Gets the value of the existsSubQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ExistsSubQueryType }
     *     
     */
    public ExistsSubQueryType getExistsSubQuery() {
        return existsSubQuery;
    }

    /**
     * Sets the value of the existsSubQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistsSubQueryType }
     *     
     */
    public void setExistsSubQuery(ExistsSubQueryType value) {
        this.existsSubQuery = value;
    }

    /**
     * Gets the value of the greaterThan property.
     * 
     * @return
     *     possible object is
     *     {@link GreaterThanType }
     *     
     */
    public GreaterThanType getGreaterThan() {
        return greaterThan;
    }

    /**
     * Sets the value of the greaterThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link GreaterThanType }
     *     
     */
    public void setGreaterThan(GreaterThanType value) {
        this.greaterThan = value;
    }

    /**
     * Gets the value of the greaterThanOrEqual property.
     * 
     * @return
     *     possible object is
     *     {@link GreaterThanOrEqualType }
     *     
     */
    public GreaterThanOrEqualType getGreaterThanOrEqual() {
        return greaterThanOrEqual;
    }

    /**
     * Sets the value of the greaterThanOrEqual property.
     * 
     * @param value
     *     allowed object is
     *     {@link GreaterThanOrEqualType }
     *     
     */
    public void setGreaterThanOrEqual(GreaterThanOrEqualType value) {
        this.greaterThanOrEqual = value;
    }

    /**
     * Gets the value of the in property.
     * 
     * @return
     *     possible object is
     *     {@link InType }
     *     
     */
    public InType getIn() {
        return in;
    }

    /**
     * Sets the value of the in property.
     * 
     * @param value
     *     allowed object is
     *     {@link InType }
     *     
     */
    public void setIn(InType value) {
        this.in = value;
    }

    /**
     * Gets the value of the inIgnoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link InIgnoreCaseType }
     *     
     */
    public InIgnoreCaseType getInIgnoreCase() {
        return inIgnoreCase;
    }

    /**
     * Sets the value of the inIgnoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link InIgnoreCaseType }
     *     
     */
    public void setInIgnoreCase(InIgnoreCaseType value) {
        this.inIgnoreCase = value;
    }

    /**
     * Gets the value of the lessThan property.
     * 
     * @return
     *     possible object is
     *     {@link LessThanType }
     *     
     */
    public LessThanType getLessThan() {
        return lessThan;
    }

    /**
     * Sets the value of the lessThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link LessThanType }
     *     
     */
    public void setLessThan(LessThanType value) {
        this.lessThan = value;
    }

    /**
     * Gets the value of the lessThanOrEqual property.
     * 
     * @return
     *     possible object is
     *     {@link LessThanOrEqualType }
     *     
     */
    public LessThanOrEqualType getLessThanOrEqual() {
        return lessThanOrEqual;
    }

    /**
     * Sets the value of the lessThanOrEqual property.
     * 
     * @param value
     *     allowed object is
     *     {@link LessThanOrEqualType }
     *     
     */
    public void setLessThanOrEqual(LessThanOrEqualType value) {
        this.lessThanOrEqual = value;
    }

    /**
     * Gets the value of the like property.
     * 
     * @return
     *     possible object is
     *     {@link LikeType }
     *     
     */
    public LikeType getLike() {
        return like;
    }

    /**
     * Sets the value of the like property.
     * 
     * @param value
     *     allowed object is
     *     {@link LikeType }
     *     
     */
    public void setLike(LikeType value) {
        this.like = value;
    }

    /**
     * Gets the value of the likeIgnoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link LikeIgnoreCaseType }
     *     
     */
    public LikeIgnoreCaseType getLikeIgnoreCase() {
        return likeIgnoreCase;
    }

    /**
     * Sets the value of the likeIgnoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link LikeIgnoreCaseType }
     *     
     */
    public void setLikeIgnoreCase(LikeIgnoreCaseType value) {
        this.likeIgnoreCase = value;
    }

    /**
     * Gets the value of the notEqual property.
     * 
     * @return
     *     possible object is
     *     {@link NotEqualType }
     *     
     */
    public NotEqualType getNotEqual() {
        return notEqual;
    }

    /**
     * Sets the value of the notEqual property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotEqualType }
     *     
     */
    public void setNotEqual(NotEqualType value) {
        this.notEqual = value;
    }

    /**
     * Gets the value of the notEqualIgnoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link NotEqualIgnoreCaseType }
     *     
     */
    public NotEqualIgnoreCaseType getNotEqualIgnoreCase() {
        return notEqualIgnoreCase;
    }

    /**
     * Sets the value of the notEqualIgnoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotEqualIgnoreCaseType }
     *     
     */
    public void setNotEqualIgnoreCase(NotEqualIgnoreCaseType value) {
        this.notEqualIgnoreCase = value;
    }

    /**
     * Gets the value of the notIn property.
     * 
     * @return
     *     possible object is
     *     {@link NotInType }
     *     
     */
    public NotInType getNotIn() {
        return notIn;
    }

    /**
     * Sets the value of the notIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotInType }
     *     
     */
    public void setNotIn(NotInType value) {
        this.notIn = value;
    }

    /**
     * Gets the value of the notInIgnoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link NotInIgnoreCaseType }
     *     
     */
    public NotInIgnoreCaseType getNotInIgnoreCase() {
        return notInIgnoreCase;
    }

    /**
     * Sets the value of the notInIgnoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotInIgnoreCaseType }
     *     
     */
    public void setNotInIgnoreCase(NotInIgnoreCaseType value) {
        this.notInIgnoreCase = value;
    }

    /**
     * Gets the value of the notLikeIgnoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link NotLikeIgnoreCaseType }
     *     
     */
    public NotLikeIgnoreCaseType getNotLikeIgnoreCase() {
        return notLikeIgnoreCase;
    }

    /**
     * Sets the value of the notLikeIgnoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotLikeIgnoreCaseType }
     *     
     */
    public void setNotLikeIgnoreCase(NotLikeIgnoreCaseType value) {
        this.notLikeIgnoreCase = value;
    }

    /**
     * Gets the value of the notLike property.
     * 
     * @return
     *     possible object is
     *     {@link NotLikeType }
     *     
     */
    public NotLikeType getNotLike() {
        return notLike;
    }

    /**
     * Sets the value of the notLike property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotLikeType }
     *     
     */
    public void setNotLike(NotLikeType value) {
        this.notLike = value;
    }

    /**
     * Gets the value of the notNull property.
     * 
     * @return
     *     possible object is
     *     {@link NotNullType }
     *     
     */
    public NotNullType getNotNull() {
        return notNull;
    }

    /**
     * Sets the value of the notNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotNullType }
     *     
     */
    public void setNotNull(NotNullType value) {
        this.notNull = value;
    }

    /**
     * Gets the value of the null property.
     * 
     * @return
     *     possible object is
     *     {@link NullType }
     *     
     */
    public NullType getNull() {
        return _null;
    }

    /**
     * Sets the value of the null property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullType }
     *     
     */
    public void setNull(NullType value) {
        this._null = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link OrType }
     *     
     */
    public OrType getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrType }
     *     
     */
    public void setOr(OrType value) {
        this.or = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets the value of the subQueryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubQueryType() {
        return subQueryType;
    }

    /**
     * Sets the value of the subQueryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubQueryType(String value) {
        this.subQueryType = value;
    }

}
