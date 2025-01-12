package org.omg.CosTransactions;


/**
* org/omg/CosTransactions/SubtransactionAwareResourcePOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public class SubtransactionAwareResourcePOATie extends SubtransactionAwareResourcePOA
{

  // Constructors

  public SubtransactionAwareResourcePOATie ( org.omg.CosTransactions.SubtransactionAwareResourceOperations delegate ) {
      this._impl = delegate;
  }
  public SubtransactionAwareResourcePOATie ( org.omg.CosTransactions.SubtransactionAwareResourceOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public org.omg.CosTransactions.SubtransactionAwareResourceOperations _delegate() {
      return this._impl;
  }
  public void _delegate (org.omg.CosTransactions.SubtransactionAwareResourceOperations delegate ) {
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
  public void commit_subtransaction (org.omg.CosTransactions.Coordinator parent)
  {
    _impl.commit_subtransaction(parent);
  } // commit_subtransaction

  public void rollback_subtransaction ()
  {
    _impl.rollback_subtransaction();
  } // rollback_subtransaction

  public org.omg.CosTransactions.Vote prepare () throws org.omg.CosTransactions.HeuristicMixed, org.omg.CosTransactions.HeuristicHazard
  {
    return _impl.prepare();
  } // prepare

  public void rollback () throws org.omg.CosTransactions.HeuristicCommit, org.omg.CosTransactions.HeuristicMixed, org.omg.CosTransactions.HeuristicHazard
  {
    _impl.rollback();
  } // rollback

  public void commit () throws org.omg.CosTransactions.NotPrepared, org.omg.CosTransactions.HeuristicRollback, org.omg.CosTransactions.HeuristicMixed, org.omg.CosTransactions.HeuristicHazard
  {
    _impl.commit();
  } // commit

  public void commit_one_phase () throws org.omg.CosTransactions.HeuristicHazard
  {
    _impl.commit_one_phase();
  } // commit_one_phase

  public void forget ()
  {
    _impl.forget();
  } // forget

  private org.omg.CosTransactions.SubtransactionAwareResourceOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class SubtransactionAwareResourcePOATie