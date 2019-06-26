package it.akademija.warehouse.auxilary;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

    @JsonValue
    public String toValue() {
        for (Map.Entry<String, ClientType> entry : typeMap.entrySet()) {
            if (entry.getValue() == this)
                return entry.getKey();
        }

        return null; // or fail
    }
}

