package com.synapse.idgenerator.generator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ivaneye on 17-3-16.
 */
public class SnowflakeIdGeneratorTest {
    @Test
    public void nextId() throws Exception {
        SnowflakeIdGenerator idWorker = new SnowflakeIdGenerator(0, 0);
        for (int i = 0; i < 1000; i++) {
            long id = idWorker.nextId();
            System.out.println(Long.toBinaryString(id));
            System.out.println(id);
        }
    }

}