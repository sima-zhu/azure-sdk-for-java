// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * Annotation given to all service client classes.
 */
@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceClient {

    /**
     * The builder class that can construct an instance of this class.
     */
    Class<?> builder();
}
