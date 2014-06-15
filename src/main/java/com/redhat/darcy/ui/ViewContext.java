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

package com.redhat.darcy.ui;

/**
 * A {@link Context} for {@link Views}. Must also be able to find 
 * {@link com.redhat.darcy.ui.elements.Element}s and other {@link ViewContext}s.
 * <P>
 * Implementations may also choose to override {@link #transition()} which provides a means for 
 * implementation-specific {@link TransitionEvent}s. By default these simply wait for the specified
 * View to be loaded.
 */
@Deprecated
public interface ViewContext extends ParentContext, ElementContext {
    /**
     * Creates a {@link Transition}, which will create a {@link TransitionEvent} based on some View,
     * that you can wait for.
     * @return
     */
    default Transition transition() {
        return new SimpleTransition(this);
    }
}
