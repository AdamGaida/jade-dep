package org.omg.CORBA;


/**
* org/omg/CORBA/AttributeDefOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public interface AttributeDefOperations  extends org.omg.CORBA.ContainedOperations
{
  org.omg.CORBA.TypeCode type ();
  org.omg.CORBA.IDLType type_def ();
  void type_def (org.omg.CORBA.IDLType newType_def);
  org.omg.CORBA.AttributeMode mode ();
  void mode (org.omg.CORBA.AttributeMode newMode);
} // interface AttributeDefOperations
