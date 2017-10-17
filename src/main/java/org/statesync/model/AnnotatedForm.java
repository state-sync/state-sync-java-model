package org.statesync.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.groups.Default;

import org.statesync.model.permissions.FormPermissions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnotatedForm<Item, Permissions extends FormPermissions> {
	public Item data;
	public Permissions permissions;
	public final Map<String, String> errors = new HashMap<>();
	public FormState state = FormState.edit;

	public void validate(final Validator validator) {
		final Set<ConstraintViolation<Item>> set = validator.validate(this.data, Default.class);
		this.errors.clear();
		for (final ConstraintViolation<Item> v : set) {
			final String propertyId = v.getPropertyPath().toString();
			String text = this.errors.get(propertyId);
			text = text == null ? v.getMessage() : text + ", " + v.getMessage();
			this.errors.put(propertyId, text);
		}
		this.permissions.update = this.errors.isEmpty();
	}
}
