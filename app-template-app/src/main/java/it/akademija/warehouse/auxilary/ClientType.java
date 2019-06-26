package it.akademija.warehouse.auxilary;

import com.fasterxml.jackson.annotation.JsonCreator;
import it.akademija.warehouse.entities.Client;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public enum ClientType {
    ORDINARY, LOYAL;

    private static Map<String, ClientType> typeMap = new HashMap<String, ClientType>(2);

    static {
        typeMap.put("ordinary", ORDINARY);
        typeMap.put("loyal", LOYAL);
    }

    @JsonCreator
    public static ClientType forValue(String value) {
        return typeMap.get(StringUtils.lowerCase(value));
    }
}

