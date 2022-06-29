package com.qa.designprinciples;

public class Vehicle {

	interface Builder {
		void addBrandName();
		void buildBody();
		void insertWheels();
// The following method is used to
// retrieve the object that is constructed.
		Vehicle getVehicle();
		}

// The CarBuilder builds cars.
		class CarBuilder implements Builder {
			Car car;
			public CarBuilder() {
				car=new Car("Ford");
		     }
			@Override
			public void addBrandName() {
				car.add(" Adding the car brand: " + car.brandName);
		     }
			@Override
			public void buildBody() {
				car.add(" Making the car body.");
		     }
			@Override
			public void insertWheels() {
			car.add(" 4 wheels are added to the car.");
		     }
			@Override
			public Vehicle getVehicle() {
			return car;
		     }
		}

		// Director class
		abstract class Director {
// Director knows how to use/instruct the
// builder to create a vehicle.
			public abstract Vehicle instruct(Builder builder);
		}

		/**
		 * The CarDirector directs the
		 * car's instantiation steps.
		 */
		class CarDirector extends Director {
// The car director follows
// its own sequence 
// Make body-> add wheels->then add the brand name.
				public Vehicle instruct(Builder builder) {
					builder.buildBody();
					builder.insertWheels();
					builder.addBrandName();
						return builder.getVehicle();
		     }
		}

}
