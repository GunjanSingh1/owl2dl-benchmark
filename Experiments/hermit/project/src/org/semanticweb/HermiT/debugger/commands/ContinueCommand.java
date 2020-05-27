/* Copyright 2009 by the Oxford University Computing Laboratory
   
   This file is part of HermiT.

   HermiT is free software: you can redistribute it and/or modify
   it under the terms of the GNU Lesser General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   HermiT is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU Lesser General Public License for more details.
   
   You should have received a copy of the GNU Lesser General Public License
   along with HermiT.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.semanticweb.HermiT.debugger.commands;

import java.io.PrintWriter;

import org.semanticweb.HermiT.debugger.Debugger;

public class ContinueCommand extends AbstractCommand {
    
    public ContinueCommand(Debugger debugger) {
        super(debugger);
    }
    public String getCommandName() {
        return "c";
    }
    public String[] getDescription() {
        return new String[] { "","continues with the current reasoning tasks" };
    }
    public void printHelp(PrintWriter writer) {
        writer.println("usage: c");
        writer.println("    Continues with the current reasoning tasks.");
    }
    public void execute(String[] args) {
          m_debugger.setInMainLoop(false);
    }
}