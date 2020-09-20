package com.tmartinez.moviecatalogservice.resources;

import com.tmartinez.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.catalog.Catalog;
import java.util.Collections;
import java.util.List;

@RestController
public class MovieCatalogResource {

    public List<CatalogItem> getCatalog(String userId) {

        return Collections.singletonList(
                new CatalogItem("Transformers", "Test", 4)
        );

    }
}
