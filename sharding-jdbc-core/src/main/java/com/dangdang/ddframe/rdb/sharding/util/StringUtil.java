/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.util;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

/**
 * String utility class.
 *
 * @author zhangliang
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class StringUtil {
    
    /**
     * Adjust is boolean value or not.
     * 
     * @param value to be adjusted string value
     * @return is boolean value or not
     */
    public static boolean isBooleanValue(final String value) {
        return Boolean.TRUE.toString().equalsIgnoreCase(value) || Boolean.FALSE.toString().equalsIgnoreCase(value);
    }
    
    /**
     * Adjust is int value or not.
     * 
     * @param value to be adjusted string value
     * @return is int value or not
     */
    public static boolean isIntValue(final String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (final NumberFormatException ex) {
            return false;
        }
    }
    
    /**
     * Adjust is long value or not.
     *
     * @param value to be adjusted string value
     * @return is long value or not
     */
    public static boolean isLongValue(final String value) {
        try {
            Long.parseLong(value);
            return true;
        } catch (final NumberFormatException ex) {
            return false;
        }
    }
}
