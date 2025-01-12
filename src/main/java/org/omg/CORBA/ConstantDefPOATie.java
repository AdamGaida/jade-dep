package org.omg.CORBA;


/**
* org/omg/CORBA/ConstantDefPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public class ConstantDefPOATie extends ConstantDefPOA
{

  // Constructors

  public ConstantDefPOATie ( org.omg.CORBA.ConstantDefOperations delegate ) {
      this._impl = delegate;
  }
  public ConstantDefPOATie ( org.omg.CORBA.ConstantDefOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public org.omg.CORBA.ConstantDefOperations _delegate() {
      return this._impl;
  }
  public void _delegate (org.omg.CORBA.ConstantDefOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public org.omg.CORBA.TypeCode type ()
  {
    return _impl.type();
  } // type

  public org.omg.CORBA.IDLType type_def ()
  {
    return _impl.type_def();
  } // type_def
  public void type_def (org.omg.CORBA.IDLType newType_def)
  {
    _impl.type_def(newType_def);
  } // type_def

  public org.omg.CORBA.Any value ()
  {
    return _impl.value();
  } // value
  public void value (org.omg.CORBA.Any newValue)
  {
    _impl.value(newValue);
  } // value


  // read/write interface
  public String id ()
  {
    return _impl.id();
  } // id

  // read/write interface
  public void id (String newId)
  {
    _impl.id(newId);
  } // id

  public String name ()
  {
    return _impl.name();
  } // name
  public void name (String newName)
  {
    _impl.name(newName);
  } // name

  public String version ()
  {
    return _impl.version();
  } // version
  public void version (String newVersion)
  {
    _impl.version(newVersion);
  } // version


  // read interface
  public org.omg.CORBA.Container defined_in ()
  {
    return _impl.defined_in();
  } // defined_in

  public String absolute_name ()
  {
    return _impl.absolute_name();
  } // absolute_name

  public org.omg.CORBA.Repository containing_repository ()
  {
    return _impl.containing_repository();
  } // containing_repository

  public org.omg.CORBA.ContainedPackage.Description describe ()
  {
    return _impl.describe();
  } // describe


  // write interface
  public void move (org.omg.CORBA.Container new_container, String new_name, String new_version)
  {
    _impl.move(new_container, new_name, new_version);
  } // move


  // read interface
  public org.omg.CORBA.DefinitionKind def_kind ()
  {
    return _impl.def_kind();
  } // def_kind


  // write interface
  public void destroy ()
  {
    _impl.destroy();
  } // destroy

  private org.omg.CORBA.ConstantDefOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class ConstantDefPOATie
