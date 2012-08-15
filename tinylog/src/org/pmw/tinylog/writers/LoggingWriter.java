/*
 * Copyright 2012 Martin Winandy
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.pmw.tinylog.writers;

import org.pmw.tinylog.ELoggingLevel;
import org.pmw.tinylog.Logger;

/**
 * Logging writers output created log entries from {@link Logger}.
 * 
 * An implemented writer must be registered as service in "META-INF/services/org.pmw.tinylog.writers" and implement the
 * static method <code>public static String getName()</code>, so that tinylog can find it. Writers can also implement
 * <code>public static String[][] getSupportedProperties()</code> to support properties.
 * 
 * @see org.pmw.tinylog.Logger#setWriter(LoggingWriter)
 */
public interface LoggingWriter {

	/**
	 * Write a log entry.
	 * 
	 * @param level
	 *            Logging level
	 * @param logEntry
	 *            Log entry to output
	 */
	void write(ELoggingLevel level, String logEntry);

}