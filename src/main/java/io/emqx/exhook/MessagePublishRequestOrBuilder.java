// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package io.emqx.exhook;

public interface MessagePublishRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emqx.exhook.v2.MessagePublishRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.emqx.exhook.v2.Message message = 1;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.emqx.exhook.v2.Message message = 1;</code>
   * @return The message.
   */
  io.emqx.exhook.Message getMessage();
  /**
   * <code>.emqx.exhook.v2.Message message = 1;</code>
   */
  io.emqx.exhook.MessageOrBuilder getMessageOrBuilder();

  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
   * @return The meta.
   */
  io.emqx.exhook.RequestMeta getMeta();
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
   */
  io.emqx.exhook.RequestMetaOrBuilder getMetaOrBuilder();
}
