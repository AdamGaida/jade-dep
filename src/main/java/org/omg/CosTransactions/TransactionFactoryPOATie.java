package org.omg.CosTransactions;


/**
* org/omg/CosTransactions/TransactionFactoryPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public class TransactionFactoryPOATie extends TransactionFactoryPOA
{

  // Constructors

  public TransactionFactoryPOATie ( org.omg.CosTransactions.TransactionFactoryOperations delegate ) {
      this._impl = delegate;
  }
  public TransactionFactoryPOATie ( org.omg.CosTransactions.TransactionFactoryOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public org.omg.CosTransactions.TransactionFactoryOperations _delegate() {
      return this._impl;
  }
  public void _delegate (org.omg.CosTransactions.TransactionFactoryOperations delegate ) {
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
  public org.omg.CosTransactions.Control create (int time_out)
  {
    return _impl.create(time_out);
  } // create

  public org.omg.CosTransactions.Control recreate (org.omg.CosTransactions.PropagationContext ctx)
  {
    return _impl.recreate(ctx);
  } // recreate

  private org.omg.CosTransactions.TransactionFactoryOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class TransactionFactoryPOATie