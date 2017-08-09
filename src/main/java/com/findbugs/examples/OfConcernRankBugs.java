package com.findbugs.examples;

public class OfConcernRankBugs {

	private String placeHolder = null;

	public OfConcernRankBugs() {
		this.placeHolder = "Test String";
	}

	private String getPlaceHolder() {
		return this.placeHolder;
	}

	@Override
	public boolean equals(Object obj) {
		OfConcernRankBugs object = (OfConcernRankBugs) obj;
		return this.getPlaceHolder().equals(object.getPlaceHolder());
	}
}
