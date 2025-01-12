package org.omg.CORBA;


/**
* org/omg/CORBA/_ContainerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


// orbos 98-01-18: Objects By Value -- end
public class _ContainerStub extends org.omg.CORBA.portable.ObjectImpl implements org.omg.CORBA.Container
{


  // read interface
  public org.omg.CORBA.Contained lookup (String search_name)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("lookup", true);
                org.omg.CORBA.ScopedNameHelper.write ($out, search_name);
                $in = _invoke ($out);
                org.omg.CORBA.Contained $result = org.omg.CORBA.ContainedHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return lookup (search_name        );
            } finally {
                _releaseReply ($in);
            }
  } // lookup

  public org.omg.CORBA.Contained[] contents (org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("contents", true);
                org.omg.CORBA.DefinitionKindHelper.write ($out, limit_type);
                $out.write_boolean (exclude_inherited);
                $in = _invoke ($out);
                org.omg.CORBA.Contained $result[] = org.omg.CORBA.ContainedSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return contents (limit_type, exclude_inherited        );
            } finally {
                _releaseReply ($in);
            }
  } // contents

  public org.omg.CORBA.Contained[] lookup_name (String search_name, int levels_to_search, org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("lookup_name", true);
                org.omg.CORBA.IdentifierHelper.write ($out, search_name);
                $out.write_long (levels_to_search);
                org.omg.CORBA.DefinitionKindHelper.write ($out, limit_type);
                $out.write_boolean (exclude_inherited);
                $in = _invoke ($out);
                org.omg.CORBA.Contained $result[] = org.omg.CORBA.ContainedSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return lookup_name (search_name, levels_to_search, limit_type, exclude_inherited        );
            } finally {
                _releaseReply ($in);
            }
  } // lookup_name

  public org.omg.CORBA.ContainerPackage.Description[] describe_contents (org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited, int max_returned_objs)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("describe_contents", true);
                org.omg.CORBA.DefinitionKindHelper.write ($out, limit_type);
                $out.write_boolean (exclude_inherited);
                $out.write_long (max_returned_objs);
                $in = _invoke ($out);
                org.omg.CORBA.ContainerPackage.Description $result[] = org.omg.CORBA.ContainerPackage.DescriptionSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return describe_contents (limit_type, exclude_inherited, max_returned_objs        );
            } finally {
                _releaseReply ($in);
            }
  } // describe_contents


  // write interface
  public org.omg.CORBA.ModuleDef create_module (String id, String name, String version)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_module", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                $in = _invoke ($out);
                org.omg.CORBA.ModuleDef $result = org.omg.CORBA.ModuleDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_module (id, name, version        );
            } finally {
                _releaseReply ($in);
            }
  } // create_module

  public org.omg.CORBA.ConstantDef create_constant (String id, String name, String version, org.omg.CORBA.IDLType type, org.omg.CORBA.Any value)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_constant", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                org.omg.CORBA.IDLTypeHelper.write ($out, type);
                $out.write_any (value);
                $in = _invoke ($out);
                org.omg.CORBA.ConstantDef $result = org.omg.CORBA.ConstantDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_constant (id, name, version, type, value        );
            } finally {
                _releaseReply ($in);
            }
  } // create_constant

  public org.omg.CORBA.StructDef create_struct (String id, String name, String version, org.omg.CORBA.StructMember[] members)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_struct", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                org.omg.CORBA.StructMemberSeqHelper.write ($out, members);
                $in = _invoke ($out);
                org.omg.CORBA.StructDef $result = org.omg.CORBA.StructDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_struct (id, name, version, members        );
            } finally {
                _releaseReply ($in);
            }
  } // create_struct

  public org.omg.CORBA.UnionDef create_union (String id, String name, String version, org.omg.CORBA.IDLType discriminator_type, org.omg.CORBA.UnionMember[] members)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_union", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                org.omg.CORBA.IDLTypeHelper.write ($out, discriminator_type);
                org.omg.CORBA.UnionMemberSeqHelper.write ($out, members);
                $in = _invoke ($out);
                org.omg.CORBA.UnionDef $result = org.omg.CORBA.UnionDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_union (id, name, version, discriminator_type, members        );
            } finally {
                _releaseReply ($in);
            }
  } // create_union

  public org.omg.CORBA.EnumDef create_enum (String id, String name, String version, String[] members)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_enum", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                org.omg.CORBA.EnumMemberSeqHelper.write ($out, members);
                $in = _invoke ($out);
                org.omg.CORBA.EnumDef $result = org.omg.CORBA.EnumDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_enum (id, name, version, members        );
            } finally {
                _releaseReply ($in);
            }
  } // create_enum

  public org.omg.CORBA.AliasDef create_alias (String id, String name, String version, org.omg.CORBA.IDLType original_type)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_alias", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                org.omg.CORBA.IDLTypeHelper.write ($out, original_type);
                $in = _invoke ($out);
                org.omg.CORBA.AliasDef $result = org.omg.CORBA.AliasDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_alias (id, name, version, original_type        );
            } finally {
                _releaseReply ($in);
            }
  } // create_alias

  public org.omg.CORBA.ExceptionDef create_exception (String id, String name, String version, org.omg.CORBA.StructMember[] members)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_exception", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                org.omg.CORBA.StructMemberSeqHelper.write ($out, members);
                $in = _invoke ($out);
                org.omg.CORBA.ExceptionDef $result = org.omg.CORBA.ExceptionDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_exception (id, name, version, members        );
            } finally {
                _releaseReply ($in);
            }
  } // create_exception

  public org.omg.CORBA.InterfaceDef create_interface (String id, String name, String version, boolean is_abstract, org.omg.CORBA.InterfaceDef[] base_interfaces)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_interface", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                $out.write_boolean (is_abstract);
                org.omg.CORBA.InterfaceDefSeqHelper.write ($out, base_interfaces);
                $in = _invoke ($out);
                org.omg.CORBA.InterfaceDef $result = org.omg.CORBA.InterfaceDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_interface (id, name, version, is_abstract, base_interfaces        );
            } finally {
                _releaseReply ($in);
            }
  } // create_interface


  // orbos 98-01-18: Objects By Value
  public org.omg.CORBA.ValueDef create_value (String id, String name, String version, boolean is_custom, boolean is_abstract, byte flags, org.omg.CORBA.ValueDef base_value, boolean has_safe_base, org.omg.CORBA.ValueDef[] abstract_base_values, org.omg.CORBA.InterfaceDef[] supported_interfaces, org.omg.CORBA.Initializer[] initializers)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_value", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                $out.write_boolean (is_custom);
                $out.write_boolean (is_abstract);
                $out.write_octet (flags);
                org.omg.CORBA.ValueDefHelper.write ($out, base_value);
                $out.write_boolean (has_safe_base);
                org.omg.CORBA.ValueDefSeqHelper.write ($out, abstract_base_values);
                org.omg.CORBA.InterfaceDefSeqHelper.write ($out, supported_interfaces);
                org.omg.CORBA.InitializerSeqHelper.write ($out, initializers);
                $in = _invoke ($out);
                org.omg.CORBA.ValueDef $result = org.omg.CORBA.ValueDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_value (id, name, version, is_custom, is_abstract, flags, base_value, has_safe_base, abstract_base_values, supported_interfaces, initializers        );
            } finally {
                _releaseReply ($in);
            }
  } // create_value


  // orbos 98-01-18: Objects By Value
  public org.omg.CORBA.ValueBoxDef create_value_box (String id, String name, String version, org.omg.CORBA.IDLType original_type_def)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_value_box", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                org.omg.CORBA.IDLTypeHelper.write ($out, original_type_def);
                $in = _invoke ($out);
                org.omg.CORBA.ValueBoxDef $result = org.omg.CORBA.ValueBoxDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_value_box (id, name, version, original_type_def        );
            } finally {
                _releaseReply ($in);
            }
  } // create_value_box

  public org.omg.CORBA.NativeDef create_native (String id, String name, String version)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_native", true);
                org.omg.CORBA.RepositoryIdHelper.write ($out, id);
                org.omg.CORBA.IdentifierHelper.write ($out, name);
                org.omg.CORBA.VersionSpecHelper.write ($out, version);
                $in = _invoke ($out);
                org.omg.CORBA.NativeDef $result = org.omg.CORBA.NativeDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_native (id, name, version        );
            } finally {
                _releaseReply ($in);
            }
  } // create_native


  // read interface
  public org.omg.CORBA.DefinitionKind def_kind ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_def_kind", true);
                $in = _invoke ($out);
                org.omg.CORBA.DefinitionKind $result = org.omg.CORBA.DefinitionKindHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return def_kind (        );
            } finally {
                _releaseReply ($in);
            }
  } // def_kind


  // write interface
  public void destroy ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CORBA/Container:1.0", 
    "IDL:CORBA/IRObject:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ContainerStub
