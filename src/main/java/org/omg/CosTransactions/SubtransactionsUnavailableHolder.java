package org.omg.CosTransactions;

/**
* org/omg/CosTransactions/SubtransactionsUnavailableHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class SubtransactionsUnavailableHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosTransactions.SubtransactionsUnavailable value = null;

  public SubtransactionsUnavailableHolder ()
  {
  }

  public SubtransactionsUnavailableHolder (org.omg.CosTransactions.SubtransactionsUnavailable initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosTransactions.SubtransactionsUnavailableHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosTransactions.SubtransactionsUnavailableHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosTransactions.SubtransactionsUnavailableHelper.type ();
  }

}