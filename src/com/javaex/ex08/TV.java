package com.javaex.ex08;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void channel(int channel) {
		if (channel >= 255) {
			this.channel = 255;
		}else {
			this.channel = 1;
		}
	}
	
	public void channel(boolean up) {
		if (up==true) {
			this.channel+=1;
			
		} else {
			this.channel-=1;
		}
		
	}

}
