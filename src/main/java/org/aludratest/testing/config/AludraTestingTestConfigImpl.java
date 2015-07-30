/*
 * Copyright (C) 2015 Hamburg Sud and the contributors.
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
package org.aludratest.testing.config;

import org.aludratest.config.impl.AludraTestConfigImpl;

public class AludraTestingTestConfigImpl extends AludraTestConfigImpl {

    private static AludraTestingTestConfigImpl testInstance;

    private Boolean stopTestCaseOnInteractionException;

    private Boolean stopTestCaseOnOtherException;

    private String xlsRootPath;

    private Boolean ignoreEnabled;

    private Boolean configTabRequired;

    private String sorterName;

    public AludraTestingTestConfigImpl() {
        super();
        testInstance = this;
    }

    public static AludraTestingTestConfigImpl getTestInstance() {
        return testInstance;
    }

    public void setStopTestCaseOnInteractionException(Boolean stopTestCaseOnInteractionException) {
        this.stopTestCaseOnInteractionException = stopTestCaseOnInteractionException;
    }

    public void setStopTestCaseOnOtherException(Boolean stopTestCaseOnOtherException) {
        this.stopTestCaseOnOtherException = stopTestCaseOnOtherException;
    }

    @Override
    public boolean isStopTestCaseOnInteractionException() {
        if (stopTestCaseOnInteractionException != null) {
            return stopTestCaseOnInteractionException.booleanValue();
        }
        return super.isStopTestCaseOnInteractionException();
    }

    @Override
    public boolean isStopTestCaseOnOtherException() {
        if (stopTestCaseOnOtherException != null) {
            return stopTestCaseOnOtherException.booleanValue();
        }
        return super.isStopTestCaseOnOtherException();
    }

    @Override
    public String getXlsRootPath() {
        if (xlsRootPath != null) {
            return xlsRootPath;
        }
        return super.getXlsRootPath();
    }

    public void setXlsRootPath(String xlsRootPath) {
        this.xlsRootPath = xlsRootPath;
    }

    public void setIgnoreEnabled(Boolean ignoreEnabled) {
        this.ignoreEnabled = ignoreEnabled;
    }

    @Override
    public boolean isIgnoreEnabled() {
        if (ignoreEnabled != null) {
            return ignoreEnabled.booleanValue();
        }
        return super.isIgnoreEnabled();
    }

    public void setConfigTabRequired(Boolean configTabRequired) {
        this.configTabRequired = configTabRequired;
    }

    @Override
    public boolean isConfigTabRequired() {
        if (configTabRequired != null) {
            return configTabRequired.booleanValue();
        }
        return super.isConfigTabRequired();
    }

    public void setRunnerTreeSorterName(String sorterName) {
        this.sorterName = sorterName;
    }

    @Override
    public String getRunnerTreeSorterName() {
        if (sorterName != null) {
            return sorterName;
        }
        return super.getRunnerTreeSorterName();
    }

}
