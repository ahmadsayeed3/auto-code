package com.auto.code.generator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomAnnotation {
    private String name;
    List<AnnotationParameter> annotationParameters;
}
