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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ghurley on 13/03/2018.
 */
public class ExternalIdWithClassifier extends ExternalId {
    public ExternalIdWithClassifier(Forge forge) {
        super(forge);
    }

    public ExternalIdWithClassifier() {
        super(null);
    }

    public String classifier;

    //May not be called
//    @Override
//    public String[] getExternalIdPieces() {
//        String[] pieces = super.getExternalIdPieces();
//        if (classifier != null ) {
//            List<String> pieceList = new ArrayList(Arrays.asList(pieces));
//            pieceList.add(classifier);
//            pieces = pieceList.toArray(new String[pieceList.size()]);
//        }
//        return pieces;
//    }
}
