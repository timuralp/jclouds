/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jclouds.vcloud.director.v1_5.domain;

import javax.xml.bind.annotation.XmlType;

import com.google.common.base.Objects;


/**
 * Represents parameters for copying a vApp and optionally deleting the source.
 * <p/>
 * <p/>
 * <p>Java class for CloneVAppParams complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CloneVAppParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.vmware.com/vcloud/v1.5}InstantiateVAppParamsType">
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlType(name = "CloneVAppParams")
public class CloneVAppParams
      extends InstantiateVAppParamsType<CloneVAppParams>

{
   @SuppressWarnings("unchecked")
   public static Builder builder() {
      return new Builder();
   }

   public Builder toBuilder() {
      return new Builder().fromCloneVAppParams(this);
   }

   public static class Builder extends InstantiateVAppParamsType.Builder<CloneVAppParams> {


      public CloneVAppParams build() {
         CloneVAppParams cloneVAppParams = new CloneVAppParams();
         return cloneVAppParams;
      }

      /**
       * @see ParamsType#getDescription()
       */
      public Builder description(String description) {
         super.description(description);
         return this;
      }

      /**
       * @see ParamsType#getName()
       */
      public Builder name(String name) {
         super.name(name);
         return this;
      }

      /**
       * @see VAppCreationParamsType#getVAppParent()
       */
      public Builder vAppParent(Reference vAppParent) {
         super.vAppParent(vAppParent);
         return this;
      }

      /**
       * @see VAppCreationParamsType#getInstantiationParams()
       */
      public Builder instantiationParams(InstantiationParams instantiationParams) {
         super.instantiationParams(instantiationParams);
         return this;
      }

      /**
       * @see VAppCreationParamsType#getDeploy()
       */
      public Builder deploy(Boolean deploy) {
         super.deploy(deploy);
         return this;
      }

      /**
       * @see VAppCreationParamsType#getPowerOn()
       */
      public Builder powerOn(Boolean powerOn) {
         super.powerOn(powerOn);
         return this;
      }

      /**
       * @see InstantiateVAppParamsType#getSource()
       */
      public Builder source(Reference source) {
         super.source(source);
         return this;
      }

      /**
       * @see InstantiateVAppParamsType#getIsSourceDelete()
       */
      public Builder isSourceDelete(Boolean isSourceDelete) {
         super.isSourceDelete(isSourceDelete);
         return this;
      }

      /**
       * @see InstantiateVAppParamsType#getLinkedClone()
       */
      public Builder linkedClone(Boolean linkedClone) {
         super.linkedClone(linkedClone);
         return this;
      }

      @Override
      public Builder fromInstantiateVAppParamsType(InstantiateVAppParamsType<CloneVAppParams> in) {
         return Builder.class.cast(super.fromInstantiateVAppParamsType(in));
      }

      public Builder fromCloneVAppParams(CloneVAppParams in) {
         return fromInstantiateVAppParamsType(in);
      }
   }

   private CloneVAppParams() {
      // For JAXB and builder use
   }

   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      CloneVAppParams that = CloneVAppParams.class.cast(o);
      return super.equals(that);
   }

   @Override
   public int hashCode() {
      return super.hashCode() + Objects.hashCode("");
   }

   @Override
   public String toString() {
      return Objects.toStringHelper("").toString();
   }

}
