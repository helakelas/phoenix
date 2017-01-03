// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PSchema.proto
package org.apache.phoenix.coprocessor.generated;

public final class PSchemaProtos {

  private PSchemaProtos() {
  }

  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistry registry) {
  }

  public interface PSchemaOrBuilder
          extends com.google.protobuf.MessageOrBuilder {

    // required string schemaName = 1;
    /**
     * <code>required string schemaName = 1;</code>
     */
    boolean hasSchemaName();

    /**
     * <code>required string schemaName = 1;</code>
     */
    java.lang.String getSchemaName();

    /**
     * <code>required string schemaName = 1;</code>
     */
    com.google.protobuf.ByteString
            getSchemaNameBytes();

    // required int64 timeStamp = 2;
    /**
     * <code>required int64 timeStamp = 2;</code>
     */
    boolean hasTimeStamp();

    /**
     * <code>required int64 timeStamp = 2;</code>
     */
    long getTimeStamp();
  }

  /**
   * Protobuf type {@code PSchema}
   */
  public static final class PSchema extends
          com.google.protobuf.GeneratedMessage
          implements PSchemaOrBuilder {

    // Use PSchema.newBuilder() to construct.
    private PSchema(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private PSchema(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final PSchema defaultInstance;

    public static PSchema getDefaultInstance() {
      return defaultInstance;
    }

    public PSchema getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
      return this.unknownFields;
    }

    private PSchema(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields
              = com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                      extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              schemaName_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              timeStamp_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
      return org.apache.phoenix.coprocessor.generated.PSchemaProtos.internal_static_PSchema_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
      return org.apache.phoenix.coprocessor.generated.PSchemaProtos.internal_static_PSchema_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema.class, org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema.Builder.class);
    }

    public static com.google.protobuf.Parser<PSchema> PARSER
            = new com.google.protobuf.AbstractParser<PSchema>() {
      public PSchema parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new PSchema(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PSchema> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string schemaName = 1;
    public static final int SCHEMANAME_FIELD_NUMBER = 1;
    private java.lang.Object schemaName_;

    /**
     * <code>required string schemaName = 1;</code>
     */
    public boolean hasSchemaName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required string schemaName = 1;</code>
     */
    public java.lang.String getSchemaName() {
      java.lang.Object ref = schemaName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs
                = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          schemaName_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string schemaName = 1;</code>
     */
    public com.google.protobuf.ByteString
            getSchemaNameBytes() {
      java.lang.Object ref = schemaName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b
                = com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        schemaName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int64 timeStamp = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private long timeStamp_;

    /**
     * <code>required int64 timeStamp = 2;</code>
     */
    public boolean hasTimeStamp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required int64 timeStamp = 2;</code>
     */
    public long getTimeStamp() {
      return timeStamp_;
    }

    private void initFields() {
      schemaName_ = "";
      timeStamp_ = 0L;
    }
    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) {
        return isInitialized == 1;
      }

      if (!hasSchemaName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTimeStamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getSchemaNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, timeStamp_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) {
        return size;
      }

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
                .computeBytesSize(1, getSchemaNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
                .computeInt64Size(2, timeStamp_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace()
            throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema)) {
        return super.equals(obj);
      }
      org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema other = (org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema) obj;

      boolean result = true;
      result = result && (hasSchemaName() == other.hasSchemaName());
      if (hasSchemaName()) {
        result = result && getSchemaName()
                .equals(other.getSchemaName());
      }
      result = result && (hasTimeStamp() == other.hasTimeStamp());
      if (hasTimeStamp()) {
        result = result && (getTimeStamp()
                == other.getTimeStamp());
      }
      result = result
              && getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasSchemaName()) {
        hash = (37 * hash) + SCHEMANAME_FIELD_NUMBER;
        hash = (53 * hash) + getSchemaName().hashCode();
      }
      if (hasTimeStamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getTimeStamp());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code PSchema}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchemaOrBuilder {

      public static final com.google.protobuf.Descriptors.Descriptor
              getDescriptor() {
        return org.apache.phoenix.coprocessor.generated.PSchemaProtos.internal_static_PSchema_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
              internalGetFieldAccessorTable() {
        return org.apache.phoenix.coprocessor.generated.PSchemaProtos.internal_static_PSchema_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema.class, org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema.Builder.class);
      }

      // Construct using org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
              com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        schemaName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        timeStamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
              getDescriptorForType() {
        return org.apache.phoenix.coprocessor.generated.PSchemaProtos.internal_static_PSchema_descriptor;
      }

      public org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema getDefaultInstanceForType() {
        return org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema.getDefaultInstance();
      }

      public org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema build() {
        org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema buildPartial() {
        org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema result = new org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.schemaName_ = schemaName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.timeStamp_ = timeStamp_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema) {
          return mergeFrom((org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema other) {
        if (other == org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema.getDefaultInstance()) {
          return this;
        }
        if (other.hasSchemaName()) {
          bitField0_ |= 0x00000001;
          schemaName_ = other.schemaName_;
          onChanged();
        }
        if (other.hasTimeStamp()) {
          setTimeStamp(other.getTimeStamp());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSchemaName()) {

          return false;
        }
        if (!hasTimeStamp()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.phoenix.coprocessor.generated.PSchemaProtos.PSchema) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string schemaName = 1;
      private java.lang.Object schemaName_ = "";

      /**
       * <code>required string schemaName = 1;</code>
       */
      public boolean hasSchemaName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string schemaName = 1;</code>
       */
      public java.lang.String getSchemaName() {
        java.lang.Object ref = schemaName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
                  .toStringUtf8();
          schemaName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string schemaName = 1;</code>
       */
      public com.google.protobuf.ByteString
              getSchemaNameBytes() {
        java.lang.Object ref = schemaName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b
                  = com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          schemaName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string schemaName = 1;</code>
       */
      public Builder setSchemaName(
              java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        schemaName_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string schemaName = 1;</code>
       */
      public Builder clearSchemaName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        schemaName_ = getDefaultInstance().getSchemaName();
        onChanged();
        return this;
      }

      /**
       * <code>required string schemaName = 1;</code>
       */
      public Builder setSchemaNameBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        schemaName_ = value;
        onChanged();
        return this;
      }

      // required int64 timeStamp = 2;
      private long timeStamp_;

      /**
       * <code>required int64 timeStamp = 2;</code>
       */
      public boolean hasTimeStamp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required int64 timeStamp = 2;</code>
       */
      public long getTimeStamp() {
        return timeStamp_;
      }

      /**
       * <code>required int64 timeStamp = 2;</code>
       */
      public Builder setTimeStamp(long value) {
        bitField0_ |= 0x00000002;
        timeStamp_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 timeStamp = 2;</code>
       */
      public Builder clearTimeStamp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        timeStamp_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PSchema)
    }

    static {
      defaultInstance = new PSchema(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PSchema)
  }

  private static com.google.protobuf.Descriptors.Descriptor internal_static_PSchema_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_PSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
          getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\rPSchema.proto\"0\n\007PSchema\022\022\n\nschemaName"
      + "\030\001 \002(\t\022\021\n\ttimeStamp\030\002 \002(\003BA\n(org.apache."
      + "phoenix.coprocessor.generatedB\rPSchemaPr"
      + "otosH\001\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner
            = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        internal_static_PSchema_descriptor
                = getDescriptor().getMessageTypes().get(0);
        internal_static_PSchema_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_PSchema_descriptor,
                new java.lang.String[]{"SchemaName", "TimeStamp",});
        return null;
      }
    };
    com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                    new com.google.protobuf.Descriptors.FileDescriptor[]{}, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
