// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package io.emqx.exhook;

public interface SessionTerminatedRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emqx.exhook.v2.SessionTerminatedRequest)
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
   * <code>string reason = 2;</code>
   * @return The reason.
   */
  java.lang.String getReason();
  /**
   * <code>string reason = 2;</code>
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString
      getReasonBytes();

  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 3;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 3;</code>
   * @return The meta.
   */
  io.emqx.exhook.RequestMeta getMeta();
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 3;</code>
   */
  io.emqx.exhook.RequestMetaOrBuilder getMetaOrBuilder();
}
