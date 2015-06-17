package com.simple;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "planets", path = "planets")
public interface PlanetRepository extends PagingAndSortingRepository<Planet, Integer>
{
    List<Planet> findByName(@Param("name") String name);
}
