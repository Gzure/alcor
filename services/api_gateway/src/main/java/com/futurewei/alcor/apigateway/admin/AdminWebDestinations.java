/*
Copyright 2019 The Alcor Authors.

Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/

package com.futurewei.alcor.apigateway.admin;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

@Data
@ConfigurationProperties(prefix = "admin.destinations")
public class AdminWebDestinations {

    private String defaultServiceUrl = "http://httpbin.org:80";

    @NotNull
    private String debugServiceUrl;

    public String getDebugServiceUrl() {
        return this.debugServiceUrl == null ? defaultServiceUrl : this.debugServiceUrl;
    }

    public void setDebugServiceUrl(String debugServiceUrl) {
        this.debugServiceUrl = debugServiceUrl;
    }
}