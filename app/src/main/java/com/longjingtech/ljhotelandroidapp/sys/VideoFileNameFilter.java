package com.longjingtech.ljhotelandroidapp.sys;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by djstava on 15/2/27.
 */
public class VideoFileNameFilter implements FilenameFilter {
    List<String> types;

    public VideoFileNameFilter() {
        types = new ArrayList<String>();
    }

    public VideoFileNameFilter(List<String> types) {
        super();
        this.types = types;
    }

    @Override
    public boolean accept(File dir,String fileName) {
        for (Iterator<String> iterator = types.iterator();iterator.hasNext();) {
            String type = (String)iterator.next();
            if (fileName.endsWith(type)) {
                return true;
            }
        }

        return false;
    }

    public void addType(String type) {
        types.add(type);
    }
}
