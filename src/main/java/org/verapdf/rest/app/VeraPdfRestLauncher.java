/*
 * Copyright (C) 2018 The veraPDF Consortium
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.verapdf.rest.app;

/**
 * This class invokes VeraPdfRestApplication with the right context for an IDE launch.  It is essentially an Eclipse
 * launch configuration captured in code.
 *
 * @author tra
 */
public class VeraPdfRestLauncher {

    public static void main(String[] args) throws Exception {
        // https://stackoverflow.com/a/25340864/53897
        System.setProperty("dw.server.applicationConnectors[0].port", "8080");
        System.setProperty("dw.server.adminConnectors[0].port", "8081");
        VeraPdfRestApplication.main(new String[]{"server"});
    }
}
