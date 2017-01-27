/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The action to take on the object attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ObjectAttributeAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectAttributeAction implements Serializable, Cloneable {

    /**
     * <p>
     * Type can be either Update or Delete.
     * </p>
     */
    private String objectAttributeActionType;
    /**
     * <p>
     * The value that you want to update to.
     * </p>
     */
    private TypedAttributeValue objectAttributeUpdateValue;

    /**
     * <p>
     * Type can be either Update or Delete.
     * </p>
     * 
     * @param objectAttributeActionType
     *        Type can be either Update or Delete.
     * @see UpdateActionType
     */

    public void setObjectAttributeActionType(String objectAttributeActionType) {
        this.objectAttributeActionType = objectAttributeActionType;
    }

    /**
     * <p>
     * Type can be either Update or Delete.
     * </p>
     * 
     * @return Type can be either Update or Delete.
     * @see UpdateActionType
     */

    public String getObjectAttributeActionType() {
        return this.objectAttributeActionType;
    }

    /**
     * <p>
     * Type can be either Update or Delete.
     * </p>
     * 
     * @param objectAttributeActionType
     *        Type can be either Update or Delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionType
     */

    public ObjectAttributeAction withObjectAttributeActionType(String objectAttributeActionType) {
        setObjectAttributeActionType(objectAttributeActionType);
        return this;
    }

    /**
     * <p>
     * Type can be either Update or Delete.
     * </p>
     * 
     * @param objectAttributeActionType
     *        Type can be either Update or Delete.
     * @see UpdateActionType
     */

    public void setObjectAttributeActionType(UpdateActionType objectAttributeActionType) {
        this.objectAttributeActionType = objectAttributeActionType.toString();
    }

    /**
     * <p>
     * Type can be either Update or Delete.
     * </p>
     * 
     * @param objectAttributeActionType
     *        Type can be either Update or Delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionType
     */

    public ObjectAttributeAction withObjectAttributeActionType(UpdateActionType objectAttributeActionType) {
        setObjectAttributeActionType(objectAttributeActionType);
        return this;
    }

    /**
     * <p>
     * The value that you want to update to.
     * </p>
     * 
     * @param objectAttributeUpdateValue
     *        The value that you want to update to.
     */

    public void setObjectAttributeUpdateValue(TypedAttributeValue objectAttributeUpdateValue) {
        this.objectAttributeUpdateValue = objectAttributeUpdateValue;
    }

    /**
     * <p>
     * The value that you want to update to.
     * </p>
     * 
     * @return The value that you want to update to.
     */

    public TypedAttributeValue getObjectAttributeUpdateValue() {
        return this.objectAttributeUpdateValue;
    }

    /**
     * <p>
     * The value that you want to update to.
     * </p>
     * 
     * @param objectAttributeUpdateValue
     *        The value that you want to update to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectAttributeAction withObjectAttributeUpdateValue(TypedAttributeValue objectAttributeUpdateValue) {
        setObjectAttributeUpdateValue(objectAttributeUpdateValue);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getObjectAttributeActionType() != null)
            sb.append("ObjectAttributeActionType: ").append(getObjectAttributeActionType()).append(",");
        if (getObjectAttributeUpdateValue() != null)
            sb.append("ObjectAttributeUpdateValue: ").append(getObjectAttributeUpdateValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectAttributeAction == false)
            return false;
        ObjectAttributeAction other = (ObjectAttributeAction) obj;
        if (other.getObjectAttributeActionType() == null ^ this.getObjectAttributeActionType() == null)
            return false;
        if (other.getObjectAttributeActionType() != null && other.getObjectAttributeActionType().equals(this.getObjectAttributeActionType()) == false)
            return false;
        if (other.getObjectAttributeUpdateValue() == null ^ this.getObjectAttributeUpdateValue() == null)
            return false;
        if (other.getObjectAttributeUpdateValue() != null && other.getObjectAttributeUpdateValue().equals(this.getObjectAttributeUpdateValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectAttributeActionType() == null) ? 0 : getObjectAttributeActionType().hashCode());
        hashCode = prime * hashCode + ((getObjectAttributeUpdateValue() == null) ? 0 : getObjectAttributeUpdateValue().hashCode());
        return hashCode;
    }

    @Override
    public ObjectAttributeAction clone() {
        try {
            return (ObjectAttributeAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
