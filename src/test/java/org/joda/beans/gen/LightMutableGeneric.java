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
import java.util.ArrayList;
import java.util.List;

import org.joda.beans.Bean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;

import com.google.common.collect.ImmutableList;

/**
 * Mock light bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(style = "light")
public final class LightMutableGeneric<T extends Number> implements Bean, Serializable {

    /**
     * The number.
     */
    @PropertyDefinition
    private T number;
    /**
     * The number.
     */
    @PropertyDefinition
    private final List<T> list = new ArrayList<>();

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code LightMutableGeneric}.
     */
    private static final MetaBean META_BEAN =
            LightMetaBean.of(
                    LightMutableGeneric.class,
                    MethodHandles.lookup(),
                    null,
                    ImmutableList.of());

    /**
     * The meta-bean for {@code LightMutableGeneric}.
     * @return the meta-bean, not null
     */
    public static MetaBean meta() {
        return META_BEAN;
    }

    static {
        MetaBean.register(META_BEAN);
    }

    /**
     * The serialization version id.
     */
    private static final long serialVersionUID = 1L;

    private LightMutableGeneric(
            T number,
            List<T> list) {
        setNumber(number);
        setList(list);
    }

    @Override
    @SuppressWarnings("unchecked")
    public TypedMetaBean<LightMutableGeneric<T>> metaBean() {
        return (TypedMetaBean<LightMutableGeneric<T>>) META_BEAN;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public T getNumber() {
        return number;
    }

    /**
     * Sets the number.
     * @param number  the new value of the property
     */
    public void setNumber(T number) {
        this.number = number;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property, not null
     */
    public List<T> getList() {
        return list;
    }

    /**
     * Sets the number.
     * @param list  the new value of the property, not null
     */
    public void setList(List<T> list) {
        JodaBeanUtils.notNull(list, "list");
        this.list.clear();
        this.list.addAll(list);
    }

    //-----------------------------------------------------------------------
    @Override
    public LightMutableGeneric<T> clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            LightMutableGeneric<?> other = (LightMutableGeneric<?>) obj;
            return JodaBeanUtils.equal(getNumber(), other.getNumber()) &&
                    JodaBeanUtils.equal(getList(), other.getList());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getNumber());
        hash = hash * 31 + JodaBeanUtils.hashCode(getList());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(96);
        buf.append("LightMutableGeneric{");
        buf.append("number").append('=').append(getNumber()).append(',').append(' ');
        buf.append("list").append('=').append(JodaBeanUtils.toString(getList()));
        buf.append('}');
        return buf.toString();
    }

    //-------------------------- AUTOGENERATED END --------------------------
}
