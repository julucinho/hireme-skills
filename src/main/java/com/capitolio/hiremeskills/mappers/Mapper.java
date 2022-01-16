package com.capitolio.hiremeskills.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Mapper {

    public static MapperAux map(Object source){
        return new MapperAux(new ObjectMapper(), source);
    }

    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    public static class MapperAux {

        private final ObjectMapper mapper;
        private final Object source;

        public <T> T to(Class<T> destinationType){
            return this.mapper.convertValue(this.source, destinationType);
        }

    }
}
