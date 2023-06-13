/**
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazon.aws.partners.saasfactory.domain.metrics;

public class TenantBuilder {
    private Tenant tenant = new Tenant();

    public TenantBuilder() {
    }

    public TenantBuilder withId(String id) {
        this.tenant.setId(id);
        return this;
    }

    public TenantBuilder withName(String name) {
        this.tenant.setName(name);
        return this;
    }

    public TenantBuilder withTier(String tier) {
        this.tenant.setTier(tier);
        return this;
    }

    public Tenant build() {
        return this.tenant;
    }
}

