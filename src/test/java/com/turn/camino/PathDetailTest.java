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
package com.turn.camino;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test for PathDetail
 *
 * @author llo
 */
@Test
public class PathDetailTest {

	@Test
	public void testConstructor() {
		long now = System.currentTimeMillis();
		PathDetail pathDetail = new PathDetail("/a/b", false, 63000, now);
		assertEquals(pathDetail.getPathValue(), "/a/b");
		assertEquals(pathDetail.getLength(), 63000);
		assertFalse(pathDetail.isDirectory());
		assertEquals(pathDetail.getLastModifiedTime(), now);
	}
}
