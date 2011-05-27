/*
 *  Copyright 2001-2011 Stephen Colebourne
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
package org.joda.beans;

import java.util.Map;

import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock address JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class CompanyAddress extends Address {

    /** The company name. */
    @PropertyDefinition
    private String companyName;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code CompanyAddress}.
     * @return the meta-bean, not null
     */
    public static CompanyAddress.Meta meta() {
        return CompanyAddress.Meta.INSTANCE;
    }

    @Override
    public CompanyAddress.Meta metaBean() {
        return CompanyAddress.Meta.INSTANCE;
    }

    @Override
    protected Object propertyGet(String propertyName) {
        switch (propertyName.hashCode()) {
            case -508582744:  // companyName
                return getCompanyName();
        }
        return super.propertyGet(propertyName);
    }

    @Override
    protected void propertySet(String propertyName, Object newValue) {
        switch (propertyName.hashCode()) {
            case -508582744:  // companyName
                setCompanyName((String) newValue);
                return;
        }
        super.propertySet(propertyName, newValue);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the company name.
     * @return the value of the property
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the company name.
     * @param companyName  the new value of the property
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Gets the the {@code companyName} property.
     * @return the property, not null
     */
    public final Property<String> companyName() {
        return metaBean().companyName().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code CompanyAddress}.
     */
    public static class Meta extends Address.Meta {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code companyName} property.
         */
        private final MetaProperty<String> companyName = DirectMetaProperty.ofReadWrite(this, "companyName", String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<Object>> map = new DirectMetaPropertyMap(
            this, (DirectMetaPropertyMap) super.metaPropertyMap(),
            "companyName");

        @Override
        public CompanyAddress createBean() {
            return new CompanyAddress();
        }

        @Override
        public Class<? extends CompanyAddress> beanType() {
            return CompanyAddress.class;
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -508582744:  // companyName
                    return companyName;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public Map<String, MetaProperty<Object>> metaPropertyMap() {
            return map;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code companyName} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> companyName() {
            return companyName;
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
