/*
 *
 *  *
 *  *  *
 *  *  *  * Copyright 2019-2020 the original author or authors.
 *  *  *  *
 *  *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *  * you may not use this file except in compliance with the License.
 *  *  *  * You may obtain a copy of the License at
 *  *  *  *
 *  *  *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *  *  *
 *  *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *  * See the License for the specific language governing permissions and
 *  *  *  * limitations under the License.
 *  *  *
 *  *
 *
 *
 */

package org.springdoc.data.rest.core;

/**
 * The enum Controller type.
 * @author bnasslahsen
 */
public enum ControllerType {
	/**
	 *Entity controller type.
	 */
	ENTITY,
	/**
	 *Search controller type.
	 */
	SEARCH,
	/**
	 *Schema controller type.
	 */
	SCHEMA,
	/**
	 *PROPERTY controller type.
	 */
	PROPERTY,
	/**
	 *GENERAL controller type.
	 */
	GENERAL
}
