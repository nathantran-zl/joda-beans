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
package org.joda.beans.sample;

import java.util.Map;
import java.util.NoSuchElementException;

import org.joda.beans.Bean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock bean, used for testing.
 */
@BeanDefinition(builderScope = "public")
public class MutableEmptyBase implements Bean {

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code MutableEmptyBase}.
     * @return the meta-bean, not null
     */
    public static MutableEmptyBase.Meta meta() {
        return MutableEmptyBase.Meta.INSTANCE;
    }

    static {
        MetaBean.register(MutableEmptyBase.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @return the builder, not null
     */
    public static MutableEmptyBase.Builder builder() {
        return new MutableEmptyBase.Builder();
    }

    /**
     * Restricted constructor.
     * @param builder  the builder to copy from, not null
     */
    protected MutableEmptyBase(MutableEmptyBase.Builder builder) {
    }

    @Override
    public MutableEmptyBase.Meta metaBean() {
        return MutableEmptyBase.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Override
    public MutableEmptyBase clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(32);
        buf.append("MutableEmptyBase{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code MutableEmptyBase}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null);

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        public MutableEmptyBase.Builder builder() {
            return new MutableEmptyBase.Builder();
        }

        @Override
        public Class<? extends MutableEmptyBase> beanType() {
            return MutableEmptyBase.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code MutableEmptyBase}.
     */
    public static class Builder extends DirectFieldsBeanBuilder<MutableEmptyBase> {

        /**
         * Restricted constructor.
         */
        protected Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        protected Builder(MutableEmptyBase beanToCopy) {
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            throw new NoSuchElementException("Unknown property: " + propertyName);
        }

        @Override
        public Builder set(String propertyName, Object newValue) {
            throw new NoSuchElementException("Unknown property: " + propertyName);
        }

        @Override
        public Builder set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public MutableEmptyBase build() {
            return new MutableEmptyBase(this);
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(32);
            buf.append("MutableEmptyBase.Builder{");
            int len = buf.length();
            toString(buf);
            if (buf.length() > len) {
                buf.setLength(buf.length() - 2);
            }
            buf.append('}');
            return buf.toString();
        }

        protected void toString(StringBuilder buf) {
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}