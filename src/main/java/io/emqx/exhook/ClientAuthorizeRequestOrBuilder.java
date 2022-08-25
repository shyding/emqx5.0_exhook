// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package io.emqx.exhook;

public interface ClientAuthorizeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emqx.exhook.v2.ClientAuthorizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   * @return Whether the clientinfo field is set.
   */
  boolean hasClientinfo();
  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   * @return The clientinfo.
   */
  io.emqx.exhook.ClientInfo getClientinfo();
  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   */
  io.emqx.exhook.ClientInfoOrBuilder getClientinfoOrBuilder();

  /**
   * <code>.emqx.exhook.v2.ClientAuthorizeRequest.AuthorizeReqType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.emqx.exhook.v2.ClientAuthorizeRequest.AuthorizeReqType type = 2;</code>
   * @return The type.
   */
  io.emqx.exhook.ClientAuthorizeRequest.AuthorizeReqType getType();

  /**
   * <code>string topic = 3;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 3;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>bool result = 4;</code>
   * @return The result.
   */
  boolean getResult();

  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 5;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 5;</code>
   * @return The meta.
   */
  io.emqx.exhook.RequestMeta getMeta();
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 5;</code>
   */
  io.emqx.exhook.RequestMetaOrBuilder getMetaOrBuilder();
}
