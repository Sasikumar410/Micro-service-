package com.hoenscanner.resources;

import com.hoenscanner.models.SearchRequest;
import com.hoenscanner.models.SearchResult;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/search")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SearchResource {

    @POST
    public Response search(SearchRequest request) {
        // Mock response (replace with actual logic to query rental_cars.json or hotels.json)
        SearchResult result = new SearchResult();
        result.setId("1");
        result.setName("Hotel Sunshine");
        result.setPrice(100.50);
        result.setType("hotel");

        return Response.ok(result).build();
    }
}
