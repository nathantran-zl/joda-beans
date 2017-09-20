/*
 *  Copyright 2001-present Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;

import org.joda.beans.Bean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;

/**
 * Mock light bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(style = "light", constructorScope = "package")
public final class LightMutableSimple implements Bean, Serializable {

    /**
     * The number.
     */
    @PropertyDefinition
    private int number;
    /**
     * The text.
     */
    @PropertyDefinition
    private String text;

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code LightMutableSimple}.
     */
    private static final TypedMetaBean<LightMutableSimple> META_BEAN =
            LightMetaBean.of(LightMutableSimple.class, MethodHandles.lookup());

    /**
     * The meta-bean for {@code LightMutableSimple}.
     * @return the meta-bean, not null
     */
    public static TypedMetaBean<LightMutableSimple> meta() {
        return META_BEAN;
    }

    static {
        MetaBean.register(META_BEAN);
    }

    /**
     * The serialization version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates an instance.
     * @param number  the value of the property
     * @param text  the value of the property
     */
    LightMutableSimple(
            int number,
            String text) {
        setNumber(number);
        setText(text);
    }

    @Override
    public TypedMetaBean<LightMutableSimple> metaBean() {
        return META_BEAN;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the number.
     * @param number  the new value of the property
     */
    public void setNumber(int number) {
        this.number = number;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the text.
     * @return the value of the property
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text.
     * @param text  the new value of the property
     */
    public void setText(String text) {
        this.text = text;
    }

    //-----------------------------------------------------------------------
    @Override
    public LightMutableSimple clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            LightMutableSimple other = (LightMutableSimple) obj;
            return (getNumber() == other.getNumber()) &&
                    JodaBeanUtils.equal(getText(), other.getText());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getNumber());
        hash = hash * 31 + JodaBeanUtils.hashCode(getText());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(96);
        buf.append("LightMutableSimple{");
        buf.append("number").append('=').append(getNumber()).append(',').append(' ');
        buf.append("text").append('=').append(JodaBeanUtils.toString(getText()));
        buf.append('}');
        return buf.toString();
    }

    //-------------------------- AUTOGENERATED END --------------------------
}
