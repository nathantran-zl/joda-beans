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
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.joda.beans.Bean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.BasicBeanBuilder;
import org.joda.beans.impl.direct.MinimalMetaBean;

/**
 * Mock minimal bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(style = "minimal")
public final class MinimalMutableSimple implements Bean, Serializable {

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
     * The meta-bean for {@code MinimalMutableSimple}.
     */
    private static final TypedMetaBean<MinimalMutableSimple> META_BEAN =
            MinimalMetaBean.of(
                    MinimalMutableSimple.class,
                    () -> new BasicBeanBuilder<>(new MinimalMutableSimple()),
                    Arrays.<Function<MinimalMutableSimple, Object>>asList(
                            b -> b.getNumber(),
                            b -> b.getText()),
                    Arrays.<BiConsumer<MinimalMutableSimple, Object>>asList(
                            (b, v) -> b.setNumber((Integer) v),
                            (b, v) -> b.setText((String) v)));

    /**
     * The meta-bean for {@code MinimalMutableSimple}.
     * @return the meta-bean, not null
     */
    public static TypedMetaBean<MinimalMutableSimple> meta() {
        return META_BEAN;
    }

    static {
        MetaBean.register(META_BEAN);
    }

    /**
     * The serialization version id.
     */
    private static final long serialVersionUID = 1L;

    @Override
    public TypedMetaBean<MinimalMutableSimple> metaBean() {
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
    public MinimalMutableSimple clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            MinimalMutableSimple other = (MinimalMutableSimple) obj;
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
        buf.append("MinimalMutableSimple{");
        buf.append("number").append('=').append(getNumber()).append(',').append(' ');
        buf.append("text").append('=').append(JodaBeanUtils.toString(getText()));
        buf.append('}');
        return buf.toString();
    }

    //-------------------------- AUTOGENERATED END --------------------------
}
