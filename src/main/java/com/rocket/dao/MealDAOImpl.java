package com.rocket.dao;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.List;
import java.util.ArrayList;
import com.rocket.logic.Meal;

public class MealDAOImpl implements MealDAO
{
	private static final Logger logger = Logger.getLogger(MealDAOImpl.class.getName());
	
	@Override
	public Meal saveMeal(Meal meal)
	{
		logger.log(Level.INFO, "Starting to make meal with");
		return meal;
	}
	
	@Override
	public List<Meal> getLastMeals()
	{
		logger.log(Level.INFO, "Get last meals");
		return new ArrayList<Meal>();
	}
}