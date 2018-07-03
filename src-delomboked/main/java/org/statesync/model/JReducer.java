package org.statesync.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class JReducer {

	protected static <T> List<T> list(final Stream<T> stream) {
		return stream.collect(Collectors.toList());
	}

	public static <T> Map<T, Boolean> toMap(final Set<T> permissions) {
		return permissions.stream().collect(Collectors.toMap(v -> v, v -> true));
	}

	public static <T> Map<T, Boolean> toMap(final T[] permissions) {
		return Arrays.asList(permissions).stream().collect(Collectors.toMap(v -> v, v -> true));
	}

}
