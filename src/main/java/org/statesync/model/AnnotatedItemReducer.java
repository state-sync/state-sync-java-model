package org.statesync.model;

public class AnnotatedItemReducer<Item, Context extends AnnotatedItemContext<Item>> extends JReducer {

	public AnnotatedItem<Item> reduce(final Item item, final Context context) {
		return new AnnotatedItem<Item>(item, context.getPermissions(item));
	}

}
