// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package io.emqx.exhook;

public interface ClientConnectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emqx.exhook.v2.ClientConnectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.emqx.exhook.v2.ConnInfo conninfo = 1;</code>
   * @return Whether the conninfo field is set.
   */
  boolean hasConninfo();
  /**
   * <code>.emqx.exhook.v2.ConnInfo conninfo = 1;</code>
   * @return The conninfo.
   */
  io.emqx.exhook.ConnInfo getConninfo();
  /**
   * <code>.emqx.exhook.v2.ConnInfo conninfo = 1;</code>
   */
  io.emqx.exhook.ConnInfoOrBuilder getConninfoOrBuilder();

  /**
   * <pre>
   * MQTT CONNECT packet's properties (MQTT v5.0)
   * It should be empty on MQTT v3.1.1/v3.1 or others protocol
   * </pre>
   *
   * <code>repeated .emqx.exhook.v2.Property props = 2;</code>
   */
  java.util.List<io.emqx.exhook.Property> 
      getPropsList();
  /**
   * <pre>
   * MQTT CONNECT packet's properties (MQTT v5.0)
   * It should be empty on MQTT v3.1.1/v3.1 or others protocol
   * </pre>
   *
   * <code>repeated .emqx.exhook.v2.Property props = 2;</code>
   */
  io.emqx.exhook.Property getProps(int index);
  /**
   * <pre>
   * MQTT CONNECT packet's properties (MQTT v5.0)
   * It should be empty on MQTT v3.1.1/v3.1 or others protocol
   * </pre>
   *
   * <code>repeated .emqx.exhook.v2.Property props = 2;</code>
   */
  int getPropsCount();
  /**
   * <pre>
   * MQTT CONNECT packet's properties (MQTT v5.0)
   * It should be empty on MQTT v3.1.1/v3.1 or others protocol
   * </pre>
   *
   * <code>repeated .emqx.exhook.v2.Property props = 2;</code>
   */
  java.util.List<? extends io.emqx.exhook.PropertyOrBuilder> 
      getPropsOrBuilderList();
  /**
   * <pre>
   * MQTT CONNECT packet's properties (MQTT v5.0)
   * It should be empty on MQTT v3.1.1/v3.1 or others protocol
   * </pre>
   *
   * <code>repeated .emqx.exhook.v2.Property props = 2;</code>
   */
  io.emqx.exhook.PropertyOrBuilder getPropsOrBuilder(
      int index);

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
