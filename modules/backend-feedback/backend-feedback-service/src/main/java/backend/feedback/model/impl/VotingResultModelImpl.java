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

package backend.feedback.model.impl;

import aQute.bnd.annotation.ProviderType;

import backend.feedback.model.VotingResult;
import backend.feedback.model.VotingResultModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VotingResult service. Represents a row in the &quot;opencps_votingresult&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VotingResultModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VotingResultImpl}.
 * </p>
 *
 * @author sondt
 * @see VotingResultImpl
 * @see VotingResult
 * @see VotingResultModel
 * @generated
 */
@ProviderType
public class VotingResultModelImpl extends BaseModelImpl<VotingResult>
	implements VotingResultModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a voting result model instance should use the {@link VotingResult} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_votingresult";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "votingResultId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "votingId", Types.BIGINT },
			{ "fullname", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "comment_", Types.VARCHAR },
			{ "selected", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("votingResultId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("votingId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fullname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comment_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("selected", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table opencps_votingresult (uuid_ VARCHAR(75) null,votingResultId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,votingId LONG,fullname VARCHAR(75) null,email VARCHAR(75) null,comment_ VARCHAR(75) null,selected VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table opencps_votingresult";
	public static final String ORDER_BY_JPQL = " ORDER BY votingResult.createDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_votingresult.createDate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(backend.feedback.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.backend.feedback.model.VotingResult"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(backend.feedback.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.backend.feedback.model.VotingResult"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(backend.feedback.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.backend.feedback.model.VotingResult"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long MODIFIEDDATE_COLUMN_BITMASK = 4L;
	public static final long SELECTED_COLUMN_BITMASK = 8L;
	public static final long USERID_COLUMN_BITMASK = 16L;
	public static final long UUID_COLUMN_BITMASK = 32L;
	public static final long VOTINGID_COLUMN_BITMASK = 64L;
	public static final long CREATEDATE_COLUMN_BITMASK = 128L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(backend.feedback.service.util.ServiceProps.get(
				"lock.expiration.time.backend.feedback.model.VotingResult"));

	public VotingResultModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _votingResultId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVotingResultId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _votingResultId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VotingResult.class;
	}

	@Override
	public String getModelClassName() {
		return VotingResult.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("votingResultId", getVotingResultId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("votingId", getVotingId());
		attributes.put("fullname", getFullname());
		attributes.put("email", getEmail());
		attributes.put("comment", getComment());
		attributes.put("selected", getSelected());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long votingResultId = (Long)attributes.get("votingResultId");

		if (votingResultId != null) {
			setVotingResultId(votingResultId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long votingId = (Long)attributes.get("votingId");

		if (votingId != null) {
			setVotingId(votingId);
		}

		String fullname = (String)attributes.get("fullname");

		if (fullname != null) {
			setFullname(fullname);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		String selected = (String)attributes.get("selected");

		if (selected != null) {
			setSelected(selected);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getVotingResultId() {
		return _votingResultId;
	}

	@Override
	public void setVotingResultId(long votingResultId) {
		_votingResultId = votingResultId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_columnBitmask |= MODIFIEDDATE_COLUMN_BITMASK;

		if (_originalModifiedDate == null) {
			_originalModifiedDate = _modifiedDate;
		}

		_modifiedDate = modifiedDate;
	}

	public Date getOriginalModifiedDate() {
		return _originalModifiedDate;
	}

	@Override
	public long getVotingId() {
		return _votingId;
	}

	@Override
	public void setVotingId(long votingId) {
		_columnBitmask |= VOTINGID_COLUMN_BITMASK;

		if (!_setOriginalVotingId) {
			_setOriginalVotingId = true;

			_originalVotingId = _votingId;
		}

		_votingId = votingId;
	}

	public long getOriginalVotingId() {
		return _originalVotingId;
	}

	@Override
	public String getFullname() {
		if (_fullname == null) {
			return "";
		}
		else {
			return _fullname;
		}
	}

	@Override
	public void setFullname(String fullname) {
		_fullname = fullname;
	}

	@Override
	public String getEmail() {
		if (_email == null) {
			return "";
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@Override
	public String getComment() {
		if (_comment == null) {
			return "";
		}
		else {
			return _comment;
		}
	}

	@Override
	public void setComment(String comment) {
		_comment = comment;
	}

	@Override
	public String getSelected() {
		if (_selected == null) {
			return "";
		}
		else {
			return _selected;
		}
	}

	@Override
	public void setSelected(String selected) {
		_columnBitmask |= SELECTED_COLUMN_BITMASK;

		if (_originalSelected == null) {
			_originalSelected = _selected;
		}

		_selected = selected;
	}

	public String getOriginalSelected() {
		return GetterUtil.getString(_originalSelected);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				VotingResult.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			VotingResult.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VotingResult toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VotingResult)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VotingResultImpl votingResultImpl = new VotingResultImpl();

		votingResultImpl.setUuid(getUuid());
		votingResultImpl.setVotingResultId(getVotingResultId());
		votingResultImpl.setCompanyId(getCompanyId());
		votingResultImpl.setGroupId(getGroupId());
		votingResultImpl.setUserId(getUserId());
		votingResultImpl.setUserName(getUserName());
		votingResultImpl.setCreateDate(getCreateDate());
		votingResultImpl.setModifiedDate(getModifiedDate());
		votingResultImpl.setVotingId(getVotingId());
		votingResultImpl.setFullname(getFullname());
		votingResultImpl.setEmail(getEmail());
		votingResultImpl.setComment(getComment());
		votingResultImpl.setSelected(getSelected());

		votingResultImpl.resetOriginalValues();

		return votingResultImpl;
	}

	@Override
	public int compareTo(VotingResult votingResult) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), votingResult.getCreateDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VotingResult)) {
			return false;
		}

		VotingResult votingResult = (VotingResult)obj;

		long primaryKey = votingResult.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		VotingResultModelImpl votingResultModelImpl = this;

		votingResultModelImpl._originalUuid = votingResultModelImpl._uuid;

		votingResultModelImpl._originalCompanyId = votingResultModelImpl._companyId;

		votingResultModelImpl._setOriginalCompanyId = false;

		votingResultModelImpl._originalGroupId = votingResultModelImpl._groupId;

		votingResultModelImpl._setOriginalGroupId = false;

		votingResultModelImpl._originalUserId = votingResultModelImpl._userId;

		votingResultModelImpl._setOriginalUserId = false;

		votingResultModelImpl._originalModifiedDate = votingResultModelImpl._modifiedDate;

		votingResultModelImpl._setModifiedDate = false;

		votingResultModelImpl._originalVotingId = votingResultModelImpl._votingId;

		votingResultModelImpl._setOriginalVotingId = false;

		votingResultModelImpl._originalSelected = votingResultModelImpl._selected;

		votingResultModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VotingResult> toCacheModel() {
		VotingResultCacheModel votingResultCacheModel = new VotingResultCacheModel();

		votingResultCacheModel.uuid = getUuid();

		String uuid = votingResultCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			votingResultCacheModel.uuid = null;
		}

		votingResultCacheModel.votingResultId = getVotingResultId();

		votingResultCacheModel.companyId = getCompanyId();

		votingResultCacheModel.groupId = getGroupId();

		votingResultCacheModel.userId = getUserId();

		votingResultCacheModel.userName = getUserName();

		String userName = votingResultCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			votingResultCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			votingResultCacheModel.createDate = createDate.getTime();
		}
		else {
			votingResultCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			votingResultCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			votingResultCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		votingResultCacheModel.votingId = getVotingId();

		votingResultCacheModel.fullname = getFullname();

		String fullname = votingResultCacheModel.fullname;

		if ((fullname != null) && (fullname.length() == 0)) {
			votingResultCacheModel.fullname = null;
		}

		votingResultCacheModel.email = getEmail();

		String email = votingResultCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			votingResultCacheModel.email = null;
		}

		votingResultCacheModel.comment = getComment();

		String comment = votingResultCacheModel.comment;

		if ((comment != null) && (comment.length() == 0)) {
			votingResultCacheModel.comment = null;
		}

		votingResultCacheModel.selected = getSelected();

		String selected = votingResultCacheModel.selected;

		if ((selected != null) && (selected.length() == 0)) {
			votingResultCacheModel.selected = null;
		}

		return votingResultCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", votingResultId=");
		sb.append(getVotingResultId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", votingId=");
		sb.append(getVotingId());
		sb.append(", fullname=");
		sb.append(getFullname());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append(", selected=");
		sb.append(getSelected());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("backend.feedback.model.VotingResult");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>votingResultId</column-name><column-value><![CDATA[");
		sb.append(getVotingResultId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>votingId</column-name><column-value><![CDATA[");
		sb.append(getVotingId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullname</column-name><column-value><![CDATA[");
		sb.append(getFullname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selected</column-name><column-value><![CDATA[");
		sb.append(getSelected());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VotingResult.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VotingResult.class, ModelWrapper.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _votingResultId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Date _originalModifiedDate;
	private boolean _setModifiedDate;
	private long _votingId;
	private long _originalVotingId;
	private boolean _setOriginalVotingId;
	private String _fullname;
	private String _email;
	private String _comment;
	private String _selected;
	private String _originalSelected;
	private long _columnBitmask;
	private VotingResult _escapedModel;
}