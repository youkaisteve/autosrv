package com.sm.autosrv.common.serialization;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * json 序列化工具类
 *
 */
public class JsonSerializer {
    private static ObjectMapper mapper = new ObjectMapper();

    /**
     *
     * @param inputString json字符串
     * @param valueType 对象类型
     * @param <T> Class
     * @return T 对象
     * @throws IOException
     */
    public static <T> T deSerialize(String inputString, Class<T> valueType) throws IOException {
        return mapper.readValue(inputString, valueType);
    }

    /**
     * 反序列化InputStream
     * @param inputStream 输入流
     * @param valueType 对象类型
     * @param <T> Class
     * @return T 对象
     * @throws IOException
     */
    public static <T> T deSerialize(InputStream inputStream, Class<T> valueType) throws IOException {
        return mapper.readValue(inputStream, valueType);
    }

    /**
     * 序列化对象
     * @param object
     * @return
     * @throws IOException
     */
    public static String serialize(Object object) throws IOException {
        return mapper.writeValueAsString(object);
    }
}
