/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.thing.profiles;

import java.util.Collection;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.type.ChannelTypeUID;

/**
 * Describes a {@link TriggerProfile} type.
 *
 * @author Simon Kaufmann - initial contribution and API.
 *
 */
@NonNullByDefault
public interface TriggerProfileType extends ProfileType {

    /**
     *
     * @return a collection of ChannelTypeUIDs (may be empty if all are supported).
     */
    Collection<ChannelTypeUID> getSupportedChannelTypeUIDs();

}
