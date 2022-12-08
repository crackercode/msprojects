/*
 * Copyright (c). All rights reserved.
 */
package com.practice.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * @author Chamara Kendaragama
 * @since 2021
 */
public class Foo {

	String name;
	List<Bar> bars = new ArrayList<>();

	public Foo(String name) {
		this.name = name;
	}

	/**
	 * Get name
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name.
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get bars
	 *
	 * @return the bars
	 */
	public List<Bar> getBars() {
		return bars;
	}

	/**
	 * Set bars.
	 *
	 * @param bars the bars to set
	 */
	public void setBars(List<Bar> bars) {
		this.bars = bars;
	}

}
