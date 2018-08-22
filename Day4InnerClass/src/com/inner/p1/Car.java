package com.inner.p1;

class Car
{
	String name;
	String color;
	
	class Engine
	{
		int power;

		class Type{
			int ignition;

			public int getIgnition() {
				return ignition;
			}

			public void setIgnition(int ignition) {
				this.ignition = ignition;
			}

			@Override
			public String toString() {
				return "Type [ignition=" + ignition + "]";
			}
			
			
		}
		public int getPower() {
			return power;
		}

		public void setPower(int power) {
			this.power = power;
		}

		@Override
		public String toString() {
			return "Engine [power=" + power + "]";
		}
	
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}
	
	
	
}
