package com.test1;

public class ConditionalEdgeRoutingDecisionAudit {
	private long routingDecisionAuditId;
	private long routingExecutionId;
	private long conditionalEdgeRoutingId;
	private long workflowExecutionId;
	private String threadId;
	private String sourceNodeId;
	private long evaluatedRuleId;
	private String evaluatedCondition;
	private String stateSnapshot;
	private String actualStateValue;
	private String expectedStatevalue;
	private String conditionMatched;
	private String selectedTargetNodeId;
	private String routingDecisionReason;
	private String decisionTimestamp;
	private long decisionLatency;
	private String fallbackApplied;
	private String decisionSource;

	public ConditionalEdgeRoutingDecisionAudit() {

	}

	public ConditionalEdgeRoutingDecisionAudit(long routingDecisionAuditId, long routingExecutionId,
			long conditionalEdgeRoutingId, long workflowExecutionId, String threadId, String sourceNodeId,
			long evaluatedRuleId, String evaluatedCondition, String stateSnapshot, String actualStateValue,
			String expectedStatevalue, String conditionMatched, String selectedTargetNodeId,
			String routingDecisionReason, String decisionTimestamp, long decisionLatency, String fallbackApplied,
			String decisionSource) {
		super();
		this.routingDecisionAuditId = routingDecisionAuditId;
		this.routingExecutionId = routingExecutionId;
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
		this.workflowExecutionId = workflowExecutionId;
		this.threadId = threadId;
		this.sourceNodeId = sourceNodeId;
		this.evaluatedRuleId = evaluatedRuleId;
		this.evaluatedCondition = evaluatedCondition;
		this.stateSnapshot = stateSnapshot;
		this.actualStateValue = actualStateValue;
		this.expectedStatevalue = expectedStatevalue;
		this.conditionMatched = conditionMatched;
		this.selectedTargetNodeId = selectedTargetNodeId;
		this.routingDecisionReason = routingDecisionReason;
		this.decisionTimestamp = decisionTimestamp;
		this.decisionLatency = decisionLatency;
		this.fallbackApplied = fallbackApplied;
		this.decisionSource = decisionSource;
	}

	public long getRoutingDecisionAuditId() {
		return routingDecisionAuditId;
	}

	public void setRoutingDecisionAuditId(long routingDecisionAuditId) {
		this.routingDecisionAuditId = routingDecisionAuditId;
	}

	public long getRoutingExecutionId() {
		return routingExecutionId;
	}

	public void setRoutingExecutionId(long routingExecutionId) {
		this.routingExecutionId = routingExecutionId;
	}

	public long getConditionalEdgeRoutingId() {
		return conditionalEdgeRoutingId;
	}

	public void setConditionalEdgeRoutingId(long conditionalEdgeRoutingId) {
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
	}

	public long getWorkflowExecutionId() {
		return workflowExecutionId;
	}

	public void setWorkflowExecutionId(long workflowExecutionId) {
		this.workflowExecutionId = workflowExecutionId;
	}

	public String getThreadId() {
		return threadId;
	}

	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}

	public String getSourceNodeId() {
		return sourceNodeId;
	}

	public void setSourceNodeId(String sourceNodeId) {
		this.sourceNodeId = sourceNodeId;
	}

	public long getEvaluatedRuleId() {
		return evaluatedRuleId;
	}

	public void setEvaluatedRuleId(long evaluatedRuleId) {
		this.evaluatedRuleId = evaluatedRuleId;
	}

	public String getEvaluatedCondition() {
		return evaluatedCondition;
	}

	public void setEvaluatedCondition(String evaluatedCondition) {
		this.evaluatedCondition = evaluatedCondition;
	}

	public String getStateSnapshot() {
		return stateSnapshot;
	}

	public void setStateSnapshot(String stateSnapshot) {
		this.stateSnapshot = stateSnapshot;
	}

	public String getActualStateValue() {
		return actualStateValue;
	}

	public void setActualStateValue(String actualStateValue) {
		this.actualStateValue = actualStateValue;
	}

	public String getExpectedStatevalue() {
		return expectedStatevalue;
	}

	public void setExpectedStatevalue(String expectedStatevalue) {
		this.expectedStatevalue = expectedStatevalue;
	}

	public String getConditionMatched() {
		return conditionMatched;
	}

	public void setConditionMatched(String conditionMatched) {
		this.conditionMatched = conditionMatched;
	}

	public String getSelectedTargetNodeId() {
		return selectedTargetNodeId;
	}

	public void setSelectedTargetNodeId(String selectedTargetNodeId) {
		this.selectedTargetNodeId = selectedTargetNodeId;
	}

	public String getRoutingDecisionReason() {
		return routingDecisionReason;
	}

	public void setRoutingDecisionReason(String routingDecisionReason) {
		this.routingDecisionReason = routingDecisionReason;
	}

	public String getDecisionTimestamp() {
		return decisionTimestamp;
	}

	public void setDecisionTimestamp(String decisionTimestamp) {
		this.decisionTimestamp = decisionTimestamp;
	}

	public long getDecisionLatency() {
		return decisionLatency;
	}

	public void setDecisionLatency(long decisionLatency) {
		this.decisionLatency = decisionLatency;
	}

	public String getFallbackApplied() {
		return fallbackApplied;
	}

	public void setFallbackApplied(String fallbackApplied) {
		this.fallbackApplied = fallbackApplied;
	}

	public String getDecisionSource() {
		return decisionSource;
	}

	public void setDecisionSource(String decisionSource) {
		this.decisionSource = decisionSource;
	}

}
