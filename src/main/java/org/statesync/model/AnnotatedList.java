package org.statesync.model;

import java.util.Map;

import lombok.Data;

@Data
public class AnnotatedList<Item> {
	public AnnotatedList<Item> data;
	public Map<String, Permission> permissions;
}
