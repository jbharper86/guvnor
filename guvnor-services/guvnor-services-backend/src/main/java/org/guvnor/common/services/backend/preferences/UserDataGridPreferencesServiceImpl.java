/*
 * Copyright 2014 JBoss by Red Hat.
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
package org.guvnor.common.services.backend.preferences;

import org.guvnor.common.services.shared.preferences.UserDataGridPreferencesService;
import com.thoughtworks.xstream.XStream;
import javax.inject.Inject;
import javax.inject.Named;
import org.guvnor.common.services.shared.preferences.GridPreferencesStore;
import org.jboss.errai.bus.server.annotations.Service;
import org.uberfire.backend.server.UserServicesBackendImpl;
import org.uberfire.io.IOService;
import org.uberfire.java.nio.file.Path;
import org.uberfire.security.Identity;

@Service
public class UserDataGridPreferencesServiceImpl implements UserDataGridPreferencesService {

  @Inject
  private UserServicesBackendImpl userServicesBackend;

  @Inject
  private Identity identity;

  @Inject
  @Named("configIO")
  private IOService ioServiceConfig;

  private XStream xs = new XStream();

  @Override
  public void saveGridPreferences(GridPreferencesStore preferences) {
    Path preferencesPath = userServicesBackend.buildPath(identity.getName(), "datagrid-preferences", preferences.getGlobalPreferences().getKey());
    ioServiceConfig.write(preferencesPath, xs.toXML(preferences));
  }

  @Override
  public GridPreferencesStore loadGridPreferences(String key) {
    Path preferencesPath = userServicesBackend.buildPath(identity.getName(), "datagrid-preferences", key);
    try {
      if (ioServiceConfig.exists(preferencesPath)) {
        final String xml = ioServiceConfig.readAllString(preferencesPath);
        return (GridPreferencesStore) xs.fromXML(xml);
      }
    } catch (final Exception e) {
    }
    return null;
  }

}