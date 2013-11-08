/*
 * Copyright (C) 2013 The ChameleonOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.pac.sidebar;

import android.graphics.drawable.Drawable;

public class AppItemInfo extends ItemInfo {
    public String packageName;
    public String className;
    public Drawable icon;

    public AppItemInfo() {
        itemType = TYPE_APPLICATION;
        container = CONTAINER_SIDEBAR;
    }

    public void setIcon(Drawable d) {
        icon = d;
    }

    @Override
    public String toString() {
        return String.format("%s, packageName: %s, className: %s",
                super.toString(), packageName, className);
    }

}
