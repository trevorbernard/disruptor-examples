package com.trevorbernard.disruptor.examples;

import com.lmax.disruptor.EventFactory;

/**
 * WARNING this is a mutable object which will be recycled the ringbuffer. 
 * You must take a copy of data it holds before the framework recycles it.  
 */
public final class ValueEvent {
    private String value;

    public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public final static EventFactory<ValueEvent> EVENT_FACTORY = new EventFactory<ValueEvent>() {
        public ValueEvent newInstance() {
            return new ValueEvent();
        }
    };
}
