/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.bridge.filter.internal;

import java.util.Enumeration;

import javax.portlet.ActionRequest;

import com.liferay.faces.bridge.context.BridgePortalContext;


/**
 * @author  Neil Griffin
 */
public class ActionRequestBridgeLiferayImpl extends ActionRequestBridgeImpl {

	// Private Data Members
	private LiferayPortletRequest liferayPortletRequest;

	public ActionRequestBridgeLiferayImpl(ActionRequest actionRequest, BridgePortalContext bridgePortalContext) {

		super(actionRequest, bridgePortalContext);
		this.liferayPortletRequest = new LiferayPortletRequest(actionRequest);
	}

	@Override
	public Enumeration<String> getProperties(String name) {
		return liferayPortletRequest.getProperties(name);
	}

	@Override
	public Enumeration<String> getPropertyNames() {
		return liferayPortletRequest.getPropertyNames();
	}
}
