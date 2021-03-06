/**
 * Copyright 2012 Neovera Inc
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
 * limitations under the License.
 */
package org.neovera.jdiablo.environment;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple map-based property placeholder provider that is expected to be defined as a bean in the Spring XML and
 * have its properties map populated via Spring's <map> element. 
 */
public class MapBasedPropertyPlaceholderProvider implements PropertyPlaceholderProvider {

    private Map<String, String> _properties = new HashMap<String, String>();

    public Map<String, String> getProperties() {
        return _properties;
    }

    public void setProperties(Map<String, String> properties) {
        _properties = properties;
    }

    public String getProperty(String key) {
        return _properties.get(key);
    }
}
