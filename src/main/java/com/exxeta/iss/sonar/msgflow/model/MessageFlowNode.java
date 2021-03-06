/*
 * Sonar Message Flow Plugin
 * Copyright (C) 2015 Hendrik Scholz and EXXETA AG
 * http://www.exxeta.com
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
package com.exxeta.iss.sonar.msgflow.model;

import java.util.ArrayList;

/**
 * The class is a model of a message flow node. The model contains variables 
 * holding connection data as well as configuration data of a message flow 
 * node. 
 * 
 * @author Hendrik Scholz (EXXETA AG)
 */
public class MessageFlowNode {

	/**
	 * The logger for the class.
	 */
	//private static final Logger LOG = LoggerFactory.getLogger(MessageFlowNode.class);
	
	/**
	 * the ID of a message flow node
	 */
	private String id;

	/**
	 * the name of a message flow node
	 */
	private String name;
	
	/**
	 * the type of a message flow node
	 */
	private String type;
	
	/**
	 * the flag for 'build Tree Using Schema' of a message flow node
	 */
	private boolean buildTreeUsingSchema;
	
	/**
	 * the flag for 'mixed Content Retain Mode' of a message flow node
	 */
	private boolean mixedContentRetainMode;
	
	/**
	 * the flag for 'comments Retain Mode' of a message flow node
	 */
	private boolean commentsRetainMode;
	
	/**
	 * the flag for 'validate Master' of a message flow node
	 */
	private boolean validateMaster;
	
	/**
	 * the message domain of a message flow node
	 */
	private String messageDomainProperty;	
	
	/**
	 * the message set of a message flow node
	 */
	private String messageSetProperty;
	
	/**
	 * the record definition of a message flow node
	 * 
	 * e.g. for File Output Node
	 * "Record is Whole File", "Record is Unmodified Data",
	 * "Record is Fixed Length Data", "Record is Delimited Data" 
	 */
	private String recordDefinition;
	
	/**
	 * the request message location of a message flow node
	 */
	private String requestMsgLocationInTree;
	
	/**
	 * the message domain of a message flow node
	 */
	private String messageDomain;
	
	/**
	 * the message set of a message flow node
	 */
	private String messageSet;
	
	/**
	 * the flag for 'reset Message Domain' of a message flow node
	 */
	private boolean resetMessageDomain;
	
	/**
	 * the flag for 'reset Message Set' of a message flow node
	 */
	private boolean resetMessageSet;
	
	/**
	 * the flag for 'reset Message Type' of a message flow node
	 */
	private boolean resetMessageType;
	
	/**
	 * the flag for 'reset Message Format' of a message flow node
	 */
	private boolean resetMessageFormat;
	
	/**
	 * the flag for "Monitoring / Monitoring events"
	 */
	private boolean areMonitoringEventsEnabled;
	
	/**
	 * the list of input terminals of a message flow node
	 */
	private ArrayList<String> inputTerminals;
	
	/**
	 * the list of output terminals of a message flow node
	 */
	private ArrayList<String> outputTerminals;
	
	/**
	 * Constructor
	 * 
	 * Creates a new message flow node (model) and initialises its properties.
	 */
	public MessageFlowNode(String id,
					   	   String name,
					   	   String type,
					   	   boolean buildTreeUsingSchema,
					   	   boolean mixedContentRetainMode,
					   	   boolean commentsRetainMode,
					   	   boolean validateMaster,
					   	   String messageDomainProperty,
					   	   String messageSetProperty,
					   	   String requestMsgLocationInTree,
					   	   String messageDomain,
					   	   String messageSet,
					   	   String recordDefinition,
					   	   boolean resetMessageDomain,
					   	   boolean resetMessageSet,
					   	   boolean resetMessageType,
					   	   boolean resetMessageFormat,
					   	   boolean areMonitoringEventsEnabled,
					   	   ArrayList<String> inputTerminals,
					   	   ArrayList<String> outputTerminals) {
		this.id							= id;
		this.name						= name;
		this.type						= type;
		this.buildTreeUsingSchema		= buildTreeUsingSchema;
		this.mixedContentRetainMode		= mixedContentRetainMode;
		this.commentsRetainMode			= commentsRetainMode;
		this.validateMaster				= validateMaster;
		this.messageDomainProperty		= messageDomainProperty;
		this.messageSetProperty			= messageSetProperty;
		this.requestMsgLocationInTree	= requestMsgLocationInTree;
		this.messageDomain 				= messageDomain; 
		this.messageSet					= messageSet;
		this.recordDefinition			= recordDefinition;
		this.resetMessageDomain 		= resetMessageDomain;
		this.resetMessageSet			= resetMessageSet;
		this.resetMessageType			= resetMessageType;
		this.resetMessageFormat			= resetMessageFormat;
		this.areMonitoringEventsEnabled	= areMonitoringEventsEnabled;
		this.inputTerminals				= inputTerminals;
		this.outputTerminals			= outputTerminals;
	}
	
	/**
	 * The method returns a the ID of a message flow node.
	 * 
	 * @return the ID of a message flow node
	 */
	public String getId() {
		return id;
	}

	/**
	 * The method returns a the name of a message flow node.
	 * 
	 * @return the name of a message flow node
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * The method returns a the type of a message flow node.
	 * 
	 * @return the type of a message flow node
	 */
	public String getType() {
		return type;
	}

	/**
	 * The method returns a the flag for 'build Tree Using Schema' of a message flow node.
	 * 
	 * @return the flag for 'build Tree Using Schema' of a message flow node
	 */
	public boolean isBuildTreeUsingSchema() {
		return buildTreeUsingSchema;
	}
	
	/**
	 * The method returns a the flag for 'mixed Content Retain Mode' of a message flow node.
	 * 
	 * @return the flag for 'mixed Content Retain Mode' of a message flow node
	 */
	public boolean isMixedContentRetainMode() {
		return mixedContentRetainMode;
	}

	/**
	 * The method returns a the flag for 'comments Retain Mode' of a message flow node.
	 * 
	 * @return the flag for 'comments Retain Mode' of a message flow node
	 */
	public boolean isCommentsRetainMode() {
		return commentsRetainMode;
	}

	/**
	 * The method returns a the flag for 'validate Master' of a message flow node.
	 * 
	 * @return the flag for 'validate Master' of a message flow node
	 */
	public boolean isValidateMaster() {
		return validateMaster;
	}

	/**
	 * The method returns a the message domain of a message flow node.
	 * 
	 * @return the message domain of a message flow node
	 */
	public String getMessageDomainProperty() {
		return messageDomainProperty;
	}

	/**
	 * The method returns a the message set of a message flow node.
	 * 
	 * @return the message set of a message flow node
	 */
	public String getMessageSetProperty() {
		return messageSetProperty;
	}

	/**
	 * The method returns a the request message location of a message flow node.
	 * 
	 * @return the request message location of a message flow node
	 */
	public String getRequestMsgLocationInTree() {
		return requestMsgLocationInTree;
	}
	
	/**
	 * The method returns a message domain of a message flow node.
	 * 
	 * @return message domain of a message flow node
	 */
	public String getMessageDomain() {
		return messageDomain;
	}

	/**
	 * The method returns a the message set of a message flow node.
	 * 
	 * @return the message set of a message flow node
	 */
	public String getMessageSet() {
		return messageSet;
	}

	/**
	 * The method returns the flag for 'reset Message Domain' of a message flow node.
	 * 
	 * @return the flag for 'reset Message Domain' of a message flow node
	 */
	public boolean isResetMessageDomain() {
		return resetMessageDomain;
	}

	/**
	 * The method returns the flag for 'reset Message Set' of a message flow node.
	 * 
	 * @return the flag for 'reset Message Set' of a message flow node
	 */
	public boolean isResetMessageSet() {
		return resetMessageSet;
	}

	/**
	 * The method returns the flag for 'reset Message Type' of a message flow node.
	 * 
	 * @return the flag for 'reset Message Type' of a message flow node
	 */
	public boolean isResetMessageType() {
		return resetMessageType;
	}

	/**
	 * The method returns the flag for 'reset Message Format' of a message flow node.
	 * 
	 * @return the flag for 'reset Message Format' of a message flow node
	 */
	public boolean isResetMessageFormat() {
		return resetMessageFormat;
	}
	
	/**
	 * The method returns the flag for 'areMonitoringEventsEnabled' of the message flow node.
	 * 
	 *  @return the flag for 'areMonitoringEventsEnabled' of the message flow node
	 */
	public boolean areMonitoringEventsEnabled() {
		return areMonitoringEventsEnabled;
	}
	
	/**
	 * The method returns a the list of input terminals of a message flow node.
	 * 
	 * @return the list of input terminals of a message flow node
	 */
	public ArrayList<String> getInputTerminals() {
		return inputTerminals;
	}
	
	/**
	 * The method returns a the list of output terminals of a message flow node.
	 * 
	 * @return the list of output terminals of a message flow node
	 */
	public ArrayList<String> getOutputTerminals() {
		return outputTerminals;
	}
	
	/**
	 * The method returns the record definition of a message flow node.
	 * 
	 * @return the recordDefinition
	 */
	public String getRecordDefinition() {
		return recordDefinition;
	}
}
