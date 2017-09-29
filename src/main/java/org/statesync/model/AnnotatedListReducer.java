package org.statesync.model;

import java.util.List;

public class AnnotatedListReducer<Item, Context extends AnnotatedListContext<Item>> extends JReducer {

	public AnnotatedList<Item> reduce(final List<Item> item, final Context context) {
		// context.search()
		return null;/// new AnnotatedItem<Item>(item,
					/// context.getListPermissions());
	}

}
