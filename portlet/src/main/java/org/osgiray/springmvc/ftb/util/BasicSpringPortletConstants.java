package org.osgiray.springmvc.ftb.util;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import org.springframework.core.SpringVersion;

/**
 * @author Miroslav Ligas <miroslav.ligas@ibacz.eu>
 */
public class BasicSpringPortletConstants {
	public static List<String> getManifestInfo(Class clazz) {
	    List<String> jarVersions = new ArrayList<String>();
	    try {
	    	Enumeration resEnum =  clazz.getClassLoader().getResources(JarFile.MANIFEST_NAME);
	        while (resEnum.hasMoreElements()) {
	            try {
	                URL url = (URL)resEnum.nextElement();
	                
	                InputStream is = url.openStream();
	                if (is != null) {
	                    Manifest manifest = new Manifest(is);
	                    Attributes mainAttribs = manifest.getMainAttributes();
	                    String version = mainAttribs.getValue("Implementation-Version");
	                    if(version != null) {
	                    	jarVersions.add(mainAttribs.getValue("Implementation-Title") + " " +  mainAttribs.getValue("Implementation-Version"));
	                    }
	                }
	            }
	            catch (Exception e) {
	                // Silently ignore wrong manifests on classpath?
	            }
	        }
	    } catch (IOException e1) {
	        // Silently ignore wrong manifests on classpath?
	    }
	    return jarVersions; 
	}
	
	
    public static final String PARAM_VIEW = "view";
    public static final String GREETING = "greetingView";
    public static final String MAIN_VIEW = "bascispring/view";
    public static final String GREETING_VIEW = "bascispring/greeting";
    public static final String TEST_ACTION = "testAction";
    public static final String DAYS_TO_BIRTHDAY_PARAM = "daysToBirthday";

    public static final String PERSON_PTO = "personPro";

    public static final String DATE_TIME_PATTERN = "dd.MM.yyyy";
    public static final List<String> JAR_VERSIONS = getManifestInfo(SpringVersion.class);
}
