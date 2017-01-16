package com.rocket.dao;

import com.rocket.logic.Meal;
import java.util.List;

public interface MealDAO
{
	public Meal saveMeal(Meal meal);
	
	public List<Meal> getLastMeals();
}
