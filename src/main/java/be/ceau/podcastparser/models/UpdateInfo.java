package be.ceau.podcastparser.models;

import java.time.temporal.Temporal;

/**
 * <p>
 * Information about rate of updates to a podcast feed.
 * <p>
 * <p>
 * Aggregates data from Syndication and RawVoice namespace elements.
 * </p>
 */
public class UpdateInfo {

	private Integer frequency;
	private String period;
	private Temporal base;

	/**
	 * <p>
	 * Used to describe the frequency of updates in relation to the update
	 * period. A positive integer indicates how many times in that period the
	 * channel is updated. For example, an updatePeriod of daily, and an
	 * updateFrequency of 2 indicates the channel format is updated twice daily.
	 * If omitted a value of 1 is assumed.
	 * </p>
	 * <p>
	 * Part of Syndication namespace specification.
	 * </p>
	 * 
	 * @return an {@link Integer} or {@code null}
	 */
	public Integer getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	/**
	 * <p>
	 * Describes the period over which the channel format is updated. Acceptable
	 * values are: hourly, daily, weekly, monthly, yearly. If omitted, daily is
	 * assumed.
	 * </p>
	 * <p>
	 * Part of Syndication namespace specification.
	 * </p>
	 * 
	 * @return an {@link Integer} or {@code null}
	 */
	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	/**
	 * <p>
	 * Defines a base date to be used in concert with updatePeriod and
	 * updateFrequency to calculate the publishing schedule. The date format
	 * takes the form: yyyy-mm-ddThh:mm
	 * </p>
	 * <p>
	 * Part of Syndication namespace specification.
	 * </p>
	 * 
	 * @return an {@link Temporal} or {@code null}
	 */
	public Temporal getBase() {
		return base;
	}

	public void setBase(Temporal base) {
		this.base = base;
	}

}
