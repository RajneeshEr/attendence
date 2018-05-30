package com.portal.Service.Core;

import com.portal.Entity.Core.MasterPage;
import com.portal.Entity.CoreModel.MasterPageModel;
import org.springframework.stereotype.Service;

@Service
public interface MasterPageService {
    MasterPage save(MasterPageModel masterPageModel);
    boolean findByIdGiven(long id);
    MasterPage findById(long id);
    Iterable<MasterPage> findAll();
}
