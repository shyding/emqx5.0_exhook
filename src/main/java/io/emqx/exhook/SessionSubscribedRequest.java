// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package io.emqx.exhook;

/**
 * Protobuf type {@code emqx.exhook.v2.SessionSubscribedRequest}
 */
public final class SessionSubscribedRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:emqx.exhook.v2.SessionSubscribedRequest)
    SessionSubscribedRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SessionSubscribedRequest.newBuilder() to construct.
  private SessionSubscribedRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SessionSubscribedRequest() {
    topic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SessionSubscribedRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SessionSubscribedRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            io.emqx.exhook.ClientInfo.Builder subBuilder = null;
            if (clientinfo_ != null) {
              subBuilder = clientinfo_.toBuilder();
            }
            clientinfo_ = input.readMessage(io.emqx.exhook.ClientInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clientinfo_);
              clientinfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            topic_ = s;
            break;
          }
          case 26: {
            io.emqx.exhook.SubOpts.Builder subBuilder = null;
            if (subopts_ != null) {
              subBuilder = subopts_.toBuilder();
            }
            subopts_ = input.readMessage(io.emqx.exhook.SubOpts.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(subopts_);
              subopts_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            io.emqx.exhook.RequestMeta.Builder subBuilder = null;
            if (meta_ != null) {
              subBuilder = meta_.toBuilder();
            }
            meta_ = input.readMessage(io.emqx.exhook.RequestMeta.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(meta_);
              meta_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_SessionSubscribedRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_SessionSubscribedRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.emqx.exhook.SessionSubscribedRequest.class, io.emqx.exhook.SessionSubscribedRequest.Builder.class);
  }

  public static final int CLIENTINFO_FIELD_NUMBER = 1;
  private io.emqx.exhook.ClientInfo clientinfo_;
  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   * @return Whether the clientinfo field is set.
   */
  @java.lang.Override
  public boolean hasClientinfo() {
    return clientinfo_ != null;
  }
  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   * @return The clientinfo.
   */
  @java.lang.Override
  public io.emqx.exhook.ClientInfo getClientinfo() {
    return clientinfo_ == null ? io.emqx.exhook.ClientInfo.getDefaultInstance() : clientinfo_;
  }
  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   */
  @java.lang.Override
  public io.emqx.exhook.ClientInfoOrBuilder getClientinfoOrBuilder() {
    return getClientinfo();
  }

  public static final int TOPIC_FIELD_NUMBER = 2;
  private volatile java.lang.Object topic_;
  /**
   * <code>string topic = 2;</code>
   * @return The topic.
   */
  @java.lang.Override
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <code>string topic = 2;</code>
   * @return The bytes for topic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBOPTS_FIELD_NUMBER = 3;
  private io.emqx.exhook.SubOpts subopts_;
  /**
   * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
   * @return Whether the subopts field is set.
   */
  @java.lang.Override
  public boolean hasSubopts() {
    return subopts_ != null;
  }
  /**
   * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
   * @return The subopts.
   */
  @java.lang.Override
  public io.emqx.exhook.SubOpts getSubopts() {
    return subopts_ == null ? io.emqx.exhook.SubOpts.getDefaultInstance() : subopts_;
  }
  /**
   * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
   */
  @java.lang.Override
  public io.emqx.exhook.SubOptsOrBuilder getSuboptsOrBuilder() {
    return getSubopts();
  }

  public static final int META_FIELD_NUMBER = 4;
  private io.emqx.exhook.RequestMeta meta_;
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
   * @return Whether the meta field is set.
   */
  @java.lang.Override
  public boolean hasMeta() {
    return meta_ != null;
  }
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
   * @return The meta.
   */
  @java.lang.Override
  public io.emqx.exhook.RequestMeta getMeta() {
    return meta_ == null ? io.emqx.exhook.RequestMeta.getDefaultInstance() : meta_;
  }
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
   */
  @java.lang.Override
  public io.emqx.exhook.RequestMetaOrBuilder getMetaOrBuilder() {
    return getMeta();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (clientinfo_ != null) {
      output.writeMessage(1, getClientinfo());
    }
    if (!getTopicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topic_);
    }
    if (subopts_ != null) {
      output.writeMessage(3, getSubopts());
    }
    if (meta_ != null) {
      output.writeMessage(4, getMeta());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientinfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClientinfo());
    }
    if (!getTopicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, topic_);
    }
    if (subopts_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSubopts());
    }
    if (meta_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMeta());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.emqx.exhook.SessionSubscribedRequest)) {
      return super.equals(obj);
    }
    io.emqx.exhook.SessionSubscribedRequest other = (io.emqx.exhook.SessionSubscribedRequest) obj;

    if (hasClientinfo() != other.hasClientinfo()) return false;
    if (hasClientinfo()) {
      if (!getClientinfo()
          .equals(other.getClientinfo())) return false;
    }
    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (hasSubopts() != other.hasSubopts()) return false;
    if (hasSubopts()) {
      if (!getSubopts()
          .equals(other.getSubopts())) return false;
    }
    if (hasMeta() != other.hasMeta()) return false;
    if (hasMeta()) {
      if (!getMeta()
          .equals(other.getMeta())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasClientinfo()) {
      hash = (37 * hash) + CLIENTINFO_FIELD_NUMBER;
      hash = (53 * hash) + getClientinfo().hashCode();
    }
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    if (hasSubopts()) {
      hash = (37 * hash) + SUBOPTS_FIELD_NUMBER;
      hash = (53 * hash) + getSubopts().hashCode();
    }
    if (hasMeta()) {
      hash = (37 * hash) + META_FIELD_NUMBER;
      hash = (53 * hash) + getMeta().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.emqx.exhook.SessionSubscribedRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.SessionSubscribedRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.emqx.exhook.SessionSubscribedRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code emqx.exhook.v2.SessionSubscribedRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:emqx.exhook.v2.SessionSubscribedRequest)
      io.emqx.exhook.SessionSubscribedRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_SessionSubscribedRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_SessionSubscribedRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.emqx.exhook.SessionSubscribedRequest.class, io.emqx.exhook.SessionSubscribedRequest.Builder.class);
    }

    // Construct using io.emqx.exhook.SessionSubscribedRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (clientinfoBuilder_ == null) {
        clientinfo_ = null;
      } else {
        clientinfo_ = null;
        clientinfoBuilder_ = null;
      }
      topic_ = "";

      if (suboptsBuilder_ == null) {
        subopts_ = null;
      } else {
        subopts_ = null;
        suboptsBuilder_ = null;
      }
      if (metaBuilder_ == null) {
        meta_ = null;
      } else {
        meta_ = null;
        metaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_SessionSubscribedRequest_descriptor;
    }

    @java.lang.Override
    public io.emqx.exhook.SessionSubscribedRequest getDefaultInstanceForType() {
      return io.emqx.exhook.SessionSubscribedRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.emqx.exhook.SessionSubscribedRequest build() {
      io.emqx.exhook.SessionSubscribedRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.emqx.exhook.SessionSubscribedRequest buildPartial() {
      io.emqx.exhook.SessionSubscribedRequest result = new io.emqx.exhook.SessionSubscribedRequest(this);
      if (clientinfoBuilder_ == null) {
        result.clientinfo_ = clientinfo_;
      } else {
        result.clientinfo_ = clientinfoBuilder_.build();
      }
      result.topic_ = topic_;
      if (suboptsBuilder_ == null) {
        result.subopts_ = subopts_;
      } else {
        result.subopts_ = suboptsBuilder_.build();
      }
      if (metaBuilder_ == null) {
        result.meta_ = meta_;
      } else {
        result.meta_ = metaBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.emqx.exhook.SessionSubscribedRequest) {
        return mergeFrom((io.emqx.exhook.SessionSubscribedRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.emqx.exhook.SessionSubscribedRequest other) {
      if (other == io.emqx.exhook.SessionSubscribedRequest.getDefaultInstance()) return this;
      if (other.hasClientinfo()) {
        mergeClientinfo(other.getClientinfo());
      }
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (other.hasSubopts()) {
        mergeSubopts(other.getSubopts());
      }
      if (other.hasMeta()) {
        mergeMeta(other.getMeta());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.emqx.exhook.SessionSubscribedRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.emqx.exhook.SessionSubscribedRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.emqx.exhook.ClientInfo clientinfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.emqx.exhook.ClientInfo, io.emqx.exhook.ClientInfo.Builder, io.emqx.exhook.ClientInfoOrBuilder> clientinfoBuilder_;
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     * @return Whether the clientinfo field is set.
     */
    public boolean hasClientinfo() {
      return clientinfoBuilder_ != null || clientinfo_ != null;
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     * @return The clientinfo.
     */
    public io.emqx.exhook.ClientInfo getClientinfo() {
      if (clientinfoBuilder_ == null) {
        return clientinfo_ == null ? io.emqx.exhook.ClientInfo.getDefaultInstance() : clientinfo_;
      } else {
        return clientinfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public Builder setClientinfo(io.emqx.exhook.ClientInfo value) {
      if (clientinfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientinfo_ = value;
        onChanged();
      } else {
        clientinfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public Builder setClientinfo(
        io.emqx.exhook.ClientInfo.Builder builderForValue) {
      if (clientinfoBuilder_ == null) {
        clientinfo_ = builderForValue.build();
        onChanged();
      } else {
        clientinfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public Builder mergeClientinfo(io.emqx.exhook.ClientInfo value) {
      if (clientinfoBuilder_ == null) {
        if (clientinfo_ != null) {
          clientinfo_ =
            io.emqx.exhook.ClientInfo.newBuilder(clientinfo_).mergeFrom(value).buildPartial();
        } else {
          clientinfo_ = value;
        }
        onChanged();
      } else {
        clientinfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public Builder clearClientinfo() {
      if (clientinfoBuilder_ == null) {
        clientinfo_ = null;
        onChanged();
      } else {
        clientinfo_ = null;
        clientinfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public io.emqx.exhook.ClientInfo.Builder getClientinfoBuilder() {
      
      onChanged();
      return getClientinfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public io.emqx.exhook.ClientInfoOrBuilder getClientinfoOrBuilder() {
      if (clientinfoBuilder_ != null) {
        return clientinfoBuilder_.getMessageOrBuilder();
      } else {
        return clientinfo_ == null ?
            io.emqx.exhook.ClientInfo.getDefaultInstance() : clientinfo_;
      }
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.emqx.exhook.ClientInfo, io.emqx.exhook.ClientInfo.Builder, io.emqx.exhook.ClientInfoOrBuilder> 
        getClientinfoFieldBuilder() {
      if (clientinfoBuilder_ == null) {
        clientinfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.emqx.exhook.ClientInfo, io.emqx.exhook.ClientInfo.Builder, io.emqx.exhook.ClientInfoOrBuilder>(
                getClientinfo(),
                getParentForChildren(),
                isClean());
        clientinfo_ = null;
      }
      return clientinfoBuilder_;
    }

    private java.lang.Object topic_ = "";
    /**
     * <code>string topic = 2;</code>
     * @return The topic.
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string topic = 2;</code>
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string topic = 2;</code>
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopic() {
      
      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 2;</code>
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topic_ = value;
      onChanged();
      return this;
    }

    private io.emqx.exhook.SubOpts subopts_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.emqx.exhook.SubOpts, io.emqx.exhook.SubOpts.Builder, io.emqx.exhook.SubOptsOrBuilder> suboptsBuilder_;
    /**
     * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
     * @return Whether the subopts field is set.
     */
    public boolean hasSubopts() {
      return suboptsBuilder_ != null || subopts_ != null;
    }
    /**
     * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
     * @return The subopts.
     */
    public io.emqx.exhook.SubOpts getSubopts() {
      if (suboptsBuilder_ == null) {
        return subopts_ == null ? io.emqx.exhook.SubOpts.getDefaultInstance() : subopts_;
      } else {
        return suboptsBuilder_.getMessage();
      }
    }
    /**
     * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
     */
    public Builder setSubopts(io.emqx.exhook.SubOpts value) {
      if (suboptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subopts_ = value;
        onChanged();
      } else {
        suboptsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
     */
    public Builder setSubopts(
        io.emqx.exhook.SubOpts.Builder builderForValue) {
      if (suboptsBuilder_ == null) {
        subopts_ = builderForValue.build();
        onChanged();
      } else {
        suboptsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
     */
    public Builder mergeSubopts(io.emqx.exhook.SubOpts value) {
      if (suboptsBuilder_ == null) {
        if (subopts_ != null) {
          subopts_ =
            io.emqx.exhook.SubOpts.newBuilder(subopts_).mergeFrom(value).buildPartial();
        } else {
          subopts_ = value;
        }
        onChanged();
      } else {
        suboptsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
     */
    public Builder clearSubopts() {
      if (suboptsBuilder_ == null) {
        subopts_ = null;
        onChanged();
      } else {
        subopts_ = null;
        suboptsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
     */
    public io.emqx.exhook.SubOpts.Builder getSuboptsBuilder() {
      
      onChanged();
      return getSuboptsFieldBuilder().getBuilder();
    }
    /**
     * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
     */
    public io.emqx.exhook.SubOptsOrBuilder getSuboptsOrBuilder() {
      if (suboptsBuilder_ != null) {
        return suboptsBuilder_.getMessageOrBuilder();
      } else {
        return subopts_ == null ?
            io.emqx.exhook.SubOpts.getDefaultInstance() : subopts_;
      }
    }
    /**
     * <code>.emqx.exhook.v2.SubOpts subopts = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.emqx.exhook.SubOpts, io.emqx.exhook.SubOpts.Builder, io.emqx.exhook.SubOptsOrBuilder> 
        getSuboptsFieldBuilder() {
      if (suboptsBuilder_ == null) {
        suboptsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.emqx.exhook.SubOpts, io.emqx.exhook.SubOpts.Builder, io.emqx.exhook.SubOptsOrBuilder>(
                getSubopts(),
                getParentForChildren(),
                isClean());
        subopts_ = null;
      }
      return suboptsBuilder_;
    }

    private io.emqx.exhook.RequestMeta meta_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.emqx.exhook.RequestMeta, io.emqx.exhook.RequestMeta.Builder, io.emqx.exhook.RequestMetaOrBuilder> metaBuilder_;
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
     * @return Whether the meta field is set.
     */
    public boolean hasMeta() {
      return metaBuilder_ != null || meta_ != null;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
     * @return The meta.
     */
    public io.emqx.exhook.RequestMeta getMeta() {
      if (metaBuilder_ == null) {
        return meta_ == null ? io.emqx.exhook.RequestMeta.getDefaultInstance() : meta_;
      } else {
        return metaBuilder_.getMessage();
      }
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
     */
    public Builder setMeta(io.emqx.exhook.RequestMeta value) {
      if (metaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        meta_ = value;
        onChanged();
      } else {
        metaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
     */
    public Builder setMeta(
        io.emqx.exhook.RequestMeta.Builder builderForValue) {
      if (metaBuilder_ == null) {
        meta_ = builderForValue.build();
        onChanged();
      } else {
        metaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
     */
    public Builder mergeMeta(io.emqx.exhook.RequestMeta value) {
      if (metaBuilder_ == null) {
        if (meta_ != null) {
          meta_ =
            io.emqx.exhook.RequestMeta.newBuilder(meta_).mergeFrom(value).buildPartial();
        } else {
          meta_ = value;
        }
        onChanged();
      } else {
        metaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
     */
    public Builder clearMeta() {
      if (metaBuilder_ == null) {
        meta_ = null;
        onChanged();
      } else {
        meta_ = null;
        metaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
     */
    public io.emqx.exhook.RequestMeta.Builder getMetaBuilder() {
      
      onChanged();
      return getMetaFieldBuilder().getBuilder();
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
     */
    public io.emqx.exhook.RequestMetaOrBuilder getMetaOrBuilder() {
      if (metaBuilder_ != null) {
        return metaBuilder_.getMessageOrBuilder();
      } else {
        return meta_ == null ?
            io.emqx.exhook.RequestMeta.getDefaultInstance() : meta_;
      }
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.emqx.exhook.RequestMeta, io.emqx.exhook.RequestMeta.Builder, io.emqx.exhook.RequestMetaOrBuilder> 
        getMetaFieldBuilder() {
      if (metaBuilder_ == null) {
        metaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.emqx.exhook.RequestMeta, io.emqx.exhook.RequestMeta.Builder, io.emqx.exhook.RequestMetaOrBuilder>(
                getMeta(),
                getParentForChildren(),
                isClean());
        meta_ = null;
      }
      return metaBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:emqx.exhook.v2.SessionSubscribedRequest)
  }

  // @@protoc_insertion_point(class_scope:emqx.exhook.v2.SessionSubscribedRequest)
  private static final io.emqx.exhook.SessionSubscribedRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.emqx.exhook.SessionSubscribedRequest();
  }

  public static io.emqx.exhook.SessionSubscribedRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SessionSubscribedRequest>
      PARSER = new com.google.protobuf.AbstractParser<SessionSubscribedRequest>() {
    @java.lang.Override
    public SessionSubscribedRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SessionSubscribedRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SessionSubscribedRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SessionSubscribedRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.emqx.exhook.SessionSubscribedRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

