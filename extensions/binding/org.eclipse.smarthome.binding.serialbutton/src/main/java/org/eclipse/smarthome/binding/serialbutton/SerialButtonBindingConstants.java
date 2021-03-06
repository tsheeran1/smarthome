/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.serialbutton;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link SerialButtonBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Kai Kreuzer - Initial contribution
 */
@NonNullByDefault
public class SerialButtonBindingConstants {

    private static final String BINDING_ID = "serialbutton";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_BUTTON = new ThingTypeUID(BINDING_ID, "button");

    // List of all Channel ids
    public static final String TRIGGER_CHANNEL = "button";

    // Config parameters
    public static final String PARAMETER_CONFIG = "port";

}
