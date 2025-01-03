package javalab.umc7th_mission.domian.foodcategory.service;

import java.util.List;
import javalab.umc7th_mission.domian.foodcategory.FoodCategory;
import javalab.umc7th_mission.domian.foodcategory.repository.FoodCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FoodCategoryService {

    private final FoodCategoryRepository repository;

    public List<FoodCategory> getByIds(List<Long> ids) {
        return repository.findByIdIn(ids);
    }

}