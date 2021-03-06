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
package com.liferay.faces.bridge.context.map.internal;

import java.util.Enumeration;

import javax.servlet.ServletContext;

import com.liferay.faces.util.map.AbstractPropertyMap;
import com.liferay.faces.util.map.AbstractPropertyMapEntry;


/**
 * @author  Neil Griffin
 */
public class ServletContextAttributeMap extends AbstractPropertyMap<Object> {

	// Private Data Members
	private ServletContext servletContext;

	public ServletContextAttributeMap(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@Override
	protected AbstractPropertyMapEntry<Object> createPropertyMapEntry(String name) {
		return new ServletContextAttributeMapEntry(servletContext, name);
	}

	@Override
	protected void removeProperty(String name) {
		servletContext.removeAttribute(name);
	}

	@Override
	protected Object getProperty(String name) {
		return servletContext.getAttribute(name);
	}

	@Override
	protected void setProperty(String name, Object value) {
		servletContext.setAttribute(name, value);
	}

	@Override
	@SuppressWarnings("unchecked")
	protected Enumeration<String> getPropertyNames() {
		return servletContext.getAttributeNames();
	}
}
