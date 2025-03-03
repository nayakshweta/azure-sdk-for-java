// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Execute Synapse notebook activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SynapseNotebook")
@JsonFlatten
@Fluent
public class SynapseNotebookActivity extends ExecutionActivity {
    /*
     * Synapse notebook reference.
     */
    @JsonProperty(value = "typeProperties.notebook", required = true)
    private SynapseNotebookReference notebook;

    /*
     * The name of the big data pool which will be used to execute the notebook.
     */
    @JsonProperty(value = "typeProperties.sparkPool")
    private BigDataPoolParametrizationReference sparkPool;

    /*
     * Notebook parameters.
     */
    @JsonProperty(value = "typeProperties.parameters")
    private Map<String, NotebookParameter> parameters;

    /*
     * Number of core and memory to be used for executors allocated in the specified Spark pool for the session, which
     * will be used for overriding 'executorCores' and 'executorMemory' of the notebook you provide. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.executorSize")
    private Object executorSize;

    /*
     * Spark configuration properties, which will override the 'conf' of the notebook you provide.
     */
    @JsonProperty(value = "typeProperties.conf")
    private Object conf;

    /*
     * Number of core and memory to be used for driver allocated in the specified Spark pool for the session, which
     * will be used for overriding 'driverCores' and 'driverMemory' of the notebook you provide. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.driverSize")
    private Object driverSize;

    /*
     * Number of executors to launch for this session, which will override the 'numExecutors' of the notebook you
     * provide.
     */
    @JsonProperty(value = "typeProperties.numExecutors")
    private Integer numExecutors;

    /**
     * Get the notebook property: Synapse notebook reference.
     *
     * @return the notebook value.
     */
    public SynapseNotebookReference getNotebook() {
        return this.notebook;
    }

    /**
     * Set the notebook property: Synapse notebook reference.
     *
     * @param notebook the notebook value to set.
     * @return the SynapseNotebookActivity object itself.
     */
    public SynapseNotebookActivity setNotebook(SynapseNotebookReference notebook) {
        this.notebook = notebook;
        return this;
    }

    /**
     * Get the sparkPool property: The name of the big data pool which will be used to execute the notebook.
     *
     * @return the sparkPool value.
     */
    public BigDataPoolParametrizationReference getSparkPool() {
        return this.sparkPool;
    }

    /**
     * Set the sparkPool property: The name of the big data pool which will be used to execute the notebook.
     *
     * @param sparkPool the sparkPool value to set.
     * @return the SynapseNotebookActivity object itself.
     */
    public SynapseNotebookActivity setSparkPool(BigDataPoolParametrizationReference sparkPool) {
        this.sparkPool = sparkPool;
        return this;
    }

    /**
     * Get the parameters property: Notebook parameters.
     *
     * @return the parameters value.
     */
    public Map<String, NotebookParameter> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Notebook parameters.
     *
     * @param parameters the parameters value to set.
     * @return the SynapseNotebookActivity object itself.
     */
    public SynapseNotebookActivity setParameters(Map<String, NotebookParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the executorSize property: Number of core and memory to be used for executors allocated in the specified
     * Spark pool for the session, which will be used for overriding 'executorCores' and 'executorMemory' of the
     * notebook you provide. Type: string (or Expression with resultType string).
     *
     * @return the executorSize value.
     */
    public Object getExecutorSize() {
        return this.executorSize;
    }

    /**
     * Set the executorSize property: Number of core and memory to be used for executors allocated in the specified
     * Spark pool for the session, which will be used for overriding 'executorCores' and 'executorMemory' of the
     * notebook you provide. Type: string (or Expression with resultType string).
     *
     * @param executorSize the executorSize value to set.
     * @return the SynapseNotebookActivity object itself.
     */
    public SynapseNotebookActivity setExecutorSize(Object executorSize) {
        this.executorSize = executorSize;
        return this;
    }

    /**
     * Get the conf property: Spark configuration properties, which will override the 'conf' of the notebook you
     * provide.
     *
     * @return the conf value.
     */
    public Object getConf() {
        return this.conf;
    }

    /**
     * Set the conf property: Spark configuration properties, which will override the 'conf' of the notebook you
     * provide.
     *
     * @param conf the conf value to set.
     * @return the SynapseNotebookActivity object itself.
     */
    public SynapseNotebookActivity setConf(Object conf) {
        this.conf = conf;
        return this;
    }

    /**
     * Get the driverSize property: Number of core and memory to be used for driver allocated in the specified Spark
     * pool for the session, which will be used for overriding 'driverCores' and 'driverMemory' of the notebook you
     * provide. Type: string (or Expression with resultType string).
     *
     * @return the driverSize value.
     */
    public Object getDriverSize() {
        return this.driverSize;
    }

    /**
     * Set the driverSize property: Number of core and memory to be used for driver allocated in the specified Spark
     * pool for the session, which will be used for overriding 'driverCores' and 'driverMemory' of the notebook you
     * provide. Type: string (or Expression with resultType string).
     *
     * @param driverSize the driverSize value to set.
     * @return the SynapseNotebookActivity object itself.
     */
    public SynapseNotebookActivity setDriverSize(Object driverSize) {
        this.driverSize = driverSize;
        return this;
    }

    /**
     * Get the numExecutors property: Number of executors to launch for this session, which will override the
     * 'numExecutors' of the notebook you provide.
     *
     * @return the numExecutors value.
     */
    public Integer getNumExecutors() {
        return this.numExecutors;
    }

    /**
     * Set the numExecutors property: Number of executors to launch for this session, which will override the
     * 'numExecutors' of the notebook you provide.
     *
     * @param numExecutors the numExecutors value to set.
     * @return the SynapseNotebookActivity object itself.
     */
    public SynapseNotebookActivity setNumExecutors(Integer numExecutors) {
        this.numExecutors = numExecutors;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SynapseNotebookActivity setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SynapseNotebookActivity setPolicy(ActivityPolicy policy) {
        super.setPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SynapseNotebookActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SynapseNotebookActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SynapseNotebookActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SynapseNotebookActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }
}
