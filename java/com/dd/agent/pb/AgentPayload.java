// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_logs_payload.proto

package com.dd.agent.pb;

public final class AgentPayload {
  private AgentPayload() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pb_Log_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pb_Log_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pb_LogPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pb_LogPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030agent_logs_payload.proto\022\002pb\"\214\001\n\003Log\022\017" +
      "\n\007message\030\001 \001(\t\022\016\n\006status\030\002 \001(\t\022\021\n\ttimes" +
      "tamp\030\003 \001(\t\022\020\n\010hostname\030\004 \001(\t\022\017\n\007service\030" +
      "\005 \001(\t\022\016\n\006source\030\006 \001(\t\022\020\n\010category\030\007 \001(\t\022" +
      "\014\n\004tags\030\010 \003(\t\"C\n\nLogPayload\022\024\n\003log\030\001 \001(\013" +
      "2\007.pb.Log\022\017\n\007api_key\030\002 \001(\t\022\016\n\006logset\030\003 \001" +
      "(\tBF\n\017com.dd.agent.pbB\014AgentPayloadP\001Z#g" +
      "ithub.com/DataDog/agent-payload/pbb\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_pb_Log_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_pb_Log_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pb_Log_descriptor,
        new java.lang.String[] { "Message", "Status", "Timestamp", "Hostname", "Service", "Source", "Category", "Tags", });
    internal_static_pb_LogPayload_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_pb_LogPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pb_LogPayload_descriptor,
        new java.lang.String[] { "Log", "ApiKey", "Logset", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
