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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendUsersMessagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private SendUsersMessageResponse sendUsersMessageResponse;

    /**
     * @param sendUsersMessageResponse
     */

    public void setSendUsersMessageResponse(SendUsersMessageResponse sendUsersMessageResponse) {
        this.sendUsersMessageResponse = sendUsersMessageResponse;
    }

    /**
     * @return
     */

    public SendUsersMessageResponse getSendUsersMessageResponse() {
        return this.sendUsersMessageResponse;
    }

    /**
     * @param sendUsersMessageResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessagesResult withSendUsersMessageResponse(SendUsersMessageResponse sendUsersMessageResponse) {
        setSendUsersMessageResponse(sendUsersMessageResponse);
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
        if (getSendUsersMessageResponse() != null)
            sb.append("SendUsersMessageResponse: ").append(getSendUsersMessageResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendUsersMessagesResult == false)
            return false;
        SendUsersMessagesResult other = (SendUsersMessagesResult) obj;
        if (other.getSendUsersMessageResponse() == null ^ this.getSendUsersMessageResponse() == null)
            return false;
        if (other.getSendUsersMessageResponse() != null && other.getSendUsersMessageResponse().equals(this.getSendUsersMessageResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSendUsersMessageResponse() == null) ? 0 : getSendUsersMessageResponse().hashCode());
        return hashCode;
    }

    @Override
    public SendUsersMessagesResult clone() {
        try {
            return (SendUsersMessagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
