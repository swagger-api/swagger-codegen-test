package io.swagger.api;

import java.time.OffsetDateTime;
import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
public class OffsetDateTimeProvider implements ParamConverterProvider {

    public static class OffsetDateTimeConverter implements ParamConverter<OffsetDateTime> {

        public OffsetDateTime fromString(String string) {
            OffsetDateTime offsetDateTime = OffsetDateTime.parse(string);
            return offsetDateTime;
        }

        public String toString(OffsetDateTime t) {
            return t.toString();
        }
    }

    public <T> ParamConverter<T> getConverter(Class<T> type, Type type1, Annotation[] antns) {
        if (OffsetDateTime.class.equals(type)) {
            return (ParamConverter<T>) new OffsetDateTimeConverter();
        }
        return null;
    }
}
