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
package com.liferay.faces.bridge.context.internal;

import com.liferay.faces.bridge.context.IncongruityContext;
import com.liferay.faces.bridge.context.IncongruityContextFactory;


/**
 * @author  Neil Griffin
 */
public class IncongruityContextFactoryImpl extends IncongruityContextFactory {

	@Override
	public IncongruityContext getIncongruityContext() {
		return new IncongruityContextImpl();
	}

	public IncongruityContextFactory getWrapped() {

		// Since this is the factory instance provided by the bridge, it will never wrap another factory.
		return null;
	}

}
