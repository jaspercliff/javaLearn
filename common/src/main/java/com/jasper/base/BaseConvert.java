package com.jasper.base;

import org.mapstruct.InheritConfiguration;

import java.util.List;

public interface BaseConvert<source,target> {

    @InheritConfiguration
    List<target> to (List<source> sources);
}
