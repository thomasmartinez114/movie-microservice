package com.tmartinez.moviecatalogservice.resources;

import com.tmartinez.moviecatalogservice.models.CatalogItem;
import com.tmartinez.moviecatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.catalog.Catalog;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        // Get all rated movie IDs
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );

        // For each movie ID, call movie info service and get details

        // Put them all together

        return Collections.singletonList(
                new CatalogItem("Transformers", "Test", 4)
        );

    }
}
