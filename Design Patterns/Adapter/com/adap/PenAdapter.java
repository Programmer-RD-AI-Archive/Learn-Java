package com.adap;

import com.krishna.PilotPen;

public class PenAdapter implements Pen{
    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
