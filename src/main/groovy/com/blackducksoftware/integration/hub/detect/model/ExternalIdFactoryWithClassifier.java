/**
 * hub-detect
 *
 * Copyright (C) 2018 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.blackducksoftware.integration.hub.detect.model;

import com.blackducksoftware.integration.hub.bdio.model.Forge;
import com.blackducksoftware.integration.hub.bdio.model.externalid.ExternalId;
import com.blackducksoftware.integration.hub.bdio.model.externalid.ExternalIdFactory;

/**
 * Created by ghurley on 13/03/2018.
 */
public class ExternalIdFactoryWithClassifier extends ExternalIdFactory {

    public ExternalId createMavenExternalIdWithClassifier(final String group, final String name, final String version, final String classifier) {
        //final ExternalIdWithClassifier externalId = createNameVersionExternalId(Forge.MAVEN, name, version, classifier);
        final ExternalIdWithClassifier externalId = new ExternalIdWithClassifier(Forge.MAVEN);
        externalId.name = name;
        externalId.version = version;
        externalId.group = group;
        externalId.classifier = classifier;
        checkForValidity(externalId);
        return externalId;
    }

    /**
     * An ExternalId should be able to create a bdioId - if it can not, an appropriate IllegalStateException will be thrown.
     */
    private void checkForValidity(final ExternalId externalId) {
        externalId.createBdioId();
    }

}
