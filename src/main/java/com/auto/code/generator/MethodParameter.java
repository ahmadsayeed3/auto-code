package com.auto.code.generator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MethodParameter {

    private String type;
    private String name;
    private List<CustomAnnotation> customAnnotations;

}
