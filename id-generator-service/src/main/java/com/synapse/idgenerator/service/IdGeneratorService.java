package com.synapse.idgenerator.service;

import com.synapse.idgenerator.generator.SnowflakeIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangyifan on 17-3-16.
 */
@Service
public class IdGeneratorService {

    @Autowired
    private SnowflakeIdGenerator generator;

    public long generate() {
        return generator.nextId();
    }

}