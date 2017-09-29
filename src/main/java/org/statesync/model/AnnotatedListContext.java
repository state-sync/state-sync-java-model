package org.statesync.model;

import java.util.Set;

public interface AnnotatedListContext<Item> extends AnnotatedItemContext<Item> {
	Set<Permission> getListPermissions();
}
