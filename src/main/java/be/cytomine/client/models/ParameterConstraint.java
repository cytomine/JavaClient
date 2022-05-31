package be.cytomine.client.models;

/*
 * Copyright (c) 2009-2022. Authors: see NOTICE file.
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

public class ParameterConstraint extends Model<ParameterConstraint> {

    public ParameterConstraint(){}
    public ParameterConstraint(String name, String expression, String dataType){
        this.set("name",name);
        this.set("expression",expression);
        this.set("dataType",dataType);
    }

    @Override
    public String getDomainName() {
        return "parameter_constraint";
    }
}
