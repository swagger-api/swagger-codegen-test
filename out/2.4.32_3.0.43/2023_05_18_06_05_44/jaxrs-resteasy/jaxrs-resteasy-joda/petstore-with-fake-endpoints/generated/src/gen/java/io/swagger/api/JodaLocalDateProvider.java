package io.swagger.api;

import org.joda.time.LocalDate;
import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;


@Provider
public class JodaLocalDateProvider implements ParamConverterProvider {

    public static class JodaLocalDateConverter implements ParamConverter<LocalDate> {

        public LocalDate fromString(String string) {
            try {
                LocalDate localDate = LocalDate.parse(string);
                return localDate;
            } catch (Exception e) {
                throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).
                entity(string + " must be valid LocalDate").build());
            }
    }

        public String toString(LocalDate t) {
            return t.toString();
        }
    }

    public <T> ParamConverter<T> getConverter(Class<T> type, Type type1, Annotation[] antns) {
        if (LocalDate.class.equals(type)) {
            return (ParamConverter<T>) new JodaLocalDateConverter();
        }
        return null;
    }
}