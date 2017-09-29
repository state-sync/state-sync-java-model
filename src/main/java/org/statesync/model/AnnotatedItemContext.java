package org.statesync.model;

import java.util.Set;

public interface AnnotatedItemContext<Item> extends ReduceContext {

	Set<Permission> getPermissions(Item item);
}
