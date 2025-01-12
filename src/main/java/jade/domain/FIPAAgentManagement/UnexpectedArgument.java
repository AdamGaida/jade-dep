/*****************************************************************
JADE - Java Agent DEvelopment Framework is a framework to develop
multi-agent systems in compliance with the FIPA specifications.
Copyright (C) 2000 CSELT S.p.A. 

GNU Lesser General Public License

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation, 
version 2.1 of the License. 

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the
Free Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA  02111-1307, USA.
*****************************************************************/


package jade.domain.FIPAAgentManagement;

import jade.content.Predicate;

/** 
* 
* @see jade.domain.FIPAAgentManagement.FIPAManagementOntology
* @author Fabio Bellifemine - CSELT S.p.A.
* @version $Date: 2003-03-10 16:38:45 +0100 (lu., 10 mar. 2003) $ $Revision: 3775 $
*/

public class UnexpectedArgument extends RefuseException implements Predicate {

  public UnexpectedArgument() {
    this("Unknown-argument-name"); 
  }
  
public UnexpectedArgument(String argumentName) {
  super("(unexpected-argument "+argumentName+")");
  s1=argumentName;
}


/**
  @serial
  */
String s1;
public void setArgumentName(String a){s1=a; setMessage("(unexpected-argument "+s1+")");}
public String getArgumentName() {return s1;}

}
