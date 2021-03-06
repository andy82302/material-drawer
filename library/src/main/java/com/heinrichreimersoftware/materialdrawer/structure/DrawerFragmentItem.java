/*
 * MIT License
 *
 * Copyright (c) 2017 Jan Heinrich Reimer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.heinrichreimersoftware.materialdrawer.structure;

import android.support.v4.app.Fragment;

public class DrawerFragmentItem extends DrawerItem {

    private Fragment mFragment;

    /**
     * Sets a fragment to the drawer item
     *
     * @param fragment Fragment to set
     */
    public DrawerFragmentItem setFragment(Fragment fragment) {
        mFragment = fragment;
        notifyDataChanged();
        return this;
    }


    /**
     * Gets the fragment of the drawer item
     *
     * @return Fragment of the drawer item
     */
    public Fragment getFragment() {
        return mFragment;
    }

    /**
     * Gets whether the drawer item has a fragment set to it
     *
     * @return True if the drawer item has a fragment set to it, false otherwise.
     */
    public boolean hasFragment() {
        return mFragment != null;
    }

    /**
     * Removes the image from the drawer item
     */
    public DrawerFragmentItem removeFragment() {
        mFragment = null;
        notifyDataChanged();
        return this;
    }
}
