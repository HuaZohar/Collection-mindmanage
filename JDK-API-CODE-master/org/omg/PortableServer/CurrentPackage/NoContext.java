package org.omg.PortableServer.CurrentPackage;


/**
* org/omg/PortableServer/CurrentPackage/NoContext.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableServer/poa.idl
* Friday, March 1, 2013 3:32:42 AM PST
*/

public final class NoContext extends org.omg.CORBA.UserException
{

  public NoContext ()
  {
    super(NoContextHelper.id());
  } // ctor


  public NoContext (String $reason)
  {
    super(NoContextHelper.id() + "  " + $reason);
  } // ctor

} // class NoContext
