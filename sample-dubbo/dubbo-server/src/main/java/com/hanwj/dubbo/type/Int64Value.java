// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wrappers.proto

package com.hanwj.dubbo.type;

/**
 * <pre>
 * Wrapper message for `int64`.
 * The JSON representation for `Int64Value` is JSON string.
 * </pre>
 *
 * Protobuf type {@code com.hanwj.dubbo.type.Int64Value}
 */
public  final class Int64Value extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.hanwj.dubbo.type.Int64Value)
    Int64ValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Int64Value.newBuilder() to construct.
  private Int64Value(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Int64Value() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Int64Value();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Int64Value(
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

            value_ = input.readInt64();
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
    return com.hanwj.dubbo.type.WrappersProto.internal_static_com_hanwj_dubbo_type_Int64Value_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hanwj.dubbo.type.WrappersProto.internal_static_com_hanwj_dubbo_type_Int64Value_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hanwj.dubbo.type.Int64Value.class, com.hanwj.dubbo.type.Int64Value.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private long value_;
  /**
   * <pre>
   * The int64 value.
   * </pre>
   *
   * <code>int64 value = 1;</code>
   * @return The value.
   */
  public long getValue() {
    return value_;
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
    if (value_ != 0L) {
      output.writeInt64(1, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, value_);
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
    if (!(obj instanceof com.hanwj.dubbo.type.Int64Value)) {
      return super.equals(obj);
    }
    com.hanwj.dubbo.type.Int64Value other = (com.hanwj.dubbo.type.Int64Value) obj;

    if (getValue()
        != other.getValue()) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hanwj.dubbo.type.Int64Value parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hanwj.dubbo.type.Int64Value parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hanwj.dubbo.type.Int64Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hanwj.dubbo.type.Int64Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hanwj.dubbo.type.Int64Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hanwj.dubbo.type.Int64Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hanwj.dubbo.type.Int64Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hanwj.dubbo.type.Int64Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hanwj.dubbo.type.Int64Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hanwj.dubbo.type.Int64Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hanwj.dubbo.type.Int64Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hanwj.dubbo.type.Int64Value parseFrom(
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
  public static Builder newBuilder(com.hanwj.dubbo.type.Int64Value prototype) {
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
   * <pre>
   * Wrapper message for `int64`.
   * The JSON representation for `Int64Value` is JSON string.
   * </pre>
   *
   * Protobuf type {@code com.hanwj.dubbo.type.Int64Value}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hanwj.dubbo.type.Int64Value)
      com.hanwj.dubbo.type.Int64ValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hanwj.dubbo.type.WrappersProto.internal_static_com_hanwj_dubbo_type_Int64Value_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hanwj.dubbo.type.WrappersProto.internal_static_com_hanwj_dubbo_type_Int64Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hanwj.dubbo.type.Int64Value.class, com.hanwj.dubbo.type.Int64Value.Builder.class);
    }

    // Construct using com.hanwj.dubbo.type.Int64Value.newBuilder()
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
      value_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hanwj.dubbo.type.WrappersProto.internal_static_com_hanwj_dubbo_type_Int64Value_descriptor;
    }

    @java.lang.Override
    public com.hanwj.dubbo.type.Int64Value getDefaultInstanceForType() {
      return com.hanwj.dubbo.type.Int64Value.getDefaultInstance();
    }

    @java.lang.Override
    public com.hanwj.dubbo.type.Int64Value build() {
      com.hanwj.dubbo.type.Int64Value result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hanwj.dubbo.type.Int64Value buildPartial() {
      com.hanwj.dubbo.type.Int64Value result = new com.hanwj.dubbo.type.Int64Value(this);
      result.value_ = value_;
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
      if (other instanceof com.hanwj.dubbo.type.Int64Value) {
        return mergeFrom((com.hanwj.dubbo.type.Int64Value)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hanwj.dubbo.type.Int64Value other) {
      if (other == com.hanwj.dubbo.type.Int64Value.getDefaultInstance()) return this;
      if (other.getValue() != 0L) {
        setValue(other.getValue());
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
      com.hanwj.dubbo.type.Int64Value parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hanwj.dubbo.type.Int64Value) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long value_ ;
    /**
     * <pre>
     * The int64 value.
     * </pre>
     *
     * <code>int64 value = 1;</code>
     * @return The value.
     */
    public long getValue() {
      return value_;
    }
    /**
     * <pre>
     * The int64 value.
     * </pre>
     *
     * <code>int64 value = 1;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The int64 value.
     * </pre>
     *
     * <code>int64 value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.hanwj.dubbo.type.Int64Value)
  }

  // @@protoc_insertion_point(class_scope:com.hanwj.dubbo.type.Int64Value)
  private static final com.hanwj.dubbo.type.Int64Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hanwj.dubbo.type.Int64Value();
  }

  public static com.hanwj.dubbo.type.Int64Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Int64Value>
      PARSER = new com.google.protobuf.AbstractParser<Int64Value>() {
    @java.lang.Override
    public Int64Value parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Int64Value(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Int64Value> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Int64Value> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hanwj.dubbo.type.Int64Value getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

