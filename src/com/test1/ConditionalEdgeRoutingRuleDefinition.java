package com.test1;

public class ConditionalEdgeRoutingRuleDefinition {
	private long routingRuleId;
	private long conditionalEdgeRoutingId;
	private long workflowDefinitionId;
	private String ruleName;
	private String ruleDescription;
	private String ruleType;
	private String sourceNodeId;
	private String targetNodeId;
	private String conditionExpression;
	private String conditionOperator;
	private String expectedStateValue;
	private String stateAttributeName;
	private long rulePriority;
	private long ruleExecutionOrder;
	private String ruleEnabled;
	private String ruleVersion;
	private long fallbackRuleId;
	private String ruleValidationStatus;

	public ConditionalEdgeRoutingRuleDefinition() {

	}

	public ConditionalEdgeRoutingRuleDefinition(long routingRuleId, long conditionalEdgeRoutingId,
			long workflowDefinitionId, String ruleName, String ruleDescription, String ruleType, String sourceNodeId,
			String targetNodeId, String conditionExpression, String conditionOperator, String expectedStateValue,
			String stateAttributeName, long rulePriority, long ruleExecutionOrder, String ruleEnabled,
			String ruleVersion, long fallbackRuleId, String ruleValidationStatus) {
		super();
		this.routingRuleId = routingRuleId;
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
		this.workflowDefinitionId = workflowDefinitionId;
		this.ruleName = ruleName;
		this.ruleDescription = ruleDescription;
		this.ruleType = ruleType;
		this.sourceNodeId = sourceNodeId;
		this.targetNodeId = targetNodeId;
		this.conditionExpression = conditionExpression;
		this.conditionOperator = conditionOperator;
		this.expectedStateValue = expectedStateValue;
		this.stateAttributeName = stateAttributeName;
		this.rulePriority = rulePriority;
		this.ruleExecutionOrder = ruleExecutionOrder;
		this.ruleEnabled = ruleEnabled;
		this.ruleVersion = ruleVersion;
		this.fallbackRuleId = fallbackRuleId;
		this.ruleValidationStatus = ruleValidationStatus;
	}

	public long getRoutingRuleId() {
		return routingRuleId;
	}

	public void setRoutingRuleId(long routingRuleId) {
		this.routingRuleId = routingRuleId;
	}

	public long getConditionalEdgeRoutingId() {
		return conditionalEdgeRoutingId;
	}

	public void setConditionalEdgeRoutingId(long conditionalEdgeRoutingId) {
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
	}

	public long getWorkflowDefinitionId() {
		return workflowDefinitionId;
	}

	public void setWorkflowDefinitionId(long workflowDefinitionId) {
		this.workflowDefinitionId = workflowDefinitionId;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleDescription() {
		return ruleDescription;
	}

	public void setRuleDescription(String ruleDescription) {
		this.ruleDescription = ruleDescription;
	}

	public String getRuleType() {
		return ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getSourceNodeId() {
		return sourceNodeId;
	}

	public void setSourceNodeId(String sourceNodeId) {
		this.sourceNodeId = sourceNodeId;
	}

	public String getTargetNodeId() {
		return targetNodeId;
	}

	public void setTargetNodeId(String targetNodeId) {
		this.targetNodeId = targetNodeId;
	}

	public String getConditionExpression() {
		return conditionExpression;
	}

	public void setConditionExpression(String conditionExpression) {
		this.conditionExpression = conditionExpression;
	}

	public String getConditionOperator() {
		return conditionOperator;
	}

	public void setConditionOperator(String conditionOperator) {
		this.conditionOperator = conditionOperator;
	}

	public String getExpectedStateValue() {
		return expectedStateValue;
	}

	public void setExpectedStateValue(String expectedStateValue) {
		this.expectedStateValue = expectedStateValue;
	}

	public String getStateAttributeName() {
		return stateAttributeName;
	}

	public void setStateAttributeName(String stateAttributeName) {
		this.stateAttributeName = stateAttributeName;
	}

	public long getRulePriority() {
		return rulePriority;
	}

	public void setRulePriority(long rulePriority) {
		this.rulePriority = rulePriority;
	}

	public long getRuleExecutionOrder() {
		return ruleExecutionOrder;
	}

	public void setRuleExecutionOrder(long ruleExecutionOrder) {
		this.ruleExecutionOrder = ruleExecutionOrder;
	}

	public String getRuleEnabled() {
		return ruleEnabled;
	}

	public void setRuleEnabled(String ruleEnabled) {
		this.ruleEnabled = ruleEnabled;
	}

	public String getRuleVersion() {
		return ruleVersion;
	}

	public void setRuleVersion(String ruleVersion) {
		this.ruleVersion = ruleVersion;
	}

	public long getFallbackRuleId() {
		return fallbackRuleId;
	}

	public void setFallbackRuleId(long fallbackRuleId) {
		this.fallbackRuleId = fallbackRuleId;
	}

	public String getRuleValidationStatus() {
		return ruleValidationStatus;
	}

	public void setRuleValidationStatus(String ruleValidationStatus) {
		this.ruleValidationStatus = ruleValidationStatus;
	}

}
