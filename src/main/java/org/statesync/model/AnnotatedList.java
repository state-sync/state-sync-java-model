package org.statesync.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class AnnotatedList<Item> {
	public List<AnnotatedItem<Item>> data = new ArrayList<>();
	public Map<Permission, Boolean> permissions = new HashMap<>();
}
