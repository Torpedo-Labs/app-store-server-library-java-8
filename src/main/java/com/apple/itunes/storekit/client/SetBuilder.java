package com.apple.itunes.storekit.client;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetBuilder {
    public static Set<String> setOf(String...values) {
        return Stream.of(values).collect(Collectors.toCollection(HashSet::new));
    }
    public static Set<?> setOf(Object...values) {
        return Stream.of(values).collect(Collectors.toCollection(HashSet::new));
    }
    public static Set<InputStream> setOf(InputStream...values) {
        return Stream.of(values).collect(Collectors.toCollection(HashSet::new));
    }
    public static Set<InputStream> setOf(ByteArrayInputStream...values) {
        return Stream.of(values).collect(Collectors.toCollection(HashSet::new));
    }
}
