package org.omg.CORBA;


/**
* org/omg/CORBA/InterfaceDescription.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class InterfaceDescription implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String id = null;
  public String defined_in = null;
  public String version = null;
  public String base_interfaces[] = null;

  public InterfaceDescription ()
  {
  } // ctor

  public InterfaceDescription (String _name, String _id, String _defined_in, String _version, String[] _base_interfaces)
  {
    name = _name;
    id = _id;
    defined_in = _defined_in;
    version = _version;
    base_interfaces = _base_interfaces;
  } // ctor

} // class InterfaceDescription
