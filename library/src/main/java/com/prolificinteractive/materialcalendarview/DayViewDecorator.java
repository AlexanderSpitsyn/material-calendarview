package com.prolificinteractive.materialcalendarview;

/**
 * Decorate Day views with drawables and text manipulation
 */
public interface DayViewDecorator {

    /**
     * Set decoration options onto a facade to be applied to all relevant days
     *
     * @param day
     * @param view View to decorate
     */
    void decorate(final CalendarDay day, DayViewFacade view);

}
