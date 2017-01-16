package com.rocket.logic;

import java.util.Date;

public class Meal
{
	//Required variables
	private int id;
	private int price;
	//TODO: Add picture
	private String description;

	private Meal(MealBuilder mealBuilder) throws IllegalStateException
	{
		if( mealBuilder.description == null || mealBuilder.created == null)
			throw new IllegalStateException("One of the required parameters is missing.");
		//Er þetta ekki private breytur?
		this.id = mealBuilder.id;
		this.price = mealBuilder.price;
		this.description = mealBuilder.description;
	}

	public static class MealBuilder
	{
		//Required
		private final int id;
		private int price;
		private Date created;
		private String description;

		public MealBuilder(int id)
		{
			this.id = id;
		}

		public MealBuilder price(int value)
		{
			this.price = value;
			return this;
		}

		public MealBuilder created(Date value)
		{
			this.created = value;
			return this;
		}

		public MealBuilder description(String value)
		{
			this.description = value;
			return this;
		}

		public Meal build()
		{
			return new Meal(this);
		}
	}

	public int getId()
	{
		return this.id;
	}

	public int getPrice()
	{
		return this.price;
	}

	public String getDescription()
	{
		return this.description;
	}
}
