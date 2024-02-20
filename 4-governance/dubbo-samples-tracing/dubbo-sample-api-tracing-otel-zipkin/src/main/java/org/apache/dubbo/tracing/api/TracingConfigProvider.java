/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.tracing.api;

import org.apache.dubbo.config.TracingConfig;
import org.apache.dubbo.config.nested.ExporterConfig;
import org.apache.dubbo.config.nested.PropagationConfig;
import org.apache.dubbo.config.nested.SamplingConfig;


public class TracingConfigProvider {

    public static TracingConfig getTracingConfig() {
        TracingConfig tracingConfig = new TracingConfig();
        SamplingConfig samplingConfig = new SamplingConfig();
        samplingConfig.setProbability(1.0f);
        PropagationConfig propagationConfig = new PropagationConfig();
        propagationConfig.setType("W3C");
        ExporterConfig.ZipkinConfig zipkinConfig = new ExporterConfig.ZipkinConfig();
        zipkinConfig.setEndpoint("http://localhost:9411/api/v2/spans");
        tracingConfig.setEnabled(true);
        tracingConfig.setSampling(samplingConfig);
        tracingConfig.setPropagation(propagationConfig);
        ExporterConfig exporterConfig = new ExporterConfig();
        exporterConfig.setZipkinConfig(zipkinConfig);
        tracingConfig.setTracingExporter(exporterConfig);
        return tracingConfig;
    }
}
