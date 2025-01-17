/*
 * Copyright (C) 2023 Hedera Hashgraph, LLC
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

package com.swirlds.config.processor;

import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;

/**
 * Metadata for a config property definition.
 * @param fieldName   the field name like "maxSize"
 * @param name         the full name like "com.swirlds.config.foo.bar"
 * @param type        the type like "int"
 * @param defaultValue the default value like "100"
 * @param description the description like "the maximum size"
 */
public record ConfigDataPropertyDefinition(
        @NonNull String fieldName,
        @NonNull String name,
        @NonNull String type,
        @Nullable String defaultValue,
        @Nullable String description) {}
