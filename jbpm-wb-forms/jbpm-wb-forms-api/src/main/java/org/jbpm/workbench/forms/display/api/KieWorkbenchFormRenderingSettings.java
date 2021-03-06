/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.workbench.forms.display.api;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.jbpm.workbench.forms.display.FormRenderingSettings;
import org.kie.workbench.common.forms.dynamic.service.shared.impl.MapModelRenderingContext;

@Portable
public class KieWorkbenchFormRenderingSettings implements FormRenderingSettings {

    private Long timestamp;
    private MapModelRenderingContext renderingContext;
    private boolean defaultForms;

    public KieWorkbenchFormRenderingSettings(@MapsTo("timestamp") Long timestamp,
                                             @MapsTo("renderingContext") MapModelRenderingContext renderingContext,
                                             @MapsTo("defaultForms") boolean defaultForms) {
        this.timestamp = timestamp;
        this.renderingContext = renderingContext;
        this.defaultForms = defaultForms;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public MapModelRenderingContext getRenderingContext() {
        return renderingContext;
    }

    public boolean isDefaultForms() {
        return defaultForms;
    }
}
