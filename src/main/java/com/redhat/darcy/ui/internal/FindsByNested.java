/*
 Copyright 2014 Red Hat, Inc. and/or its affiliates.

 This file is part of darcy.

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.redhat.darcy.ui.internal;

import com.redhat.darcy.ui.api.ElementContext;
import com.redhat.darcy.ui.api.Locator;
import com.redhat.darcy.ui.api.elements.Element;

import java.util.List;

public interface FindsByNested {
    <T> List<T> findAllByNested(Class<T> type, Element parent, Locator child);
    <T> T findByNested(Class<T> type, Element parent, Locator child);

    /**
     * Returns this context where all look ups will start from the specified root element,
     * essentially transforming every locator on this context with a unary operator:
     * L -> By.nested(root, L)
     */
    ElementContext withRootElement(Element root);
}
