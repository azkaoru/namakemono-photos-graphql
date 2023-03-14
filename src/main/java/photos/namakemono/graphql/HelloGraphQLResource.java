package photos.namakemono.graphql;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;


@GraphQLApi
public class HelloGraphQLResource {

    @Query
    public String hello(@DefaultValue("World") String name) {
        List<String> list = new ArrayList<String>();
        list.add("hoge");
        System.out.println("hoge");
        return "Hello " + name;
    }

}
