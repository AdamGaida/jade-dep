package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/AnySeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/DynamicAny.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class AnySeqHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.Any value[] = null;

  public AnySeqHolder ()
  {
  }

  public AnySeqHolder (org.omg.CORBA.Any[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.DynamicAny.AnySeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.DynamicAny.AnySeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.DynamicAny.AnySeqHelper.type ();
  }

}
