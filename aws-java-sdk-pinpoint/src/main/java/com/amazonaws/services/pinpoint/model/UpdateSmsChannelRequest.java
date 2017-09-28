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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSmsChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String applicationId;

    private SMSChannelRequest sMSChannelRequest;

    /**
     * @param applicationId
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * @return
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @param applicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSmsChannelRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * @param sMSChannelRequest
     */

    public void setSMSChannelRequest(SMSChannelRequest sMSChannelRequest) {
        this.sMSChannelRequest = sMSChannelRequest;
    }

    /**
     * @return
     */

    public SMSChannelRequest getSMSChannelRequest() {
        return this.sMSChannelRequest;
    }

    /**
     * @param sMSChannelRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSmsChannelRequest withSMSChannelRequest(SMSChannelRequest sMSChannelRequest) {
        setSMSChannelRequest(sMSChannelRequest);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getSMSChannelRequest() != null)
            sb.append("SMSChannelRequest: ").append(getSMSChannelRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSmsChannelRequest == false)
            return false;
        UpdateSmsChannelRequest other = (UpdateSmsChannelRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getSMSChannelRequest() == null ^ this.getSMSChannelRequest() == null)
            return false;
        if (other.getSMSChannelRequest() != null && other.getSMSChannelRequest().equals(this.getSMSChannelRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getSMSChannelRequest() == null) ? 0 : getSMSChannelRequest().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSmsChannelRequest clone() {
        return (UpdateSmsChannelRequest) super.clone();
    }

}
