// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Persons.proto

package com.hanwj.dubbo.user;

public final class Persons {
  private Persons() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hanwj_dubbo_user_Staff_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hanwj_dubbo_user_Staff_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hanwj_dubbo_user_Staff_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hanwj_dubbo_user_Staff_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hanwj_dubbo_user_Staff_Map_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hanwj_dubbo_user_Staff_Map_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rPersons.proto\022\025com.hanwj.dubbo.user\"\266" +
      "\002\n\005Staff\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\013\n\003ag" +
      "e\030\003 \001(\005\0227\n\005phone\030\004 \003(\0132(.com.hanwj.dubb" +
      "o.user.Staff.PhoneNumber\022-\n\003map\030\005 \001(\0132 ." +
      "com.hanwj.dubbo.user.Staff.Map\032S\n\013Phone" +
      "Number\022\016\n\006number\030\001 \001(\t\0224\n\004type\030\002 \001(\0162&.c" +
      "om.hanwj.dubbo.user.Staff.PhoneType\032!\n\003" +
      "Map\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005\"&\n\tPhone" +
      "Type\022\n\n\006MOBILE\020\000\022\r\n\tTELEPHONE\020\001B/\n\025com.w" +
      "enjay.dubbo.userB\007PersonsP\001\330\001\001\242\002\007DEMOSRV" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_hanwj_dubbo_user_Staff_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hanwj_dubbo_user_Staff_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hanwj_dubbo_user_Staff_descriptor,
        new java.lang.String[] { "Id", "Name", "Age", "Phone", "Map", });
    internal_static_com_hanwj_dubbo_user_Staff_PhoneNumber_descriptor =
      internal_static_com_hanwj_dubbo_user_Staff_descriptor.getNestedTypes().get(0);
    internal_static_com_hanwj_dubbo_user_Staff_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hanwj_dubbo_user_Staff_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_com_hanwj_dubbo_user_Staff_Map_descriptor =
      internal_static_com_hanwj_dubbo_user_Staff_descriptor.getNestedTypes().get(1);
    internal_static_com_hanwj_dubbo_user_Staff_Map_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hanwj_dubbo_user_Staff_Map_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}