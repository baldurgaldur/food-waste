package com.rocket.logic;

import com.rocket.dao.MealDAO;
import com.rocket.dao.MealDAOImpl;

import java.util.Date;

public class MealLogic
{
	private MealDAO mealDAO = new MealDAOImpl();

	public void makeAMeal()
	{
		Meal lastMeal = new Meal.MealBuilder(1)
						.price(12)
						.created(new Date())
						.description("Lamb")
						.build();

		mealDAO.saveMeal(lastMeal);
	}

}
