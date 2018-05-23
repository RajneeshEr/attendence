package com.portal.Repository;

import com.portal.Entity.MasterPage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MasterPageRepository extends CrudRepository<MasterPage, Long> {

    public MasterPage findByMrfNumber(long mrfNumber);




}
