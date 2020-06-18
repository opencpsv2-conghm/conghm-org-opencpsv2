/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.dossiermgt.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DossierPart service. Represents a row in the &quot;opencps_dossierpart&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.dossiermgt.model.impl.DossierPartModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.dossiermgt.model.impl.DossierPartImpl}.
 * </p>
 *
 * @author huymq
 * @see DossierPart
 * @see org.opencps.dossiermgt.model.impl.DossierPartImpl
 * @see org.opencps.dossiermgt.model.impl.DossierPartModelImpl
 * @generated
 */
@ProviderType
public interface DossierPartModel extends BaseModel<DossierPart>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier part model instance should use the {@link DossierPart} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier part.
	 *
	 * @return the primary key of this dossier part
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier part.
	 *
	 * @param primaryKey the primary key of this dossier part
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this dossier part.
	 *
	 * @return the uuid of this dossier part
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this dossier part.
	 *
	 * @param uuid the uuid of this dossier part
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the dossier part ID of this dossier part.
	 *
	 * @return the dossier part ID of this dossier part
	 */
	public long getDossierPartId();

	/**
	 * Sets the dossier part ID of this dossier part.
	 *
	 * @param dossierPartId the dossier part ID of this dossier part
	 */
	public void setDossierPartId(long dossierPartId);

	/**
	 * Returns the group ID of this dossier part.
	 *
	 * @return the group ID of this dossier part
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this dossier part.
	 *
	 * @param groupId the group ID of this dossier part
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this dossier part.
	 *
	 * @return the company ID of this dossier part
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier part.
	 *
	 * @param companyId the company ID of this dossier part
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this dossier part.
	 *
	 * @return the user ID of this dossier part
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this dossier part.
	 *
	 * @param userId the user ID of this dossier part
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dossier part.
	 *
	 * @return the user uuid of this dossier part
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this dossier part.
	 *
	 * @param userUuid the user uuid of this dossier part
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this dossier part.
	 *
	 * @return the user name of this dossier part
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this dossier part.
	 *
	 * @param userName the user name of this dossier part
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this dossier part.
	 *
	 * @return the create date of this dossier part
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this dossier part.
	 *
	 * @param createDate the create date of this dossier part
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dossier part.
	 *
	 * @return the modified date of this dossier part
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dossier part.
	 *
	 * @param modifiedDate the modified date of this dossier part
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the template no of this dossier part.
	 *
	 * @return the template no of this dossier part
	 */
	@AutoEscape
	public String getTemplateNo();

	/**
	 * Sets the template no of this dossier part.
	 *
	 * @param templateNo the template no of this dossier part
	 */
	public void setTemplateNo(String templateNo);

	/**
	 * Returns the part no of this dossier part.
	 *
	 * @return the part no of this dossier part
	 */
	@AutoEscape
	public String getPartNo();

	/**
	 * Sets the part no of this dossier part.
	 *
	 * @param partNo the part no of this dossier part
	 */
	public void setPartNo(String partNo);

	/**
	 * Returns the part name of this dossier part.
	 *
	 * @return the part name of this dossier part
	 */
	@AutoEscape
	public String getPartName();

	/**
	 * Sets the part name of this dossier part.
	 *
	 * @param partName the part name of this dossier part
	 */
	public void setPartName(String partName);

	/**
	 * Returns the part tip of this dossier part.
	 *
	 * @return the part tip of this dossier part
	 */
	@AutoEscape
	public String getPartTip();

	/**
	 * Sets the part tip of this dossier part.
	 *
	 * @param partTip the part tip of this dossier part
	 */
	public void setPartTip(String partTip);

	/**
	 * Returns the part type of this dossier part.
	 *
	 * @return the part type of this dossier part
	 */
	public int getPartType();

	/**
	 * Sets the part type of this dossier part.
	 *
	 * @param partType the part type of this dossier part
	 */
	public void setPartType(int partType);

	/**
	 * Returns the multiple of this dossier part.
	 *
	 * @return the multiple of this dossier part
	 */
	public boolean getMultiple();

	/**
	 * Returns <code>true</code> if this dossier part is multiple.
	 *
	 * @return <code>true</code> if this dossier part is multiple; <code>false</code> otherwise
	 */
	public boolean isMultiple();

	/**
	 * Sets whether this dossier part is multiple.
	 *
	 * @param multiple the multiple of this dossier part
	 */
	public void setMultiple(boolean multiple);

	/**
	 * Returns the form script of this dossier part.
	 *
	 * @return the form script of this dossier part
	 */
	@AutoEscape
	public String getFormScript();

	/**
	 * Sets the form script of this dossier part.
	 *
	 * @param formScript the form script of this dossier part
	 */
	public void setFormScript(String formScript);

	/**
	 * Returns the form report of this dossier part.
	 *
	 * @return the form report of this dossier part
	 */
	@AutoEscape
	public String getFormReport();

	/**
	 * Sets the form report of this dossier part.
	 *
	 * @param formReport the form report of this dossier part
	 */
	public void setFormReport(String formReport);

	/**
	 * Returns the sample data of this dossier part.
	 *
	 * @return the sample data of this dossier part
	 */
	@AutoEscape
	public String getSampleData();

	/**
	 * Sets the sample data of this dossier part.
	 *
	 * @param sampleData the sample data of this dossier part
	 */
	public void setSampleData(String sampleData);

	/**
	 * Returns the required of this dossier part.
	 *
	 * @return the required of this dossier part
	 */
	public boolean getRequired();

	/**
	 * Returns <code>true</code> if this dossier part is required.
	 *
	 * @return <code>true</code> if this dossier part is required; <code>false</code> otherwise
	 */
	public boolean isRequired();

	/**
	 * Sets whether this dossier part is required.
	 *
	 * @param required the required of this dossier part
	 */
	public void setRequired(boolean required);

	/**
	 * Returns the file template no of this dossier part.
	 *
	 * @return the file template no of this dossier part
	 */
	@AutoEscape
	public String getFileTemplateNo();

	/**
	 * Sets the file template no of this dossier part.
	 *
	 * @param fileTemplateNo the file template no of this dossier part
	 */
	public void setFileTemplateNo(String fileTemplateNo);

	/**
	 * Returns the e sign of this dossier part.
	 *
	 * @return the e sign of this dossier part
	 */
	public boolean getESign();

	/**
	 * Returns <code>true</code> if this dossier part is e sign.
	 *
	 * @return <code>true</code> if this dossier part is e sign; <code>false</code> otherwise
	 */
	public boolean isESign();

	/**
	 * Sets whether this dossier part is e sign.
	 *
	 * @param eSign the e sign of this dossier part
	 */
	public void setESign(boolean eSign);

	/**
	 * Returns the deliverable type of this dossier part.
	 *
	 * @return the deliverable type of this dossier part
	 */
	@AutoEscape
	public String getDeliverableType();

	/**
	 * Sets the deliverable type of this dossier part.
	 *
	 * @param deliverableType the deliverable type of this dossier part
	 */
	public void setDeliverableType(String deliverableType);

	/**
	 * Returns the deliverable action of this dossier part.
	 *
	 * @return the deliverable action of this dossier part
	 */
	public int getDeliverableAction();

	/**
	 * Sets the deliverable action of this dossier part.
	 *
	 * @param deliverableAction the deliverable action of this dossier part
	 */
	public void setDeliverableAction(int deliverableAction);

	/**
	 * Returns the e form of this dossier part.
	 *
	 * @return the e form of this dossier part
	 */
	public boolean getEForm();

	/**
	 * Returns <code>true</code> if this dossier part is e form.
	 *
	 * @return <code>true</code> if this dossier part is e form; <code>false</code> otherwise
	 */
	public boolean isEForm();

	/**
	 * Sets whether this dossier part is e form.
	 *
	 * @param eForm the e form of this dossier part
	 */
	public void setEForm(boolean eForm);

	/**
	 * Returns the file mark of this dossier part.
	 *
	 * @return the file mark of this dossier part
	 */
	public int getFileMark();

	/**
	 * Sets the file mark of this dossier part.
	 *
	 * @param fileMark the file mark of this dossier part
	 */
	public void setFileMark(int fileMark);

	/**
	 * Returns the part name title of this dossier part.
	 *
	 * @return the part name title of this dossier part
	 */
	@AutoEscape
	public String getPartNameTitle();

	/**
	 * Sets the part name title of this dossier part.
	 *
	 * @param partNameTitle the part name title of this dossier part
	 */
	public void setPartNameTitle(String partNameTitle);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(DossierPart dossierPart);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DossierPart> toCacheModel();

	@Override
	public DossierPart toEscapedModel();

	@Override
	public DossierPart toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}