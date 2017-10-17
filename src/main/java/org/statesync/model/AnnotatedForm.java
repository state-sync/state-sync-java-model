package org.statesync.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.groups.Default;

import org.statesync.model.permissions.ItemPermissions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnotatedForm<Item, Permissions extends ItemPermissions> {
	public Item data;
	public Permissions permissions;
	public final Map<String, Map<String, String>> errors = new HashMap<>();
	public boolean progress = false;

	public void validate(final Validator validator) {
		final Set<ConstraintViolation<Item>> set = validator.validate(this.data, Default.class);
		for (final ConstraintViolation<Item> v : set) {
			this.errors.computeIfAbsent(v.getPropertyPath().toString(), (id) -> new HashMap<>()).put(v.getMessage(),
					"");
		}
	}
}
