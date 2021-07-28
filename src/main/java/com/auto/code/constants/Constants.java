package com.auto.code.constants;

import com.auto.code.generator.AnnotationParameter;
import com.auto.code.generator.CustomAnnotation;

import java.util.Arrays;
import java.util.List;

public class Constants {
    public static String DEFAULT_PACKAGE = "com.auto.code";

    /*=== Mapper ============================*/
    public static String MAPPER_PACKAGE = DEFAULT_PACKAGE + ".mapper";
    public static List<CustomAnnotation> MAPPER_INTERFACE_ANNOTATIONS = Arrays.asList(
            new CustomAnnotation("Mapper", Arrays.asList(new AnnotationParameter("componentModel", "\"spring\""))),
            new CustomAnnotation("Service", null));


}
