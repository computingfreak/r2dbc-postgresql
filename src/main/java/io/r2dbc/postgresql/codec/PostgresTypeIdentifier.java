/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.r2dbc.postgresql.codec;

import io.r2dbc.spi.Type;

/**
 * Represents a Postgres type identifier identified by {@link #getObjectId() OID}.
 *
 * @see PostgresqlObjectId
 * @since 0.9
 */
public interface PostgresTypeIdentifier extends Type {

    /**
     * Postgres type identifier.
     *
     * @return the Postgres type OID.
     */
    int getObjectId();

}