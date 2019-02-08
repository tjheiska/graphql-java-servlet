/**
 * 
 */
package graphql.servlet;

import java.util.Collection;

import graphql.schema.GraphQLFieldDefinition;

/**
 * This interface is used by OSGi bundles to plugin new field into the root
 * subscription type
 */
public interface GraphQLSubscriptionProvider extends GraphQLProvider {
	/**
	 * @return a collection of field definitions that will be added to the root
	 *         subscription type.
	 */
	Collection<GraphQLFieldDefinition> getSubscriptions();

}
