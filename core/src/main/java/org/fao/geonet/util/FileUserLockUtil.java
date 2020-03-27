//=============================================================================
//===   Copyright (C) 2001-2007 Food and Agriculture Organization of the
//===   United Nations (FAO-UN), United Nations World Food Programme (WFP)
//===   and United Nations Environment Programme (UNEP)
//===
//===   This program is free software; you can redistribute it and/or modify
//===   it under the terms of the GNU General Public License as published by
//===   the Free Software Foundation; either version 2 of the License, or (at
//===   your option) any later version.
//===
//===   This program is distributed in the hope that it will be useful, but
//===   WITHOUT ANY WARRANTY; without even the implied warranty of
//===   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
//===   General Public License for more details.
//===
//===   You should have received a copy of the GNU General Public License
//===   along with this program; if not, write to the Free Software
//===   Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
//===
//===   Contact: Jeroen Ticheler - FAO - Viale delle Terme di Caracalla 2,
//===   Rome - Italy. email: geonetwork@osgeo.org
//==============================================================================

package org.fao.geonet.util;

import org.apache.commons.io.FileUtils;
import org.fao.geonet.constants.Geonet;
import org.fao.geonet.utils.Log;
import org.openrdf.sesame.sail.query.In;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by francois on 24/06/16.
 */
public class FileUserLockUtil {


    private String directory = Paths.get("").toAbsolutePath().toString().concat("\\lock\\");
    private File file;
    private Path path;

    public FileUserLockUtil(String userName){
        this.path = Paths.get(directory.concat(userName));
        file = new File(this.path.toString());
        if(!file.exists()){
            createUserLockFile();
        }
    }

    private void createUserLockFile(){
        try{
            if(!file.exists()){
                Files.createDirectories(Paths.get(directory));
                file.createNewFile();
                FileUtils.writeStringToFile(file, "0");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public boolean verifyUserLockFile() {
        return this.file.exists();
    }

    public void addFailedLoginAttempt(){
        try {
            FileUtils.writeStringToFile(file, (String.valueOf(getErrorAttempts() + 1)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int getErrorAttempts(){
        String number = "0";
        if(!file.exists()){
            return 0;
        }
        try {
            Stream<String> lines = Files.lines(path);
            number = lines.collect(Collectors.joining("\n"));
            lines.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.valueOf(number);
    }

    public void deleteFile(){
        if (file.exists()){
            file.delete();
        }
    }
}
