// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package io.emqx.exhook;

/**
 * Protobuf type {@code emqx.exhook.v2.ProviderUnloadedRequest}
 */
public final class ProviderUnloadedRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:emqx.exhook.v2.ProviderUnloadedRequest)
    ProviderUnloadedRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProviderUnloadedRequest.newBuilder() to construct.
  private ProviderUnloadedRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProviderUnloadedRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProviderUnloadedRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProviderUnloadedRequest(
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
    return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_ProviderUnloadedRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_ProviderUnloadedRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.emqx.exhook.ProviderUnloadedRequest.class, io.emqx.exhook.ProviderUnloadedRequest.Builder.class);
  }

  public static final int META_FIELD_NUMBER = 1;
  private io.emqx.exhook.RequestMeta meta_;
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
   * @return Whether the meta field is set.
   */
  @java.lang.Override
  public boolean hasMeta() {
    return meta_ != null;
  }
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
   * @return The meta.
   */
  @java.lang.Override
  public io.emqx.exhook.RequestMeta getMeta() {
    return meta_ == null ? io.emqx.exhook.RequestMeta.getDefaultInstance() : meta_;
  }
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
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
    if (meta_ != null) {
      output.writeMessage(1, getMeta());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (meta_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMeta());
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
    if (!(obj instanceof io.emqx.exhook.ProviderUnloadedRequest)) {
      return super.equals(obj);
    }
    io.emqx.exhook.ProviderUnloadedRequest other = (io.emqx.exhook.ProviderUnloadedRequest) obj;

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
    if (hasMeta()) {
      hash = (37 * hash) + META_FIELD_NUMBER;
      hash = (53 * hash) + getMeta().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.emqx.exhook.ProviderUnloadedRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.ProviderUnloadedRequest parseFrom(
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
  public static Builder newBuilder(io.emqx.exhook.ProviderUnloadedRequest prototype) {
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
   * Protobuf type {@code emqx.exhook.v2.ProviderUnloadedRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:emqx.exhook.v2.ProviderUnloadedRequest)
      io.emqx.exhook.ProviderUnloadedRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_ProviderUnloadedRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_ProviderUnloadedRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.emqx.exhook.ProviderUnloadedRequest.class, io.emqx.exhook.ProviderUnloadedRequest.Builder.class);
    }

    // Construct using io.emqx.exhook.ProviderUnloadedRequest.newBuilder()
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
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_ProviderUnloadedRequest_descriptor;
    }

    @java.lang.Override
    public io.emqx.exhook.ProviderUnloadedRequest getDefaultInstanceForType() {
      return io.emqx.exhook.ProviderUnloadedRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.emqx.exhook.ProviderUnloadedRequest build() {
      io.emqx.exhook.ProviderUnloadedRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.emqx.exhook.ProviderUnloadedRequest buildPartial() {
      io.emqx.exhook.ProviderUnloadedRequest result = new io.emqx.exhook.ProviderUnloadedRequest(this);
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
      if (other instanceof io.emqx.exhook.ProviderUnloadedRequest) {
        return mergeFrom((io.emqx.exhook.ProviderUnloadedRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.emqx.exhook.ProviderUnloadedRequest other) {
      if (other == io.emqx.exhook.ProviderUnloadedRequest.getDefaultInstance()) return this;
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
      io.emqx.exhook.ProviderUnloadedRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.emqx.exhook.ProviderUnloadedRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.emqx.exhook.RequestMeta meta_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.emqx.exhook.RequestMeta, io.emqx.exhook.RequestMeta.Builder, io.emqx.exhook.RequestMetaOrBuilder> metaBuilder_;
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
     * @return Whether the meta field is set.
     */
    public boolean hasMeta() {
      return metaBuilder_ != null || meta_ != null;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
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
     * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
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
     * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
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
     * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
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
     * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
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
     * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
     */
    public io.emqx.exhook.RequestMeta.Builder getMetaBuilder() {
      
      onChanged();
      return getMetaFieldBuilder().getBuilder();
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
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
     * <code>.emqx.exhook.v2.RequestMeta meta = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:emqx.exhook.v2.ProviderUnloadedRequest)
  }

  // @@protoc_insertion_point(class_scope:emqx.exhook.v2.ProviderUnloadedRequest)
  private static final io.emqx.exhook.ProviderUnloadedRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.emqx.exhook.ProviderUnloadedRequest();
  }

  public static io.emqx.exhook.ProviderUnloadedRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProviderUnloadedRequest>
      PARSER = new com.google.protobuf.AbstractParser<ProviderUnloadedRequest>() {
    @java.lang.Override
    public ProviderUnloadedRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProviderUnloadedRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProviderUnloadedRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProviderUnloadedRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.emqx.exhook.ProviderUnloadedRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

