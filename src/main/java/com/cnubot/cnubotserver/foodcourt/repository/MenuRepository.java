package com.cnubot.cnubotserver.foodcourt.repository;

import com.cnubot.cnubotserver.foodcourt.entity.Menu;
import com.cnubot.cnubotserver.foodcourt.enums.FoodCourt;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, String> {

    List<Menu> findAllByFoodCourt(@Param("food_court") FoodCourt foodCourt);
}
