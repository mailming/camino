/**
 * Copyright (C) 2014-2016, Turn Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 */
package com.turn.camino.render;

/**
 * Exception during rendering
 *
 * @author llo
 */
public class RenderException extends Exception {

	/**
	 * Constructor
	 *
	 * @param message error message
	 */
	public RenderException(String message) {
		super(message);
	}

	/**
	 * Constructor
	 *
	 * @param message error message
	 * @param throwable underlying exception
	 */
	public RenderException(String message, Throwable throwable) {
		super(message, throwable);
	}

	/**
	 * Constructor
	 *
	 * @param throwable underlying exception
	 */
	public RenderException(Throwable throwable) {
		super(throwable);
	}
}
