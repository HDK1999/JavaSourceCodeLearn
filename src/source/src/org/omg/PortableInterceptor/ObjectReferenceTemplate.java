package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ObjectReferenceTemplate.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u151/9699/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Tuesday, September 5, 2017 7:35:45 PM PDT
*/


/** The object reference template.  An instance of this must
   * exist for each object adapter created in an ORB.  The server_id,
   * orb_id, and adapter_name attributes uniquely identify this template
   * within the scope of an IMR.  Note that adapter_id is similarly unique
   * within the same scope, but it is opaque, and less useful in many
   * cases.
   */
public interface ObjectReferenceTemplate extends org.omg.PortableInterceptor.ObjectReferenceFactory
{
  public abstract String server_id ();

  public abstract String orb_id ();

  public abstract String[] adapter_name ();

} // interface ObjectReferenceTemplate
