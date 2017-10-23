/*
 * Copyright (c) Gaocan Inc., Oak Hill, VA, USA, All rights reserverd.
 */
package com.gaocan.train.train;

import com.gaocan.publictransportation.AbstractStationFactory;


/**
 * @author
 *
 */
public class TrainStationFactory implements AbstractStationFactory {
    public com.gaocan.publictransportation.Station createStation(String name) {
        return new Station(name);
    }
}
