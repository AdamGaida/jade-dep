package org.omg.CORBA;


/**
* org/omg/CORBA/RepositoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public interface RepositoryOperations  extends org.omg.CORBA.ContainerOperations
{

  // read interface
  org.omg.CORBA.Contained lookup_id (String search_id);
  org.omg.CORBA.PrimitiveDef get_primitive (org.omg.CORBA.PrimitiveKind kind);

  // write interface
  org.omg.CORBA.StringDef create_string (int bound);
  org.omg.CORBA.SequenceDef create_sequence (int bound, org.omg.CORBA.IDLType element_type);
  org.omg.CORBA.ArrayDef create_array (int length, org.omg.CORBA.IDLType element_type);
} // interface RepositoryOperations
