package com.auto.code.generator;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class CustomClass {


    private String packageName;
    private String classType;
    private String className;
    private CustomClassExtends customClassExtends;
    private List<CustomField> classFields;
    private List<CustomMethod> customMethods;
    private List<CustomAnnotation> customAnnotations;
    private List<String> imports;

}
