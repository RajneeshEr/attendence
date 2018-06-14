package com.portal.Repository.CoreRepository;

import com.portal.Entity.Core.City;
import com.portal.Entity.CoreProjections.CityProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@RepositoryRestResource
public interface CityRepository extends CrudRepository<City, Long> {
    City findById(long id);
    ArrayList<CityProjection> findByLocationId(long locId);
}