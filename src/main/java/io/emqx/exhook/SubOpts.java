// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package io.emqx.exhook;

/**
 * Protobuf type {@code emqx.exhook.v2.SubOpts}
 */
public final class SubOpts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:emqx.exhook.v2.SubOpts)
    SubOptsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubOpts.newBuilder() to construct.
  private SubOpts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubOpts() {
    share_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubOpts();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubOpts(
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
          case 8: {

            qos_ = input.readUInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            share_ = s;
            break;
          }
          case 24: {

            rh_ = input.readUInt32();
            break;
          }
          case 32: {

            rap_ = input.readUInt32();
            break;
          }
          case 40: {

            nl_ = input.readUInt32();
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
    return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_SubOpts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_SubOpts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.emqx.exhook.SubOpts.class, io.emqx.exhook.SubOpts.Builder.class);
  }

  public static final int QOS_FIELD_NUMBER = 1;
  private int qos_;
  /**
   * <pre>
   * The QoS level
   * </pre>
   *
   * <code>uint32 qos = 1;</code>
   * @return The qos.
   */
  @java.lang.Override
  public int getQos() {
    return qos_;
  }

  public static final int SHARE_FIELD_NUMBER = 2;
  private volatile java.lang.Object share_;
  /**
   * <pre>
   * The group name for shared subscription
   * </pre>
   *
   * <code>string share = 2;</code>
   * @return The share.
   */
  @java.lang.Override
  public java.lang.String getShare() {
    java.lang.Object ref = share_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      share_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The group name for shared subscription
   * </pre>
   *
   * <code>string share = 2;</code>
   * @return The bytes for share.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShareBytes() {
    java.lang.Object ref = share_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      share_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RH_FIELD_NUMBER = 3;
  private int rh_;
  /**
   * <pre>
   * The Retain Handling option (MQTT v5.0)
   *  0 = Send retained messages at the time of the subscribe
   *  1 = Send retained messages at subscribe only if the subscription does
   *       not currently exist
   *  2 = Do not send retained messages at the time of the subscribe
   * </pre>
   *
   * <code>uint32 rh = 3;</code>
   * @return The rh.
   */
  @java.lang.Override
  public int getRh() {
    return rh_;
  }

  public static final int RAP_FIELD_NUMBER = 4;
  private int rap_;
  /**
   * <pre>
   * The Retain as Published option (MQTT v5.0)
   *  If 1, Application Messages forwarded using this subscription keep the
   *        RETAIN flag they were published with.
   *  If 0, Application Messages forwarded using this subscription have the
   *        RETAIN flag set to 0.
   * Retained messages sent when the subscription is established have the RETAIN flag set to 1.
   * </pre>
   *
   * <code>uint32 rap = 4;</code>
   * @return The rap.
   */
  @java.lang.Override
  public int getRap() {
    return rap_;
  }

  public static final int NL_FIELD_NUMBER = 5;
  private int nl_;
  /**
   * <pre>
   * The No Local option (MQTT v5.0)
   * If the value is 1, Application Messages MUST NOT be forwarded to a
   * connection with a ClientID equal to the ClientID of the publishing
   * </pre>
   *
   * <code>uint32 nl = 5;</code>
   * @return The nl.
   */
  @java.lang.Override
  public int getNl() {
    return nl_;
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
    if (qos_ != 0) {
      output.writeUInt32(1, qos_);
    }
    if (!getShareBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, share_);
    }
    if (rh_ != 0) {
      output.writeUInt32(3, rh_);
    }
    if (rap_ != 0) {
      output.writeUInt32(4, rap_);
    }
    if (nl_ != 0) {
      output.writeUInt32(5, nl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (qos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, qos_);
    }
    if (!getShareBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, share_);
    }
    if (rh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, rh_);
    }
    if (rap_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, rap_);
    }
    if (nl_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, nl_);
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
    if (!(obj instanceof io.emqx.exhook.SubOpts)) {
      return super.equals(obj);
    }
    io.emqx.exhook.SubOpts other = (io.emqx.exhook.SubOpts) obj;

    if (getQos()
        != other.getQos()) return false;
    if (!getShare()
        .equals(other.getShare())) return false;
    if (getRh()
        != other.getRh()) return false;
    if (getRap()
        != other.getRap()) return false;
    if (getNl()
        != other.getNl()) return false;
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
    hash = (37 * hash) + QOS_FIELD_NUMBER;
    hash = (53 * hash) + getQos();
    hash = (37 * hash) + SHARE_FIELD_NUMBER;
    hash = (53 * hash) + getShare().hashCode();
    hash = (37 * hash) + RH_FIELD_NUMBER;
    hash = (53 * hash) + getRh();
    hash = (37 * hash) + RAP_FIELD_NUMBER;
    hash = (53 * hash) + getRap();
    hash = (37 * hash) + NL_FIELD_NUMBER;
    hash = (53 * hash) + getNl();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.emqx.exhook.SubOpts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.SubOpts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.SubOpts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.SubOpts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.SubOpts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.SubOpts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.SubOpts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.SubOpts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.emqx.exhook.SubOpts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.SubOpts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.emqx.exhook.SubOpts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.SubOpts parseFrom(
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
  public static Builder newBuilder(io.emqx.exhook.SubOpts prototype) {
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
   * Protobuf type {@code emqx.exhook.v2.SubOpts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:emqx.exhook.v2.SubOpts)
      io.emqx.exhook.SubOptsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_SubOpts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_SubOpts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.emqx.exhook.SubOpts.class, io.emqx.exhook.SubOpts.Builder.class);
    }

    // Construct using io.emqx.exhook.SubOpts.newBuilder()
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
      qos_ = 0;

      share_ = "";

      rh_ = 0;

      rap_ = 0;

      nl_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v2_SubOpts_descriptor;
    }

    @java.lang.Override
    public io.emqx.exhook.SubOpts getDefaultInstanceForType() {
      return io.emqx.exhook.SubOpts.getDefaultInstance();
    }

    @java.lang.Override
    public io.emqx.exhook.SubOpts build() {
      io.emqx.exhook.SubOpts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.emqx.exhook.SubOpts buildPartial() {
      io.emqx.exhook.SubOpts result = new io.emqx.exhook.SubOpts(this);
      result.qos_ = qos_;
      result.share_ = share_;
      result.rh_ = rh_;
      result.rap_ = rap_;
      result.nl_ = nl_;
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
      if (other instanceof io.emqx.exhook.SubOpts) {
        return mergeFrom((io.emqx.exhook.SubOpts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.emqx.exhook.SubOpts other) {
      if (other == io.emqx.exhook.SubOpts.getDefaultInstance()) return this;
      if (other.getQos() != 0) {
        setQos(other.getQos());
      }
      if (!other.getShare().isEmpty()) {
        share_ = other.share_;
        onChanged();
      }
      if (other.getRh() != 0) {
        setRh(other.getRh());
      }
      if (other.getRap() != 0) {
        setRap(other.getRap());
      }
      if (other.getNl() != 0) {
        setNl(other.getNl());
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
      io.emqx.exhook.SubOpts parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.emqx.exhook.SubOpts) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int qos_ ;
    /**
     * <pre>
     * The QoS level
     * </pre>
     *
     * <code>uint32 qos = 1;</code>
     * @return The qos.
     */
    @java.lang.Override
    public int getQos() {
      return qos_;
    }
    /**
     * <pre>
     * The QoS level
     * </pre>
     *
     * <code>uint32 qos = 1;</code>
     * @param value The qos to set.
     * @return This builder for chaining.
     */
    public Builder setQos(int value) {
      
      qos_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The QoS level
     * </pre>
     *
     * <code>uint32 qos = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQos() {
      
      qos_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object share_ = "";
    /**
     * <pre>
     * The group name for shared subscription
     * </pre>
     *
     * <code>string share = 2;</code>
     * @return The share.
     */
    public java.lang.String getShare() {
      java.lang.Object ref = share_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        share_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The group name for shared subscription
     * </pre>
     *
     * <code>string share = 2;</code>
     * @return The bytes for share.
     */
    public com.google.protobuf.ByteString
        getShareBytes() {
      java.lang.Object ref = share_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        share_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The group name for shared subscription
     * </pre>
     *
     * <code>string share = 2;</code>
     * @param value The share to set.
     * @return This builder for chaining.
     */
    public Builder setShare(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      share_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The group name for shared subscription
     * </pre>
     *
     * <code>string share = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearShare() {
      
      share_ = getDefaultInstance().getShare();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The group name for shared subscription
     * </pre>
     *
     * <code>string share = 2;</code>
     * @param value The bytes for share to set.
     * @return This builder for chaining.
     */
    public Builder setShareBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      share_ = value;
      onChanged();
      return this;
    }

    private int rh_ ;
    /**
     * <pre>
     * The Retain Handling option (MQTT v5.0)
     *  0 = Send retained messages at the time of the subscribe
     *  1 = Send retained messages at subscribe only if the subscription does
     *       not currently exist
     *  2 = Do not send retained messages at the time of the subscribe
     * </pre>
     *
     * <code>uint32 rh = 3;</code>
     * @return The rh.
     */
    @java.lang.Override
    public int getRh() {
      return rh_;
    }
    /**
     * <pre>
     * The Retain Handling option (MQTT v5.0)
     *  0 = Send retained messages at the time of the subscribe
     *  1 = Send retained messages at subscribe only if the subscription does
     *       not currently exist
     *  2 = Do not send retained messages at the time of the subscribe
     * </pre>
     *
     * <code>uint32 rh = 3;</code>
     * @param value The rh to set.
     * @return This builder for chaining.
     */
    public Builder setRh(int value) {
      
      rh_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Retain Handling option (MQTT v5.0)
     *  0 = Send retained messages at the time of the subscribe
     *  1 = Send retained messages at subscribe only if the subscription does
     *       not currently exist
     *  2 = Do not send retained messages at the time of the subscribe
     * </pre>
     *
     * <code>uint32 rh = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRh() {
      
      rh_ = 0;
      onChanged();
      return this;
    }

    private int rap_ ;
    /**
     * <pre>
     * The Retain as Published option (MQTT v5.0)
     *  If 1, Application Messages forwarded using this subscription keep the
     *        RETAIN flag they were published with.
     *  If 0, Application Messages forwarded using this subscription have the
     *        RETAIN flag set to 0.
     * Retained messages sent when the subscription is established have the RETAIN flag set to 1.
     * </pre>
     *
     * <code>uint32 rap = 4;</code>
     * @return The rap.
     */
    @java.lang.Override
    public int getRap() {
      return rap_;
    }
    /**
     * <pre>
     * The Retain as Published option (MQTT v5.0)
     *  If 1, Application Messages forwarded using this subscription keep the
     *        RETAIN flag they were published with.
     *  If 0, Application Messages forwarded using this subscription have the
     *        RETAIN flag set to 0.
     * Retained messages sent when the subscription is established have the RETAIN flag set to 1.
     * </pre>
     *
     * <code>uint32 rap = 4;</code>
     * @param value The rap to set.
     * @return This builder for chaining.
     */
    public Builder setRap(int value) {
      
      rap_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Retain as Published option (MQTT v5.0)
     *  If 1, Application Messages forwarded using this subscription keep the
     *        RETAIN flag they were published with.
     *  If 0, Application Messages forwarded using this subscription have the
     *        RETAIN flag set to 0.
     * Retained messages sent when the subscription is established have the RETAIN flag set to 1.
     * </pre>
     *
     * <code>uint32 rap = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRap() {
      
      rap_ = 0;
      onChanged();
      return this;
    }

    private int nl_ ;
    /**
     * <pre>
     * The No Local option (MQTT v5.0)
     * If the value is 1, Application Messages MUST NOT be forwarded to a
     * connection with a ClientID equal to the ClientID of the publishing
     * </pre>
     *
     * <code>uint32 nl = 5;</code>
     * @return The nl.
     */
    @java.lang.Override
    public int getNl() {
      return nl_;
    }
    /**
     * <pre>
     * The No Local option (MQTT v5.0)
     * If the value is 1, Application Messages MUST NOT be forwarded to a
     * connection with a ClientID equal to the ClientID of the publishing
     * </pre>
     *
     * <code>uint32 nl = 5;</code>
     * @param value The nl to set.
     * @return This builder for chaining.
     */
    public Builder setNl(int value) {
      
      nl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The No Local option (MQTT v5.0)
     * If the value is 1, Application Messages MUST NOT be forwarded to a
     * connection with a ClientID equal to the ClientID of the publishing
     * </pre>
     *
     * <code>uint32 nl = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNl() {
      
      nl_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:emqx.exhook.v2.SubOpts)
  }

  // @@protoc_insertion_point(class_scope:emqx.exhook.v2.SubOpts)
  private static final io.emqx.exhook.SubOpts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.emqx.exhook.SubOpts();
  }

  public static io.emqx.exhook.SubOpts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubOpts>
      PARSER = new com.google.protobuf.AbstractParser<SubOpts>() {
    @java.lang.Override
    public SubOpts parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubOpts(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubOpts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubOpts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.emqx.exhook.SubOpts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

