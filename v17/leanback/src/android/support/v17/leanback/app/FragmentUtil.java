/*
 * Copyright (C) 2017 The Android Open Source Project
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
package android.support.v17.leanback.app;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;

class FragmentUtil {

    @TargetApi(23)
    private static Context getContextNew(Fragment fragment) {
        return fragment.getContext();
    }

    public static Context getContext(Fragment fragment) {
        if (Build.VERSION.SDK_INT >= 23) {
            return getContextNew(fragment);
        } else {
            return fragment.getActivity();
        }
    }
}
