/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.thing.profiles;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.smarthome.core.thing.Channel;

/**
 * Implementors can give advice which {@link Profile}s can/should be used for a given link.
 *
 * @author Simon Kaufmann - initial contribution and API.
 *
 */
@NonNullByDefault
public interface ProfileAdvisor {

    /**
     * Suggest a custom profile for the given channel (and potentially also the itemType).
     *
     * Please note:
     * <ul>
     * <li>This will override any default behavior
     * <li>A "profile" configuration on the link will override this suggestion
     * </ul>
     *
     * @param channel the linked channel
     * @param itemType the linked itemType (not applicable for trigger channels)
     * @return the profile identifier or {@code null} if this advisor
     */
    @Nullable
    ProfileTypeUID getSuggestedProfileTypeUID(Channel channel, @Nullable String itemType);

}
