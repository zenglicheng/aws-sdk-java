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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignActivities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCampaignActivitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String applicationId;

    private String campaignId;
    /** The number of entries you want on each page in the response. */
    private String pageSize;
    /**
     * The NextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     */
    private String token;

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

    public GetCampaignActivitiesRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * @param campaignId
     */

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * @return
     */

    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @param campaignId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignActivitiesRequest withCampaignId(String campaignId) {
        setCampaignId(campaignId);
        return this;
    }

    /**
     * The number of entries you want on each page in the response.
     * 
     * @param pageSize
     *        The number of entries you want on each page in the response.
     */

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * The number of entries you want on each page in the response.
     * 
     * @return The number of entries you want on each page in the response.
     */

    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * The number of entries you want on each page in the response.
     * 
     * @param pageSize
     *        The number of entries you want on each page in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignActivitiesRequest withPageSize(String pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * The NextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * 
     * @param token
     *        The NextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * The NextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * 
     * @return The NextToken string returned on a previous page that you use to get the next page of results in a
     *         paginated response.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * The NextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * 
     * @param token
     *        The NextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignActivitiesRequest withToken(String token) {
        setToken(token);
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
        if (getCampaignId() != null)
            sb.append("CampaignId: ").append(getCampaignId()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCampaignActivitiesRequest == false)
            return false;
        GetCampaignActivitiesRequest other = (GetCampaignActivitiesRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCampaignActivitiesRequest clone() {
        return (GetCampaignActivitiesRequest) super.clone();
    }

}
