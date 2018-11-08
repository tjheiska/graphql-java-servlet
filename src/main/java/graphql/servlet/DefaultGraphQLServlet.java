package graphql.servlet;

import javax.servlet.ServletConfig;

public class DefaultGraphQLServlet extends AbstractGraphQLHttpServlet {

    @Override
    public void init(ServletConfig config) {

        super.init(config);
    }

    @Override
    protected GraphQLInvocationInputFactory getInvocationInputFactory() {
        return null;
    }

    @Override
    protected GraphQLQueryInvoker getQueryInvoker() {
        return GraphQLQueryInvoker.newBuilder().build();
    }

    @Override
    protected GraphQLObjectMapper getGraphQLObjectMapper() {
        return GraphQLObjectMapper.newBuilder().build();
    }

    @Override
    protected boolean isAsyncServletMode() {
        return false;
    }

}
